package stuPjt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {

	static int count = 1;
	{//초기화 블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		//자동번호생성 S2401,S2402, ...
		this.stuNo = "S"+sdf.format(d)+String.format("%02d", count++); 
	}//초기화블럭
	
	String stuNo, name;
	int kor, eng, math, total, rank;
	double avg;
	
	Students(){}//기본생성자
	Students(String name, int kor, int eng, int math)
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}
	
	String getStuNo()
	{
		return stuNo;
	}
	void setStuNo(String stuNo)
	{
		this.stuNo = stuNo;
	}
	
	
}
