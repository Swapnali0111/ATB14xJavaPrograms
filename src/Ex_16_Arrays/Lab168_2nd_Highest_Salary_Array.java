package Ex_16_Arrays;

public class Lab168_2nd_Highest_Salary_Array {
    public static void main(String[] args) {
        int[] numbers = {100, 45, 67, 23, 89, 45, 189};
        int highest  = 0;
        int secondHighest = 0;

        for(int num : numbers){
            if(num > highest){
                secondHighest = highest;
                highest = num;
            }
            else if( num > secondHighest && num !=highest)
            {
                secondHighest = num;
            }
        }
        System.out.println("The Highest Salary is " + highest +" & " +"The Second Highest Salary is " + secondHighest);



    }
}
