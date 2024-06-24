package p0624;

public class C0624_03_01같이보세요 {
	
	public static void main(String[] args) {
		//print : d.x
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x1 : "+d.x); //10
		
		change(d);
		//print : d.x
		System.out.println("d.x2 : "+d.x); //1000
	}
	static void change(Data d)
	{
		d.x = 1000;
		//print : d.x
		System.out.println("d.x3 : "+d.x); //1000
	}
}
