package p0618;

import java.util.Scanner;

public class C0618_01 {

	public static void main(String[] args) {
		// 주민번호 앞자리를 입력받아 봄여름가을겨울 출력
		//990101-1011101
		// 12-02: 겨울, 03-05: 봄, 06-08:여름, 09-11: 가을
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 입력(ex: 880101-1011111)>>");
		// 1,2 1900 // 2024-1988 = 36
		// 3,4 2000 // 2024-2001 = 23
		String input = scan.nextLine();
		System.out.println("입력: "+input);
		String flag = input.substring(7,8);
		String birthY = input.substring(0,2);
		System.out.println("1234: "+flag);
		System.out.println("age: "+birthY);
		
		//int n = Integer.parseInt(str1)
		int age = 0;
		switch(flag) {
			case "1": case "2":
				age = 2024 - Integer.parseInt("19"+birthY);
				
				break;
			case "3": case "4":
				age = 2024 - Integer.parseInt("20"+birthY);
				
				break;		
		}
		System.out.println("나이: "+age);
		
		
		
		
//		// 태어난 월 계절
//		String birthM = input.substring(2,4);
//		System.out.println("태어난 월: "+birthM);
//		switch (birthM) {
//			case "03": case "04": case "05":
//				System.out.println("봄");
//				break;
//			case "06": case "07": case "08":
//				System.out.println("여름");
//				break;
//			case "09": case "10": case "11":
//				System.out.println("가을");
//				break;
//			case "12": case "01": case "02":
//				System.out.println("겨울");
//				break;
//				}

			
//		String str = "990101";
//		//str.substring(n,m): n~(m-1) 까지 가져온다 
//		String birthM = str.substring(2,4);
//		System.out.println(birthM);

	}

}
