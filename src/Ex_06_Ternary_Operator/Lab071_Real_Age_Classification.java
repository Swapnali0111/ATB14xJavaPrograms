package Ex_06_Ternary_Operator;

public class Lab071_Real_Age_Classification {
    public static void main(String[] args) {
        String user_input = "10";
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        // Input - String
        // String - Int
        int age = Integer.parseInt(user_input);

        String result = (age < 18) ? "Minor" : (age <= 60) ? "Adult": "Sr. Citizen";
        System.out.println(result);

    }

}
