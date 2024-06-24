package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		//두 수의 사칙연산
		//숫자2, 사칙연산1 입력받아 결과 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int x = scan.nextInt();
		System.out.println("숫자입력>>");
		int y = scan.nextInt();
		System.out.println("사칙연산>>");
		System.out.println("1.더하기(+)>>");
		System.out.println("2.빼기(-)>>");
		System.out.println("3.곱하기(*)>>");
		System.out.println("4.나누기(/)>>");
		String str = scan.next();
		
		//cal()메소드를 구현해서 사용
		//인스턴스 메소드
		//객체선언 후, 참조변수명.인스턴스변수명
//		Calculate c = new Calculate();
//		int result = c.cal(x, y, str);
		
		//x,y을 배열로 받아서 사용하기
		//for 사용
		int arr[] = new int[2];
		for(int i=0;i<2;i++)
		{
			arr[i] = scan.nextInt();
		}
		Calculate c = new Calculate();
		int result = c.cal(arr,str);
		System.out.println(result);
		
//		int result = 0;
//		switch(str) 
//		{
//		case "+":
//			result = x+y;
//			break;
//		case "-":
//			result = x-y;
//			break;
//		case "*":
//			result = x*y;
//			break;
//		case "/":
//			result = x/y;
//			break;
//		
//		}//switch(str) 

	}
}
