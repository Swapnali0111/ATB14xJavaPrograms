package Ex_02_Java_Basics;

public class Lab014_Variables {
    public static void main(String[] args) {
        System.out.println("This method will called by JVM.");
    }
    // We can have multiple main method but not having same parameter.

    public static void main(String args) {
        System.out.println("We can have multiple main method but not having same parameter.");
        //System will not run this statement.
    }

}
