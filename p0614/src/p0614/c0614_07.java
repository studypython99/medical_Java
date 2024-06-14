package p0614;

public class c0614_07 {

	public static void main(String[] args) {
		// 연산자
		System.out.println(10.0/3); // 3.3333333333333335
		System.out.println(10.0f/3); // 3.3333333
		System.out.printf("%.2f\n",10.0/3); // 3.33
		int x = 0x1a; // 0x 16진수 표현, 16진수의 1a
		// 1*16+
		System.out.println("x: "+x); // 26
		System.out.printf("%X \n", x); // 1A
		
		long a = 10L;
		System.out.printf("%d \n",a); // 10
		int b = 20;
		System.out.printf("%d \n",b); // 20
		
		int age = 10;
		int year = 2014;
		System.out.printf("나이: %d, 년도: %d \n", age, year); //나이: 10, 년도: 2014
		System.out.println("나이: "+age+"세, 년도: "+year+"년"); // 나이: 10세, 년도: 2014년

		// 자릿수
		System.out.printf("[%5d \n",10); // _-_10 빈자리로 10
		System.out.printf("[%05d \n",10); // 00010 0으로 채운 10
	}

}
