

import java.util.ArrayList;

public class Customer {
    private int accNo;
    private String name;
    private int pin;
    private int accountBalance;
    private ArrayList<Transaction> transactions;
    public Customer(int accNo,String name, int pin,int accountBalance){
        this.accNo =accNo;
        this.name = name;
        this.pin= pin;
        this.accountBalance=accountBalance;
    }

    public int getAccNo() {
        return accNo;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getPin() {
        return pin;
    }
    public String getName(){
        return name;
    }
    public void updateBalance(int n){
        accountBalance = n;
    }

}
