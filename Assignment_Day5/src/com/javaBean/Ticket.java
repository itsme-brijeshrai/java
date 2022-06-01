package com.javaBean;

public class Ticket {
	private int ticketId;
	private int price;
	private int noofticket;
	private static int availableTickets;
	private int leftTicket;
	private int amount;
	
	
	/**
	 * 
	 */
	public Ticket() {
	}
	public Ticket(int ticketId, int price, int noofticket) {
		this.ticketId = ticketId;
		this.price = price;
		this.noofticket = noofticket;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getNoofticket() {
		return noofticket;
	}
	public void setNoofticket(int noofticket) {
		this.noofticket = noofticket;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets() {
		if(availableTickets <=0) {
			System.out.println("-1");
		}else {
			availableTickets = availableTickets;
		}
	}
	
	public int calculateTicketCost(int nooftickets) {
		int ticketCost = nooftickets*price;
		return ticketCost;
	}
	
}
