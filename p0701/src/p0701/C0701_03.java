package p0701;

import java.util.ArrayList;
import java.util.HashMap;

public class C0701_03 {

	public static void main(String[] args) {
		
		Process p = new Process();
		//Card list 가져오기 출력
//		System.out.println(p.clistAdd());
		ArrayList<Card> clist = p.clistAdd();
		 for (int i=0;i<clist.size();i++)
	        {
//	        	System.out.println(clist.get(i));
	        	System.out.println(( clist.get(i).getKind()+","+ clist.get(i).getNumber()));
	        }
		
		//Students list 가져와서 출력
		 ArrayList<Students> slist = p.slistAdd();
		 for (int i=0;i<clist.size();i++)
		 {
			 System.out.println(( slist.get(i).getName()));
			 System.out.println(slist.get(i)); //@Override tostring으로 형식작성하기
		 }

		 
		 //HashMap 둘다 출력받기
		 
		 HashMap<String,Object> map = p.listAdd();
		 clist = (ArrayList<Card>)map.get("clist"); //형변환
		 for (int i=0;i<clist.size();i++)
		 {
			 System.out.println( clist.get(i).getKind());
			 System.out.println(clist.get(i)); //@Override tostring으로 형식작성하기
		 }
		 slist = (ArrayList<Students>)map.get("slist"); //형변환
		 for (int i=0;i<clist.size();i++)
		 {
			 System.out.println( slist.get(i).getName());
			 System.out.println(slist.get(i)); //@Override tostring으로 형식작성하기
		 }
}
}
