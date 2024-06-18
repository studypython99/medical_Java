package p0618;

public class C0618_06 {

	public static void main(String[] args) {
		// int 배열 10개를 선언해서 1,3,5,7,9,... 10개 입력해서 출력
		int[] holsu = new int[500];
		// .length: 배열의 갯수만큼 크기설정
		for(int i=0;i<holsu.length;i++) {
			holsu[i] = ((2*i)+1);
			System.out.printf("%d번째 숫자: %d \n",i+1,holsu[i]);
		}
			
		
		
		//		// 배열 선언 - 주소는 0부터 시작 // 많이사용
//		int[] score = new int[5];
//		// 배열에 값 입력, 초기화
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//
//		// 배열선언, 초기화
//		int[] sc1 = new int[] {1,2,3,4,5};
//		int[] sc2 = {1,2,3,4,5}; //많이사용
//		
//		// 배열선언, for문으로 초기화
//		int[] s = new int[5];
//		for(int i=0;i<5;i++) {
//			s[i] = i+1;
//		}
	}

}
