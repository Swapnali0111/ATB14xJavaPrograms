package Ex_18_OOP_Consructor;

public class Lab172_Car_LoginPage {
    public static void main (String[] args)
    {
        LoginPage lp = new LoginPage();

        Car1 car1 = new Car1();
        Car2 car2 = new Car2();

        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println(car2.model);
        System.out.println(car2.year);

    }
}
