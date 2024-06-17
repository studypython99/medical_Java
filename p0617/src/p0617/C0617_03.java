package p0617;

import java.util.Scanner;

public class C0617_03 {

	public static void main(String[] args) {
		//Java.util.Scanner scan = new Scanner(System.in); 동일
		Scanner scan = new Scanner(System.in);
		
		// input("데이터입력 >>")
		System.out.println("데이터 입력 >>");
		String input = scan.next();
		System.out.println("숫자 입력 >>");
		int num = scan.nextInt();
		System.out.printf("입력한 데이터: %s, 입력숫자: %d \n",input, num);
		
		System.out.printf("입력한 데이터: %s", input);
	}

}
