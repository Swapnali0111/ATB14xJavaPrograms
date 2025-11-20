package Ex_20_OOP_Polymorphism.Method_Overriding;

public class Lab182_Runtime_Polymorphism {
    public static void main(String[] args) {
// Runtime Polymophism.

        Pramod p1  = new Pramod();
        p1.home();

//        Father f1 = new Father();
//        f1.home();

        Father f2 = new Pramod(); // Dynamic Dispatch /
        f2.home();

        //  Pramod p1 = new Father();
        // When father is getting born, child reference cannot be given to.
    }
}

class Father{
    void home(){
        System.out.println("2BHK");
    }
}

class Pramod extends Father{
    @Override
    void home(){
        System.out.println("3BHK");
    }
}
