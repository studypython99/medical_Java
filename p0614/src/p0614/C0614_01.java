package p0614;

public class C0614_01 {

	public static void main(String[] args) {
		
		// 논리형
		boolean bol = true;
		boolean bol2 = false;
		
		// 문자형
		char ch1 = 'a'; // 홑따옴표
		//char ch2 = 'xx'; // char는 문자 1개만 저장
		char ch3 = ' '; // '' 공백x / ' ' 한칸띄우기 가능
		
		byte a = 127; // 127까지 입력가능
		short b = 2;
		int c = 2147483647; // 2147483647;까지 입력가능
		long d = 2147483648L; // 넘어가면 L(long)입력
		
		//실수형 - float: F를 붙여야한다, double
		float e = 3.14F; // 접미사 F 무조건 붙여야함.
		double f = 3.14; // 접미사 D 생략가능
		
		// 정수형 - byte, short, int, long
		int num = 10;
		System.out.println(num);
		// print(num); 안됨;;
		
	}//main

}//class
