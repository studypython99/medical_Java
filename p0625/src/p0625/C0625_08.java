package p0625;

public class C0625_08 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println("현재 보유금액: "+b.money);// 천만
		System.out.println("현재 보너스액: "+b.bonusPoint);// 0
		
		Tv tv = new Tv();
		b.buy(tv); // tv하나를 구매했따
		System.out.println("현재 보유금액: "+b.money);// 구백만
		System.out.println("현재 보너스액: "+b.bonusPoint);// 일만
		
		Computer c = new Computer();
		b.buy(c);
		System.out.println("현재 보유금액: "+b.money);// 구백만
		System.out.println("현재 보너스액: "+b.bonusPoint);// 일만
		Audio a = new Audio();
		b.buy(a);
		System.out.println("현재 보유금액: "+b.money);// 구백만
		System.out.println("현재 보너스액: "+b.bonusPoint);// 일만
	}
}
