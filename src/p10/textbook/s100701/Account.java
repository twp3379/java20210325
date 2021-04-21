package p10.textbook.s100701;

public class Account {
	private long balance;
<<<<<<< HEAD
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족:" + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}








=======

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족:" + (money - balance) + " 모자람");
		}
		balance -= money;
	}

}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
