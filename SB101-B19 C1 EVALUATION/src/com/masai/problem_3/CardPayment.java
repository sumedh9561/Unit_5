package com.masai.problem_3;

public class CardPayment implements Payment {


    private int amount;
    //initialize amount using parameterized constructor



    @Override
    public void doPayment() {
        // TODO Auto-generated method stub
        System.out.println("Payment done using Card "+amount);

    }

    public CardPayment() {
        // TODO Auto-generated constructor stub
    }

    public CardPayment(int amount) {
        super();
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}