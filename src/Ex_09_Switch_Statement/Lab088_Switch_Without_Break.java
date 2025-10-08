package Ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab088_Switch_Without_Break {
    public static void main(String[] args) {
        // Switch

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        //int day = Integer.parseInt(args[0]); - CLI option

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();
                        //if you are not added break, then it will be print all values up to default
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default:
                System.out.println("Invalid, day number");

        }
    }
}
