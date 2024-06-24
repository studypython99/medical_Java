package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu_score {
	
	{ //초기화블럭, 공통으로 들어가는 부분을 따로 분리시켰다.
		count ++;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		this.stuNo = "S"+sdf.format(d)+String.format("%03d",count);
	}

	//생성자, 클래스명과 동일하게 만든다
	Stu_score(){} // 기본생성자: 정의가안되어있다면 기본으로 만들어준다
	
	//매개변수 생성자, 한개라도 있으면 기본생성자는 안만들어준다.
	Stu_score(String name, int kor, int eng, int math)
	{
		this.stuNo = stuNo;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = total/3.0;
	}
	static int count; // 클래스변수 - 모든 객체가 공용으로 사용
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	
	
}
