package p0626;

import java.util.ArrayList;

public class C0626_04_Car {

	public static void main(String[] args) {
		
		//c20240001
		// 1: white,4
		// 2: red,5
		// 3: blue,4
		// 4: gray,3
		// 5: black,5
		
		// Arraylist 생성
		ArrayList list = new ArrayList();
		
		// Arraylist 입력
		list.add(new Car("white",4));
		list.add(new Car("red",5));
		list.add(new Car("blue",4));
		list.add(new Car("gray",3));
		list.add(new Car("black",5));
		
		//전체출력
		for(int i=0;i<list.size();i++)
		{
			Car c = (Car)list.get(i); // 형변환
			System.out.printf("%s,%s,%d\n",c.serialNo,c.color,c.door);
		}
		
	}//main
	}
