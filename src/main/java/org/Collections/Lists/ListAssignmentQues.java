package org.Collections.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListAssignmentQues {
    public static void main(String[] args) {
        List<Integer> list = getRandomNumbers(10, 10, 50);
        System.out.println(list);
        List<String> list1 = List.of("Sruthi", "Sindhu", "BTS", "Durga", "Meeti");
        List<String> list2 = List.of("Sowji", "Hanish", "Praneeth", "Sruthi","BTS", "Charan", "Ajay");
        List<String> list3 = getDuplicateNames(list1, list2);
        System.out.println(list3);
        List<String> list4 = getUniqueNames( list1, list2);
        System.out.println(list4);


    }
            // Get n random numbers in the range lb and ub and store them in a list.
            //note:The numbers should not be repeated.
    public static List<Integer> getRandomNumbers(int n, int lb, int ub) {
        if(n<=0||lb>ub){
            throw new IllegalArgumentException("invalid arguments");
        }
            List<Integer> list = new ArrayList<>();
            Random r = new Random();
            for (int i = 0; i < n; i++) {
                int list1 = r.nextInt((ub-lb)+1)+lb;
                list.add(list1);



            }


        return list;
    }

    public static List<String> getDuplicateNames(List<String> list1, List<String> list2) {
        List<String> list3 = new ArrayList<>(list1);
        List<String> list5 = new ArrayList<>();
        //for each loop
        for (String name : list2) {
            if (list3.contains(name)) {
                list5.add(name);
            }
        }
        return list5;
    }
    public static List<String> getUniqueNames(List<String> list1, List <String> list2){
        List<String > list4 = new ArrayList<>(list1);
        for(String names:list2){
            if(!list4.contains(names)){
                list4.add(names);
            }
        }
            return list4;
        }

    }


