package p0618;

public class C0618_04 {

	public static void main(String[] args) {
		//구구단
		// 4x4 에서 멈추고싶다
		// loop가 있는곳에서 멈추고싶다!?
		loop1:for (int i=2;i<=9;i++) {
			System.out.printf("[%d단]\n",i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%dx%d=%d \n",i,j,i*j);
				if (i==4 && j==4) {
					break loop1;
				}
			}
		}

	}

}
