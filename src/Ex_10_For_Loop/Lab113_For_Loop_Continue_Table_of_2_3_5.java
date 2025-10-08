package Ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Table_of_2_3_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20 ; i++) {
            if(i%2 !=0 ){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("*************************");
        for (int i = 1; i <= 30 ; i++) {
            if(i%3 !=0 ){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("*************************");
        for (int i = 1; i <= 50 ; i++) {
            if(i%5 !=0 ){
                continue;
            }
            System.out.println(i);
        }
    }
}
