package ddit.chap06.sec02;

public class Student {
	final String MAJOR = "����Ʈ���� �а�";
	static long stdID = 2023000L;
	
	Student(){
		stdID++;
	}
	
	public long getStdID() {
		return stdID;
	}
}
