package Ex_19_OOP_Inheritance.single_inheritance;

public class Lab174_FS_Single_Inheritance {
    public static void main(String[] args) {
        Son s1 = new Son();

        System.out.println(s1.gold);
        s1.bhk2();
        s1.bhk3();

        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.bhk2();
    }
}
