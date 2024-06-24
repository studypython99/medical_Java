package p0624;

import java.util.Scanner;

public class C0624_04 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		for (int i=0;i<3;i++)
		{
			System.out.println((i+1)+"번째 숫자 입력");
			num[i] = scan.nextInt();
		}
		
		//객체선언 후 참조변수명.메소드명
		Cal c = new Cal();
		int result = c.add(num[0]+num[1]+num[2]);
		int sum = c.add2(num);
		System.out.println("합계: "+result);
		
//		//두수를 입력받아, 두 수를 더한 값을 출력하시오
//		System.out.println("첫번째 숫자 입력 >>");
//		int x = scan.nextInt();
//		System.out.println("두번째 숫자 입력 >>");
//		int y = scan.nextInt();
//		System.out.println("합: "+(x+y));	
//		
//		
//		//for 사용
//		int[] num = new int[3];
//		int sum = 0;
//		for (int i=0;i<3;i++)
//		{
//			System.out.println((i+1)+"번째 숫자 입력");
//			num[i] = scan.nextInt();
//			sum += num[i];
//		}
//		System.out.println("합계: "+sum);
	}//main
}//class
