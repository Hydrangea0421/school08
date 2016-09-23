package ex0905;

import java.util.Random;
import java.util.Scanner;

public class kazuate {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int ran = rand.nextInt(90) + 10;
		System.out.print("答えは" + ran + "ですか？\n当たり：0／それより上：1／それより下：2＞＞");
		int ans = stdIn.nextInt();
		int n = 0;

		for (int i = 0; i > n; i++)

			if (ans == 0) {
				System.out.println("終了します。");
				break;
			} else if (ans == 1) {
				System.out.println("答えは" + ran + "ですか？");

			} else if (ans == 2) {
				System.out.println("答えは" + ran + "ですか？");

			} else {
				System.out.println("選択肢にありません");

			}

		stdIn.close();
	}

}
