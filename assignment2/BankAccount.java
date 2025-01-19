class BankAccount{
    long accountNumber;
    String accountHolderName;
    String accountType;
    double balance;

    void assignValues(String accountHolderName, long accountNumber, String accountType, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }
    void withdraw(double amount){  
        if(balance<amount){
            System.out.println("Insufficient balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Current balance: " + balance);
        }
    }
    void display(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args){
        BankAccount account = new BankAccount();

        account.assignValues("Pritanshu Samanta", 1234567890, "Savings", 1000.0);
        account.display();
        account.deposit(500.0);
        account.withdraw(200.0);

        account.display();
    }
}