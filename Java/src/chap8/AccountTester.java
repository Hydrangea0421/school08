package chap8;

class Account {
	// フィールド
	private String name; // 初期化はnull
	private String no; // 初期化はnull
	private long balance; // 初期化は0

	// コンストラクタ
	Account(String n, String num, long z) {
		name = n;
		no = num;
		balance = z;
	}

	// インスタンスメソッド
	String getName() {
		return name;
	}

	String getNo() {
		return no;
	}

	long getBalance() {
		return balance;
	}

	void deposit(long k) {
		balance += k;
	}

	void withdraw(long k) {
		balance -= k;
	}
}

public class AccountTester {

	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000);
		Account nakata = new Account("仲田真二", "654321", 200);

		adachi.withdraw(200);
		nakata.deposit(100);

		System.out.println("■足立君の口座");
		System.out.println("　口座名義：" + adachi.getName());
		System.out.println("　口座番号：" + adachi.getNo());
		System.out.println("　預金残高：" + adachi.getBalance());

		System.out.println("■仲田君の口座");
		System.out.println("　口座名義：" + nakata.getName());
		System.out.println("　口座番号：" + nakata.getNo());
		System.out.println("　預金残高：" + nakata.getBalance());
	}
}
