package lesson0914;

public class Sampletester {

	public static void main(String[] args) {
		String[] names = { "田中", "高橋", "鈴木", "佐藤", "加藤", "伊藤", "田中", "高橋", "加藤", "田中", };

			System.out.println();

		// countNames()を呼んで
			String[] countName = Sample.countNames(names);
			System.out.print("\nメインでの結果={");
			for (String str :  countName) {
				System.out.print(str+",");
			}
			System.out.println("}");
		// countNamesの戻り値を出力する
	}

}
