package p0624;

public class C0624_08 {

	public static void main(String[] args) {
		
		Stu_score s = new Stu_score("s0001","홍길동",100,99,90);
		System.out.println(s.total);
		System.out.println(s.avg);
//		stu.kor = 100;
		s.kor = 100;
		System.out.println(s); //p0624.Stu_score@48cf768c
		System.out.println(s.kor); // 100

		
		
		
		// 5펙토리얼
		int result = 1;
		for (int i=5;i>0;i--)
		{
			result *= i;
		}
		
		//change()
		C0624_08 c = new C0624_08(); // 객체선언 후
		c.change(); // 참조변수명.메소드명
		
		System.out.println(result);
		
		
		add(); // 객체선언 없이 클래스명.메소드명, 같은 클래스 내에서는 클래스명 생략가능
	}
	//오버로딩
	//매개변수의 타입이 다른것(매개변수 이름이 다른것은 오버로딩이 아니다)
	void change() // 인스턴스 메소드, 객체선언 후, 참조변수명.메소드명
	{
		System.out.println(0);
	}
	void change(int a) // 인스턴스 메소드, 객체선언 후, 참조변수명.메소드명
	{
		System.out.println(a);
	}
	void change(int a, int b) // 인스턴스 메소드, 객체선언 후, 참조변수명.메소드명
	{
		System.out.println(a+b);
	}
	static void add()
	{
		
	}
}
