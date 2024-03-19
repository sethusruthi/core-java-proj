package org.arrays;

import java.util.Arrays;

public class Array_ex2 {
    public static void main(String[]args){
        int[]arr=new int[]{10,3,4,5,6,8,9,0};
        System.out.println("The length of the arr is; "+arr.length);
        //a pre-defined class in util array class that prints the elements in arrays.
        System.out.println((Arrays.toString(arr)));
        //also a pre-defined class that sorts the elements in array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //Comparing two arrays
        int[]arr1=new int[]{3,4,5,7,89,2};
        System.out.println("Comparing two arrays "+Arrays.equals(arr,arr1));



    }


}
