package Ex_19_OOP_Inheritance.Hierarchical;

public class Lab177_Hierarchical_Inheritance {
    public static void main(String[] args) {
        Son1 son1 = new Son1();
        son1.home();
        son1.Car1();
        System.out.println("####################");
        Son2 son2 =new Son2();
        son2.home();
        son2.Car2();
        System.out.println("####################");
        Son3 son3 = new Son3();
        son3.Car3();
        son3.home();
    }
}
