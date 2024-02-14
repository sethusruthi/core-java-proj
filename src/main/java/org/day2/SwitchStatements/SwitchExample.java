package org.day2.SwitchStatements;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2:");
        int num2 = sc.nextInt();
        while (true) {
            System.out.println("1. Add 2. Sub 3. Mul 4. Div 5. Mod 6. Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("The sub of " + num1 + " and " + num2 + " is " + sub(num1, num2));
                    break;
                case 3:
                    System.out.println("The mul of " + num1 + " and " + num2 + " is " + mul(num1, num2));
                    break;
                case 4:
                    System.out.println("The div of " + num1 + " and " + num2 + " is " + div(num1, num2));
                    break;
                case 5:
                    System.out.println("The mod of " + num1 + " and " + num2 + " is " + mod(num1, num2));
                    break;
                case 6:
                    System.out.println("Thanks for using the calculator");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            sc.nextLine();
            System.out.println("Do you want to continue (yes/no) :");
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("no")) {
                break;
            }

        }
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int mod(int a, int b) {
        return a % b;
    }
}
