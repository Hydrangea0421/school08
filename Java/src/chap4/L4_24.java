package chap4;

import java.util.Scanner;

class L4_24 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("素数か判定します");
		System.out.print("整数を入力してください：");

		int num = stdIn.nextInt();
		int tenp;

		for (tenp = 2;; tenp++) {

			if (num == 2) {
				System.out.print("約数です");
				break;
			} else if (num == 1 || num % tenp == 0) {
				System.out.print("約数ではありません");
				break;
			} else if (tenp == num - 1) {
				System.out.print("約数です");
				break;
			}
		}
		stdIn.close();
	}
}
