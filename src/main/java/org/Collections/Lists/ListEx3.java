package org.Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[]args){
        List<String> list1 = new ArrayList<>();
        list1.add("Sruthi");
        list1.add("sindhu");
        list1.add("Srinivas");
        list1.add("sunitha");

        List<String> list2 = new ArrayList<>();
        list2.add("Sriram");
        list2.add("Bhanu");
        list2.add("Sindhu");
        list2.add("Jhansi");
        list2.add("BabuRao");

        List<String> list3 = new ArrayList<>(list1);
        for(String name:list2){
            if(!list3.contains(name)){
                list3.add(name);
            }
        }
        System.out.println(list3);
    }
}
