package p0620;

public class C0620_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println((a+1)+(b+1));
		System.out.println((a+1)-(b+1));
		System.out.println((a+1)*(b+1));
		System.out.println((a+1)/(b+1));
		
		//객체선언
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t2 ch: "+t2.channel);//0
		t2 = t1; // 얕은복사, 이렇게하면 안된다ㅏㅏㅏ
		t1.channel = 7;
		System.out.println("t2 ch: "+t2.channel);//7
		
		//		//객체선언
//		Tv t = new Tv();
//		t.channel = 7;
//		t.channelUp(); //channel++
//		System.out.println(t.channel); //8
//		t.channelDown();
//		t.channelDown();
//		System.out.println(t.channel); //6
	}
}
