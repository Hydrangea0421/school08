package Lesson0831;

import java.util.Scanner;

public class Lesson009 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int n;

		do {
			System.out.print("整数を入力＞");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("" + n + "までの和は" + sum + "です。");
		stdIn.close();
	}

}