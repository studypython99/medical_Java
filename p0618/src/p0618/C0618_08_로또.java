package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_08_로또 {

	public static void main(String[] args) {
		// 로또번호 생성, 섞기, 6개의 숫자 출력
		
		// 1. 45개 번호 배열
		int[] ball = new int[45];
		
		// 2. 반복문을 사용하여 1~45까지 숫자 입력
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}//for ball
//		System.out.println(Arrays.toString(ball));
		
		// 3. 랜덤으로 섞기
		int no = 0;
		int t_value = 0;
		for(int i=0;i<100;i++) {
			no = (int)(Math.random()*45);
//			System.out.println(no);
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
			}//for random shuffle
//		System.out.println(Arrays.toString(ball));
		// 5. 로또번호 출력 ball의 6개 출력
		System.out.println("로또번호: ");
		for(int i=0;i<6;i++) {
			System.out.println(ball[i]+" ");
		}
		
		// 4. 나의 로또번호 6개
		Scanner scan = new Scanner(System.in);
		int[] myArry = new int[6];
		int num = 0;
		int n = 0;
		while(n<6) {
			System.out.println("나의 로또번호 >>");
			for(int i=0;i<myArry.length;i++) {
				num = scan.nextInt();
				if(num<1 || num>45) {
					System.out.println("1~45숫자만 입력하세요.");
					continue;
				}
				myArry[n] = num;
				n++;
		}//for myArry
		}//while (n<6)
		System.out.println(Arrays.toString(myArry));
		
		
		// 6. 로또번호와 일치하는 번호
		//당첨번호도 같이 출력
		int[] dang = new int[6];
		int count = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(myArry[i]==ball[j]) {
					dang[count] = myArry[i]; // dang의 0번위치부터 입력한다.
					count++;
				}//if myArry==ball
			}//for j
		}// for i
		
		System.out.println("로또당첨갯수: "+count);
		System.out.printf("당첨번호: \n");
		for (int i=0;i<count;i++) {
			if(count==0) {
				System.out.println("없습니다.");
			}else {
			System.out.printf("%d.",dang[i]);
			}
		}//for count
		// 당첨금액: 6개 100억원 / 5개 1억원 / 4개 1백만원 / 3개 1만원
		System.out.println("당첨금액: ");
		switch (count) {
		case 6:
			System.out.println("100억원");
			break;
		case 5:
			System.out.println("1억원");
			break;
		case 4:
			System.out.println("100만원");
			break;
		case 3:
			System.out.println("1만원");
			break;
		default:
			System.out.println("꽝");
			break;
			
		}
		
	}// main

}
