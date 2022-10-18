package if_else_loop;//Write a program to enter the numbers till the user wants and at the end,
// the program should display the largest and smallest numbers user entered.

import java.util.*;

public class findLargestAndSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>number = new ArrayList<Integer>();

        String quit = "no";
        System.out.print("Enter int number (press q to quit):") ;
        while (quit=="no"){
            try {
                String num = input.next();
                char checkQuit = num.charAt(0);

                if(checkQuit == 'q'){
                    quit = "yes";

                }else{
                    number.add( Integer.parseInt(num));
                }
            }catch (NumberFormatException err){
                System.out.println(err);
            }

        }


        Integer min = Collections.min(number);
        Integer max = Collections.max(number);
        System.out.println("\nYour Entered Numbers were: "+ number);

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);


    }


}



