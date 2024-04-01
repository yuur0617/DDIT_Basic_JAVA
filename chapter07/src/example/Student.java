package example;

public class Student extends Teacher {
	String stdName;
	String group;

	String[] stdGroup1 = { "장길동", "고영우", "박재림" }; // 1반 학생
	String[] stdGroup2 = { "박승우", "이지훈" }; // 2반 학생
	String[] stdGroup3 = { "신국현", "최승철" }; // 3반 학생

	Student() {
	}
	//학급을 출력하는 메서드
	@Override
	public String group(String stdName) {
		boolean stdCheak = false;
		for (int i = 0; i < stdGroup1.length; i++) {
			if (stdGroup1[i].equals(stdName)) {	//입력한 학생이름과 1반학생명단에 있을경우
				stdCheak = true;
				return "1반";
			}
		}
		for (int i = 0; i < stdGroup2.length; i++) {
			if (stdGroup2[i].equals(stdName)) {	//입력한 학생이름과 2반학생명단에 있을경우
				stdCheak = true;
				return "2반";
			}
		}
		for (int i = 0; i < stdGroup3.length; i++) {
			if (stdGroup3[i].equals(stdName)) {	//입력한 학생이름과 3반학생명단에 있을경우
				stdCheak = true;
				return "3반";
			}
		}
		if (stdCheak == false) {	//예외처리
			return "등록된 이름이 없습니다.";
		}
		return stdName;
	}

	//같은반 친구를 출력하는 메서드
	public String friend(String stdGroup, String name) {
		String result = "";
		if (stdGroup.equals("1반")) {	//1반학생일때
			for (int i = 0; i < stdGroup1.length; i++) {
				if (!name.equals(stdGroup1[i])) {	//입력한 학생이름과 같이 않을때
					if (result.equals("")) {
						result = stdGroup1[i];
					} else
						result += "," + stdGroup1[i];
				}
			}
			return result;
		}
		if (stdGroup.equals("2반")) {	//2반학생일때
			for (int i = 0; i < stdGroup2.length; i++) {
				if (!name.equals(stdGroup2[i])) {
					if (result.equals("")) {
						result = stdGroup2[i];
					} else
						result += "," + stdGroup2[i];
				}
			}
			return result;
		}
		if (stdGroup.equals("3반")) {	//3반학생일때
			for (int i = 0; i < stdGroup3.length; i++) {
				if (!name.equals(stdGroup3[i])) {
					if (result.equals("")) {
						result = stdGroup3[i];
					} else
						result += "," + stdGroup3[i];
				}
			}
			return result;
		}
		return group;
	}

}
