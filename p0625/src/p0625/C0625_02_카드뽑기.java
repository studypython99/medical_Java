package p0625;

import java.util.Arrays;

public class C0625_02_카드뽑기 {

	public static void main(String[] args) {
		Deck d = new Deck(); // 52장 카드생성
		
		// 카드 섞기
		d.shuffle();
		// 5장을 뽑자
		Card[] cc = d.pick5();
		for(int i=0;i<cc.length;i++)
		{
			System.out.printf("카드%02d: %s,\t%02d\n",i+1,cc[i].kind,cc[i].number);
		}
		// 5장을 뽑자
		Card[] cc2 = d.pick5();
		for(int i=0;i<cc2.length;i++)
		{
			System.out.printf("카드%02d: %s,\t%02d\n",i+1,cc2[i].kind,cc2[i].number);
		}
		
		System.out.println("카드객체: "+cc2[0]); // override구문을 작성하니 보임;;
		
		//카드1장 뽑기
		Card card = d.pick();
//		System.out.printf("카드한장: %s,%d\n",card.kind,card.number);
		Card card1 = d.pick(3);
//		System.out.printf("카드한장: %s,%d\n",card1.kind,card1.number);
		//출력부분
		for(int i=0;i<52;i++)
		{
//			System.out.printf("카드%02d: %s,\t%02d\n",i+1,d.c[i].kind,d.c[i].number);
		}
		
		
		Card[] c = new Card[52];//배열선언
		
		int[] number = new int[52];
		String[] kind = new String[52];
		// 0~12=0, 13~25=1, 26~38=2, 39~51=3
		String[] shape = {"CLOVER","HEART","DIAMOND","SPADE"};
		for (int i=0;i<52;i++)
		{
			//#1
			c[i] = new Card(); //객체선언
			c[i].number = i%13+1;//기본생성자로 이동
			c[i].kind = shape[i/13];//기본생성자로 이동

			//#2
			c[i] = new Card(i%13+1,shape[i/13]); //Card 생성자에 양식이 있다.
			
			
			number[i] = i%13+1;// 숫자 1~13 4셋트
			kind[i] = shape[i/13];// 모양 13개씩
		}

		
		// 1~10 = 1
		//11~20 = 11
		//23~30 = 21
		// ((i-1)/10)*10+1
	}
}
