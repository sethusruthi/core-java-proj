package org.Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {


        public static void main(String[] args) {

            List<String> namesList = new ArrayList<>();
            namesList.add("Krish");
            namesList.add("Manoj");
            namesList.add("John");
            namesList.add("Smith");
            namesList.add("Krish");
        //they have overriden toString method so it prints the content of the obj
            System.out.println(namesList.toString());
            System.out.println(namesList.get(0));
            System.out.println(namesList.get(4));
            System.out.println(namesList.size());

            // process all the elements in the list using for loop
            for (int i = 0; i < namesList.size(); i++) {
                System.out.println(namesList.get(i).toUpperCase());
            }

            namesList.remove(0);
            System.out.println(namesList);
            namesList.set(0,"Manoj Kumar");
            System.out.println(namesList);
            System.out.println(namesList.contains("John"));

            List<String> names = new ArrayList<>();
            names.add("Krish");
            names.add("Manoj Kumar");
        //to check if names is present in namesList or not
            System.out.println(namesList.containsAll(names));

            System.out.println(namesList.subList(0,2));

        }
    }

