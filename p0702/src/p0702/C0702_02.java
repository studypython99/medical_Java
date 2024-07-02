package p0702;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import p0626.Stu_process;

public class C0702_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Students> list = new ArrayList();
		int choice = 0;
		String stuNo="",name="";
		int kor=0,eng=0,math=0,total=0,rank=0;
		double avg=0;
		
		
		//abc파일 읽어서 출력
		try {
			FileReader fr = new FileReader("c:/save/abc.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			fr.close();
			br.close();
		} catch (Exception e) {e.printStackTrace();} 
		
			
		
		
		
		
		Stu_process sp = new Stu_process();
		loop1:
		while(true) {
			int choice = sp.screen(list); //화면부분 메소드 호출
			switch(choice) {
			case 1: //학생입력부분
				sp.stu_input(list);
				break;
			
			case 2: //학생출력부분
				sp.stu_print(list);
				break;
				
			case 3: //학생성적수정
				sp.stu_update(list);
				break;
			
			case 4: //학생삭제
				sp.stu_delete(list);
				break;
				
			case 5: //학생검색
				sp.stu_search(list);
				break;

			case 6: //등수처리
				sp.stu_rank(list);
				break;
			
			case 7: //학생성적 정렬
				sp.stu_sort(list);
				break;
				
			case 8: //파일저장
				sp.stu_save(list);
				break;
				
			case 0: //프로그램종료
				System.out.println("프로그램을 종료합니다.");
				break loop1;
	
			}//switch	
	
		}//while(true)		
		
	}//main
}
