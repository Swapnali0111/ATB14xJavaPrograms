package Ex_05_Type_Casting;

public class Lab062_TypeCasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
//        short s = phone_no; // Narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s);
    }
}
