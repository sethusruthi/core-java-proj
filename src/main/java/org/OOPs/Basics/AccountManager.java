package org.OOPs.Basics;

import org.OOPs.Basics.Account;

public class AccountManager {
    public static void main(String[]args){
        Account acc1 = new Account("sindhu",2000);
        Account acc2 = new Account("Durga",5502);
        acc1.showAccountInfo();
        acc2.deposite(2530);
        acc2.withdrawAmount(250);
        acc1.ShowAccBalance();
        acc2.ShowAccBalance();
    }

}
