package ddit.chap02.sec03;
/*	1���� 365.2422���̴�
  	��� : 1���� 365�� 5�ð� 4x�� 4x���Դϴ�.*/

public class homework02 {

	public static void main(String[] args) {
		
		double year = 365.2422;
		int day, hour, min, sec;
		
		day = (int)year;
		hour = (int)((year-day)*24);	
		min = (int)(((year-day)*24-hour)*60);
		sec = (int)((((year-day)*24-hour)*60-min)*60);
			
		System.out.println("1���� "+day+"�� "+hour+"�ð� "+min+"�� "+sec+"�� �Դϴ�.");
	}
}
