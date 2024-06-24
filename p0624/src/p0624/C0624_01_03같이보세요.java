package p0624;

public class C0624_01_03같이보세요 {

	public static void main(String[] args) {
		// 객체선언 후, 참조변수명.변수명
		Data d = new Data();
		d.x = 10;
		//print : d.x
		System.out.println("d.x1: "+d.x);//10
		
		change(d.x);
		//print : d.x
		System.out.println("d.x2: "+d.x);//10
	}
	
	static void change(int x) //기본형 매개변수 - 값만 전달
	{
		x = 1000;
		//print x
		System.out.println("change x3: "+x);//1000
	}
}
