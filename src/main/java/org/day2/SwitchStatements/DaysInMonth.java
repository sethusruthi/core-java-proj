package org.day2.SwitchStatements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number :");
        int month = sc.nextInt();
        System.out.println("Enter the year :");
        int year = sc.nextInt();
        System.out.println("The number of days in the month " + month + " in the year " + year + " is " + daysInMonth(month, year));

    }

    public static int daysInMonth(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 0;
        };

    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

    public static String getMonthName(int num){
        String name = switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number";
        };
        return name.toUpperCase();
    }
    public static String getDayName(int num){
        return "";
    }
}
