package ddit.chap05.sec06;

public class EnumExample {

	public static void main(String[] args) {
		Day day = Day.MONDAY;
		
		switch(day) {
		case MONDAY :
			System.out.println("������ �Դϴ�.");
			break;
		case THURSDAY :
			System.out.println("ȭ���� �Դϴ�.");
			break;
		case WEDNESDAY:
			System.out.println("������ �Դϴ�.");
			break;
		case TUESDAY :
			System.out.println("����� �Դϴ�.");
			break;
		case FRIDAY :
			System.out.println("�ݿ��� �Դϴ�.");
			break;
		case SATURDAY :
			System.out.println("����� �Դϴ�.");
			break;
		case SUNDAY :
			System.out.println("�Ͽ��� �Դϴ�.");
			break;
		default:
			System.out.println("���ϼ����� �߸��Ǿ����ϴ�.");
		

		}

	}

}
