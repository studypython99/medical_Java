package p0618;

import java.util.Scanner;

public class C0618_03 {

	public static void main(String[] args) {
		// 입력한 숫자를 출력하고 x or X 입력시 종료
		Scanner scan = new Scanner(System.in);
		//프로그램 종료시 입력한 숫자들의 합
		int sum = 0;
		int num = 0;
		//for(;;) {while 아랫줄 입력하면 동일}
		while(true) {
			System.out.println("숫자를 입력하세요(종료:x) >>");
			String input = scan.nextLine();
			if(input.equalsIgnoreCase("x")) {
				System.out.println("입력한숫자의 합: "+sum);
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("입력한 숫자: "+input);
			num = Integer.parseInt(input);
			sum += num;
		}
		
		// while & for
//		int i = 10;
//		while(i>=0) {
//			System.out.println(i);
//			i--;
//		}
//		
//		for(i=10;i>=0;i--) {
//			System.out.println(i);
//		}
		
		
		//		int i = 0;
//		while (i<10) {
//			System.out.println(i);
//			i++;
//		}
//		//초기화;조건식;증감식
//		for (int i=0;i<10;i++) {
//			System.out.println(i);
//		}
	}

}
