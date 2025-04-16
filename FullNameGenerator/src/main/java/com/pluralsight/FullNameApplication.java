package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // prompting user to enter their name
        System.out.println("Please enter your full name in parts below:");
        // tells user to not enter middle or suffix if they do not have one
        System.out.println("If you have no middle name or suffix please leave blank!");

        System.out.println("------------------------------------------");

        // asks user for first name
        System.out.print("First name: ");
        String firstName = myScanner.nextLine();

        // asks user for middle name
        System.out.print("Middle name: ");
        String middleName = myScanner.nextLine();

        // asks user for last name
        System.out.print("Last name: ");
        String lastName = myScanner.nextLine();

        // asks user for suffix
        System.out.print("Suffix: ");
        String suffix = myScanner.nextLine();

        System.out.println("------------------------------------------");

        // creates empty string
        String fullName = "";

        // if the length of characters is greater than 0 it adds to full name
        if (!firstName.isEmpty()){
            fullName += firstName;
        } else {
            System.out.println("Please enter first name:");
            System.exit(0); // exits if first name is blank
        }

        // if the length of characters is greater than 0 it adds to middle name
        if (!middleName.isEmpty()){
            fullName += " " + middleName;
        }

        // if the length of characters is greater than 0 it adds to last name
        if (!lastName.isEmpty()){
            fullName += " " + lastName;
        } else {
            System.out.println("Please enter last name:");
            System.exit(0); // exits if last name is blank
        }

        // if the length of characters is greater than 0 it adds the suffix with a comma
        if (!suffix.isEmpty()){
            fullName += "," + " " + suffix;
        }

        // displays parts of name with full name
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
        System.out.println("Suffix: " + suffix);
        System.out.println("Full name: " + fullName);

    }

}
