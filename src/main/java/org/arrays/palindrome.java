package org.arrays;

public class palindrome {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 7, 5, 3, 1};
        System.out.println("Is palindrome : " + isPalindrome(arr));
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Is palindrome : " + isPalindrome(arr1));



    }


    public static boolean isPalindrome(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }

        }
        return true;
    }
}



