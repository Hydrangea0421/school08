package chap6;

public class PrintArray {

	public static void main(String[] args) {
		final int[] a = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("a = " + a);
		a[0] = 10;
		System.out.println("a = " + a);
	}

}
