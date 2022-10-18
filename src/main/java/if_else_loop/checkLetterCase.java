package if_else_loop;
// Write a program to check if inputted letter is small or capital
import java.util.Scanner;

public class checkLetterCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        String letter = input.nextLine();

        //make letter in uppercase form
        String upperCaseLetter = letter.toUpperCase();

        if(letter==upperCaseLetter){
            System.out.println("Your given letter was in uppercase form");
        }else{
            System.out.println("Your given letter was in lowercase form");
        }




    }
}
