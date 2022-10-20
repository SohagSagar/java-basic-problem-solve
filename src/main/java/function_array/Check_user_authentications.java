package function_array;
// Suppose a software system excepts valid credentials from user to logged in to the system.
//if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
//Let the username: admin, password: admin@123

import java.util.Scanner;

public class Check_user_authentications {
    public static void main(String[] args) {
        System.out.print("\n********* Please input your username and password *********\n");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.next();


        System.out.println();
        String actualUsername="admin";
        if(!username.equals(actualUsername)){
            System.out.println("\nusername not found. Try again!");
        }
        else {
            int count =0;
            while(true){
                System.out.print("Enter password: ");
                String password = input.next();
                String actualPassword = "admin@123";

                if (!password.equals(actualPassword)){
                    if(count>=2){
                        System.out.println("Your user has been temporary locked\n");
                        System.exit(0);
                    }else{
                        System.out.println("You entered wrong password. Try again!");
                        count++;

                    }

                }else{
                    System.out.print("\n*********** Welcome to admin dashboard ***********\n");
                    System.exit(0);
                }

            }




        }

    }
}
