package chap5;

import java.util.Scanner;

public class L5_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数値xとyとzの平均値を求めます。");
		System.out.print("xの値:");
		int x = stdIn.nextInt();
		System.out.print("yの値:");
		int y = stdIn.nextInt();
		System.out.print("zの値:");
		int z = stdIn.nextInt();

		int sum = (x + y + z);
		System.out.println("xとyとzの合計値は" + sum + "です。");

		double ave = (double)(x + y + z) / 3;
		System.out.println("xとyとzの平均値は" + ave + "です。");

		stdIn.close();


	}

}
