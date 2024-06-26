package stuPjt;

import java.util.ArrayList;
import java.util.Scanner;

public class Stu_process {

	Scanner scan = new Scanner(System.in);
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	String stuNo,name;
	int kor,eng,math,total,rank;
	double avg;
	int choice;
	
	//화면부분 메소드
	int screen(ArrayList list)
	{
		System.out.println("[학생성적프로그램]");
		System.out.printf("현재 입력된 학생수: %d명\n",list.size());
		System.out.println("-------------");
		System.out.println("1. 성적입력");
		System.out.println("1. 성적입력");
		System.out.println("1. 성적입력");
		System.out.println("1. 성적입력");
		System.out.println("1. 성적입력");
		System.out.println("1. 성적입력");
		System.out.println("1. 성적입력");
		System.out.println("1. 성적입력");
		System.out.println("-------------");
		System.out.println("원하는 번호를 입력하세요.>>");
	}
}
