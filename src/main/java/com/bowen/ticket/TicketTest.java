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
                  startstation = Station.TAIPEI;
                  break;
              case (2):
                  startstation = Station.TAICHUNG;
                  break;
              case (3):
                  startstation = Station.KAOHSIUNG;
                  break;
          }
          System.out.println("Your end station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
          choose = Integer.parseInt(scanner.next());
          Station endstation = null;
          switch (choose) {
              case (1):
                  endstation = Station.TAIPEI;
                  break;
              case (2):
                  endstation = Station.TAICHUNG;
                  break;
              case (3):
                  endstation = Station.KAOHSIUNG;
                  break;
          }

          Scanner scanner1 = new Scanner(System.in);
          System.out.println("How many tickets do you want?");
          int ticketnumber = Integer.parseInt(scanner1.next());
          if (ticketnumber > 1) {
              assert endstation != null;
              System.out.println((startstation != null ? startstation.name : null) + "\t" + endstation.name + "\t" + ticketnumber + "tickets");
          } else {
              assert startstation != null;
              assert endstation != null;
              System.out.println(startstation.name + "\t" + endstation.name + "\t" + ticketnumber + "ticket");
          }
      }
  }
