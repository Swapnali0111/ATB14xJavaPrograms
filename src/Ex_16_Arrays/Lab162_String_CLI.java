package Ex_16_Arrays;

public class Lab162_String_CLI {
    public static void main(String[] args) {
        //  Entered elements in CLI arguments
        /*click on small down arrow besides run icon
           click on Edit Configuration
           enter the CLI args*/

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println("*****************");
        //for each loop
        for (Object obj : args){
            System.out.println(obj);
        }
    }
}