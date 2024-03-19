package org.OOPs.Override;

public class SavingsAccount extends Account {
    protected double minBalance;

    public SavingsAccount(int accNum,String name , double balance,double minBalance){
        super(accNum,name,balance);
        this.minBalance=minBalance;

    }
    @Override
    public void withdraw(double amount){
        if(amount > (balance - minBalance)) {
            System.out.println("Sorry! Insufficient funds");
        }else {
            balance -= amount;
            System.out.println("Amount "+amount+" is withdrawn from account "+accNum);

        }

    }
}
