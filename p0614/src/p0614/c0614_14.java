package p0614;

import java.util.Scanner;

public class c0614_14 {

	public static void main(String[] args) {
		int a = 10;

		if(a==10) {
			System.out.println("ooo");
		}else {
			System.out.println("xxx");
		}
		// 입력한 숫자가 양수인지 음수인지, 0은 양수로 출력
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num > 0) {
			System.out.println(num+"양수");
		}else if (num < 0){
			System.out.println("음수");
		}else {
			System.out.println("0");
			
		}
		
//		if (a>0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}
		

	}

}
