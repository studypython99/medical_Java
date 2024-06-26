package p0626;

import java.util.Arrays;

public class C0626_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa", "1111", 10000,0);
		
		//구매내역, 장바구니
//		Product[] p = new Product[10];
		
		
		
		//구매하기
		Product t = new Tv(); // 다형성, 부모의 참조변수로 자손의 객체를 다루는것.
		Product t2 = new Tv();
		b.buy(t); //Tv 1대 구매
		b.buy(t2); //Tv 1대 구매
		
		
		// 컴퓨터 구매
		Product c = new Computer();
		b.buy(c); 
		
		// 오디오 구매
		Product a = new Audio();
		b.buy(a); 
		
		// 냉장고 구매
		Product r = new Refregerator();
		b.buy(r);

		//추가구매
		b.buy(new Refregerator());
		b.buy(new Audio());
		
		//cart 제품명, 가격 모두 출력
		b.summary();
		//b.cart: 배열
		//b.list
//		int sum = 0;
//		for(int i=0;i<b.list.size();i++) //b.list.size() 리스트에 몇개있다.
//		{
//			Product p = (Product)b.list.get(i); //(Product)형변환 해야 접근가능.
//			System.out.printf("구매제품: %s\n",p.pName);
//			sum += p.price;
//		}
//		System.out.printf("총 구매한 갯수: %d\n",b.list.size());
//		System.out.printf("총 구매금액: %d\n",sum);
		
	}
}
