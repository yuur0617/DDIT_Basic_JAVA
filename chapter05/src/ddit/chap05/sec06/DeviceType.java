package ddit.chap05.sec06;

public enum DeviceType {
	MOVILE("안드로이드"),
	WEB("스프링"),
	SERVER("리눅스");
	
	private final String name;
	
	private DeviceType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
