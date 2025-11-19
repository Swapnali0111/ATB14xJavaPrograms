package Ex_19_OOP_Inheritance.Multilevel;

public class Lab176_Multilevel_Inheritance_Dynamic_Dispatch {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.home();
        s1.bhk3();
        s1.land();
        s1.Extra();
        System.out.println("*********************");
        Father f = new Father();
        f.land();
        f.home();
        f.Extra();
        System.out.println("*********************");
        GrandFather gf =  new GrandFather();
        gf.land();
        gf.home();

        // Dynamic Dispatch
        GrandFather g1 = new Son();
        Father f1  = new Son();
        //Son s1 = new GrandFather();
        //Son s2 = new Father();
    }
}
