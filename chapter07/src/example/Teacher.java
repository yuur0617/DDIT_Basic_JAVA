package example;

public class Teacher extends School {
	String teaName1 = "�豹��";	//1�� ����
	String teaName2 = "�ڼ���";	//2�� ����
	String teaName3 = "�ְ���";	//3�� ����

	Teacher(){}
	
	@Override
	public String teacher(String stdGroup) {
		if(stdGroup.equals("1��")) {
			return teaName1;
		}
		else if(stdGroup.equals("2��")) {
			return teaName2;
		}
		else if(stdGroup.equals("3��")) {
			return teaName3;
		}
		else {
			return "��ϵ� ���� �����ϴ�.";
		}
	}

}
