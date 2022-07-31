package chapter14;

public class BankAccount {
    private String accountNumber;
    private int balance;
    
    public String getAccountNumber () {
        return accountNumber;
    }
    
    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public int getBalance () {
        return balance;
    }
    
    public void setBalance (int balance) {
        this.balance = balance;
    }
    
    public String toString () {
        return "\\" + this.balance + "（口座番号：" + this.accountNumber + "）";
    }
    
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof BankAccount) {
            BankAccount bankAccount = (BankAccount) o;
            String an1 = this.accountNumber.trim ();
            String an2 = bankAccount.accountNumber.trim ();
            if (an1.equals (an2)) {
                return true;
            }
        }
        return false;
    }
    
}
