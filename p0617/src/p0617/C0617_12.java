package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		//점수를 입력받아 90점이상 A,BCDF 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("점수입력");
		int num = scan.nextInt();
		String score = "";
		if (num >= 90) {
			score = "A";
			if (num>=97) score = score+"+";
			else if(num<=92) {score = score+"-";}
		}else if (num>=80){
			score = "B";
			if (num>=87) score = score+"+";
			else if(num<=82) {score = score+"-";}
		}else if (num>=70){
			score = "C";
			if (num>=77) score = score+"+";
			else if(num<=72) {score = score+"-";}
		}else if (num>=60){
			score = "D";
			if (num>=67) score = score+"+";
			else if(num<=62) {score = score+"-";}
		}else
			score = "F";
		System.out.println("학점: "+score);
//		
//		{
//			if (num >= 97 ) {System.out.println("A+");
//			}else if (num >= 95 ) {System.out.println("A");
//			}
//			System.out.println("A");}
//		else if (num >= 80) System.out.println("B");
//		else if (num >= 70) System.out.println("C");
//		else if (num >= 60) System.out.println("D");
//		else System.out.println("F");
		
	}

}
