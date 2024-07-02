package stuPjt;

import java.util.ArrayList;

public class Stu_main {

	public static void main(String[] args) {
		
		//변수선언부분
		ArrayList list  = new ArrayList();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",100,100,99));
		list.add(new Students("이순신",100,100,99));
		list.add(new Students("김구",100,100,99));
		list.add(new Students("김유신",100,100,99));
		list.add(new Students("홍길자",100,100,99));
		list.add(new Students("홍길순",100,100,99));
		Stu_process sp = new Stu_process();
		https://muz.so/asKF

		while (true)
		{
			int choice = sp.screen(list);
			switch(choice)
			{
			case 1://학생입력
			
				break;
			case 2://학생출력
				
				break;
			case 3://학생수정
				
				break;
			case 4://학생삭제
				 
				break;
			case 5://학생검색
				
				break;
			case 6://등수처리
				
				break;
			
			}//switch
		}//while
	}//main
}//Stu_main
