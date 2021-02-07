package ch05;

public class Array19 {

	public static void main(String[] args) {
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
			};
		// 과목별 총점
		int korSum = 0, engSum = 0, mathSum = 0;
		
		System.out.println(" No.  Kor  Eng  Math  Sum  Avg");
		System.out.println("=================================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0; // 개인별 총점
			float avg = 0.0f;
			
			korSum += score[i][0];
			engSum += score[i][1];
			mathSum += score[i][2];
			System.out.printf("%3d",i+1);
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum/(float)score[i].length;	// 평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("=================================");
		System.out.printf("Sum Score: %3d %4d %4d%n",korSum, engSum,mathSum);
	}
}
