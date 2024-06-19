package p0618;

import java.util.Scanner;

public class C0618_12_국영수 {

	public static void main(String[] args) {
		// 3,3 홍길동,유관순,이순신의 국,영,수 성적을 출력하시오.
		Scanner scan = new Scanner(System.in);
		// 이름: 3명
		String[] name = new String[3];
		// 과목: 국영수
		int[][] score = new int[3][3];
		String[] title = {"이름","국어","영어","수학"};
		
		// 입력하기
		for (int i=0;i<score.length;i++) {
			System.out.println(title[0]+"을 입력하세요");
			name[i] = scan.next();
			for (int j=0;j<score[i].length;j++) {
				System.out.println(title[j+1]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();
			}//for j
		}//for i
		
		// 출력하기
		// title 입력
		for (int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}//for i title
		System.out.println();
		for (int i=0;i<3;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(score[i][j]+"\t");
			}//for j
			System.out.println();
		}//for i
		
	}//main

}
