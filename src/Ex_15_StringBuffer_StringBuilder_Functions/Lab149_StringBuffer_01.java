package Ex_15_StringBuffer_StringBuilder_Functions;

public class Lab149_StringBuffer_01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);

    }
}
