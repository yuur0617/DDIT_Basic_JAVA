package ddit.chap05.sec02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample06 {

	public static void main(String[] args) {
		Scramble s = new Scramble();	//클래스 개체생성
		String choicedWord = s.selectWord();
		String question = s.shuffle(choicedWord);
		
		System.out.println("제시어 :" + question);
		System.out.println("--------------------------");
		s.inputAnswer(choicedWord);
		
	}
}
/*		제시된 5개의 단어를 배열에 저장하시오.		
	"hope", "love", "apple", "pear", "persimmon"	
	1. 위 배열에서 임의의 단어 선택(selectWord() 메서드)하여 choicedWord변수에 저장	
	2. shuffle메서드에서 선택된 단어의 문자들을 섞는다.
	3. inputAnswer메서드에서 사용자로부터 정답을 맞출때까지 입력받아 
		맞추면 "성공했습니다 , 시도횟수 =  회"	
		틀렸으면 "정답이 아닙니다. 다시 시도하세요"출력후 다시 정답을 입력 받도록 한다.  						*/

class Scramble{
	Random r = new Random();
	
	String[] word = {"hope", "love", "apple", "pear", "persimmon"};
	
	public String selectWord() {
		int rnd = r.nextInt(5);
		return word[rnd];

	}
	
	public String shuffle(String str) {
//		char[] ch = str.toCharArray();	//문자열을 문자배열로 변경
		char[] ch = new char[str.length()];
		for(int i=0; i<ch.length; i++) {
			ch[i] = str.charAt(i);	//i번째 들어있는 문자를 ch[i]에 저장
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
			System.out.print("정답 : ");
			String answer = sc.next();
			if(answer.equals(word)) {	//내용을 비교할때는 .equals, 주소를 비교할때는 =
				System.out.println("정답입니다. 시도횟수는 " + count + "회");
				break;
			}else {
				System.out.println("정답이 아닙니다. 다시 시도하세요.");
			}
		}
	}	
}
