package org.OOPs.Basics;

public class Account {
    private  long accNum;

    private  String name;
    private double balance;

    public Account(String name,double balance){
        accNum=System.currentTimeMillis();
        this.name =name;
        this.balance= balance;



    }

    public void showAccountInfo(){
        System.out.println("The Account "+ DataMask.maskAccountNumber(accNum)+ " and the Name is "+name+" and the balance is "+balance);

    }
    public void withdrawAmount(double amount){
        if(balance< amount){
            System.out.println("Insufficient Balance");
        }else{
            balance-=amount;
            System.out.println(" The Account "+DataMask.maskAccountNumber(accNum)+ " and the withdrawn amount is "+amount+" and the balance is "+balance);
        }

    }
    public void deposite(double amount){
        balance+=amount;
        System.out.println(" The Account "+DataMask.maskAccountNumber(accNum)+ " and the withdrawn amount is "+amount+" and the Name is "+name+" and the balance is "+balance);
    }
    public void ShowAccBalance(){
        System.out.println(" The Account "+DataMask.maskAccountNumber(accNum)+" and the Name is "+name+" and the balance is "+balance);

    }
}
