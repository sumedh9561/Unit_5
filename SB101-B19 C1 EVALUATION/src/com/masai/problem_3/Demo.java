package com.masai.problem_3;


import java.util.Arrays;
import java.util.List;

public class Demo {

    static  <T> void doTransaction  (List<T>  list) {

        for(Object i:list) {
//		  System.out.println(i);
            if(i instanceof CardPayment) {
//			  System.out.println("cash");
                List <CardPayment> card= (List<CardPayment>) list;
                for(CardPayment j:card) {
                    j.doPayment();			  }
                break;
            }
            else {

                List <CashPayment> cash= (List<CashPayment>) list;
                for(CashPayment j:cash) {
                    j.doPayment();			  }
                break;
            }
        }


        if(list instanceof Object) {
//			System.out.println("cp");
        }
        else {
//			System.out.println("nod");
        }
    }

    public static void main(String[] args) {

//		CashPayment cp=new CashPayment()

        List<CashPayment> cash=Arrays.asList(new CashPayment(8000),new CashPayment(7000));
//		System.out.println(cash);
        List<CardPayment> card=Arrays.asList(new CardPayment(6000),new CardPayment(9000));

        doTransaction(card);
        doTransaction(cash);
    }

}