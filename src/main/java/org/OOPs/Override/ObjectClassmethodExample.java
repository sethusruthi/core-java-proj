package org.OOPs.Override;

import java.util.Objects;
     class product extends Object {


        private int num;
        private String name;
        private double pBalance;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getpBalance() {
            return pBalance;
        }

        public void setpBlance(double pBalance) {
            this.pBalance = pBalance;
        }

        public product(int num, String name, double pBalance) {
            this.num = num;
            this.name = name;
            this.pBalance = pBalance;
        }
        @Override
        public String toString(){
            return "Product {" +
                    "num=" + num +
                    ", name='" + name + '\'' +
                    ", balance=" + pBalance +
                    '}';

        }

         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (!(o instanceof product product)) return false;
             return num == product.num && Double.compare(pBalance, product.pBalance) == 0 && Objects.equals(name, product.name);
         }

         @Override
         public int hashCode() {
             return Objects.hash(num, name, pBalance);
         }
     }

public class ObjectClassmethodExample {
    public static void main(String[]args){
        product obj= new product(100,"pite",2400.5);
        product obj2= new product(100,"pite",2400.5);
        product obj3 = obj2;
        product obj4 = new product(200,"lila",2500);
        System.out.println(obj);
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
        System.out.println(obj4.equals(obj));

    }
}
