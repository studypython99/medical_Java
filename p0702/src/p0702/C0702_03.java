package p0702;

import java.util.Arrays;
import java.util.Collections;

public class C0702_03 {

	public static void main(String[] args) {

		String[] strArr1 = {"S0001","S0002","S0003","S0004","S0005","S0006","S0007"};
		//8
		String a = strArr1[strArr1.length-1].substring(1);
		int n = Integer.parseInt(a);
		System.out.println(n+1);
		String[] strArr2 = {"S0001","S0002","S0011","S0008","S0026","S0006","S0022"};
		//27
		String b = strArr2[strArr2.length-1].substring(1);
		int m = Integer.parseInt(b);
		System.out.println(m+1);
		
		String[] strArr3 = {"S0001","S0002","S0011","S0008","S0026","S0006","S0022"};
		Arrays.sort(strArr3);// 순차정렬
		System.out.println(Arrays.toString(strArr3));
		String c = strArr3[strArr3.length-1].substring(1);
		int o = Integer.parseInt(c);
		System.out.println(o+1);
		
//		int[] arr = {1,5,21,30,2,11,303};
//		Arrays.sort(arr);// 순차정렬
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[arr.length-1]); //303 출력
//
//		Integer[] arr2 = {1,5,21,30,2,11,303};
//		Arrays.sort(arr2,Collections.reverseOrder()); //역순정렬
//		System.out.println(Arrays.toString(arr2));
	}
		
}
