package chap6;

import java.util.Scanner;

public class PointSumAve {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int sum = 0; // 合計
		System.out.println("5人の点数を「入力せよ。");

		System.out.println("1番の点数：");
		int yamane = stdIn.nextInt();
		sum += yamane;

		System.out.println("2番の点数：");
		int takaba = stdIn.nextInt();
		sum += takaba;

		System.out.println("3番の点数：");
		int kawachi = stdIn.nextInt();
		sum += kawachi;

		System.out.println("4番の点数：");
		int koga = stdIn.nextInt();
		sum += koga;

		System.out.println("5番の点数：");
		int tozuka = stdIn.nextInt();
		sum += tozuka;

		System.out.println("合計は" + sum + "点です。");
		System.out.println("平均は" + (double) sum / 5 + "点です。");

		stdIn.close();
	}

}
