package p0620;

import java.util.Arrays;
import java.util.Scanner;

public class C0620_01_뽑기25 
{
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			// lotto, 학생성적프로그램
			String[] score = new String[45]; // 특정위치 x 표시를 위해 string으로 변환
			for(int i=0;i<score.length;i++)
			{
				score[i] = i+1+"";
			}
//			System.out.println(Arrays.toString(score));
			
			
			String[][] arr = new String[5][5];
			// 1~25까지의 숫자를 넣고 배열을 섞어 
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					arr[i][j] = (i*5+(j+1))+"";
				}
			}
			// 2차원배열 섞기
			int no1=0, no2=0;
			String t_value = 0+"";			
			for(int j=0;j<500;j++)
			{
				no1 = (int)(Math.random()*5);
				no2 = (int)(Math.random()*5);
				//섞기
				t_value = arr[0][0]+"";
				arr[0][0] = arr[no1][no2];
				arr[no1][no2] = t_value;
			}
			
			int count = 0;
			while(true)
			{					
				// 2차원배열 출력 (for문으로 출력)
				System.out.println("[2차원배열출력]");
				System.out.println("-----------");
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[i].length;j++)
					{
						System.out.print(arr[i][j]+"\t");						
					}
					System.out.println();
				}
				System.out.println("-----------");
				if(count==25)
				{
					System.out.println("-끝-");
					break;
				}
				
				// 특정 위치에 x 표시가 나타나도록
				System.out.println("1~25 숫자를 입력하세요 >>");
				int input = scan.nextInt();
				// 입력한 숫자가 범위를 벗어날 경우 다시 입력하세요 출력하기
				if (input>25 || input<1)
				{
					System.out.println("다시입력하세요");
					continue;
				}
				// 1~25사이의 숫자를 넣으면 x가 표시되도록 구현
				int temp = 0;
				for(int i=0;i<arr.length;i++)
				{
					for(int j=0;j<arr[i].length;j++)
					{
						if(arr[i][j].equals(input+""))
						{
							arr[i][j] = "x";
							temp = 1;
							count++;
						}

					}
					System.out.println();
				}
				if(temp==0)
				{
					System.out.printf("%d번은 입력된 숫자입니다. 다시 입력하세요.",input);
				}
				
				System.out.println("입력한 숫자: "+input);
				System.out.println();
			}//while

			
			
			
			
			
			
			
			
			
			
		}//main
}//class
