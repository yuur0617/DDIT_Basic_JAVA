package ddit.chap05.sec03;

public class TwoDimArray01 {

	public static void main(String[] args) {
		tarrayMethod01();
	}

	public static void tarrayMethod01() {
/*		5���� �̸�(ȫ�浿, ������, ������, ������, �̼���)��	-name
 		3������ ������ �迭ó���ϰ��� �Ѵ�.	-score
 		�迭�� �����Ͻÿ�.							
 		 �̸�		  ����		  ���		  ��ȸ
 		ȫ�浿	 80		 75		 80
 		������	 90		 85		 90
 		������	 90		 90		 80
 		������	 80		 70		 70
 		�̼���	 70		 95		 70		 			 */
		String[] name = {"ȫ�浿", "������", "������", "������", "�̼���"};
		int[][] score = {{80, 75, 80, 0, 0, 1}, {90, 85, 90, 0, 0, 1}, {90, 90, 80, 0, 0, 1}, 
						{80, 70, 70, 0, 0, 1}, {70, 95, 70, 0, 0, 1}};
		
		System.out.println("�̸�            ����     ���     ��ȸ     ����     ���    ���");

		for(int i=0; i<score.length; i++) {
			for(int j=0; j<3; j++) {
				score[i][3] += score[i][j];	//����
			}
			score[i][4] = score[i][3]/3;	//���
		}
		
		for(int i=0; i<score.length; i++) {	//���
			for(int j=0; j<score.length; j++) {
				if(score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
		}
		
		for(int i=0; i<score.length; i++) {	//�������
			for(int j=0; j<score.length; j++) {
				if(score[i][5]<score[j][5]) {
					int[] t = score[i];
					score[i] = score[j];
					score[j] = t;	
					
					String h = name[i];
					name[i] = name[j];
					name[j] = h;
				}
			}
		}
		
		for(int i=0; i<score.length; i++) {	//���
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%-5d", score[i][j]);				
			}
			System.out.println();
		}
	}
}
