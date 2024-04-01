package example;

public class School {
	String schoolName;	//학교 이름
	int group;		//학교의 등급? -> 학급
	String stdName;		//학생 이름
	String teaName;		//선생님 이름
	
	public String group(String stdName) {
		return "학급출력";
	}

	public String teacher(String stdName) {
		return "담임선생님이름 출력";
	}
}
