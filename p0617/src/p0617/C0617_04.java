package p0617;

import java.util.Scanner;

public class C0617_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char ch = 'a';
		System.out.println((char)(ch-32)); // A
		char ch2 = 'A';
		System.out.println((char)(ch2+32)); // a
		
		char ch3 = '3';
		char ch4 = '2';
		System.out.println(ch3-ch4); // 51-50 0:48, 1:49, 2:50, 3:51
		System.out.println(ch3+ch4); // 51+50 0:48, 1:49, 2:50, 3:51
		// 문자 숫자타입을 정수타입으로 변경하는 방법
		//각각의 숫자에서 0(48)만큼 빼주면 문자 그대로의 숫자가 된다. 3=51-48
		System.out.println((ch3-'0')+(ch4-'0')); //5
		
//		int a = 1000000;
//		int b = 1000000;
//		System.out.println(a*b); // overflow
//		System.out.println((long)a*b); // a, b 둘중 하나는 long으로 변경
		
//		char ch = 'A'; // 아스키코드로 65, a:97, 0:48
//		char ch2 = 'B'; // 아스키코드로 66, a:98, 0:48
//		// char > 4칙연산시 int로 변경된다
//		System.out.println(ch+ch2); // 131 (65+66)
		
//		// 문자를 입력해도 숫자로 받을 수 있도록
//		System.out.println("1숫자 입력");
//		String str = scan.nextLine();
//		//String: 참조형 변수는 그냥 변경할 수 없다
//		//바꾸려면?
//		int n1 = Integer.parseInt(str); // 문자열을 정수형으로 변환
//		System.out.println("2숫자 입력");
//		String str2 = scan.nextLine();
//		int n2 = Integer.parseInt(str2); // 문자열을 정수형으로 변환
//		
////		System.out.println("두수의 합: "+(str+str2));
//		System.out.println("두수의 합: "+(n1+n2));
		
//		System.out.println("1숫자 입력");
//		int n1 = scan.nextInt(); // 정수로 숫자
//		System.out.println("2숫자 입력");
//		int n2 = scan.nextInt(); // 정수로 숫자
//		System.out.println("두수의 합: "+(n1+n2));
	}

}
