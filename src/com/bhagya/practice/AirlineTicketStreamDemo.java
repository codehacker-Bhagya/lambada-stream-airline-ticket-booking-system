package com.bhagya.practice;

import java.util.Scanner;

public class AirlineTicketStreamDemo {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        PassengerController passengerController = new PassengerController();
        FlightController flightController = new FlightController();
        TicketController ticketController = new TicketController();
        ConcessionTicketController concessionTicketController = new ConcessionTicketController();
        NotificationAlertController notificationAlertController = new NotificationAlertController();
        BookingHistoryController bookingHistoryController = new BookingHistoryController();
        BillingAndCancellationController billingAndCancellationController = new BillingAndCancellationController();

        int option = 0;
        do  {

            System.out.println("Welcome to Airline booking System");
            System.out.println("Enter your option");
            System.out.println("1. Passenger Registration");
            System.out.println("2. information About Flight");
            System.out.println("3. book your Ticket here");
            System.out.println("4. For Concession Ticket");
            System.out.println("5. for booking History");
            System.out.println("6. for BillingAndCancellation");
            System.out.println("7. for Notification");
            System.out.println("0. Exit ");


            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    passengerController.handlePassengerOperation();
                    break;
                case 2:
                    flightController.handleFlightOperation();
                    break;
                case 3:
                    ticketController.handleTicketOperations();
                    break;
                case 4:
                    concessionTicketController.concessionTicketBooking();
                    break;
                case 5:
                    bookingHistoryController.handleBookingHistory();
                    break;
                case 6:
                    billingAndCancellationController.handleBilling();
                    break;
                case 7:
                    notificationAlertController.handleNotificationOperation();
                    break;
                case 0:
                    System.out.println("Back To Main Menu");
                    System.out.println("Enter your option");
                    System.out.println("1. Passenger Registration");
                    System.out.println("2. information About Flight");
                    System.out.println("3. book your Ticket here");
                    System.out.println("4. For Concession Ticket");
                    System.out.println("5. for booking History");
                    System.out.println("6. for BillingAndCancellation");
                    System.out.println("7. for Notification");
                    System.out.println("0. Exit ");
                default:
                    System.out.println("Invalid Otion");


            }

            System.out.println("Tnank You");

        }while (option != 0);
    }

}
