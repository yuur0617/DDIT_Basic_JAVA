package example;

public class Teacher extends School {
	String teaName1 = "김국어";	//1반 담임
	String teaName2 = "박수학";	//2반 담임
	String teaName3 = "최과학";	//3반 담임

	Teacher(){}
	
	@Override
	public String teacher(String stdGroup) {
		if(stdGroup.equals("1반")) {
			return teaName1;
		}
		else if(stdGroup.equals("2반")) {
			return teaName2;
		}
		else if(stdGroup.equals("3반")) {
			return teaName3;
		}
		else {
			return "등록된 반이 없습니다.";
		}
	}

}
