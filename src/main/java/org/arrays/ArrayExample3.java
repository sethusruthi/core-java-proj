package org.arrays;

public class ArrayExample3 {
    public static void main(String[]args){
        int[]arr={25,40,10,65,50,44};
        System.out.println(("The biggest element in the array is: "+maxElement(arr)));
        int ele = 44;
        int index = indexEle( arr,ele);
        if(index!=-1){
            System.out.println("The index of the element is: " +index);
        }else{
            System.out.println("Element not found in the array");
        }



    }
    public static int maxElement(int[] arr){
        int max = arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            return max;
    }
    public static int indexEle(int[]arr,int element){
        int index=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==element){
                index= i;
                break;
            }
        }
        return index;
    }
}
