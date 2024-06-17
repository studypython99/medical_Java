package p0617;

import java.util.Scanner;

public class C0617_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문자열 선언방법 2가지
		String str = "안녕";
		String str2 = "안녕";
		String str3 = new String("안녕");
		int num = 5;
		int num2 = 5;
		// 기본타입 8개 = boolean, char, byte, short, int, long, float, double
		// 기본타입: 비교연산자를 통해서 확인 가능
		if (num == num2) {
			System.out.println("같은숫자");
		}else {
			System.out.println("다른숫자");
		}
		System.out.println("str: "+str);
		System.out.println("new str: "+str3);
		
		// 문자열, 참조변수(str,str2,str3) 비교는 == 비교가 안됨, 
		//equals메소드 사용해야한다.
		
		//if (str == str3) // ==비교 안됨;;
		if (str.equals(str3)) {
			System.out.println("같은문자");
		}else {
			System.out.println("다른문자");			
		}
		
		//----------------------------------------
		// 
		System.out.println("------------------------------");
		if(str =="안녕") {
			System.out.println("같은");
		}else {
			System.out.println("다른");
		}
	}

}
