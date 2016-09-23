package chap6;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		for (int i = 0; i < monthString.length; i++){
			System.out.println(monthString[i]);
		}

		stdIn.close();
	}

}