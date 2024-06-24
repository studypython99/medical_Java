package p0619;

import javax.swing.JOptionPane;

public class C0619_07 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		int input = 0; // 입력받을 값
		int count = 0; // 도전 회수
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			String str = JOptionPane.showInputDialog("숫자를 입력하세요.(-1:종료)");
			count++;
			if(input == -1) {
				System.out.println("프로그램 종료");
				break;
			}//if(input == -1)
			
			if(num>input) {
				System.out.println("더 큰수 입력");
			}else if(num<input){
				System.out.println("더 작은수 입력");
			}else {
				System.out.println("정답입니다.");
			}
		}//while
	}//main
}
