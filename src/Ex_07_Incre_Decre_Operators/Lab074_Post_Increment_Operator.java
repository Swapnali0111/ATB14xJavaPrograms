package Ex_07_Incre_Decre_Operators;

public class Lab074_Post_Increment_Operator {
    public static void main(String[] args) {
        int a = 10;
//        System.out.println(++a);


        // POST increment  = Print first and then increase.
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

        // ERT ( Exp and Result Table)
        // LNo |  a_post | b
        // 11  |  10 | NA
        // 12  |  11  | 10
        // 14  |  11  | 10
    }
}
