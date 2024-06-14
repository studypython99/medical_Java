package p0614;

public class c0614_04 {
	
	static int num; // 클래스 내 변수 - 자동으로 초기화

	// 메소드 내에서는 무조건 변수값을 초기화해야한다.
	public static void main(String[] args) {
		int score = 0; // 초기값을 설정해주어야한다, 자동초기화x
		System.out.println(score); // 0
		System.out.println(num); // 0
	}

}
