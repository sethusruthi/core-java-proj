package org.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[]args){
        //its a raw type so can store any type of values
        List list = new ArrayList();
        list.add(10);
        list.add("Hello");
        list.add(10.5);
        list.add(true);
        list.add(new Object());
        list.add("Java");
        list.add(".Net");

        for(Object obj:list) {
            //if we want to store string values we should do typecasting first and then print them
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println(str.toUpperCase());
            }
        }
    }
}
