package com.pluralsight;

public class ForLoop {

    public static void main(String[] args) throws InterruptedException {

        for (int countdown = 10; countdown > 0; countdown--) {
            Thread.sleep(1000);
            System.out.println(countdown);
        }

        System.out.println("Launch!");

    }

}
