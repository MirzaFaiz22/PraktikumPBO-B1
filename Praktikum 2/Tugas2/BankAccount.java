package Tugas2;

public class BankAccount {
    private float balance;

    public BankAccount(float initialBalance){
        balance = initialBalance; 
    }

    public float deposit(float money){
        if(money > 0){
            balance += money;
            return money; 
        } else {
            return 0;
        }
    }

    public float withdraw(float money){
        if(money > 0 && money <= balance){
            balance -= money;
            return money; 
        } else {
            return 0; 
        }
    }

    public float getBalance(){
        return balance;
    }
}
