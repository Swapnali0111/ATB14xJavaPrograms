package Ex_10_For_Loop;

public class Lab109_For_If_Loop_Odd_number {
    public static void main(String[] args) {
        // TO find the odd numbers from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd --> " + i);
            }
        }
    }
}
