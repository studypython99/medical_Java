package p0619;

import java.util.Arrays;
import java.util.Scanner;

public class C0619_02_로또 {
	public static void main(String[] args) {
		// 1~45까지 로또번호를 생성, 랜덤으로 섞은 후 출력하기
		int[] ball = new int[45];
		// 1~14까지 ball 배열에 입력
		for(int i=0;i<45;i++) 
		{
			ball[i] = i+1;
		}//for i
		// 1~45 출력
//		for(int i=0;i<45;i++) 
//		{
//			System.out.print(ball[i]+","); 
//		}//for i
		
		// 2. ball 배열 섞기
		int no = 0; // 0번째 배열과 바꿀 배열번호
		int t_value = 0; // 임시저장소
		for(int i=0;i<300;i++) 
		{
			no = (int)(Math.random()*45); // 0~44
			// t_value:빈컵, ball[0]:우유, ball[no]:주스
			t_value = ball[0]; // 우유를 빈컵에
			ball[0] = ball[no]; //주스를 우유가 있던 컵에
			ball[no] = t_value; //우유를 주스가 있던 컵에
		}//for i300

		// my_ball 입력
		// 6개의 로또번호 입력
		Scanner scan = new Scanner(System.in);
		int[] my_ball = new int[6];
		for(int i=0;i<6;i++) 
		{
			System.out.printf("%d번째 로또번호를 입력하세요 >>",i+1);
			my_ball[i] = scan.nextInt();
		}//for i
		//입력번호 출력
		System.out.println("입력번호: ");
		for(int i=0;i<6;i++) 
		{
			System.out.printf("%1d",my_ball[i]); //1칸씩 띄우기
		}//for i
		System.out.println();
		
		//로또번호 출력
		System.out.println("로또번호: ");
		for(int i=0;i<6;i++) 
		{
			System.out.printf("%1d",ball[i]); //1칸씩 띄우기
		}//for i
		
		// 6. 당첨갯수
		int[] dangchum = new int[6];
		int count = 0;
		for (int i=0;i<6;i++) 
		{
			for (int j=0;j<6;j++) 
			{
				if (ball[i] == my_ball[j]) 
				{
					dangchum[count] = my_ball[j];
					count++;
				}// if ball[i] == my_ball[j]
			}//for j
		}//for i
		System.out.println();
		// 7. 당첨번호 출력
		System.out.printf("댕첨갯수: %d \n",count);
		System.out.println("당첨번호: ");
		for(int i=0;i<count;i++) 
		{
			System.out.printf("%d, ",dangchum[i]);
		}// for i
		
		
//		int[][] arr = new int[5][5];
//		// 1~25 번호를 넣고, 랜덤으로 섞은 후 출력하기
//		int[] to_25 = new int[25];
//		for(int i=0;i<25;i++) {
//			to_25[i] = i+1; // 1~25 입력
//		}//for i
//		//랜덤으로 섞기
//		int no = 0;
//		int v_value = 0;
//		for(int i=0;i<300;i++) {
//			no = (int)(Math.random()*25);
//			v_value = to_25[0];
//			to_25[0] = to_25[no];
//			to_25[no] = v_value;
//		}
////		System.out.println();
////		System.out.println(Arrays.toString(to_25));
//		
//		// 섞어놓은 to_25를 배열에 입력하기
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				arr[i][j] = to_25[(i*5+(j+1))];
//			}// for j
//		}// for i
//		
//		//5*5배열출력
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}//for j
//			System.out.println();
//		}// for i
	}//main
}
