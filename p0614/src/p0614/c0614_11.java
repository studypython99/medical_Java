package p0614;

public class c0614_11 {

	public static void main(String[] args) {
		byte a = 1;
		int n = 350;
		int c = (a+n); // byte: 95, int: 351
		System.out.println(c);
		
		char ch = 'A'; // A:65, a:97, 32의 차이가 있다.
		char ch2 = 'b';
		System.out.println(ch+ch2); // 163
		
		System.out.println((char)(ch+32)); // a
		
		// byte의 사칙연산은 int로 바뀜, 따라서 (byte)필요
		byte by = 10;
		byte by2 = 20;
		byte by3 =(byte)(by+by2);
		System.out.println(by3); // 30
		
		int num = 1000000;
		int num2 = 2000000;
		// 둘중에 한가지만 (long)이 붙어도 된다.
		long total = (long)num * num2;
		System.out.println("long: "+total); // long: -1454759936
		
		long num3 = 1000000L;
		long num4 = num*num3;
		System.out.println(num4);
		
		int num5 = 1000000;
		System.out.println(num/num5*1000000);
		System.out.println(num*num5/1000000);
		
		char c1 = 'a';
//		char c2 = c1 + 1; //에러
		char c2 = (char)(c1+1);
		System.out.println(c2); // b
		
		char c3 = c1++;
		System.out.println(c3 ); // a
		char c4 = ++c1;
		System.out.println(c4 ); // c
		
		int i = 'B' - 'A'; // A:65 B:66 C:67 D:68 a:97 b:98 c:99
		System.out.println(i);

		// 문자 숫자는 문자숫자 '0'을 빼면 숫자값이 나온다
		int j = '2' - '0'; // 0:48, 1:49, 2:50 => 50-48=2
		System.out.println(j);

		int k = '8' - '0';
		System.out.println(k);
		
		
		
		
	}

}
