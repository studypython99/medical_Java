package p0614;

import java.util.Scanner;

public class c0614_09 {

	public static void main(String[] args) {
		int sca = 0;
		Scanner scan = new Scanner(System.in); //콘솔창에서 입력받는다
		
		// 두 숫자를 입력받아 +-*/ 출력하시오.
//		System.out.println("1번숫자 >>");
		int num1 = scan.nextInt();
	//	System.out.println("2번숫자 >>");
		int num2 = scan.nextInt();
		
		System.out.println("덧셈"+(num1+num2));
		System.out.println("뺄셈"+(num1-num2));
		System.out.println("곱셈"+(num1*num2));
		System.out.printf("나눗셈"+"%.2f\n",((float)num1/(float)num2));
	}

}
