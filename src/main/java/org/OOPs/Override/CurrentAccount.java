package org.OOPs.Override;

public class CurrentAccount extends Account{
    private double overDraft;

    public CurrentAccount(int accNum, String name, double balance, double overDraft){
        super(accNum,name,balance);
        this.overDraft=overDraft;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > (balance + overDraft)) {
            System.out.println("Sorry! Insufficient funds");
        }else {
            balance -= amount;
            System.out.println("Amount "+amount+" is withdrawn from account "+accNum);
        }
    }
}
