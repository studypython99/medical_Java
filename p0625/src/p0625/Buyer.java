package p0625;

public class Buyer {

	int money = 10_000_000;
	int bonusPoint = 0;
	
	void buy(Product p)//부모의 참조변수 = 자손의 객체를 다룬다
	{
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.name+"제품을 구매했습니다.");
	}
	
}
