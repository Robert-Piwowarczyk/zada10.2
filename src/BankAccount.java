public class BankAccount {
    private double accountBalance;
    Person person = new Person("", "", 123);

    public BankAccount(double accountBalance, Person person) {
        this.accountBalance = accountBalance;
        this.person = person;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    public void deposit(double amount) {
        accountBalance = getAccountBalance() + amount;
    }

    public void withdraw(double amount) {
        if (amount > accountBalance) {
            throw new LackOfAccountFunds();
        }
        accountBalance = getAccountBalance() - amount;
    }
}


