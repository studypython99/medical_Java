package p0614;

public class c0614_10 {

	public static void main(String[] args) {
		// 증감연산자 ++, --
		// 전위형 증감연산자
//		int i = 5;
//		int j = 0;
//		j = ++i; // i:5+1 = 6
//		System.out.println(j);

		// 후위형 증감연산자
		int i = 5;
		int j = 0;
		j = i++; // i:5 => j에 넣음, i+1=6
		System.out.println(j);
		System.out.println(i);
		
		boolean bol1 = true;
		boolean bol2 = false;
		
		System.out.println(bol1 == bol2); // false
		System.out.println(bol1 != bol2); // true
		
		
	}

}
