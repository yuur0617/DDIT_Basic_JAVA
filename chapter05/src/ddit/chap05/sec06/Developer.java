package ddit.chap05.sec06;

public class Developer {
	String name;
	int career;
	public DeviceType type;
	static Developer d = new Developer();
	
	public static void main(String[] args) {
		getInfo();
		getDeviceType();
	}
	public static void getInfo(){
		d.name = "������";
		d.career = 5;
		d.type = DeviceType.SERVER;
		System.out.println("�����ڸ� : " + d.name);
		System.out.println("���߰�� : " + d.career);
		System.out.println("������Ʈ : " + d.type);
	}
	
	public static void getDeviceType() {
		for(DeviceType dev : DeviceType.values()) {
			System.out.println (dev.getName());
		}
		
		DeviceType dp = d.type.WEB;
		System.out.println(dp.ordinal());	//���� 
	}

}
