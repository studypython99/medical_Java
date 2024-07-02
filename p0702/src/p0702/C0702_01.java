package p0702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class C0702_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String stuNo="", name="";
		int kor=0,eng=0,math=0,total=0,rank=0;
		double avg=0; 
		ArrayList<Students> list = new ArrayList<Students>();
//		List<Students> list = new ArrayList<Students>();
		
		try {
			FileReader fr = new FileReader("c:/save/abc.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line ==null) break;
				String[] arr = line.split(",");
				stuNo = arr[0];
				name = arr[1];
				kor = Integer.parseInt(arr[2]);
				eng = Integer.parseInt(arr[3]);
				math = Integer.parseInt(arr[4]);
				total = Integer.parseInt(arr[5]);
				avg = Double.parseDouble(arr[6]);
				rank = Integer.parseInt(arr[3]);
				list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));
				System.out.println(line);
			
			}//while
			
			// 삭제시 문제발생, 
			Students.count = list.size()+1;
			
			
				
			//학생입력부분 - 학번은 자동부여, 이름/국영수
			//x가 입력되면 프로그램 종료
			System.out.println("이름을 입력하세요(x.종료)");
			if(name.equalsIgnoreCase("x")) {
				
			}
			name = scan.next();
			System.out.println("국어점수 >>");
			kor = scan.nextInt();
			System.out.println("영어점수 >>");
			eng = scan.nextInt();
			System.out.println("수학점수 >>");
			math = scan.nextInt();
	
			
			//list 2명 학생성적 추가(김유신,홍길순)
			//파일저장
			String str = "";
			
			String str = "S0006,김유신,100,100,100,300,100.0,0\r\n";
			str += "S0007,홍길순,100,100,100,300,100.0,0\r\n";
			
			try {
				FileWriter fw = new FileWriter("c:/save/abc.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(str);
				bw.close();
			}catch(IOException e) {e.printStackTrace();}
			
			//생성자를 찾아간다
			list.add(new Students(name,name, kor,eng,math, rank, avg, rank));
			
			//list 출력 번호,이름,합계,평균,등수
			for(int i=0;i<list.size();i++) {
				Students s = list.get(i);
				System.out.printf("%s,%s,%d,%.2f,%d\n",s.getStuNo(),s.getName(),s.getTotal(),s.getAvg(),s.getRank());
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
