package sample;

import java.util.Date;
import java.util.Scanner;

public class bot {

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
            System.out.println("\nInvalid Option");
            Menu();
        }

    }

    public static void welcomeUser() {
        Date date = new Date();
        //int hour = date.getHours();
        //int mins = date.getMinutes();
        int secs = date.getSeconds();

        secs = 20;
        for (int g = 0; g < secs; g++) {
            int count = 0;//local variable for all statements
            System.out.println("Green" + "\t" + (count + g));
            secs += secs;
            for (int r = 0; r < secs; r++) {
                System.out.println("Red" + "\t" + (count + r));
                secs += secs;
                for (int a = 0; a < secs; a++) {
                    System.out.println("Amber" + "\t" + (count + a));
                    secs += secs;
                }//EO_Amber
            }//EO_Red
        }//EO_Green
        //welcomeUser() ;
    }//eo_WelcomeUser();
}




