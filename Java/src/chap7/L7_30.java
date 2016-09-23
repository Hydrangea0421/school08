package chap7;

public class L7_30 {

	static int min(int a, int b) {
		return a < b ? a : b;
	}

	static int min(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;
	}

	static int min(int[] b) {
		int min = b[0];
		for (int i = 1; i < b.length; i++) {
			min = min(min, b[i]);
		}
		return min;
	}

	public static void main(String[] args) {
		int param1 = 15;
		int param2 = 30;
		int param3 = 42;
		int[] a = { param1, param2, param3 };

		System.out.println(param1 + "," + param2 + "の最小値は" + min(param1, param2) + "です。");
		System.out.println(param1 + "," + param2 + "," + param3 + "の最小値は" + min(param1, param2, param3) + "です。");
		System.out.println("配列a[" + param1 + "," + param2 + "," + param3 + "]の最小値は" + min(a) + "です。");

	}
}
