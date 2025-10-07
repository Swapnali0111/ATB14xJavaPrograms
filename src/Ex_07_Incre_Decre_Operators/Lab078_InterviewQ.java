package Ex_07_Incre_Decre_Operators;

public class Lab078_InterviewQ {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ ->  A
        // +
        // ++a -> B
        // ++a -> A -> ExpA -> 11 , a -> 11
        // ++a -> B -> ExpB -> 12 , a -> 12
        // ExpA+ExpB -> 11+12 -> 23, a -> 12
    }
}
