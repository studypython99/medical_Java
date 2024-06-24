package p0619;

public class C0619_03_얕은복사 {

	public static void main(String[] args) {
		
		
		
		int[] score = {1,2,3,4,5};
		System.out.println(score);
		int[] score2 = score; // 얕은복사, 주소값만 복사됨
		
		int[] score3 = new int[score.length];
		for(int i=0;i<score3.length;i++) {
			score3[i] = score[i];
			System.out.println(score3);
		}
		
		

	}

}
