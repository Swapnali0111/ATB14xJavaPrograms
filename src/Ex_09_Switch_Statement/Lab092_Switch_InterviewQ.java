package Ex_09_Switch_Statement;

public class Lab092_Switch_InterviewQ {
    public static void main(String[] args) {
        char ch = 'A';          // if here,you've changed the alphabet 'A' then default statement will execute
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
