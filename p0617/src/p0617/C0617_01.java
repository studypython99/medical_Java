package p0617;

public class C0617_01 {

	public static void main(String[] args) {
		// class.mathod(함수)
		System.out.println(7+7+""); // 14 숫자로 7+7
		System.out.println(""+7+7); // 77 문자로 7+7
	
		char ch = 'a';
		System.out.println("char a: "+ch); // a 문자로 출력
		
		int num = 'a';
		System.out.println("int a: "+num); // 97, 대문자 A(a-32)는 65 
		int num2 = 98;
		ch = (char)num2; // char 가 빠지면 미스매치;; int>char
		System.out.println("char 98: "+ch); // b
		
		int num1 = 'A';
		System.out.println("int A: "+num1); // 대문자 A는 65
				
		

	}

}
