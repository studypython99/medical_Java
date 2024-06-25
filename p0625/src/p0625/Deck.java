package p0625;

public class Deck {
	// 13*4 = 52
	Card[] c = new Card[52]; //배열선언
	Card[] cc = new Card[5]; // 5칸짜리 배열선언
	String[] shape = {"SPADE","DIAMOND","HEART","CLOVER"};
	int count = 0;
	//1~10,
	Deck()//기본생성자 
	{
		for (int i=0;i<52;i++)
		{
			//#2
			c[i] = new Card(i%13+1,shape[i/13]); //Card 생성자에 양식이 있다.
		}
	}
	//카드섞기메소드
	void shuffle()
	{
		for(int i=0;i<300;i++)
		{
			int random = (int)(Math.random()*52); //0~51
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
		
	}
	// 1장 뽑는 메소드
	Card pick()
	{
		Card card = c[0];
		count++;
		return card;
	}
	Card pick(int n)
	{
		return c[n];
	}
	
	//5장을 뽑는 메소드, 5배열생성, 
	Card[] pick5()
	{
		for(int i=0;i<5;i++)
		{
			cc[i] = c[count++];
		}
		return cc;
	}
	
	
}//Deck
