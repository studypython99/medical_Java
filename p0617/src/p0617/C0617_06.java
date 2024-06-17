package p0617;

import java.util.Scanner;

public class C0617_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String str = scan.next(); // next(): _한칸띄우기 전까지만 받음
									// nextLine(): 전체 다 받는다
		char ch = str.charAt(0); // 문자열을 문자로 변환, charAt(0): 첫번째 문자만 가져온다
		// 영문자 확인
		if((ch >= 'a' && ch <='z')||(ch >= 'A' && ch <='Z')) {
			System.out.println("영문자 입니다.");
		}else {
			System.out.println("영문자가 아닙니다.");
		}
		// 숫자 확인
		if((ch >= '0' && ch <='9')) {
			System.out.println("숫자 입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
	}

}
