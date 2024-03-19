package org.OOPs.InterfaceExample;

interface AmountCalculator{

     public double Calculate(double Amount,int time, int RateOfInterest);

}
class SimpleInterestCalculator implements AmountCalculator{
   public double Calculate(double Amount,int time, int RateOfInterest){
       return (Amount*time*RateOfInterest)/100;

    }
    class EmiCalculator implements AmountCalculator{
        @Override
        public double Calculate(double Amount, int time, int RateOfInterest) {
            RateOfInterest = RateOfInterest / 12 / 100;
            return Amount * RateOfInterest * Math.pow(1 + RateOfInterest, time) / (Math.pow(1 + RateOfInterest, time) - 1);
        }
    }
}
public class Calculator {

    public static void main(String[]args){
        /*when we want to run method in emicalculator we should change the obj creation for it so instead we can have
        a factory method*/
        AmountCalculator calc= new SimpleInterestCalculator();
       double si= calc.Calculate(200000,1,7);
        System.out.println("the SI is: "+si);
    }
}
