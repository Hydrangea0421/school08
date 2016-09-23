package chap4;

import java.util.Random;
import java.util.Scanner;

class L4_27 {

	public static void main(String[] args) {
		final int MAXNO = 99;
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(MAXNO + 1); // 当てるべき数：0～99の乱数として生成

		System.out.println("数当てゲーム開始！！");
		System.out.println("0～" + MAXNO + "の数を入れてください");

		int x; // プレイヤーが入力した数

		do {
			System.out.print("いくつかな：");
			x = stdIn.nextInt();

			if (x > no)
				System.out.println("もっと小さな数だよ。");

			else if (x < no)
				System.out.println("もっと大きな数だよ。");

		} while (x != no);

		System.out.println("正解です。");
		stdIn.close();
	}

}
