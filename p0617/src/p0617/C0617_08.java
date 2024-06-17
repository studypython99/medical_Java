package p0617;

import java.util.Scanner;

public class C0617_08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int a = 10;
		if (a>0) {
			System.out.println("양수");
		}else if (a==0) {
			System.out.println("0입니다");
		}else {
			System.out.println("음수");
		}
		// 한줄일때만 중괄호 생략가능
		if(a>0)
			System.out.println("양수");
		else if(a==0)
			System.out.println("0입니다.");
		else
			System.out.println("음수");
		
//		// 숫자를 입력받아, 양수, 음수,0 출력
//		System.out.println("숫자를 입력하세요");
//		int num1 = scan.nextInt();
//		// 뒤에 양수,음수가 문자열이기에 앞에 String
//		// 결과값의 형태로 String
//		String absx = (num1 >0) ? "양수" :(num1==0?"0입니다":"음수");
//		System.out.println((absx));
//		if(num1 >=0) {
//			System.out.println("양수");
//		}else(num1 <0) {
//			System.out.println("음수");
//		}
				
		
//		System.out.println("숫자를 입력하세요");
//		int x = scan.nextInt();
//		int absx = x>=10 ? x: -x;
//		System.out.println(absx);
		
//		// 입력한숫자의 length가 얼마인지
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자 입력");
//		String str = scan.next(); // 안녕 반가워: 2
//		System.out.println("입력한 문자의 길이: "+str.length());
////		String str = scan.nextLine(); // 안녕 반가워: 6
////		System.out.println("입력한 문자의 길이: "+str.length());
	}

}
