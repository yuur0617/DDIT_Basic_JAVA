package test;

public class test {

	public static void main(String[] args) {
//		test1();
//		test2();

	}
	public static void test1() {
		String[] seat = {};
		int count = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("\tбр\t");
			}
			System.out.println();
			for(int h=0; h<3; h++) {
				System.out.print("\t"+ count +"\t");
				count++;
			}

			System.out.println("\n");
		}
	}
	
	public static void test2() {
		String[][] seatArray = {{"бр", "бр" ,"бр"},{"бр", "бр" ,"бр"},{"бр", "бр" ,"бр"}};
		int count = 1;
		for(int i=0; i<seatArray.length; i++) {
			for(int j=0; j<seatArray[i].length; j++) {
				System.out.print("\tбр\t");
			}
			System.out.println();
			for(int h=0; h<3; h++) {
				System.out.print("\t"+ count +"\t");
				count++;
			}
			System.out.println("\n");
		}
		
	}
	

}
