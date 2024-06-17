package p0617;

public class C0617_17 {

	public static void main(String[] args) {
		// 1~100랜덤숫자 10개를 생성해서 합을 출력
		int sum = 0; 
		for (int i=1; i<=10; i++) {
			int ran_num = ((int)(Math.random()*100)+1);
//			System.out.println((int)(Math.random()*100)+1);
			System.out.println("랜덤숫자: "+ran_num);
			System.out.println("합계: "+(sum += ran_num));
		}
		
	}

}
