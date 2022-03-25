 package com.bowen.ticket;


 import java.util.Scanner;

  public class TicketTest {
      public static void main(String[] args) {
          Ticket ticket = new Ticket(Station.TAIPEI, Station.KAOHSIUNG);

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
      }
  }
