package chap10;

public class Day {
	private int year  = 1;
	private int month = 1;
	private int date  = 1;

public static boolean isLeap(int y) {
	return y %4 == 0 && y % 100 != 0 || y % 400 == 0;
}
	public Day(int year) {
		set(year, 1, 1);
	}

	public Day(int year, int month) {
		set(year, month, 1);
	}

	public Day(int year, int month, int date) {
		set(year, month, date);
	}

	public Day(Day d) {
		set(d.year, d.month, d.date);
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDate(int date) {
		this.date = date;
	}

	/** 年月日を設定 */
	void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public boolean isLeap() { return isLeap(year); }

	/** 曜日を求める */
	int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}
	/** 文字列表現を返却 */
	public String toString() {
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		return String.format("%04d年%02d月%02d日", year, month, date, wd[dayOfWeek()]);
	}
}
