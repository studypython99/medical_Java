package p0624;

public class Car {
	static int count = 0; 
	String serial_no;
	String color;
	String gearType;
	int door;
	
	//초기화블럭 - 생성자를 호출하기 전에 먼저 실행시킨다.
	//공통적인 부분을 가져온다 {}중괄호 안에 입력
	{
		count += 1;
		this.serial_no = "HD"+String.format("%04d",count);
		
	}
	//오버로딩, 이름은 같고 매개변수가 다를 때
	Car()
	{
//		serial_no += 1;
	}//기본생성자
	Car(String color)
	{
//		count += 1;
//		this.serial_no = count;
		this.color = color;
	}
	Car(String color, String gearType, int door)
	{
//		count += 1; 
//		this.serial_no = count;
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	void Car2(String c){} //void 없으면 에러
	

}
