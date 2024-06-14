package p0614;

import java.util.Scanner;

public class c0614_13 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int)(pi*1000)/1000f;
		System.out.println(shortPi);
		
		// 입력한 숫자를 소수점 2자리 절사
		//System.in: 콘솔에서 입력받는다
		Scanner scan = new Scanner(System.in); 
		System.out.printf("float입력");
		float num = scan.nextFloat();
//		float short_num = (int)(num*100)/100f; // 절사
//		float short_num = Math.round(num*100)/100f;	// 반올림
		double short_num = Math.ceil(num*100)/100d;	// 올림
		System.out.println(short_num);

	}

}
