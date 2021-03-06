package chap7;

import java.util.Scanner;

public class MaxHwa {

//	static int max(int a, int b, int c) {
//		int max = a;
//		if (b > max)
//			max = b;
//		if (c > max)
//			max = c;
//		return max;
//	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("[" + (i + 1) + "] ");
			System.out.print("身長：");
			height[i] = stdIn.nextInt();
			System.out.print("    体重：");
			weight[i] = stdIn.nextInt();
			System.out.print("    年齢：");
			age[i] = stdIn.nextInt();
		}

		int maxHeight = max(height);
		int maxWeight = max(weight);
		int maxAge = max(age);

		System.out.println("身長の最大値は" + maxHeight + "です。");
		System.out.println("体重の最大値は" + maxWeight + "です。");
		System.out.println("年齢の最大値は" + maxAge + "です。");
		stdIn.close();
	}

private static int max(int[] height) {
	int maxHeight = height[1];
	if (height[1] > maxHeight)
		maxHeight = height[1];
	if (height[2] > maxHeight)
		maxHeight = height[2];
	return maxHeight;
}

}
