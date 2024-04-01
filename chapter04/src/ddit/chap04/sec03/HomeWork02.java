package ddit.chap04.sec03;
/*	1-2+3...-10=?  */
public class HomeWork02 {

	public static void main(String[] args) {
		int sign = -1;
		int sum = 0;
		int cnt = 1;
		
		while(cnt <= 10) {
			sign = sign*(-1);
			sum = sum + (cnt*sign);
			if(sign>0 && cnt != 1) {
				System.out.print("+"+(sign*cnt));
			}else {
				System.out.print(sign*cnt);	
			}
			cnt++;
		}
		System.out.println(" = " + sum);
	}

}
