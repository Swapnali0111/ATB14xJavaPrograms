package Ex_15_StringBuffer_StringBuilder_Functions;

public class Lab146_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Swapnali");

        stringBuffer.append("Khairnar");
        System.out.println(stringBuffer); // SwapnaliKhairnar


        String s1 = "Swapnali";
        s1 = s1+ "Khairnar";
        System.out.println(s1);
    }
}
