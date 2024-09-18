public class TicketBookingExercise {

  public static void main(String[] args) {

    TicketBookingSystem ticketBookingSystem = new TicketBookingSystem(10);
    User joe = new User(ticketBookingSystem, 2);
    User sabine = new User(ticketBookingSystem, 2);
    User nina = new User(ticketBookingSystem, 2);
    User ralf = new User(ticketBookingSystem, 2);
    User gregor = new User(ticketBookingSystem, 3);

    System.out.println("Joe start");
    joe.start();
    System.out.println("Sabine start");
    sabine.start();
    System.out.println("Nina start");
    nina.start();
    System.out.println("Ralf start");
    ralf.start();
    System.out.println("Gregor start");
    gregor.start();

    try {
      joe.join();
      sabine.join();
      nina.join();
      ralf.join();
      gregor.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    ticketBookingSystem.getAvailableTickets();
    System.out.println("Program exiting");
  }
}
