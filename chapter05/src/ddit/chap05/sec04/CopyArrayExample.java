package ddit.chap05.sec04;

import java.util.Arrays;

public class CopyArrayExample {
	public static void main(String[] args) {
//		arrayCopy();
//		arrayClone();
		arrayManualCopy();
	}
	
	//system.arraycopy() =>  복사해줄 배열과 복사 받을배열이 생성되어 있어야 함
	public static void arrayCopy() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = new int[10];				//복사받을 배열
		
		System.arraycopy(arr1, 0, arr2, 5, arr1.length); //소스, 복사시작위치, 복사받을배열, 복사받을 위치, 복사받을갯수
		
		System.out.println("원본배열 = " + Arrays.toString(arr1)+arr1);		
		System.out.println("복사받은배열 = " + Arrays.toString(arr2)+arr2);	//arr1과 arr2는 다른 주소에 위치해 있다.
	}
	
	//clone() => 복사받을 배열을 생성과 동시에 배열복사	//일부만 복사할수없다
	public static void arrayClone() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = arr1.clone();			//객체를 복제할떄 사용함
		
		System.out.println("원본배열 = " + Arrays.toString(arr1)+arr1);		
		System.out.println("복사받은배열 = " + Arrays.toString(arr2)+arr2);	
	}

	//for문을 이용하여 하나씩 복사
	public static void arrayManualCopy() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = new int[10];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("원본배열 = " + Arrays.toString(arr1)+arr1);		
		System.out.println("복사받은배열 = " + Arrays.toString(arr2)+arr2);	
	}
}
