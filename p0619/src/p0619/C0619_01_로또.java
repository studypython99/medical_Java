package p0619;

public class C0619_01_로또 {
	public static void main(String[] args) {
		//로또 프로그램 구현
		//1~45 배열에서 랜덤으로 섞고, 0~5(6개)가져오면 로또번호
		//입력번호 6개
		//당첨번호갯수 배열, 카운트변수
		//모든 배열 출력
		
		// 1. 45개 번호 배열
		int[] ball = new int[45];
		System.out.println(ball); // 주소값
		ball[0] = 1;
		System.out.println(ball[0]); // 1
		for(int i=0;i<45;i++) {
			ball[i] = i+1;
//			System.out.println(ball[i]); // 1~45까지 출력
		}//for i
		
		// 2. ball배열 섞기
		int no = 0; // 0번째 배열과 바꿀 배열번호
		int t_value = 0; // 임시저장소
		for(int i=0;i<300;i++) {
			no = (int)(Math.random()*45); // 0~44
			// t_value:빈컵, ball[0]:우유, ball[no]:주스
			t_value = ball[0]; // 우유를 빈컵에
			ball[0] = ball[no]; //주스를 우유가 있던 컵에
			ball[no] = t_value; //우유를 주스가 있던 컵에
		}//for i300
		
		// 3. 섞인 ball배열 출력
		System.out.println("섞인 ball배열 출력");
		for(int i=0;i<45;i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		//5*5배열입력
//		int[][] arr = new int[5][5];
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				arr[i][j] = 5*i+(j+1); 
//			}//for j
//		}// for i
//		//5*5배열출력
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(arr[i][j]+"\t");
//			}//for j
//			System.out.println();
//		}// for i
	}//main
}
