package Ex_15_StringBuffer_StringBuilder_Functions;

public class Lab148_StringBuilder_01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Hello World
        sb.reverse(); // dlroW olleH
        System.out.println(sb);
    }
}
