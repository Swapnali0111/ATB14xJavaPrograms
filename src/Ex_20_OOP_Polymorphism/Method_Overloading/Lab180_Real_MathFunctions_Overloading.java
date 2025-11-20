package Ex_20_OOP_Polymorphism.Method_Overloading;

public class Lab180_Real_MathFunctions_Overloading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        h1.task("Bathroom");
    }

}

class Home {

    void task() {
        System.out.println("Task Cleaning Fan");
    }

    void task(String whichTask) {
        System.out.println("Task " + whichTask);
    }
}
