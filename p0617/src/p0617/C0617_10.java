package p0617;

import java.util.Scanner;

public class C0617_10 {

	public static void main(String[] args) {
		// 숫자를 입력받아, 60점 이상이면 합격, 60점 미만이면 불합격 출력
		// 90점이상: A, 80점이상: B, 70점이상: C, 60점이상 D, 나머지 F
		Scanner scan = new Scanner(System.in);
		System.out.println("점수입력 >>");
		int num1 = scan.nextInt();
		String absx = num1 >= 60 ? "합격" : "불합격";
		System.out.println(absx);
		//예외처리, 999점이라면?
		// 0~100점 사이에서만 구분할 수 있도록한다.
		if(num1>0 && num1<=100) {
		if (num1 >= 90) {System.out.println("A");}
		else if (num1 >= 80) System.out.println("B");
		else if (num1 >= 70) System.out.println("C");
		else if (num1 >= 60) System.out.println("D");
		else System.out.println("F");}
		else System.out.println("올바른점수가아니에요");
	}

}
