package Ex_09_Switch_Statement;

public class Lab095_JDK13 {
    public static void main(String[] args) {
        // JDK > 13
        int Itemcode = 003;
        switch (Itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }
}
