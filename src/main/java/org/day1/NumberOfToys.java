package org.day1;

import java.util.Scanner;

public class NumberOfToys {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of toys:");
        int toys= sc.nextInt();
        System.out.println("Enter the box size:");
        int size= sc.nextInt();
        int noOfBoxes = toys/size;
        if(toys%size!=0){
            noOfBoxes+=1;

        }
        System.out.println("The number of boxes requried are = " + noOfBoxes);
    }
}
