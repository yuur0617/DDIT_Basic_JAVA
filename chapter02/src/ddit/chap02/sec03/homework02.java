package ddit.chap02.sec03;
/*	1년은 365.2422일이다
  	출력 : 1년은 365일 5시간 4x분 4x초입니다.*/

public class homework02 {

	public static void main(String[] args) {
		
		double year = 365.2422;
		int day, hour, min, sec;
		
		day = (int)year;
		hour = (int)((year-day)*24);	
		min = (int)(((year-day)*24-hour)*60);
		sec = (int)((((year-day)*24-hour)*60-min)*60);
			
		System.out.println("1년은 "+day+"일 "+hour+"시간 "+min+"분 "+sec+"초 입니다.");
	}
}
