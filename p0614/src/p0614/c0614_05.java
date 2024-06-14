package p0614;

public class c0614_05 {

	// main ctrl+space
	public static void main(String[] args) {

		byte b = 127;
		//byte b2 = 128; // 에러
		b = (byte) (b+1);
		
		// 1~127 까지 채우고나서 -128,-127... 순환
		System.out.println(b); // -128 오버플로우 발생
		
		int num = 2147483647; 
		num = num + 1;
		System.out.println(num); //-2147483648 오버플로우 발생
		
		// 문자열 타입 변경
		char ch = 'A';
		//char ch2 = 'aa'; // 문자 두개이상 불가
		char ch3 = ' ';
		String str = "AA";
		//String2 = "";
		//String3 = null;
		
		String s1 = "A"+"B";
		System.out.println(s1); //AB
		System.out.println(""+7+7+7); // 문자열+어떤타입 = 문자열
		System.out.println(7+7+7+""+7); // 217
		

	}

}
