package p0624;

public class C0624_09 { 
	public static void main(String[] args) {
		
		//객체선언 후 white, auto, 4
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		Car c = new Car("white","auto",4);
		System.out.println(c.color); // null, this 붙인 후: white
		
		//객체선언 후 red, auto, 5
		Car cc = new Car("red","auto",3);
		
		//객체선언 후 blue, auto, 3
		Car ccc = new Car("blue","auto",3);
		
		
//	// Data, Data2 같이보세요
//	Data d = new Data(); //에러 없음
//	//Data2 d2 = new Data2(); // 에러
//	
//	Data2 d3 = new Data2(10); //에러없다
	}
}
