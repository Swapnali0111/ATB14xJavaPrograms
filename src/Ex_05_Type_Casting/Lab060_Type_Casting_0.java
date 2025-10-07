package Ex_05_Type_Casting;

public class Lab060_Type_Casting_0 {
    public static void main(String[] args) {
        byte b = 10;
        // int a = b; // // Valid syntax - Implicit - Casting -> Widening ->
        int a = (int) b; // Explicit Casting - Widening
        System.out.println(a);
        System.out.println(b);
        /*
                int a1 = 300;
                byte b1 = a1;
        */
    }
}
