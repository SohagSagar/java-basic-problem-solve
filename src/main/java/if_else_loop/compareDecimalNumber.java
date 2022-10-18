package if_else_loop;

import java.text.DecimalFormat;
import java.util.Scanner;

//Input 2 decimal numbers and check if they are both same or different up to two decimal places.
// E.g 120.546 & 120.241

public class compareDecimalNumber {
    public static void main(String[] args) {

        //take input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        float firstNumber = input.nextFloat();
        System.out.println("Enter second number");
        float secondNumber = input.nextFloat();

        //extract decimal number form the input
        float fractionOfFirstNumber = Float.parseFloat((new DecimalFormat("0.00").format(firstNumber % 1)));
        float fractionOfSecondNumber = Float.parseFloat((new DecimalFormat("0.00").format(secondNumber % 1)));

        System.out.println("Decimal input of the first input:" + fractionOfFirstNumber);
        System.out.println("Decimal input of the second input:" + fractionOfSecondNumber);
        if(fractionOfFirstNumber==fractionOfSecondNumber){
            System.out.println("Decimal part of the two numbers are equal");
        }else {
            System.out.println("Decimal part of the two numbers are not equal");
        }





    }


}
