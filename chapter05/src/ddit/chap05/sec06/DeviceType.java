package ddit.chap05.sec06;

public enum DeviceType {
	MOVILE("�ȵ���̵�"),
	WEB("������"),
	SERVER("������");
	
	private final String name;
	
	private DeviceType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
