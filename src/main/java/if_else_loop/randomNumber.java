package if_else_loop;//Write a program to generate 2 random numbers which will not be shown to the user.
// Take a user input and match it with any of the random numbers.
// If correct give it 1 point and if incorrect, do not give it any point.
// Finally, repeat this for 10 times and count the point user achieved.

import java.util.Scanner;
public class randomNumber {
    public static void main(String[] args) {
        int min =0;
        int max =10;
        //generate random numbers
        double randomNumber1 =  Math.random()*(max-min+1)+min;
        double randomNumber2 =  Math.random()*(max-min+1)+min;

        Scanner input = new Scanner(System.in);

        int arr[] = {};
        int pointsCount=0;

        for(int i=0; i<=10;i++){
            System.out.print("Enter number-"+ i + ":");
            int num = input.nextInt();
            if(num == Math.round(randomNumber1) || num == Math.round(randomNumber2)){
                pointsCount++;
            }

        }
        System.out.println("\nRandom numbers were: " + Math.round(randomNumber1) +" "+ Math.round(randomNumber2));
        System.out.println("Your point: "+ pointsCount);






    }
}
