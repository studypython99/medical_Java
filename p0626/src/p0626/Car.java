package p0626;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {

	static int count = 1;
	{//초기화블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		this.serialNo = "c"+sdf.format(d)+String.format("%04d",count++);
	}
	String serialNo;
	String color;
	int door;
	
	Car(){}//기본생성자
	Car(String color, int door)
	{
		this.color = color;
		this.door = door;
	}
	
	String getSerialNo()
	{
		return serialNo;
	}
	void setSerialNo(String serialNo)
	{
		this.serialNo = serialNo;
	}
}
