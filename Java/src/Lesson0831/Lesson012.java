package Lesson0831;

import java.util.Scanner;

public class Lesson012 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;
		int sum = 0;
		int ave = 0;
		for(int i = 1; ; i++){
			System.out.print("数値の" + i + "を入力＞");
			n = stdIn.nextInt();
			if(n == 0){
			break;
			}
			sum += n;	// sum = sum + n;
			ave = sum / i;
		}

/*		}
		int n = stdIn.nextInt();

		int sum = 0;
		for (int i = 1; ; i++) {
			int t = stdIn.nextInt();
			if (t == 0)
				break;
		}
		*/
		System.out.println("合計は"+ sum +"です。");
		System.out.println("平均は"+ ave +"です。");
		stdIn.close();

	}

}
