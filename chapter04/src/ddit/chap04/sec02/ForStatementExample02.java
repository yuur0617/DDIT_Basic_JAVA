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
		for(int i = 0; i<5; i++) {	//��(row)�� ���
			for(int j = 0; j <= i; j++) {	
				System.out.print("*");
			}
			System.out.println();	//�ٹٲ�
		}
	}
	
	public static void forMethod02() {
/*		    *
  		   **
  		  ***
		 ****
 		*****	*/
		for(int i = 0; i<5; i++) {	//��(row)�� ���
				for(int j = 0; j <4-i ; j++) {	
					System.out.print(" ");	//����Ż��
				}
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();	//�ٹٲ�
			}
		}
	
	public static void forMethod03() {
/*		*****
  		****
  		***
		**
 		*	*/
		for(int i = 0; i<5; i++) {	//��(row)�� ���
				for(int j = 0; j <5 -i ; j++) {	
					System.out.print("*");	
				}
				System.out.println();	//�ٹٲ�
			}
		}
	
	public static void forMethod04() {
/*		*****			    *		*********
  		 ****			   ***		 *******
  		  ***			  *****		  *****
		   **		 	 *******	   ***
 		    *			*********		*			*/
		for(int i = 0; i<5; i++) {	//��(row)�� ���
				for(int j = 0; j < i ; j++) {	
					System.out.print(" ");	
				}
				for(int j = 0; j <5-i; j++) {
					System.out.print("*");
				}
				System.out.println();	//�ٹٲ�
			}
		}
	
	public static void forMethod05() {
/*	       *		
	  	  ***		 
	  	 *****		  
	    *******	  	  
	   *********		*/
		for(int i = 0; i<5; i++) {	//��(row)�� ���
			for(int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i+1 ; j++) {	
				System.out.print("*");	
			}
			System.out.println();	//�ٹٲ�
		}
	}
	
	public static void forMethod06() {
/*	   	*********
	  	 *******
	  	  *****
	       ***
	   		*			*/
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j < i; j++) { // ���� ����
		        System.out.print(" ");
		    }
		    for (int j = i; j <= 2 * 5 - i; j++) {
		        System.out.print("*");
		    }		    
		    for (int j = 1; j < i; j++) { // ������ ���� j
		        System.out.print(" ");
		    }		    
		    System.out.println("");
		}
	}
			
}
