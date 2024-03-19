package org.Collections.Lists;

import java.util.ArrayList;
import java.util.List;
//Done by me.
public class AssignmentQuestionWithList {


        List<Integer> list = getRandomNumbers(20, 10, 50);

        public List<Integer> getAllEvenNumbers(){
            List<Integer> l = new ArrayList<>();
            for(Integer i:list){
                if(i%2==0){
                    l.add(i);
                }
            }

            return l;
        }
        public List<Integer> getAllNumbersDivisibleBy(int num){
            List<Integer> l =new ArrayList<>();
            for(Integer i:list){
                if(i%num==0){
                    l.add(i);
                }
            }
            return l;
        }
        public List<Integer> getAllNumbersDivisibleBy(int num1,int num2){
            List<Integer> n = new ArrayList<>();
            for(Integer i:list){
                if(i%num1==0&&i%num2==0){
                    n.add(i);
                }
            }
            return n;
        }
        public List<Integer> getEvenNumberByDoublingTheValue(){
            List<Integer> d = new ArrayList<>();
            for(Integer e:list){
                if(e%2==0){
                    d.add(e*2);
                }
            }
            return d;
        }
        public List<Integer> getEvenNumbersBetween(int lb,int ub){
            List<Integer> l = new ArrayList<>();
            for(Integer i:list){
                if(i%2==0&&i>lb&&i<ub){
                    l.add(i);
                }
            }

            return l;
        }
        public List<Integer> getRandomNumbers(int n, int lb, int ub) {
            List<Integer> list = new ArrayList<>();
            while (list.size() != n) {
                int num = (int) (Math.random() * (ub - lb + 1) + lb);
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
            return list;
        }



        public static void main(String[] args) {

            AssignmentQuestionWithList assignmentQuestionWithList = new AssignmentQuestionWithList();
            System.out.println(assignmentQuestionWithList.list);

            System.out.println(assignmentQuestionWithList.getAllEvenNumbers());
            System.out.println(assignmentQuestionWithList.getEvenNumberByDoublingTheValue());
            System.out.println(assignmentQuestionWithList.getAllNumbersDivisibleBy(3));
            System.out.println(assignmentQuestionWithList.getEvenNumbersBetween(22,40));

        }
    }


