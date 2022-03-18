package com.bowen;

public class NormalCustomer{
    String id;
    int amount;
    int bonus;
    public NormalCustomer(String id, int amount){
        this.id = id;
        this.amount = amount;
    }
    public NormalCustomer(){

    }

    public void print(){
        float free = (amount/1000)*100;
        float total = amount - free;
        if (total>1000){
            System.out.println(id+ "\t" +amount+"\t"+total);
        }else {
            System.out.println(id+"\t"+amount+"\t"+"\t"+total);
        }
    }
}
