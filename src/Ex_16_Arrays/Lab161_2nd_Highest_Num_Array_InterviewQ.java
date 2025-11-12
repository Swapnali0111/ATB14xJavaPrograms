package Ex_16_Arrays;

import java.util.Arrays;

public class Lab161_2nd_Highest_Num_Array_InterviewQ {
    public static void main(String[] args) {
        int[] numbers = {12, 80, 10, 1, 100, 3, 4, 32};//100,80
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);
    }
}
