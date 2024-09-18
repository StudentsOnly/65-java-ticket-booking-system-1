public class User extends Thread {
  private final TicketBookingSystem ticketBookingSystem;
  private final int tickets;

  public User(TicketBookingSystem ticketBookingSystem, int tickets) {
    this.ticketBookingSystem = ticketBookingSystem;
    this.tickets = tickets;
  }

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " run.");
    for (int i = 0; i < tickets; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      if (!ticketBookingSystem.bookTicket()) {
        System.out.println(Thread.currentThread().getName() + " could not buy ticket.");
      }
    }
    System.out.println(Thread.currentThread().getName() + " done.");
  }
}
