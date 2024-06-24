package p0624;

public class C0624_07 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int[] result = new int[4];
		
		//Elenemt의 메소드 활용
		//a,b의 사칙연산 결과값 출력
		//cal(a,b);
		//더하기 15
		Element e = new Element();
		e.allCal(a, b, result);
		
		System.out.println("합: "+result[0]);
		System.out.println("차: "+result[1]);
		System.out.println("곱: "+result[2]);
		System.out.println("분: "+result[3]);
	}

}
