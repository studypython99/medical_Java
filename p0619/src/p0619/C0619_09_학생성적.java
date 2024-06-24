package p0619;

import java.util.Scanner;

public class C0619_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//학생성적 입력구현
		//각각 필요항목 배열생성
		//학번s,이름s,국영수i,평균i,등수d
		String[] stuNo = new String[3]; // 학번
		String[] name = new String[3]; // 이름
		int[][] score = new int[3][4]; // 국영수
		double[] avg = new double[3]; // 평균
		int[] rank = new int[3]; // 등수
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0;
		//프로그램실행, while, switch
		loop1:
		while(true) {			
			System.out.println("학생성적프로그램");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 종료");
			System.out.println("--------");
			System.out.println("번호 입력 >>");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				//입력하기
				while(true) {
						
					
					System.out.println("1. 성적입력");
					//학번 자동부여: S0001
					stuNo[s_count] = "S"+String.format("%04d", s_count+1);
					System.out.println("학번: "+stuNo[s_count]);
					
					//이름입력
					System.out.println("이름(0.취소) >>");
					String temp = scan.nextLine();
					if(temp.equals("0")) {
						System.out.println("이전 화면으로 이동");
						System.out.println();
						break;//while
					}
					
					//이름입력
					name[s_count] = temp;
					
					//점수입력
					System.out.println("성적입력 >>");
					for(int i=0;i<3;i++) {
						System.out.printf("%s 점수를 입력하세요. >>",title[i+2]);
						score[s_count][i] = scan.nextInt();				
					}//for i
					scan.nextLine();
					//합계, 평균
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					avg[s_count] = score[s_count][3]/3.0;
					
					System.out.printf("학번: %s, 이름: %s \n",stuNo[s_count],name[s_count]);
					System.out.println("성적입력이 완로되었습니다.");
					System.out.println();
					
					s_count++;
				}
				
				break;
				
			case 2:
				//출력하기
				//제목줄 출력
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}//제목줄 출력
				System.out.println("------------------------------");
				System.out.println();
				break;
			case 0:
				System.out.println("-끝-");
				break loop1;
			default:
				break;
			}//switch
		}//while
	}//main
}//class
