package p0614;

import java.util.Scanner;

public class c0614_12 {

	public static void main(String[] args) {
		// Integer.parseInt(): 문자열을 숫자로 변경
		// next(), nextLine(), nextInt(), nextDouble()
		// charAt(n): n번째 문자를 가져옴
		
//		대문자를 입력하면 소문자로 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("대문자 입력");
		String str = scan.next();
		char input = str.charAt(0); // 0번째 문자를 가져와
		System.out.println((char)(input+32)); //a
		System.out.println(str.toUpperCase()); //A
				
	}

}
