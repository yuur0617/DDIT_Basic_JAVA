package example;

public class Student extends Teacher {
	String stdName;
	String group;

	String[] stdGroup1 = { "��浿", "����", "���縲" }; // 1�� �л�
	String[] stdGroup2 = { "�ڽ¿�", "������" }; // 2�� �л�
	String[] stdGroup3 = { "�ű���", "�ֽ�ö" }; // 3�� �л�

	Student() {
	}
	//�б��� ����ϴ� �޼���
	@Override
	public String group(String stdName) {
		boolean stdCheak = false;
		for (int i = 0; i < stdGroup1.length; i++) {
			if (stdGroup1[i].equals(stdName)) {	//�Է��� �л��̸��� 1���л���ܿ� �������
				stdCheak = true;
				return "1��";
			}
		}
		for (int i = 0; i < stdGroup2.length; i++) {
			if (stdGroup2[i].equals(stdName)) {	//�Է��� �л��̸��� 2���л���ܿ� �������
				stdCheak = true;
				return "2��";
			}
		}
		for (int i = 0; i < stdGroup3.length; i++) {
			if (stdGroup3[i].equals(stdName)) {	//�Է��� �л��̸��� 3���л���ܿ� �������
				stdCheak = true;
				return "3��";
			}
		}
		if (stdCheak == false) {	//����ó��
			return "��ϵ� �̸��� �����ϴ�.";
		}
		return stdName;
	}

	//������ ģ���� ����ϴ� �޼���
	public String friend(String stdGroup, String name) {
		String result = "";
		if (stdGroup.equals("1��")) {	//1���л��϶�
			for (int i = 0; i < stdGroup1.length; i++) {
				if (!name.equals(stdGroup1[i])) {	//�Է��� �л��̸��� ���� ������
					if (result.equals("")) {
						result = stdGroup1[i];
					} else
						result += "," + stdGroup1[i];
				}
			}
			return result;
		}
		if (stdGroup.equals("2��")) {	//2���л��϶�
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
		if (stdGroup.equals("3��")) {	//3���л��϶�
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
