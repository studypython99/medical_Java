package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		// 주민등록번호 나이를 if문으로 작성
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호 입력(ex: 880101-1234567)>>");
		String input = scan.nextLine();
		String flag = input.substring(7,8);
		String birthY = input.substring(0,2);
		int age = 0;
		if (flag.equals("1") || flag.equals("2") ) {
			age = 2024-Integer.parseInt("19"+birthY);
			System.out.println("나이: "+age);
		}else {
			age = 2024-Integer.parseInt("20"+birthY);
			System.out.println("나이: "+age);
		}
		
	}
	
}
