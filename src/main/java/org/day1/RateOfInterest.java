package org.day1;

import java.util.Scanner;

public class RateOfInterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal amount");
        double pAmount = sc.nextDouble();
        System.out.println("enter the interest rate amount");
        double rInterest= sc.nextDouble();
        System.out.println("enter the no of years");
        double years = sc.nextDouble();

        double Total = (pAmount*rInterest*years)/100;
        System.out.println("The simple interest is " +Total);

    }
}
