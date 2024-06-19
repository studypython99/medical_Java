package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_10_근사치 {

	public static void main(String[] args) {
		// 1~100까지 랜덤숫자를 생성, 랜덤숫자 맞추기
		// 숫자를 입력해서 up, down 말해주기
		// 10번까지 입력가능
		// 마지막에는 랜덤숫자:00, 입력한숫자:00,00,..,00
		Scanner scan = new Scanner(System.in);
		
		int[] input = new int[10];
		int r_num = (int)(Math.random()*100)+1;
		System.out.println("랜덤번호: "+r_num);
		//100을 넘어가는 숫자가 입력되면 다시
		int i = 0;
		while(i<10) {
			System.out.println("\n 숫자를 입력하세요(1~100)");
			int num = scan.nextInt();
			
			if (num<1 || num>100) {
				System.out.println("1~100 사이의 숫자를 입력하세요.");
				continue;
			}
			input[i] = num;
			if (num>r_num) {
				System.out.printf("%d보다 작습니다.",num);
				i += 1;
			}else if (num<r_num) {
				System.out.printf("%d보다 큽니다.",num);
				i += 1;
			}else {
				System.out.printf("%d 정답입니다.",num);
				break;
			}
			
		}//while(true)
		//결과 생성
		System.out.println("랜덤번호: "+r_num);
		System.out.println("입력번호: ");
		for(int j=0;j<i;j++) {
			System.out.println(input[j]+" ");
			
		}
		// 정답을 못맞추면 가장 근사치에 있는애가 누군지 찾으시오
		// 정답-오답=|근사치|

		int[] arr = new int[10];

		for (int k=0;k<10;k++) {
			if ((r_num - input[k])<0) {
				arr[k] = (r_num - input[k])*(-1);
			}else {
				arr[k] = r_num - input[k];
			}
		}// for k
		System.out.println(Arrays.toString(arr));
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("근사치: "+(r_num-min));
		System.out.println("랜덤숫자: "+r_num);
	}// main

}
