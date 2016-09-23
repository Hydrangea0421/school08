package chap10;

public class Account {
	// フィールド
	private static int counter = 0;
	private String name; // 初期化はnull
	private String no; // 初期化はnull
	private long balance; // 初期化は0
	private int id;

	// コンストラクタ
	public Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
		id = ++counter;
	}

	// インスタンスメソッド
	public String getName() {
		return name;
	}

	public String getNo() {
		return no;
	}

	public long getBalance() {
		return balance;
	}

	public int getId() {
		return id;
	}

	public void deposit(long k) {
		balance += k;
	}

	public void withdraw(long k) {
		balance -= k;
	}
}
