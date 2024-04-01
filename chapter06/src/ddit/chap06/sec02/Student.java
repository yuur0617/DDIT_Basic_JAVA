package ddit.chap06.sec02;

public class Student {
	final String MAJOR = "소프트웨어 학과";
	static long stdID = 2023000L;
	
	Student(){
		stdID++;
	}
	
	public long getStdID() {
		return stdID;
	}
}
