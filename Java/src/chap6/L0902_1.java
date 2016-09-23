package chap6;

import java.util.ArrayList;

public class L0902_1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		{

			for (int i = 0; i < 3; i++) {
				a.add(i + 1);
			}
			for (int i = 0; i < a.size(); i++) {
				System.out.println("a.get(" + i + ")=" + a.get(i));
			}

			for (int i = 3; i < 5; i++) {
				a.add(i + 1);
			}
			for (int i = 0; i < a.size(); i++) {
				System.out.println("a.get(" + i + ")=" + a.get(i));
			}
		}
	}
}