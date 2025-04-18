package com.pluralsight;

import java.awt.*;
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
        System.out.println("Serial number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());

    }

}
