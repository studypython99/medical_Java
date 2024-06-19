package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_test_lotto {
	
	public static void main(String[] args) {
		// 1. 45개 번호 배열
		int[] ball = new int[45];
		
		// 2. 반복문으로 번호 45개 입력
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}// for i
		
		// 3. 번호를 랜덤으로 섞기
		int no = 0; // ball의 임의자리 선택
		int t_value = 0; // 빈공간 마련, ball[0]의 임시공간 및 ball[no]로 전달
		for(int i=0;i<100;i++) { // ball 자리바꾸기 100회
			no = (int)(Math.random()*45);
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
			
		}// for i
		//System.out.println(Arrays.toString(ball)); // 랜덤으로 섞였는지 확인
		
		// 4. myArry 내가 번호를 뽑아 6개
		// 1~45 사이만 입력, 중복불가
		Scanner scan = new Scanner(System.in);
		int[] myArry = new int[6];
		int num = 0;
		int n = 0;
		while (n<6) {
			System.out.println("내가 뽑을 번호는 ??");
			for (int i=0;i<myArry.length;i++) {
				num = scan.nextInt();
				if (num<1 || num>45) {
					System.out.println("1~45 사이의 숫자만 입력하세요");
					continue;
				}// 1~45사이만 입력
				myArry[n]=num; // 입력한 번호를 배열에 저장
				n++; // 6회까지 올라가는 카운트 n
			}// myArry
		}// while
		System.out.println(Arrays.toString(myArry));
		// 5. 일치여부확인
		// myArry, ball 배열의 비교
		int[] dangchum = new int[6];
		int count = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if (myArry[i]==ball[j]) { // 같은게 있으면 당첨!
					dangchum[count] = myArry[i];
					count++; //당첨된 갯수
				}// if myArry==ball
			}//for j
		}//for i
		// 6. 등수 및 당첨금
		System.out.println("당첨금액: ");
		switch(count) {
		case 6:
			System.out.println("1등, 100억원");
			break;
		case 5:
			System.out.println("2등, 10억원");
			break;
		case 4:
			System.out.println("3등, 1억원");
			break;
		case 3:
			System.out.println("4등, 0.1억원");
			break;
		default:
			System.out.println("꽝");
			break;
		}// switch(count)
	}// main

}
