## Exercise: Ticket Booking System

#### Objective:
The objective of this exercise is to create a program to simulate a ticket booking system where multiple users attempt to book tickets concurrently using threads.

#### Instructions:

1.	Create a Java class named TicketBookingExercise with a main method.
2.	Create a class named TicketBookingSystem to represent the ticket booking system. This class should have the following attributes and methods:
    -	An integer variable named totalTickets to store the total number of available tickets.
    -	A method named bookTicket to simulate a user booking a ticket. This method should decrement the totalTickets by 1 if there are available tickets.
    -	A method named getAvailableTickets to retrieve the current number of available tickets.
3.	Create a class named User that extends the Thread class. Each User represents a user of the ticket booking system and has the following responsibilities:
    -	Simulate booking multiple tickets (e.g., 2 tickets per user) using the bookTicket method of the TicketBookingSystem. If there are not enough tickets available, the user should print a message indicating that no tickets are available.
    -	Repeat the booking process multiple times (e.g., 3 booking attempts per user).
4.	In the main method of the TicketBookingExercise class, create one instance of the TicketBookingSystem, and create multiple User instances (e.g., 5 users).
5.	Start all the User threads to simulate concurrent booking attempts.
6.	Print messages indicating when tickets are successfully booked and when no tickets are available.
