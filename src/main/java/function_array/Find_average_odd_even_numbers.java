package function_array;
//Take 5 numbers from users in an array
// Then find out the average number, how many even and how many odd numbers using these functions:
// average(), countEvenNumbers(), countOddNumbers()

import java.util.ArrayList;
import java.util.Scanner;

public class Find_average_odd_even_numbers {
    public static <integer> void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; i++) {
            System.out.print("Enter-"+ i +" element: ");
            int element = input.nextInt();
            numbers.add(element);
        }
//        convert arraylist to array
        Integer[] num_array = numbers.toArray(new Integer[0]);


        average(num_array);
        countEventNumbers(num_array);
        countOddNumbers(num_array);
    }

    public static void average(Integer[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        float average = sum/array.length;
        System.out.print("\nAverage of all the number: " + average+"\n" );
    }

    public static void countEventNumbers(Integer[] array){
        int eventCount =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                eventCount++;
            }
        }
        System.out.println("Total event numbers: " + eventCount);
    }

    public static void countOddNumbers(Integer[] array){
        int oddCount =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                oddCount++;
            }
        }
        System.out.print("Total odd numbers: " + oddCount +"\n");
    }




}
