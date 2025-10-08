package Ex_09_Switch_Statement;

public class Lab097_Switch_InterviewQ {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo Swappppp");
            case 'A':
                System.out.println("60");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
// here, switch case is for 'C', but C case is not present so default statement is executing and after default break is not given so case A is also executing