package org.day2.SwitchStatements;

import java.util.Scanner;

public class SayDayName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number :");
        int day = sc.nextInt();

        // 1. Mondays are boring
        // 2. Tuesday are better
        // 3. Wednesday are best
        // 4. Thursday are good
        // 5. Friday are awesome
        // 6. Saturday are super
        // 7. Sunday are funday

        switch (day) {
            case 1:
                System.out.println("Mondays are boring");
                break;
            case 2:
                System.out.println("Tuesday are better");
                break;
            case 3:
                System.out.println("Wednesday are best");
                break;
            case 4:
                System.out.println("Thursday are good");
                break;
            case 5:
                System.out.println("Friday are awesome");
                break;
            case 6:
                System.out.println("Saturday are super");
                break;
            case 7:
                System.out.println("Sunday are funday");
                break;
            default:
                System.out.println("Invalid day number");

        }

    }
}
