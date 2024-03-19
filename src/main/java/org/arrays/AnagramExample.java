package org.arrays;

import java.util.Arrays;

public class AnagramExample {
    public static void main(String[]args){
        int[]arr1 = {5,3,6,8};
        int[]arr2={8,3,5,6};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1,arr2));

    }
}
