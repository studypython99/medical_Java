package p0624;

import java.util.Scanner;

public class Calculate {

	//메소드 1개를 사용해서 구현
	Scanner scan = new Scanner(System.in);

	void change(int[] score)
	{
		System.out.println("변경할 국어점수: ");	
		score[0] = scan.nextInt();
		
		System.out.println("변경할 영어점수: ");	
		score[1] = scan.nextInt();
		
		System.out.println("변경할 수학점수: ");	
		score[2] = scan.nextInt();
		
	}
//	void change(int kor, int eng, int math)
//	{
//		System.out.println("현재 국어점수: "+kor);	
//		kor = scan.nextInt();
//		
//		System.out.println("현재 영어점수: "+eng);	
//		eng = scan.nextInt();
//		
//		System.out.println("현재 수학점수: "+math);	
//		math = scan.nextInt();
//				
//		System.out.println("변경 국어점수: "+kor);
//		System.out.println("변경 국어점수: "+eng);
//		System.out.println("변경 수학점수: "+math);
//	}
	//
	int korChange(int kor)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("변경할 국어점수를 입력하세요");
		kor = scan.nextInt();
		return kor;
	}
	int engChange(int eng)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("변경할 영어점수를 입력하세요");
		eng = scan.nextInt();
		return eng;
	}
	int mathChange(int math)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("변경할 수학점수를 입력하세요");
		math = scan.nextInt();
		return math;
	}
	
//	int result = 0;
//	//cal()
//	//return result; 사용할것
//	int cal(int[] arr, String str)
//	{
//		switch(str) 
//		{
//		case "+":
//			result = arr[0]+arr[1];
//			break;
//		case "-":
//			result = arr[0]-arr[1];
//			break;
//		case "*":
//			result = arr[0]*arr[1];
//			break;
//		case "/":
//			result = arr[0]/arr[1];
//			break;
//		
//		}//switch(str) 
//		
//		
//		
//		
//		return result;
//	}
}//class
