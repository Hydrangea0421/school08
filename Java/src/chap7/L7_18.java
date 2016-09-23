package chap7;

import java.util.Scanner;

public class L7_18 {

	static void aryRmv(int[] a, int idx){
		for(int i = idx + 1; i < a.length; i++){
			a[i - 1] = a[i];
		}

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] a = { 1, 3, 4, 7, 9, 11 };

		aryRmv(a, 2);

		System.out.print("{");
		for (int aa : a) {
			System.out.print(aa + ",");
		}
		System.out.println("}");
		stdIn.close();
	}

}
