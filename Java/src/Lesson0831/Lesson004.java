package Lesson0831;

import java.util.Scanner;

public class Lesson004 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("秒を入力＞");
		int time = stdIn.nextInt();

		int second = (time % 3600) % 60;
		int minute = ((time - second) / 60) % 60;
		int hour = (time - second) / 3600;

		System.out.printf("" + hour + "時間" + minute + "分" + second + "秒です。");

		stdIn.close();
	}

}
