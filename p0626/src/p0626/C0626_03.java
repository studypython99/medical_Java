package p0626;

import java.util.ArrayList;

public class C0626_03 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(new Students("홍길동",100,100,99));
		list.add(new Students("유관순",89,87,99));
		list.add(new Students("이순신",90,90,92));

		list.remove(1); // 유관순 삭제
		System.out.println("입력된 갯수: "+list.size());
		//전체출력
		for(int i=0;i<list.size();i++)
		{
			//리턴타입은 object,
			Students s = (Students)list.get(i);
			System.out.printf("%s,%s,%d,%d,%d,%d,%.2f,%d\n",
					s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
		}
	
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("배열갯수: "+arr.length);
		
//		int[] arr = {1,2,0,4,5};
//		int[] arr2 = {1,2,4,5};
//		arr[2] = 0;
	}
}
