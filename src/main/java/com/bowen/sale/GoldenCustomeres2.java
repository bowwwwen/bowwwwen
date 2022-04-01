package com.bowen.sale;

public class GoldenCustomeres2 extends SilverCustomer{
    public GoldenCustomeres2(String id, int amount) {
        super(id,amount);
    }
    @Override
        public void print() {
            float bonus = amount*0.1f;
            float price = amount*0.9f;
            if (amount>1000){
                System.out.println(id + "\t" + amount + "\t" + price + "(" + bonus + ")");
            }else {
                System.out.println(id + "\t" + amount + "\t" + "\t" + price + "(" + bonus + ")");
            }
    }
}
