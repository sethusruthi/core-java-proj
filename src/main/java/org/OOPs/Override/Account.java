package org.OOPs.Override;

public class Account {
    protected int accNum;
    protected String name;
    protected double balance;

    public Account(int accNum,String name,double balance) {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;

    }

        public void withdraw(double amount){
            if (amount > balance) {
                System.out.println("Insufficient Balance");
            } else {
                balance -= amount;
            }

        }
        public void ShowInfo(){
        System.out.println("Acc num is " +accNum+ " the name " +name+ " the balance is "+balance);
        }
        public void depositAmount(double amount){
        balance+=amount;
        }

}
