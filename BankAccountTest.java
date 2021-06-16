public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount Alex = new BankAccount("Alex");

		Alex.depositSavings(43.21);
		Alex.depositChecking(500.00);
		Alex.checkBalance();
		Alex.withdrawlCheckingMoney(10.00);
		Alex.withdrawlSavingsMoney(20.00);
		Alex.checkBalance();

		
	}
	
}