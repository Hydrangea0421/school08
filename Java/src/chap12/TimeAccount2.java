package chap12;

public class TimeAccount2 extends Account {
	/** 定期の預金残高 */
	private long timeBalance;

	TimeAccount2(String name, String no, long balance, long timeBalance) {
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}

	long getTimeBalance() {
		return timeBalance;
	}

	/** 定期預金を解約して普通預金に移す */
	void cansel(){
		setBalance(getBalance() + timeBalance);
		timeBalance = 0;
	}
}
