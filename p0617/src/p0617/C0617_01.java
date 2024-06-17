package p0617;

public class C0617_01 {

	public static void main(String[] args) {
		// class.mathod(함수)
		System.out.println(7+7+""); // 14
		System.out.println(""+7+7); // 77
	
		char ch = 'a';
		System.out.println(ch); // a
		
		int num = 'a';
		System.out.println(num); // 97, 대문자 A는 65
		int num2 = 98;
		ch = (char)num2; // char 가 빠지면 미스매치;; int>char
		System.out.println(ch); // b
		
		int num1 = 'A';
		System.out.println(num1); // 대문자 A는 65
				
		

	}

}
