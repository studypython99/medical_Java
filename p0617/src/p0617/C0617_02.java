package p0617;

public class C0617_02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		//System.out.println(a/b); // 3
		//System.out.print(a/(double)b); // 3.33333335, print: 줄바꿈없다
		//System.out.println(10/3.0); // 3.3333333335
		System.out.printf("소숫점 둘째자리까지+탭: "+"%.2f \t",10/3.0); // 3.3333333335
		System.out.println("aaa");
		System.out.printf("16진수: "+"%x \n",15); // 16진수, f
		System.out.printf("8진수: "+"%o \n",15); // 8진수, 17
		System.out.printf("2진수, 문자열변경: "+"%s \n",Integer.toBinaryString(15)); // 2진수> 문자열변경
		

	}

}
