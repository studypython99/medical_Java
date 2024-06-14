package p0614;

import java.util.Scanner;

public class c0614_08 {

	public static void main(String[] args) {
		// input()
//		java.util.Scanner scan2 = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		// 숫자 - nextInt(), nextDouble()
		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
		String num = scan.nextLine();		
		System.out.println("숫자2를 입력하세요: ");
		String num2 = scan.nextLine();
		
		//기본형 타입의 경우, 형변환
		//String 참조형 타입
		//int number = Integer.parseInt(num);
		// 참조형 문자열타입을 정수형타입으로 변경
		int number = Integer.parseInt(num); 
		int number2 = Integer.parseInt(num2);
		System.out.println("입력한 숫자: "+(number+number2)    );
		
		
		
		// 문자열 - nextLine(), 띄어쓰기도 다 받는다
		System.out.println("3문자를 입력하세요.");
		String str3 = scan.nextLine();	
		System.out.println("3입력한 문자: "+str3);
		
		System.out.println("1문자를 입력하세요.");
		String str = scan.next();
		System.out.println("1입력한 문자: "+str);
		
		// 문자열 - next(), 띄어쓰기를 하면 넘어감, 엔터를 입력받지 않는다.
		//			nextLine() 이렇게 입력해줘야하는 경우도 생김...
		System.out.println("2문자를 입력하세요.");
		String str2 = scan.next();
		System.out.println("2입력한 문자: "+str2);
		scan.nextLine();
				

		
		
	}

}
