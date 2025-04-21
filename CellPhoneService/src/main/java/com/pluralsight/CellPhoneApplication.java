package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // creates the cellphone
        CellPhone myPhone = new CellPhone();

        // asks user for cellphone information
        System.out.println("What is the serial number? ");
        String serialNumber = myScanner.nextLine();

        System.out.println("What model is the phone? ");
        String model = myScanner.nextLine();

        System.out.println("Who is the carrier? ");
        String carrier = myScanner.nextLine();

        System.out.println("What is the phone number? ");
        String phoneNumber = myScanner.nextLine();

        System.out.println("Who is the owner of the phone? ");
        String owner = myScanner.nextLine();

        // the Setters - sets the cellphone info on the object
        myPhone.setSerialNumber(Integer.parseInt(serialNumber)); // parses the string from user input back into an int
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);

        System.out.println("--------------------------------------------");

        // the Getters - gets the cellphone info to display
        // System.out.println("Serial number: " + myPhone.getSerialNumber());
        // System.out.println("Model: " + myPhone.getModel());
        // System.out.println("Carrier: " + myPhone.getCarrier());
        // System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        // System.out.println("Owner: " + myPhone.getOwner());

        // displays first phone info
        display(myPhone);

        // creates a second phone and sets the owner name and phone number
        CellPhone myPhone2 = new CellPhone();
        myPhone2.setOwner("David");
        myPhone2.setPhoneNumber("888-555-1234");

        // displays second phone info
        display(myPhone2);

        System.out.println("--------------------------------------------");

        // phones dial each other with name and phone numbers
        myPhone.dial(myPhone2.getPhoneNumber());
        myPhone2.dial(myPhone.getPhoneNumber());

        // creates a third phone with the new constructor that takes in all the parameters
        CellPhone myPhone3 = new CellPhone(266337, "iPhone 13 Pro", "ATT", "808-545-4004", "Mark");

        System.out.println("--------------------------------------------");

        // displays third phone with display method
        display(myPhone3);

        System.out.println("--------------------------------------------");

        // uses overloaded constructor of dial to take the name and phone number from a new cell phone
        myPhone.dial(myPhone3);
        myPhone3.dial(myPhone);

    }

    // displays the phones info
    public static void display(CellPhone phone) {

        System.out.println("Serial number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

    }

}
