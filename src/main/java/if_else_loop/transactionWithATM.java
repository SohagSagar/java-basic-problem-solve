package if_else_loop;//Write a program to check balance and withdraw money from ATM booth using if else or switch case

import java.util.Scanner;

public class transactionWithATM {

    //quite application based on user command
    public static String userConfirmation(){
        Scanner input = new Scanner(System.in);
        //get user termination confirmations
        System.out.println("Are you finish your transaction? (press Y if YES or press N for NO)");
        String userConfirmation = input.next();
        char ConfirmationCharacter = userConfirmation.charAt(0);
        if(ConfirmationCharacter == 'Y') {
            System.exit(0);
            System.out.println("\nThank you for staying with us.\n");
        }
        return "" ;
    };

    public static void main(String[] args) {
        float initalBalance = 5000;


        System.out.println("\n**************** WELCOME ****************\n");

        transactionWithATM obj = new transactionWithATM();

        while (true){
            //options
            Scanner input = new Scanner(System.in);
            System.out.println("Press 1 Check balance");
            System.out.println("Press 2 Add balance");
            System.out.println("Press 3 Withdraw  balance");
            System.out.println("Press 4 to exit");
            System.out.print("Please Choice a option:");

            int getChoice = input.nextInt();
            switch (getChoice){
                case 1:
                    System.out.println("\nYour balance is:" + initalBalance);
                    transactionWithATM.userConfirmation();
                    break;

                case 2:
                    System.out.print("\nEnter amount to deposit:");
                    float getDepositAmount = input.nextFloat();
                    if(getDepositAmount>0){
                        initalBalance+=getDepositAmount;
                        System.out.println("Your deposit is successful");
                        System.out.println("Your Current balance:" + initalBalance);
                    }else if(getDepositAmount<0){
                        System.out.println("Invalid amount");
                    }

                    transactionWithATM.userConfirmation();
                    break;

                case 3:
                    System.out.print("\nEnter withdraw amount:");
                    int withdrawAmount = input.nextInt();

                    if(withdrawAmount>0 && (withdrawAmount == (int)withdrawAmount) || (withdrawAmount == (float)withdrawAmount)){
                        if(withdrawAmount<initalBalance){
                            initalBalance-=withdrawAmount;
                            System.out.println("Your transaction is successful.Please take your money.");
                            System.out.println("Your current balance:" + initalBalance);
                        }else{
                            System.out.println("Insuffecient balance. Try again.");
                            transactionWithATM.userConfirmation();
                        }
                    }else{
                        System.out.println("Invalid amount");
                        transactionWithATM.userConfirmation();
                    }
                    break;

                case 4:
                    System.out.println("\nThank you for staying with us.\n");
                    System.exit(0);
                default:
                    System.out.println("\nPlease select correct option.\n");
                    break;
            }
        }


    }
}



