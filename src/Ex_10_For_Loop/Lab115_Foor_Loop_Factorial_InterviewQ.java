package Ex_10_For_Loop;

import java.util.Scanner;

public class Lab115_Foor_Loop_Factorial_InterviewQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int fact = 1;
        if (n == 0) {
            fact = 1;
        }

        // for (int i = n; i >=1 ; i--) {
        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }
        System.out.println("This Factorial of " + n + " number is --> " + fact);
    }
}
