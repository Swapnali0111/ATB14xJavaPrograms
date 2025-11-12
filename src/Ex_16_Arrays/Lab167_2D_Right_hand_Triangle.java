package Ex_16_Arrays;

import java.util.Scanner;

public class Lab167_2D_Right_hand_Triangle {
    public static void main(String[] args) {
        // left hand triangle pattern
        // // How the pattern we want
        //        //  n = 3
        //        // *
        //        // **
        //        // ***
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern, e.g n = 3");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for(int j=0;j<=i;j++){
                System.out.print("\uD83D\uDE0A"); //smily symbol
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
