package chap8;

public class Car {
	/** 名前 */
	private String name;
	/** 幅 */
	private int width;
	/** 高さ */
	private int height;
	/** 長さ */
	private int length;
	/** 現在位置X座標 */
	private double x;
	/** 現在位置Y座標 */
	private double y;
	/** 残り燃料 */
	private double fuel;
	/** ナンバープレートの番号 */
	private String namber;
	/** 車体の色 */
	private String color;

	public Car(String name, int width, int height, int length, double fuel, String namber, String color) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.namber = namber;
		this.color = color;
		x = y = 0.0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getFuel() {
		return fuel;
	}

	/** スペック表示 */
	void putSpec() {
		System.out.println("名前:" + name);
		System.out.println("車幅" + width + "mm");
		System.out.println("車高" + height + "mm");
		System.out.println("車長" + length + "mm");
		System.out.println("ナンバー：" + namber);
		System.out.println("車体の色：" + color);
	}

	/**
	 * X方向にdx、Y方向にdy分移動する
	 *
	 * @param dx
	 *            X方向
	 * @param dy
	 *            Y方向
	 * @return 燃料が足りているので移動した=true/燃料不足=false
	 */
	boolean move(double dx, double dy) {
		boolean ret = true;

		double dist = Math.sqrt(dx * dx + dy * dy);
		if (dist > fuel) {
			ret = false;
		} else {
			fuel -= dist;
			x += dx;
			y += dy;
		}
		return ret;
	}
}
