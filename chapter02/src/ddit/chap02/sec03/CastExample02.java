package ddit.chap02.sec03;
/* ���� �ش�*/
public class CastExample02 {

	public static void main(String[] args) {
		double year = 365.2422;
		int days = (int)year;	//����
		
		double hour = (year-days)*24;
		int hours = (int)hour;
		
		double minut = (hour- hours)*60;
		int minuts = (int)minut;
		
		double second = (minut-minuts)*60;
		int seconds = (int)second;
		
		
		System.out.println("1����"+ days + "��"+
							hours + "�ð�" + minuts + "��" + seconds + "�� �Դϴ�.");
	}

}
