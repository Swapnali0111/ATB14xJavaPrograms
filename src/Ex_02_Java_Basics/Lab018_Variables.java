package Ex_02_Java_Basics;

public class Lab018_Variables {
    public static void main(String[] args) {
        // Special character also can be a variable name.
        int _ = 60;
        // System.out.println(_);  --> '_' java: underscore not allowed here
        int $ = 65;
        System.out.println($);

        int year = 2025;

        int this_is_a_vari_long_name_in_the_class_hello_$_akakak = 89;

        System.out.println(this_is_a_vari_long_name_in_the_class_hello_$_akakak);
    }
}
