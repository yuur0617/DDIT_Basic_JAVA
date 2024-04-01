package ddit.chap05.sec04;

import java.util.Arrays;

public class CopyArrayExample {
	public static void main(String[] args) {
//		arrayCopy();
//		arrayClone();
		arrayManualCopy();
	}
	
	//system.arraycopy() =>  �������� �迭�� ���� �����迭�� �����Ǿ� �־�� ��
	public static void arrayCopy() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = new int[10];				//������� �迭
		
		System.arraycopy(arr1, 0, arr2, 5, arr1.length); //�ҽ�, ���������ġ, ��������迭, ������� ��ġ, �����������
		
		System.out.println("�����迭 = " + Arrays.toString(arr1)+arr1);		
		System.out.println("��������迭 = " + Arrays.toString(arr2)+arr2);	//arr1�� arr2�� �ٸ� �ּҿ� ��ġ�� �ִ�.
	}
	
	//clone() => ������� �迭�� ������ ���ÿ� �迭����	//�Ϻθ� �����Ҽ�����
	public static void arrayClone() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = arr1.clone();			//��ü�� �����ҋ� �����
		
		System.out.println("�����迭 = " + Arrays.toString(arr1)+arr1);		
		System.out.println("��������迭 = " + Arrays.toString(arr2)+arr2);	
	}

	//for���� �̿��Ͽ� �ϳ��� ����
	public static void arrayManualCopy() {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = new int[10];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("�����迭 = " + Arrays.toString(arr1)+arr1);		
		System.out.println("��������迭 = " + Arrays.toString(arr2)+arr2);	
	}
}
