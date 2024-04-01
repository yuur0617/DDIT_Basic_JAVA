package ddit.chap05.sec02;

public class ArrayExample05 {

	public static void main(String[] args) {
/*		최대값, 최소값 구하기		*/
		int[] num = {15, 23, 7, 85, 66, 27, 10};
		int tmin = num[0];	//임시최소값
		int tmax = num[0];	//임시최대값
		
		for(int i=0; i<num.length;	i++) {
			//최소값	
			if(tmin > num[i]) {
				tmin = num[i];
			}
			//최대값
			if(tmax < num[i]) {
				tmax = num[i];
			}
			
		}
		System.out.println("최소값은 : " + tmin);
		System.out.println("최대값은 : " + tmax);
	}

}
