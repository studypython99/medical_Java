package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 구구단 세로 출력
		for (int j=1; j<10; j++) {	 
			for (int i=2; i<10; i++) {
//				System.out.printf("[%d단] \n",i);
					System.out.printf("%dx%d=%d \t",i,j,i*j);
				
			}
			System.out.println("\n");
		}
			
		
//		int sum = 0;
//		int i = 0;
//		// 1~10까지 합
//		for (i=1; i<=10; i++) {
//			sum += i;
//		}
		// for문 안에서는 11번까지 감, 따라서 i-1해야 10번까지
//		System.out.println((i-1)+"까지의 합"+sum);
		
		// 1~100합, sum값이 150을 넘었을 때 i,sum값 출력
//		int sum = 0;
////		int i = 0; // for문 밖에서 i 선언
//		for (int i=1; i<=100; i++) { //for문 안에서 i 선언, 지역변수
//			sum = sum+i;
//			if (sum >= 150) {
//				System.out.println("i값: "+i);
//				System.out.println("sum값: "+sum);
//				break; // sum값이 150 이상일 때 멈춘다
//			}
////		System.out.println("i값: "+i);
//		System.out.println("sum값: "+sum);
//		}
		
		
		//구구단 중첩for문 사용
//		for (int i=2; i<10; i++) {
//			System.out.printf("[%d단]\n",i);
//			for (int j=1; j<10; j++) {
////				System.out.printf(i+"x"+j+"="+(j*i)+"\t");
//				System.out.printf("%dx%d=%d \t",i,j,i*j);
//			}
//			System.out.println("");
//		}
		
		//		//입력받을 때 마다 합계를 출력하시오
//		// 5 => 5, 10 =>15, 10번을 출력하시오
//		int sum = 0;
//		for(int i=1;i<=10;i++) {
//			System.out.println("숫자입력>>");
//			int input = scan.nextInt();
//			sum = sum + input;
//			System.out.println(sum);
//			
//		}
		
		//1~100까지 숫자를 더해서 출력
//		int sum = 0;
//		for(int i=0; i<=100; i+=2) {
//			if((i+1)%2 != 0) {
//			sum = sum+i;
//			System.out.println("i: "+i);
//			System.out.println("sum: "+sum);
//			}
//		}
//		System.out.println(sum);
		
		//1~100까지 홀수만 더해서 최종값
		
		
		// for문 1~10까지 더하기
//		int sum = 0;
//		for(int i=0; i<=10; i++) {
//			sum = sum+i;
//			System.out.println("i: "+i);
//			System.out.println("sum: "+sum);
//		}
//		System.out.println("최종 sum: "+sum);

	}

}
