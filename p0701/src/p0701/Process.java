package p0701;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Process {

	ArrayList<Card> clist = new ArrayList();
	ArrayList<Students> slist = new ArrayList();
	
	//Card list 보내기
	ArrayList<Card> clistAdd(){//인스턴스 메소드, 객체선언 후 참조변수명.변수명
		
		clist.add(new Card(1,"CLOVER"));
		clist.add(new Card(2,"CLOVER"));
		clist.add(new Card(3,"CLOVER"));
		clist.add(new Card(4,"CLOVER"));
		clist.add(new Card(5,"CLOVER"));
		return clist;
	}
	// Student list 보내기
	ArrayList<Students> slistAdd(){
		slist.add(new Students("홍길동",100,100,99));
		slist.add(new Students("유관순",100,100,99));
		slist.add(new Students("이순신",100,100,99));
		slist.add(new Students("김구",100,100,99));
		slist.add(new Students("강감찬",100,100,99));
		
		return slist;
	}
	
	//2개를 모두 보내기
	//선언되어있는 형태 그대로 받는다.
	HashMap<String, Object> listAdd() { //void를> HashMap<String, Object>로
//		Map<String, Object> map = new HashMap<String, Object>();
		//import java.util.HashMap;
		HashMap <String,Object> map = new HashMap <String, Object>();
		map.put("clist", clistAdd());
		map.put("slist", slistAdd());
		return map;//리턴타입 수정하기 map을 보내고싶다
	}
	
}
