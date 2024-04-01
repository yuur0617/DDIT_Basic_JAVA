package ddit.chap05.sec03;

public class TwoDimArray01 {

	public static void main(String[] args) {
		tarrayMethod01();
	}

	public static void tarrayMethod01() {
/*		5명의 이름(홍길동, 정몽주, 강감찬, 김유신, 이순신)과	-name
 		3과목의 성적을 배열처리하고자 한다.	-score
 		배열을 생성하시오.							
 		 이름		  국어		  산수		  사회
 		홍길동	 80		 75		 80
 		정몽주	 90		 85		 90
 		강감찬	 90		 90		 80
 		김유신	 80		 70		 70
 		이순신	 70		 95		 70		 			 */
		String[] name = {"홍길동", "정몽주", "강감찬", "김유신", "이순신"};
		int[][] score = {{80, 75, 80, 0, 0, 1}, {90, 85, 90, 0, 0, 1}, {90, 90, 80, 0, 0, 1}, 
						{80, 70, 70, 0, 0, 1}, {70, 95, 70, 0, 0, 1}};
		
		System.out.println("이름            국어     산수     사회     총점     평균    등수");

		for(int i=0; i<score.length; i++) {
			for(int j=0; j<3; j++) {
				score[i][3] += score[i][j];	//총점
			}
			score[i][4] = score[i][3]/3;	//평균
		}
		
		for(int i=0; i<score.length; i++) {	//등수
			for(int j=0; j<score.length; j++) {
				if(score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
		}
		
		for(int i=0; i<score.length; i++) {	//순차등수
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
		
		for(int i=0; i<score.length; i++) {	//출력
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%-5d", score[i][j]);				
			}
			System.out.println();
		}
	}
}
