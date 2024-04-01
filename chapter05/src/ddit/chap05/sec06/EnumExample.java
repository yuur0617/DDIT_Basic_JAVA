package ddit.chap05.sec06;

public class EnumExample {

	public static void main(String[] args) {
		Day day = Day.MONDAY;
		
		switch(day) {
		case MONDAY :
			System.out.println("월요일 입니다.");
			break;
		case THURSDAY :
			System.out.println("화요일 입니다.");
			break;
		case WEDNESDAY:
			System.out.println("수요일 입니다.");
			break;
		case TUESDAY :
			System.out.println("목요일 입니다.");
			break;
		case FRIDAY :
			System.out.println("금요일 입니다.");
			break;
		case SATURDAY :
			System.out.println("토요일 입니다.");
			break;
		case SUNDAY :
			System.out.println("일요일 입니다.");
			break;
		default:
			System.out.println("요일선택이 잘못되었습니다.");
		

		}

	}

}
