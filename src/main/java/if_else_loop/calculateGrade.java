package if_else_loop;// Write a program to calculate GPA and find grade

import java.util.Scanner;

public class calculateGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //take subject mark from user
        System.out.println("Enter number of subject:");
        int subCount = input.nextInt();
        float totalMarks=0;
        for(int i=1;i<=subCount;i++){
            System.out.println("Enter subject-" + i +" mark:");
            totalMarks+= input.nextFloat();
        }
        //calculate average of the given marks
        float average = totalMarks/subCount;

        /* grade system
        * average above 89 and below 101 -> A+
        * average above 79 and below 90 -> A
        * average above 69 and below 80 -> A-
        * average above 59 and below 70 -> B
        * average above 59 -> F
        * */

        System.out.println("Your total marks:"+ totalMarks);
        System.out.println("Your average marks:"+ average);
        if(average>89 && average <101){
            System.out.println("You got 'A+'");
        } else if (average>79 && average <90) {
            System.out.println("You got 'A'");
        } else if (average>69 && average <80) {
            System.out.println("You got 'A-'");
        } else if (average>59 && average <70) {
            System.out.println("You got 'B'");
        }else{
            System.out.println("You got 'F'");
        }



    }
}
