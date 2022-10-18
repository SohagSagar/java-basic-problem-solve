package if_else_loop;//Write a program to sum of user input until users input ‘q’ from keyboard

import java.util.Scanner;
public class calculateSumUntilUserQuite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter number (use q to to quit):");
            String num = input.next();

            try{
                char ConfirmationCharacter = num.charAt(0);
                if(ConfirmationCharacter == 'q') {
                    System.out.println("\nTotal: " + sum);
                    System.exit(0);
                }
                int number = Integer.parseInt(num);
                sum += number;
            }
            catch(NumberFormatException  err){
                System.out.println(err);
            }

        }
    }
}
