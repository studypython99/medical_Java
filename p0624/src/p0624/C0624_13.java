package p0624;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0624_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//변수선언
		final int STU = 10;
		String[] stuNo = new String[STU]; //학번
		String[] name = new String[STU]; //이름
		int[][] score = new int[STU][4]; //국영수합
		double[] avg = new double[STU]; //평균
		int[] rank = new int[STU]; //등수
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0; // 입력된 학생 수
		while(true)
		{
			
			System.out.println("[학생성적프로그램]");
			System.out.println("-------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생검색");
			System.out.println("5. 등수처리");
			System.out.println("0. 프로그램종료");
			System.out.println("-------------");
			System.out.println("원하는 번호 입력 >>");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice)
			{
			case 1:
				while(true)
				{				
					System.out.println("1. 성적입력");	
					//학번입력
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yy");
					String stuNo1 = "S"+sdf.format(date)+String.format("%02d",s_count+1);
					stuNo[s_count] = stuNo1;
					System.out.println("학생번호: "+stuNo1);
					//이름입력
					System.out.println("이름을 입력하세요>>(0.이전페이지)");
					name[s_count] = scan.nextLine();
					if(name[s_count].equals("0"))
					{
						System.out.println("이전화면 이동");
						System.out.println();
						break;
					}
					
					//국영수
					System.out.println("국어점수입력>>");
					score[s_count][0] = scan.nextInt();
					System.out.println("영어점수입력>>");
					score[s_count][1] = scan.nextInt();
					System.out.println("수학점수입력>>");
					score[s_count][2] = scan.nextInt();
					scan.nextLine();
					//합계
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					//평균
					avg[s_count] = score[s_count][3]/3.0;
					//입력완료
					System.out.printf("%s 학생성적이 저장되었습니다 \n",name[s_count]);
					System.out.println();
					s_count++;
				}//while' '
				break;
			case 2:
				System.out.println("2. 성적출력");
				for(int i=0;i<title.length;i++)
				{
					System.out.printf("%s \t",title[i]);
				}
				System.out.println();
				System.out.println("---------------------------------------");
				for(int i=0;i<s_count;i++)
				{
					System.out.printf("%s\t",stuNo[i]);
					System.out.printf("%s\t",name[i]);
					for(int j=0;j<4;j++)
					{
						System.out.printf("%d\t",score[i][j]);//국영수합
					}
					System.out.printf("%.2f\t",avg[i]);//평균
					System.out.printf("%d\t",rank[i]);//등수
					
				}
				System.out.println();
				break;
			case 3:
				System.out.println("3. 성적수정");
				System.out.println("학생이름을 입력하세요 >>");
				String search = scan.nextLine();
				//검색
				int temp_no = -1;
				for(int i=0;i<s_count;i++)
				{
					if(name[i].equals(search))
					{
						temp_no=i; // 찾은 학생의 위치값
						System.out.printf("%s 학생이 검식되었습니다",search); //=name[i]
						System.out.println();
						break;
					}
				}
				//이름이 안나온 경우
				if(temp_no == -1)
				{
					System.out.println("찾는학생이 없습니다. 다시 입력하세요.");
					System.out.println();
				}else {
					System.out.printf("%s 성적수정",search);
					System.out.println("---------------");
					System.out.println("1. 국어수정");
					System.out.println("2. 영어수정");
					System.out.println("3. 수학수정");
					System.out.println("---------------");
					System.out.println("원하는 번호를 입력하세요 >>");
					choice = scan.nextInt();
					
					switch(choice)
					{
					case 1://국어점수 변경 - title : 학번-0 이름-1 국어-2 영어-3 수학-4
						System.out.printf("현재 %s점수: %d",title[choice+1],score[temp_no][choice-1]);
						System.out.println("변경할 점수를 입력하세요>>");
						score[temp_no][choice-1] = scan.nextInt();
						//합계,평균 다시구하기
						// 합계 = 국어점수 + 영어점수 + 수학점수
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						// 평균 = 합계/3.0
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("변경된 %s점수: %d\n",title[choice+1],score[temp_no][choice-1]);
						break;
					case 2://국어점수 변경 - title : 학번-0 이름-1 국어-2 영어-3 수학-4
						System.out.printf("현재 %s점수: %d",title[choice+1],score[temp_no][choice-1]);
						System.out.println("변경할 점수를 입력하세요>>");
						score[temp_no][choice-1] = scan.nextInt();
						//합계,평균 다시구하기
						// 합계 = 국어점수 + 영어점수 + 수학점수
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						// 평균 = 합계/3.0
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("변경된 %s점수: %d\n",title[choice+1],score[temp_no][choice-1]);
						break;
					case 3://국어점수 변경 - title : 학번-0 이름-1 국어-2 영어-3 수학-4
						System.out.printf("현재 %s점수: %d",title[choice+1],score[temp_no][choice-1]);
						System.out.println("변경할 점수를 입력하세요>>");
						score[temp_no][choice-1] = scan.nextInt();
						//합계,평균 다시구하기
						// 합계 = 국어점수 + 영어점수 + 수학점수
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						// 평균 = 합계/3.0
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.printf("변경된 %s점수: %d\n",title[choice+1],score[temp_no][choice-1]);
						break;
					}
				}				
				break;
			case 4:
				System.out.println("4. 학생검색");
				break;
			case 5:
				System.out.println("5. 등수처리");
				
				break;
			case 0:
				System.out.println("0. 프로그램종료");
				break;
			}//switch
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
