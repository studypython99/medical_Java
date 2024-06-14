package p0614;

public class c0614_15 {

	public static void main(String[] args) {
		System.out.println((float)0.1d == 0.1f); // false 0.1이지만, 실제로 7째자리까지만 나온다
		//				0.1000000000000000d == 0.10000000f
		double num = 0.1d;
		System.out.println("double타입:"+num);
		
		double d = (double)0.1f;
		System.out.println("float변경: "+d); // 0.10000000149011612 뒤에가 이상하다.;;

		

	}

}
