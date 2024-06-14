package p0614;

public class c0614_03 {
	public static void main(String[] args) {
		
		boolean power = true; // T로 하면 error
		char ch = 'A';
		
		System.out.println(ch);
		
		char ch2 = '\u0041'; // 16진수 41 = A
		System.out.println(ch2);
		
		char ch3 = 'A';
		System.out.println((int)ch3); // 65, asc 아스키코드
		
		int a = 65;
		System.out.println(a); // 65
		System.out.println((char)a); // 형변환하면 A
		
		int hex = 0x100;
		System.out.println(hex); // 256
	}

}
