package ddit.chap05.sec02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample06 {

	public static void main(String[] args) {
		Scramble s = new Scramble();	//Ŭ���� ��ü����
		String choicedWord = s.selectWord();
		String question = s.shuffle(choicedWord);
		
		System.out.println("���þ� :" + question);
		System.out.println("--------------------------");
		s.inputAnswer(choicedWord);
		
	}
}
/*		���õ� 5���� �ܾ �迭�� �����Ͻÿ�.		
	"hope", "love", "apple", "pear", "persimmon"	
	1. �� �迭���� ������ �ܾ� ����(selectWord() �޼���)�Ͽ� choicedWord������ ����	
	2. shuffle�޼��忡�� ���õ� �ܾ��� ���ڵ��� ���´�.
	3. inputAnswer�޼��忡�� ����ڷκ��� ������ ���⶧���� �Է¹޾� 
		���߸� "�����߽��ϴ� , �õ�Ƚ�� =  ȸ"	
		Ʋ������ "������ �ƴմϴ�. �ٽ� �õ��ϼ���"����� �ٽ� ������ �Է� �޵��� �Ѵ�.  						*/

class Scramble{
	Random r = new Random();
	
	String[] word = {"hope", "love", "apple", "pear", "persimmon"};
	
	public String selectWord() {
		int rnd = r.nextInt(5);
		return word[rnd];

	}
	
	public String shuffle(String str) {
//		char[] ch = str.toCharArray();	//���ڿ��� ���ڹ迭�� ����
		char[] ch = new char[str.length()];
		for(int i=0; i<ch.length; i++) {
			ch[i] = str.charAt(i);	//i��° ����ִ� ���ڸ� ch[i]�� ����
		}
		for(int i=0; i<100; i++) {
			int rnd = r.nextInt(ch.length);
			char temp = ch[0];
			ch[0] = ch[rnd];
			ch[rnd] = temp;
		}
		return new String(ch);
	}
	
	public void inputAnswer(String word) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println();
		while(true) {
			
			count++;
			System.out.print("���� : ");
			String answer = sc.next();
			if(answer.equals(word)) {	//������ ���Ҷ��� .equals, �ּҸ� ���Ҷ��� =
				System.out.println("�����Դϴ�. �õ�Ƚ���� " + count + "ȸ");
				break;
			}else {
				System.out.println("������ �ƴմϴ�. �ٽ� �õ��ϼ���.");
			}
		}
	}	
}
