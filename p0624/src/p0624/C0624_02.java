package p0624;

import java.util.Arrays;

public class C0624_02 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = null;
		arr2 = arr; // 동기화에 사용
		System.out.println(Arrays.toString(arr2));
		arr2[0] = 1000;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		// 주소값을 전달해서 값이 같다.
		// 참조변수는 주소값만 전달한다.
	}
}
