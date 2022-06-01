package com.javaBean;
import java.util.Scanner;
public class TicketMain {

	public static void main(String[] args) {
		Ticket tickets = new Ticket();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of bookings - ");
		int noofBooking = sc.nextInt();
		System.out.println("Enter available tickets -");
		int availableTicket = sc.nextInt();
		for(int i=1;i<=noofBooking;i++) {
			System.out.println("Enter the ticketId - ");
			int ticketId = sc.nextInt();
			System.out.println("Enter price of ticket - ");
			int ticketPrice = sc.nextInt();
			System.out.println("Enter number of tickets -" );
			int nooftickets = sc.nextInt();
			
			Ticket t1 = new Ticket(ticketId, ticketPrice, nooftickets);
			t1.calculateTicketCost(nooftickets);
			
		}

	}

}
