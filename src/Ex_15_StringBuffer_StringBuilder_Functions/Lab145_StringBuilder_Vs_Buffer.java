package Ex_15_StringBuffer_StringBuilder_Functions;

public class Lab145_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Swapnali";
        String s1 = new String("Sapna");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Swapnali");
        StringBuilder stringBuilder = new StringBuilder("Sapna");


        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
