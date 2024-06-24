package p0619;

public class C0619_05 {
	public static void main(String[] args) {
		//[5,5]배열을 생성, 1~25 숫자 입력, 랜덤섞고 출력
		int[][] arr = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = (i*5+(j+1));
			}//for j
		}//for i
		// [5x5] 출력
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+"\t");
			}//for j
			System.out.println();
		}//for i
		
		// 2. 번호섞기
		int no1 = 0, no2 = 0, t_value = 0;
		for(int i=0;i<300;i++) {
			no1 = (int)(Math.random()*5);
			no2 = (int)(Math.random()*5);
			t_value = arr[0][0];
			
		}
		
	}// main
}
