package function_array;
//Take input from a user and check if the number exists in the array

import java.util.Scanner;

public class Check_number_exists_in_the_array {
    public static void main(String[] args) {
        int arr [] = {1,3,5,7,2,4,6,7,8};
        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease enter an integer number: ");
        int userInput = input.nextInt();
        int count=0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] == userInput){
                System.out.println("Integer " + userInput + " is found at index "+ i);
                count++;
            }
        }
        if (count==0) {
            System.out.println("/nFound no element");
        }




    }
}
