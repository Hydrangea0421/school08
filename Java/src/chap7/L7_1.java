package chap7;

import java.util.Scanner;

public class L7_1 {

	static int signOf(int n) {

		int ret = 0;
		if (n < 0) {
			ret = -1;
		}
		else if (n > 0) {
			ret = 1;
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int param = -10;
		System.out.println("引数=" + param + "戻り値=" + signOf(param));
		param = 0;
		System.out.println("引数=" + param + "戻り値=" + signOf(param));
		param = 10;
		System.out.println("引数=" + param + "戻り値=" + signOf(param));

		stdIn.close();
	}

}
