package chap5;

public class Quotation {

	public static void main(String[] args) {
		System.out.println("文字列リテラルと文字定数について");

		System.out.println("二重引用符に囲まれた\"ABC\"は文字列リテラルです。");

		System.out.print("一重引用符で囲まれた");
		System.out.print('\'');
		System.out.println("A'は文字列リテラルです。");

		System.out.println("\\");
		System.out.println("\\\\");
		System.out.println("\60\61\62\63\64\65\66\67\70\71\72\73\74\75");
		System.out.println("\160\161\162");
	}

}
