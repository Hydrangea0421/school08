package Lesson0831;

import java.util.Scanner;

public class Lesson002 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int n;

		do {
			System.out.print("正の整数を入力してください。＞");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1から" + n + "までの和は" + sum + "です。");
		stdIn.close();
	}

}
