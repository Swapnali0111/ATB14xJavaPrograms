package Ex_08_If_Condition_Statement;

public class Lab081_If_Cond {
    public static void main(String[] args) {
        String user_input = "17";
        //System.out.println(user_input);
        int age = Integer.parseInt(user_input);
        System.out.println(age);

        if (age > 18) {

            System.out.println("Yes you can vote!");

        } else {
            System.out.println("You can't vote!");
        }
    }
}
