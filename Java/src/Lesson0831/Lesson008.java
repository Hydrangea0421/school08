package Lesson0831;

import java.util.Scanner;

public class Lesson008 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("先頭の整数を入力＞");
		int x = stdIn.nextInt();
		System.out.print("末尾の整数を入力＞");
		int y = stdIn.nextInt();

		if (x > y) {
			int t = x;
			x = y;
			y = t;
			for (int i = 0; i <= y; i++) {
				if (y % i == 0)
					System.out.print(i);
			}
			stdIn.close();
		}
	}
}
