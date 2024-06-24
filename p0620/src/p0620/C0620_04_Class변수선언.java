package p0620;

import java.util.Scanner;

public class C0620_04_Class변수선언 {

	public static void main(String[] args) {
		//변수선언
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		String str = new String("aaa");
		Tv t1 = new Tv(); // 객체선언
		t1.color = "white";
		t1.power = false;
		t1.channel = 0;
		
		
		
		//객체 선언
		//다른타입도 입력할 수 있다.
		//클래스타입(Tv) 참조변수명(t2) = new 클래스타입();
		Tv t2; // 객체를 다루기 위한 참조변수 선언
		t2 = new Tv(); // 객체 생성 후, 생성된 객체의 주소를 참조변수에 저장시켜줌.
		Tv t3 = new Tv();
		

		

		
		
		String color = "white";
		boolean power = false;
		int channel = 0;
		//volume, size,,
		
		while(true)
		{
			System.out.println("1. tv 켜기");
			System.out.println("2. tv 끄기");
			System.out.println("---------");
			System.out.println("tv상태를 확인하세요");
			int choice = scan.nextInt();
		}
	}
}
