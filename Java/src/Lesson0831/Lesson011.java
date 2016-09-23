package Lesson0831;

import java.util.Scanner;

public class Lesson011 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("「*」を５つ表示します。");

		int n = 5;

		for(int i = 0; i < n; i++){
		System.out.print('*');
		}
		stdIn.close();
	}

}
