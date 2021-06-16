public class BankAccount {
	public String name;
	public String accountingNumber;
	public static Integer totalAccounts = 0;
	static Double totalMoney = 0.0;
	public Double checkingBal = 0.0;
	public Double savingBal = 0.0;

	public BankAccount(String name){
		this.name = name;
		this.totalAccounts += 1;
	}

	public void depositSavings(Double check) {
		this.savingBal = check + savingBal;
		this.totalMoney += check;
		System.out.println("You deposited " + check + " into your savings account. Your new savings balance is " + savingBal);		  
	}

	public void depositChecking(Double check) {
		this.checkingBal = check + checkingBal;
		this.totalMoney += check;
		System.out.println("You deposited " + check + " into your checking account. Your total Checking balance is " + checkingBal);
	}


	public void checkTotalBalance() {
		System.out.println("Your total $"+ (this.savingBal + this.checkingBal));
	}

	public void checkBalance() {
		System.out.println("Your savings $"+this.savingBal);
		System.out.println("Your checking $"+this.checkingBal);
	}

	public void withdrawlSavingsMoney(Double withdraw) {
		this.savingBal -= withdraw;
		if(this.savingBal < 00.00) {
			this.savingBal += withdraw;
			System.out.println("You dont have enough money to make this withdrawl from that account!");
		} else {
			System.out.println("Your current balance after withdrawing from savings: $" + this.savingBal);

		}

	}

	public void withdrawlCheckingMoney(Double withdraw) {
		this.checkingBal -= withdraw;
		if(this.checkingBal < 00.00) {
			this.checkingBal += withdraw;
			System.out.println("You dont have enough funds to withdraw that amount from your checking account!");
            } 
        else {
			System.out.println("Your current balance after withdraw from checking is $" + this.checkingBal);
		}
	}
}