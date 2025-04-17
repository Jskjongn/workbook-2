package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // asking user the prompts of entering name, billing, and shipping info
        System.out.println("Please provide the following information:");
        String name = userQuestions("Full name: ");
        String billingStreet = userQuestions("Billing Street: ");
        String billingCity = userQuestions("Billing City: ");
        String billingState = userQuestions("Billing State: ");
        String billingZip = userQuestions("Billing Zip: ");
        String shippingStreet = userQuestions("Shipping Street: ");
        String shippingCity = userQuestions("Shipping City: ");
        String shippingState = userQuestions("Shipping State: ");
        String shippingZip = userQuestions("Shipping Zip: ");

        System.out.println("-----------------------------------------------");

        // displays the name, billing, and shipping information
        displayInformation(name, billingStreet, billingCity, billingState, billingZip, shippingStreet, shippingCity, shippingState, shippingZip);
    }

    public static String userQuestions(String questions){
        // scanner to store user questions
        System.out.print(questions);
        String answer = scanner.nextLine();

        return answer;

    }

    // string builders for appending and formatting the name, billing, and shipping information together
    public static void displayInformation(String name, String billingStreet, String billingCity, String billingState, String billingZip, String shippingStreet, String shippingCity, String shippingState, String shippingZip){

        // appends the name
        StringBuilder fullName = new StringBuilder();
        fullName.append(name);
        System.out.println(fullName);

        // appends Billing Address to the answers the user gave
        StringBuilder billingInfo = new StringBuilder();
        billingInfo.append("\nBilling Address: \n");
        billingInfo.append(billingStreet);
        billingInfo.append("\n").append(billingCity).append(", ").append(billingState).append(" ").append(billingZip);
        System.out.println(billingInfo);

        // appends Shipping Address to the answers the user gave
        StringBuilder shippingInfo = new StringBuilder();
        shippingInfo.append("\nShipping Address: \n");
        shippingInfo.append(shippingStreet);
        shippingInfo.append("\n").append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);
        System.out.println(shippingInfo);

    }

}
