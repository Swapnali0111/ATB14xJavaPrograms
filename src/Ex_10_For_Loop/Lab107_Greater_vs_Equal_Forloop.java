package Ex_10_For_Loop;

public class Lab107_Greater_vs_Equal_Forloop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {  // 0 to 10, 11 times
            System.out.println(i);
        }
        System.out.println("******************");
        for (int i = 1; i <= 10; i++) { // 1 to 10, 10 times
            System.out.println(i);
        }
        System.out.println("******************");
        for (int i = 0; i < 10; i++) { // 0 to 9 , 10 times
            System.out.println(i);
        }
        System.out.println("******************");
    }
}
