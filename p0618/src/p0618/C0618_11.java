package p0618;

import java.util.Scanner;

public class C0618_11 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		// 이름 입력하기
		String[] name = new String[2];
		
		
		int[][] score = new int[2][3];
		String[] title = {"이름", "국어", "영어", "수학"};
		// 2명 학생의 성적을 입력받아 출력하시오.
		// 입력하기
		for(int i=0;i<score.length;i++) { // score.length: 2
			System.out.println(title[0]+"을 입력하세요.>>");
			name[i] = scan.next();
			for(int j=0;j<score[i].length;j++) { // score[i].length: 3 
				System.out.println(title[j+1]+"을 입력하세요.>>");
				score[i][j] = scan.nextInt();
			}//for j
		}//for i
		
		// 출력하기
		//title 입력
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		for(int i=0;i<2;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+"\t");
			}//for j
			System.out.println();
		}//for i
		
		//		int[][] score = new int[5][3];
//		score[0][0] = 100;
//		score[0][1] = 100;
//		score[0][2] = 100;
//		score[1][0] = 90;
//		score[1][1] = 90;
//		score[1][2] = 90;
//		score[2][0] = 80;
//		score[2][1] = 80;
//		score[2][2] = 80;
//		score[3][0] = 70;
//		score[3][1] = 70;
//		score[3][2] = 70;
//		score[4][0] = 60;
//		score[4][1] = 60;
//		score[4][2] = 60;
//		
//		int[][] score2 = {
//				{100,100,100},
//				{90,90,90},
//				{80,80,80},
//				{70,70,70},
//				{60,60,60}
//		};
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<3;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
                       
	}//main

}
