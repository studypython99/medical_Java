package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaClass {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//list 출력
		//리스트를 i에 주고 그 매개변수를 i에 입력해서 출력한다!?
		list.forEach(i -> System.out.println(i));
		//매개변수가 메소그다 올수있다, 람다식만 매개변수로 사용가능
		list.removeIf(x -> x%2==0 || x%3==0); 
		System.out.println(list);
		
		list.replaceAll(i -> i*10);
		System.out.println(list);
		
		Map<String,String> map = new HashMap();
		map.put("1", "1");
		map.put("2", "1");
		map.put("3", "1");
		map.put("4", "1");
		//뒤에는 함수가 올 수 없다, 변수만 올 수 있다.
		map.forEach((str,str2) -> System.out.println("{"+str+","+str2+"}"));
//		map.forEach(data_list());
	}


//	public static void data_list() {
//		
//	}

	
}
