package org.Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample1 {
    public static void main(String[]args){
        Set<String> s = new HashSet<>();
        s.add("Sindhu");
        s.add("Durga");
        s.add("meeti");
        s.add("Sindhu");
        System.out.println(s);

        // set will check the hashcode and equals method to check the duplicate


//        for(String ele: Set) {
//            System.out.println(ele);
//        }
//        Set.forEach(System.out::println);
//
//        Iterator<String> iterator = Set.iterator();
//        while(iterator.hasNext()) {
//            String ele = iterator.next();
//            System.out.println(ele);
//        }
    }
}
