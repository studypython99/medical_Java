package p0614;

public class c0614_06 {

	public static void main(String[] args) {
		// (n): byte
		// double(8) > float(4) > long(8) > int(4) > short, char(2) > boolean, byte(1)
		// 작은거에서 큰거로 갈 땐 생략가능
		// 큰거에서 작은거로 갈 땐 붙여주자
		float f = 1.6f;
		int i = (int)f; // float타입(큰)을 int(작)타입으로 변경
		System.out.println(i); // 1
		
		int n = 10;
		float f1 = n;
		System.out.println(n); // 10 
		System.out.println(f1); // 10.0 int(작) => float(큰) 
		
		int  n2 = 65;
		char ch = (char) n2; // 형변환
		System.out.println(ch); // A
		
		char ch2 = 'a';
		int n3 = ch2;
		System.out.println(n3); // 97
		
		int n4 = 10;
		float f2 = n4;
		System.out.println(f2); // 10.0
	}

}
