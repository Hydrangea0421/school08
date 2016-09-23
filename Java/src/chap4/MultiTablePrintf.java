package chap4;

public class MultiTablePrintf {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				/*if (i * j == 40) {
					System.out.print("   ");
					continue;
				}*/
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
}
