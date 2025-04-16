package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // asks user to type name in either of the two formats
        System.out.println("Please enter full name below in either formats: ");
        System.out.println("First Last or First Middle Last");

        // storing user's name in full name
        String fullName = myScanner.nextLine().trim();

        // splitting the spaces in between the user's first middle and last name
        // then putting those parts into an array string name parts
        String[] nameParts = fullName.split(" ");

        // if the length of the array name parts is equal to 2
        if (nameParts.length == 2){
            // splits the parts into first name and last name
            String firstName = nameParts[0];
            String lastName = nameParts[1];
            // displays out their first, middle as none, and last name
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + lastName);
        }
        // if the length of the array name parts is equal to 3
        else if (nameParts.length == 3){
            // splits the parts into first middle and last name
            String firstName = nameParts[0];
            String middleName = nameParts[1];
            String lastName = nameParts[2];
            // displays out their first middle and last name
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
        }
        // if the array is not equal to 2 or 3 then the user didn't use either of the formats
        else {
            System.out.println("Please enter either of two formats: - First Last or First Middle Last\nThank you!");
        }



    }

}
