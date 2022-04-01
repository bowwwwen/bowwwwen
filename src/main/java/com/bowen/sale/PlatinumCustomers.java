package com.bowen.sale;

public class PlatinumCustomers extends NormalCustomer{
    public PlatinumCustomers(String id,int amount){
        this.id = id;
        this.amount = amount;
    }

    @Override
    public void print() {
        float bonus = amount*0.2f;
        float price = amount*0.7f;
        if (amount>1000){
            System.out.println(id + "\t" + amount + "\t" + price + "(" + bonus + ")");
        }else System.out.println(id + "\t" + amount + "\t" + "\t" + price + "(" + bonus + ")");
    }
}
