package if_else_loop;//Write a program to sum of numbers which only divisible by 5 from 1 to 100

public class sumOfGivenNumbers {
    public static void main(String[] args) {
        int divident = 5;
        int totalSum = 0;

        for(int i=1;i<101;i++){
            if(i % divident == 0){
                totalSum+= i;
            }
        }

        System.out.println("\nTotal sum is:" + totalSum +"\n");
    }
}
