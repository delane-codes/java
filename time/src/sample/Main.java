package sample;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        welcomeUser();
        Menu();
    }

    public static void Menu() {
        int option;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nMAIN MENU \n 1.continue\n 2.exit");
        option = scan.nextInt();
        if (option == 1) {
            welcomeUser();
            Menu();
        } else if (option == 2) {
            System.out.println("\ngoodBye!!!");

        } else {
            System.err.println("\nInvalid Option");
            Menu();
        }

    }

    public static void welcomeUser() {
        Date date = new Date();
        int hour = date.getHours();
        int mins = date.getMinutes();
        int secs = date.getSeconds();
        if (hour > 6 && hour < 12) {
            System.out.println("\nGood Morning," + " the time is: " + hour + ":" + mins + "am");
        } else if (hour >= 12 & hour <= 16) {
            System.out.println("\nGood Afternoon," + " the time is: " + hour + ":" + mins + "pm");
            if (hour == 16 && mins == 8) {
                System.out.println("\nPray," + " the time is: " + hour + ":" + mins + "pm");
            }

        } else {
            System.out.println("\nGood Evening," + " the time is: " + hour + ":" + mins + "pm");
        }
        double x = 0.0;
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }

}
