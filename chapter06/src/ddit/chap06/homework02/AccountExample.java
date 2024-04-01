package ddit.chap06.homework02;

public class AccountExample {

	public static void main(String[] args) {
		Account acc1 = new Account();
		 
		acc1.setOwner("È«±æ¼ø");
		System.out.println("¿¹±ÝÁÖ : "+acc1.getOwner());
		System.out.println("ÀÜ°í : "+ acc1.getBalance());
		System.err.println("---------------------------------");
	}
	public static void printAccountInfo() {
		
	}
	 
}
