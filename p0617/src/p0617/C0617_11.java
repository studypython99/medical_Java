package p0617;

import java.util.Scanner;

public class C0617_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("프로그램을 종료할까요?(종료: x)");
		String str = scan.next();
		// x, X가 들어오면 프로그램 종료
//		if (str.equals("x") || str.equals("X")) {
		if (str.equalsIgnoreCase("x")) {
			System.out.println("프로그램을 종료합니다.");
		}else {
		System.out.println("프로그램을 계속 실행합니다.");
		}
		
		//		String str = null;
//		String str = "";
//		// 빈문자일때만 0번째를 가져와라
//		if(str !=null || !str.equals(""))
//			str.charAt(0);
//		else
//			System.out.println("빈문자입니다.");
		
	}

}
