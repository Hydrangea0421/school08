package chap9;

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
	/** 購入日 */
	private Day purchaseDay;

	/**コンストラクタ*/
	public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.purchaseDay =  new Day (purchaseDay);
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
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}

	/** スペック表示 */
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
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
