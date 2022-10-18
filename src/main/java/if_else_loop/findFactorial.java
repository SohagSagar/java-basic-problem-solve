package if_else_loop;// Write  a program to find the factorial of a given number

import java.util.Scanner;

public class findFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int number: ");
        int n = input.nextInt();

        int facValue = 1;
        if(n>0){
            for(int i = 1 ; i<=n; i++){
                facValue*=i;
            }
        }

        System.out.println("Factorial value of number "+ n + " is: " + facValue);
    }
}
