package p0619;

import java.util.Arrays;
import java.util.Scanner;

public class C0619_04 {

	public static void main(String[] args) {
		// 퀴즈
		// 5,5배열생성

		// 1이 5개 배치된 5x5배열
		int[][] arr = new int[5][5];
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 1;
		arr[0][4] = 1;
		
		// 2. 번호섞기
		int no1 = 0;
		int no2 = 0;
		int t_value = 0;
		for(int i=0;i<300;i++) {
			no1 = (int)(Math.random()*5);
			no2 = (int)(Math.random()*5);
			t_value = arr[0][0];
			arr[0][0] = arr[no1][no2];
			arr[no1][no2] = t_value;
		}
		// 번호 출력
		//5*5배열출력
		for (int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+"\t");
			}//for j
			System.out.println();
		}// for i
		//--------------------------------------------------------
		// 1. 번호 맞추기
		String[][] lotto = new String[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				lotto[i][j] = "Q";
			}
		}
		while(true) {
			
		
			
			// 번호 출력
			//5*5배열출력
			for (int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(lotto[i][j]+"\t");
				}//for j
				System.out.println();
			}// for i
			
			// 4. 좌표입력
			// 좌표값이 확인되었다면: 확인된 좌표입니다, 다시 입력해주세요
			// 
			// 좌표 범위를 넘어가면 다시 입력
			// x,y가 5이상이면 다시
			
			Scanner scan = new Scanner(System.in);
			System.out.println("-----------");
			System.out.println("가로 좌표 입력");
			int x = scan.nextInt();
			System.out.println("세로 좌표 입력");
			int y = scan.nextInt();

			// 좌표가 범위를 넘어갔을 경우
			if((x<0||x>4)||(y<0||y>4)) {
				System.out.println("확인된 좌표입니다, 다시 입력하세요");
				continue;
			}//좌표가 범위를
			
			// 좌표가 이미 확인된 경우
			if(lotto[x][y].equals("꽝")||lotto[x][y].equals("당첨")) {
				System.out.println("확인된 좌표입니다, 다시 입력하세요");
				continue;
			}// 좌표가 이미 확인
			
			
			// 5. arr배열에서 x,y의 좌표값 비교
			// 1이면 당첨, 0이면 꽝 출력
			
			if(arr[x][y] == 1) {
				lotto[x][y] = "당첨";
			}else {
				lotto[x][y] = "꽝";
			}
		}//while true
		
		
		
//		// 1이 5개 배치된 5x5배열
//		int[][] arr = new int[5][5];
//		arr[0][0] = 1;
//		arr[0][1] = 1;
//		arr[0][2] = 1;
//		arr[0][3] = 1;
//		arr[0][4] = 1;
//		int no1 = 0;
//		int no2 = 0;
//		int t_value = 0;
//		for(int i=0;i<300;i++) {
//			no1 = (int)(Math.random()*5);
//			no2 = (int)(Math.random()*5);
//			t_value = arr[0][0];
//			arr[0][0] = arr[no1][no2];
//			arr[no1][no2] = t_value;
//		}
//		// 번호 출력
//		//5*5배열출력
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}//for j
//			System.out.println();
//		}// for i
	}//main

}
