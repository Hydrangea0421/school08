package chap6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class L6_9 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数:");
		int n = stdIn.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			a.add(rand.nextInt(9) + 1);
			System.out.println("a.get(" + i + ") = " + a.get(i));
		}
		System.out.println(a);
		stdIn.close();
	}
}
