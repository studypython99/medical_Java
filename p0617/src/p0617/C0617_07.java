package p0617;

import java.util.Scanner;

public class C0617_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 2개의 문자열을 입력받아
		// 숫자이면 정수타입으로 변경해서 두 수를 더하는 프로그램 구현.
		System.out.println("문자 입력");
		String str1 = scan.next();
		char ch1 = str1.charAt(0);
		String str2 = scan.next();
		char ch2 = str2.charAt(0);
		
		if((ch1 >= '0' && ch1 <= '9') && (ch2 >= '0' && ch2 <= '9')) {
			int num1 = ch1 - '0'; //문자를 정수형으로 변경하는 방법
			int n = Integer.parseInt(str1); // 문자열을 정수형으로 변경
			int num2 = ch2 - '0';
			System.out.println(num1+num2);
		}else {
			System.out.printf("%c, %c", ch1, ch2); // 문자 그대로 출력"
					
		}
		
//		System.out.println(ch1);
//		System.out.println(ch2);
//		System.out.println((int)((ch1-'0')+(ch2-'0')));
	}

}
