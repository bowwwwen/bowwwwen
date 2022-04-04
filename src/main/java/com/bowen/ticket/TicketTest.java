 package com.bowen.ticket;


 import java.util.Scanner;

 public class TicketTest {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Your start station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
         int choose = Integer.parseInt(scanner.next());
         Station startstation = null;
         switch (choose) {
             case (1):
                 startstation = Station.TAIPEI_STATION;
                 break;
             case (2):
                 startstation = Station.TAICHUNG_STATION;
                 break;
             case (3):
                 startstation = Station.KAOHSIUNG_STATION;
                 break;
         }
         System.out.println("Your end station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
         choose = Integer.parseInt(scanner.next());
         Station endstation = null;
         switch (choose) {
             case (1):
                 endstation = Station.TAIPEI_STATION;
                 break;
             case (2):
                 endstation = Station.TAICHUNG_STATION;
                 break;
             case (3):
                 endstation = Station.KAOHSIUNG_STATION;
                 break;
         }

         System.out.println("Which kind of ticket? Normal Ticket:1 Student ticket:2 Elder ticket:3 Double ticket:4");
         choose = Integer.parseInt(scanner.next());
         Ticket ticket = null;
         switch (choose){
             case (1):
                 ticket = new Ticket(startstation,endstation);
                 break;
             case (2):
                 ticket = new StudentTicket(startstation,endstation);
                 break;
             case (3):
                 ticket = new ElderTicket(startstation,endstation);
                 break;
             case(4):
                 ticket = new DoubleTicket(startstation,endstation);
                 break;
         }

         System.out.println("How many tickets do you want?");
         Scanner scanner1 = new Scanner(System.in);
         int ticketnumber = Integer.parseInt(scanner1.next());
         assert ticket != null;
         assert startstation != null;
         assert  endstation != null;
         System.out.println(startstation.name + "\t" + endstation.name + "\t" + ticketnumber + "\t" + "total:" + ticket.price*ticketnumber);
     }
 }
