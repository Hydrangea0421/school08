package Lesson0831;

import java.util.Scanner;

public class Lesson001 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数１＞");
		int x = stdIn.nextInt();
		System.out.print("整数２＞");
		int y = stdIn.nextInt();

		int sum = x + y;

		System.out.println("" + x + "と" + y + "の合計値は" + sum + "です。");
		stdIn.close();
	}

}
