package p0625;

public class C0625_07 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		//다형성: 부모의 참조변수 자손의 객체를 다룬다.
		//	자손의 참조변수로 부모의 객체를 다루는것은 안된다.
		//
//		a2 = (Ambulance)c; // 안된다;;
		//
		//시작이 자손의 객체이기에 가능
		c = a; //시작, 부모의 참조변수에 자손객체를 입력.
		if(c instanceof Ambulance)
		{
			System.out.println("ok");
		}
		a2 = (Ambulance)c; //부모를 자손에 가능
		
		
		c2 = a;//업캐스팅
//		f2 = (FireEngine)c2;
		
		
		//형변환 - 자손타입에서 조상타입: 형변환타입 생략
		c2 = a; // 자손에서 부모로: 형변환타입 생략
//		c2 = (Car)a;
//		a2 = (Ambulance)c2; // Car에서는 타입을 정해야한다
		//업캐스팅은 안붙이고, 다운캐스팅은 붙여야한다
		c2 = a; //Ambulance > Car
		c2.drive();
//		c2.color // 부모의 참조변수로는 사용할 수 없다
		
//		a2 = (Ambulance) c2;
		a2.siren();
		
		
	}
}
