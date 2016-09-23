package Lesson0831;

import java.util.Scanner;

public class Lesson003 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数１を入力＞");
		int a = stdIn.nextInt();

		System.out.print("整数２を入力＞");
		int b = stdIn.nextInt();

		System.out.print("整数３を入力＞");
		int c = stdIn.nextInt();

		if (a > b) {
			int t = a;
			a = b;
			b = t;

		}
		if (b > c) {
			int t = b;
			b = c;
			c = t;

		}
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		System.out.println("最も大きい整数" + c + "と");
		System.out.println("最も小さい整数" + a + "の差は" + (c - a) + "です。");

		stdIn.close();
	}

}
