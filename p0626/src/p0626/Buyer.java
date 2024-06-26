package p0626;

import java.util.ArrayList;

public class Buyer {

	String userId = "aaa";
	String userPw = "1111";
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10];//인스턴스변수
	ArrayList list = new ArrayList(); //객체배열선언
	
	int count = 0;
	
	Buyer(){}
	Buyer(String userId, String userPw, int money, int bonusPoint)
	{
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	public String getUserId()
	{
		return userId;
	}
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	
	//구매 메소드 - 부모의 참조변수
	void buy(Product p)
	{
		if (money< p.price)
		{
			System.out.printf("잔액이 부족합니다.(보유금액: %d)\n",money);
			return;
		}
		money -= p.price;
		bonusPoint += bonusPoint;
		list.add(p); // collection 이라고 함;; 객체배열에 추가 add()
//		cart[count++] = p; // 구매물품 저장
		System.out.printf("%s 제품을 구매했습니다.(보유금액: %d)\n",p.pName,money);
	}
	void summary() 
	{
		System.out.println("구매내역");
		int sum = 0;
		for(int i=0;i<list.size();i++) //b.list.size() 리스트에 몇개있다.
		{
			Product p = (Product)list.get(i); //(Product)형변환 해야 접근가능.
			System.out.printf("구매제품: %s\n",p.pName);
			sum += p.price;
		}
		System.out.printf("총 구매한 갯수: %d\n",list.size());
		System.out.printf("총 구매금액: %d\n",sum);
	}
//	void buy(Tv t)
//	{
//		money -= t.price;
//		bonusPoint += bonusPoint;
//	}
//	void buy(Computer c)
//	{
//		money -= c.price;
//		bonusPoint += bonusPoint;
//		
//	}
//	void buy(Audio a)
//	{
//		money -= a.price;
//		bonusPoint += bonusPoint;
//		
//	}
	
}
