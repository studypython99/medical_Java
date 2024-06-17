package p0617;

import java.util.Scanner;

public class C0617_13 {

	public static void main(String[] args) {
		// switch가 if보다 속도가 빠르다;;
		Scanner scan = new Scanner(System.in);
		// 두 수를 입력받아 사칙연산 구현
		System.out.println("1번쨰 숫자 입력");
		int num1 = scan.nextInt();
		System.out.println("2번쨰 숫자 입력");
		int num2 = scan.nextInt();
		
		System.out.println("1.더하기+ 2.빼기- 3.곱하기x 4.나누기/");
		System.out.println("원하는 번호를 입력하세요.");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("더하기: "+(num1+num2));
			break;
		case 2:
			System.out.println("빼기: "+(num1-num2));
			break;
		case 3:
			System.out.println("곱하기: "+(num1*num2));
			break;
		case 4:
			System.out.println("나누기: "+(num1/num2));
			//(Math.round(pi*1000)/1000f)
			break;
		default:
			System.out.println("번호를 잘못입력했습니다.");
			break;
		}
	}

}
