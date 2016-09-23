package chap5;

import java.util.Scanner;

public class L5_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		float x;
		double y;

		System.out.println("x:");
		x = stdIn.nextFloat();
		System.out.println("y:");
		y = stdIn.nextDouble();

		System.out.println("x = " + x);
		System.out.println("y = " + y);

		stdIn.close();
	}

}
