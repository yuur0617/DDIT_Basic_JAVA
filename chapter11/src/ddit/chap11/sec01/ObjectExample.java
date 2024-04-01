package ddit.chap11.sec01;

public class ObjectExample {

	public static void main(String[] args) {
		ObjectClass obj1 = new ObjectClass("ȫ�浿","1234");
		
		ObjectClass obj2 = new ObjectClass("ȫ�浿","1234");
		
		obj1 = obj2;
		
		if(obj1.equals(obj2) && obj1.hashCode() == obj2.hashCode()) {
			System.out.println("���� ��ü");
			System.exit(0);
		}else {
			System.out.println("���δٸ� ��ü");
		}

		System.out.println(obj1.hashCode());
		System.out.println("obj1 : " + obj1);
		
//		String str1 = "ȫ�浿";
//		if(str1.equals("ȫ�浿")) {
//			System.out.println("���� ��ü");
//		}else {
//			System.out.println("���δٸ� ��ü");
//		}
	}

}

class ObjectClass{
	String name;
	String id;
	
	ObjectClass(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ObjectClass) {
			ObjectClass object = (ObjectClass)obj;
			if(name.equals(object.name)) {
				return true;
			}	
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
//		return getClass().getName() + '@' + Integer.toHexString(hashCode());
		return id + "," + name;
	}
}