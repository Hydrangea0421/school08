package Lesson0831;

import java.util.Scanner;

public class Lesson006 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("先頭の整数を入力＞");
		int num = stdIn.nextInt();

		for (int i = 0; i >= -num; i--) {

			System.out.print(i + num +"");
			stdIn.close();
		}
	}
}
