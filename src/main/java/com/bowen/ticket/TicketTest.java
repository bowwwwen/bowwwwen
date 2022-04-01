 package com.bowen.ticket;


 import java.util.Scanner;

  public class TicketTest {
      public static void main(String[] args) {
          Station startstation = null;
          Station endstation = null;
          Ticket ticket = new Ticket(startstation, endstation);

          Scanner scanner = new Scanner(System.in);
          System.out.println("Your start station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
          int choose = Integer.parseInt(scanner.next());
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
          int number = Integer.parseInt(scanner1.next());
          if (number > 1) {
              System.out.println(startstation + "\t" + endstation + "\t" + number + "tickets");
          } else System.out.println(startstation + "\t" + endstation + "\t" + number + "ticket");
      }
  }
