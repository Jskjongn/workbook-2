package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // greets user
        System.out.println("Welcome to TheaterReservations.com!");
        System.out.println("-----------------------------------------------");

        // asks user to enter name, then splits name at the space and puts the list into different
        // parts of first and last name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // asks user for the date of their reservation and then formats it to month/day/year
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String enteredDate = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        // parses to print out updated format
        LocalDate updatedDate = LocalDate.parse(enteredDate, formatter);

        // asks user for number of tickets
        System.out.print("How many tickets would you like? ");
        int numberOfTickets = scanner.nextInt();

        System.out.println("-----------------------------------------------");

        // if number of tickets is greater than 1 then its prints it out with "tickets"
        // else it prints it out with only "ticket"
        // concat and displays tickets, date, last name and then first name together
        if (numberOfTickets > 1){
            System.out.println(numberOfTickets + " tickets reserved for " + updatedDate.format(formatter)
                    + " under " + lastName + ", " + firstName);
        } else {
            System.out.println(numberOfTickets + " ticket reserved for " + updatedDate.format(formatter)
                    + " under " + lastName + ", " + firstName);
        }

    }

}
