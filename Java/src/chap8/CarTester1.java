package chap8;

public class CarTester1 {

	public static void main(String[] args) {
		Car vitz = new Car("ビッツ", 1660, 1500, 3640, 40.0, "77-77", "白");
		Car march = new Car("マーチ", 1660, 1525, 3695, 41.0, "87-65", "黒");

		vitz.putSpec();
		System.out.println();
		march.putSpec();
	}
}
