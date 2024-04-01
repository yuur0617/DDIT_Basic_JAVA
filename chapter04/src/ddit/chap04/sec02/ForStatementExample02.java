package ddit.chap04.sec02;

public class ForStatementExample02 {

	public static void main(String[] args) {
//		forMethod01();
//		forMethod02();
//		forMethod03();
//		forMethod04();
//		forMethod05();
		forMethod06();
	}
	public static void forMethod01() {
/*		*
  		**
  		***
  		****
  		*****	*/
		for(int i = 0; i<5; i++) {	//줄(row)를 담당
			for(int j = 0; j <= i; j++) {	
				System.out.print("*");
			}
			System.out.println();	//줄바꿈
		}
	}
	
	public static void forMethod02() {
/*		    *
  		   **
  		  ***
		 ****
 		*****	*/
		for(int i = 0; i<5; i++) {	//줄(row)를 담당
				for(int j = 0; j <4-i ; j++) {	
					System.out.print(" ");	//공백탈출
				}
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();	//줄바꿈
			}
		}
	
	public static void forMethod03() {
/*		*****
  		****
  		***
		**
 		*	*/
		for(int i = 0; i<5; i++) {	//줄(row)를 담당
				for(int j = 0; j <5 -i ; j++) {	
					System.out.print("*");	
				}
				System.out.println();	//줄바꿈
			}
		}
	
	public static void forMethod04() {
/*		*****			    *		*********
  		 ****			   ***		 *******
  		  ***			  *****		  *****
		   **		 	 *******	   ***
 		    *			*********		*			*/
		for(int i = 0; i<5; i++) {	//줄(row)를 담당
				for(int j = 0; j < i ; j++) {	
					System.out.print(" ");	
				}
				for(int j = 0; j <5-i; j++) {
					System.out.print("*");
				}
				System.out.println();	//줄바꿈
			}
		}
	
	public static void forMethod05() {
/*	       *		
	  	  ***		 
	  	 *****		  
	    *******	  	  
	   *********		*/
		for(int i = 0; i<5; i++) {	//줄(row)를 담당
			for(int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1 ; j++) {	
				System.out.print("*");	
			}
			System.out.println();	//줄바꿈
		}
	}
	
	public static void forMethod06() {
/*	   	*********
	  	 *******
	  	  *****
	       ***
	   		*			*/
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j < i; j++) { // 왼쪽 공백
		        System.out.print(" ");
		    }
		    for (int j = i; j <= 2 * 5 - i; j++) {
		        System.out.print("*");
		    }		    
		    for (int j = 1; j < i; j++) { // 오른쪽 공백 j
		        System.out.print(" ");
		    }		    
		    System.out.println("");
		}
	}
			
}
