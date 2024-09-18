public class TicketBookingSystem {

  private int totalTickets;

  public TicketBookingSystem(int totalTickets) {
    this.totalTickets = totalTickets;
  }

  public synchronized boolean bookTicket() {
    if (totalTickets < 1) {
      System.out.println("No tickets are available.");
      return false;
    }
    System.out.println(Thread.currentThread().getName() + " 1 Ticket sold "
      + " Tickets remaining " + --totalTickets);
    return true;
  }

  public synchronized void getAvailableTickets() {
    System.out.println(Thread.currentThread().getName() + " Tickets available " + totalTickets);
  }
}
