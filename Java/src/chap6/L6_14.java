//package chap6;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class L6_14 {
//
//	public static void main(String[] args) {
//		Random rand = new Random();
//		Scanner stdIn = new Scanner(System.in);
//		String[] monthString = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
//				"October", "November", "December" };
//
//		int month = rand.nextInt(12);
//		System.out.println("英語の月名を入力してください。");
//
//
//
//		while (true) {
//			System.out.print(rand + "月：");
//			int m = stdIn.nextInt();
//			if (m == month + 1)
//				continue;
//			System.out.println("正解です。");
//			stdIn.close();
//		}
//		System.out.println("違います。");
//
//	}
//
//}
