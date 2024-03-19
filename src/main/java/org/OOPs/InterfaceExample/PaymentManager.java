//package org.OOPs.InterfaceExample;
//
//import java.util.Scanner;
//
//interface payment{
//    public void payment(double toAccount,double fromAccount,double amount);
//}
//class cashPayment implements payment{
//    @Override
//    public void payment(double toAccount, double fromAccount, double amount) {
//        System.out.println("the account "+this.getClass().getSimpleName()+fromAccount+"to "+toAccount+" and the amount is "+amount);
//    }
//}
//class ChequePayment implements payment{
//    public void payment(double toAccount, double fromAccount, double amount) {
//        System.out.println("the account "+this.getClass().getSimpleName()+fromAccount+"to "+toAccount+" and the amount is "+amount);
//    }
//
//}
//class NetBanking implements payment{
//    public void payment(double toAccount, double fromAccount, double amount) {
//        System.out.println("the account "+this.getClass().getSimpleName()+fromAccount+"to "+toAccount+" and the amount is "+amount);
//    }
//}
//class PaymentService {
//
//    private payment pay;
//
//    public PaymentService(payment pay) {
//        this.pay = pay;
//    }
//
//    public String payBill(double toAccount, double fromAccount, double amount) {
//        return pay.payment(toAccount, fromAccount, amount);
//    }
//
//}
//
//private static  payment GetPayment(String type){
//    return switch(type){
//        case "C"->new cashPayment();
//        case "Ch"->new ChequePayment();
//        case "Nb"->new NetBanking();
//        default -> throw new IllegalArgumentException("invalid exception");
//
//    };
//}
//public class PaymentManager {
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the type(C/Ch,Nb");
//        String type = sc.nextLine();
//        payment pay = GetPayment(type);
//        PaymentService service = new PaymentService(pay);
//        String response = service.payBill(12345, 67890, 1000);
//        System.out.println(response);
//
//    }
//}
