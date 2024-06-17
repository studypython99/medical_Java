package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
		
		Math.random(); // 0 <= x && x < 1
//		System.out.println(Math.random()*10);
		// 1~10까지 랜덤
		int num1 = (int)(Math.random()*10)+1;
		System.out.println("1~10: "+num1);
		
		// 1~100까지 랜덤
		int num2 = (int)(Math.random()*100)+1;
		System.out.println("1~100: "+num2);
		
		// 0~4까지 랜덤
		int num3 = (int)(Math.random()*5);
		System.out.println("0~4: "+num3);
		
		// 0~19까지 랜덤
		int num4 = (int)(Math.random()*20);
		System.out.println("0~19: "+(num4));
		
		// 2~10
		int num5 = (int)(Math.random()*9)+2;
		System.out.println("2~10: "+num5);
		
		// 1~3
		int num6 = (int)(Math.random()*3)+1;
		System.out.println("1~3: "+num6);
		
		// 1~45
		int num7 = (int)(Math.random()*45)+1;
		System.out.println("1~45: "+num7);

		// 1~10까지 랜덤숫자 생성, 숫자1개 입력받아서 정답, 꽝 출력
		Scanner scan = new Scanner(System.in);
		int num8 = (int)(Math.random()*10)+1;
		System.out.println("1~10까지 숫자입력");
		int num9 = scan.nextInt();
		if (num8 == num9) {System.out.println("정답");}
		else {System.out.println("꽝");}
		System.out.println("정답은: "+num8);
	}

}
