package Ex_17_OOPs;

public class Lab176_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Swapnali");
    }
}

class Student {
    String name;

    // DC
    Student() {
        System.out.println("DC -> Hi, I am called.");
    }

    // PC
    Student(String name) {
        System.out.println("PC -> Hi," + name);
    }


    void sleep() {
    }

    void study() {
    }

    void eat() {
    }
}

