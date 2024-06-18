package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_05_배열 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//배열생성
//		int score[] = new int[5];
		//주소는 0부터 시작
		int[] score = new int[5]; //int[] type에 붙이자!
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;

		//배열에 입력
//		for(int i=0;i<5;i++) {
//			score[i] = i+1;
//		}
		for(int i=0;i<5;i++) {
			System.out.println();
			score[i] = i+1;
		}
		
		System.out.println(score); // 주소값 [I@5f2050f6
		System.out.println(Arrays.toString(score)); // [1, 2, 3, 4, 5]

		//배열 출력
		for (int i=0;i<5;i++) {
			System.out.println(score[i]);
		}
		
//		// 5개의 숫자를 한번에 입력받은 후 출력
//		// 5개의 숫자를 한번에 입력받은 후 3번째 숫자 출력
//		System.out.println("숫자를 입력하세요 >>");
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		int n3 = scan.nextInt();
//		int n4 = scan.nextInt();
//		int n5 = scan.nextInt();
//		System.out.println(n3);

	}

}
