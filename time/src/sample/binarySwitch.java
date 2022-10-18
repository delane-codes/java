package sample;
//libraryImports

import java.util.Scanner;
//EO_libraryImports

public class binarySwitch {
    public static void main(String[] args) {

        //objects
        Scanner input = new Scanner(System.in);
        //EO_objects

        //prompt
        //EO_prompt
        GreekAlf();
        //var
        System.out.print("Enter a: ");
        int a = input.nextInt(); //externalVariable
        //input.nextInt();//ScannerBugFix
        System.out.print("Enter b: ");
        int b = input.nextInt(); //externalVariable
        boolean x = (a < b);
        isLess(x);

        System.out.println("\nPress 1 for On \t\t 0 for Off");
        int press = input.nextInt();
        //input.nextInt();//ScannerBugFix
        boolean switchOn = (press % 2 == 0);
        //EO_var


        //display
        if (!switchOn) { //use ! to cancel the original signal to false, giving us tru for our condition
            System.out.println("On");
        } else {
            System.err.println("Off");
        }
        //EO_display
        //prompt
        System.out.print("\nEnter sequence: ");
        //EO_prompt
        //countdown(); resources
        int n = input.nextInt();
        countdown(n);
        //EO_countdown(); resources
    }//EO_main();

    public static void countdown(int n) {
        if (n == 0) {
            System.err.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    private static void isLess(boolean x) {
        String y = "parsed string from bool";
        // x = 1;
        System.out.println(y);
    }

    public static void GreekAlf() {
        System.out.print(("Greek"));
        for (int i = 913; i < 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        //indexOf()
        String fruit = "Gamer radio err";
        int index = fruit.indexOf("err", 4);
        if (index == -1) { //use try
            System.err.println("err -1");
        }
        String ty = fruit.substring(12);
        System.out.println(ty);
        System.out.println(index);
    }

    //methods
    //EO_method

}//EO_binarySwitch_class
