package example;

public class School {
	String schoolName;	//�б� �̸�
	int group;		//�б��� ���? -> �б�
	String stdName;		//�л� �̸�
	String teaName;		//������ �̸�
	
	public String group(String stdName) {
		return "�б����";
	}

	public String teacher(String stdName) {
		return "���Ӽ������̸� ���";
	}
}
