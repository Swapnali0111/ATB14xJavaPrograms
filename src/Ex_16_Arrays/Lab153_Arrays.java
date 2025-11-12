package Ex_16_Arrays;

public class Lab153_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int marks[] = {91, 90, 51, 100, 91, 92, 89};

        boolean [] is_married_people = {true,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[2]);

//        System.out.println(marks[-1]); // java.lang.ArrayIndexOutOfBoundsException


        String name = "sapna";
        String[] name_each_element_char = name.split("");
        //    // ["s","a","p","n","a"]
        for (String s: name_each_element_char){
            System.out.println(s);
            // System.out.print(s);
        }
    }
}
