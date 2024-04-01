package ddit.chap05.sec02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample03 {

	public static void main(String[] args) {
		ArrayExample03 ae03 = new ArrayExample03();
		int[] source = {27, 63, 15, 84, 35};
		
		ae03.bubbleSort(source);
		System.out.println("bubble 정렬 후 : " 
					+ Arrays.toString(source));
		System.out.println("selection 정렬 후 : "
					+ Arrays.toString(ae03.selectionsort()));
	}

	public void bubbleSort(int[] target) {
		System.out.println("정렬 전: " + Arrays.toString(target));
		
		boolean f = true;
		int i = 0;
		
		for(i=0; i<target.length-1; i++) {	//회전수
			f = true;
			for(int j=0; j<target.length-1-i; j++) {
				if(target[j] > target[j+1]) {
					int t = target[j];
					target[j] = target[j+1];
					target[j+1] = t;
					f = false;
				}
			}
			if(f) {
				System.out.println("회전  수 : " + (i+1));
			        break;
			}
		}

	}
	
	public int[] selectionsort() {
		int[] source = {17, 43, 25, 84, 35, 40};
		System.out.println("\n정렬 전: " + Arrays.toString(source));
		
		Arrays.sort(source);
		System.out.println("자동정렬 전: " + Arrays.toString(source));
		
		for(int i=0; i<source.length-1; i++) {
			for(int j=i; j<source.length; j++) {
				if(source[i] > source[j]) {
					int t = source[i];
					source[i] = source[j];
					source[j] = t;
				}
			}
		}
		return source;
	}
}
