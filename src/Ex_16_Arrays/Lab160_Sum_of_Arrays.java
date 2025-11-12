package Ex_16_Arrays;

public class Lab160_Sum_of_Arrays {
    public static void main(String[] args) {
        int[] numbers = {5, 15, 10};
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum+ numbers[i];
        }
        System.out.println(sum);

    }
}
