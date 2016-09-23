package chap6;

import java.util.Scanner;

public class L6_6Array {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		final int ninzu = 3;
		int[] tensu = new int[ninzu];

		System.out.println(ninzu + "人の点数を入力せよ。");
		for (int i = 0; i < ninzu; i++) {
			System.out.print((i + 1) + "番の人数");
			tensu[i] = stdIn.nextInt();
		}
		stdIn.close();

		int max = tensu[0];
		int min = tensu[0];

		for (int i = 1; i < tensu.length; i++) {
			if (tensu[i] > max)
				max = tensu[i];
			if (tensu[i] < min)
				min = tensu[i];
		}

		System.out.println("最高点は" + max + "です。");
		System.out.println("最低点は" + min + "です。");

	}

}
