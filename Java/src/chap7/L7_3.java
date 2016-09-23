package chap7;

import java.util.Scanner;

public class L7_3 {

	static int mid(int a, int b, int c) {
		int mid = a;
		if ((a > b && b > c)||(c > b && b > a)){
			mid = b;
		}
		if ((a > c && c > b)||(b > c && c > a)){
			mid = c;
		}
		return mid;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("変数a：");
		int a = stdIn.nextInt();
		System.out.print("変数b：");
		int b = stdIn.nextInt();
		System.out.print("変数c：");
		int c = stdIn.nextInt();

		System.out.println("中央値は" + mid(a, b, c) + "です。");
		stdIn.close();
	}

}
