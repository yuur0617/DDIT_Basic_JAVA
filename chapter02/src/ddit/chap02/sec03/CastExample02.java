package ddit.chap02.sec03;
/* 과제 해답*/
public class CastExample02 {

	public static void main(String[] args) {
		double year = 365.2422;
		int days = (int)year;	//날수
		
		double hour = (year-days)*24;
		int hours = (int)hour;
		
		double minut = (hour- hours)*60;
		int minuts = (int)minut;
		
		double second = (minut-minuts)*60;
		int seconds = (int)second;
		
		
		System.out.println("1년은"+ days + "일"+
							hours + "시간" + minuts + "분" + seconds + "초 입니다.");
	}

}
