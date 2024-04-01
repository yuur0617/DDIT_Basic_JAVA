package ddit.chap05.sec03;

import java.util.Random;

public class TwoDimArray02 {

	public static void main(String[] args) {
		Dice d = new Dice();				//������
		d.setDice();
		char[][] ch = d.convertArray();		//ch�迭�� concertArray�� ��ȯ�� ���� �־��ش�.
		d.showHisto(ch); 					//char[][] ch�� ����
	}

}

class Dice{
	int[] dice = new int[6];			//���� ���� ���� ����	//DiceŬ������ �ɹ�����
	Random rnd = new Random();			//���� ��ü ����
	char[][] histo;				//�迭����
	
	//�ֻ����� 50�� ���� ���� ���� ���� ���ϴ� �ν��Ͻ��޼ҵ�
	public void setDice() {				
		for(int i=0; i<50; i++) {		//�ֻ��� 50���� ������ for��
			int r=rnd.nextInt(6)+1;		//������ r�� ����
			dice[r-1]++;				//������ �ش��ϴ� �ε����� ���� +1
		}
	}
	
	//���� ���� ���ϴ� �ν��Ͻ��޼ҵ�
	public char[][] convertArray() {				//�迭�� ��ȯ�ϱ����� �ڷ����� ��ȯŸ������ ����
		int countOfRow = dice[0];					//�ӽ��ִ밪����		
		for(int i=1; i<dice.length; i++) {
			if(countOfRow < dice[i]) 	
				countOfRow = dice[i];				//���� �ִ밪�� countOfRow������ ����
			
		}
		histo = new char[countOfRow][6];	//[countOfRow][6]�� ũ����� (histo)�������迭 ����
		
		for(int i=0; i<dice.length; i++) {
			for(int j=0; j<dice[i]; j++) {
				histo[j][i] = '*';
			}
		}
		return histo;								//�迭 ��ȯ
	}
	
	//histo�� ����ϱ����� �޼ҵ�
	public void showHisto(char[][] ch) {			//����ڷ����� ���� Ÿ���� ��ȣ�ȿ� ���´�.
		for(int i=ch.length-1; i>= 0; i--) {		//ch.length = �ִ밪 
			for(int j=0; j<ch[i].length; j++) {
				System.out.print(ch[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		for(int i=1; i<7; i++) {
			System.out.print(i + "\t");
		}
	}
	
}