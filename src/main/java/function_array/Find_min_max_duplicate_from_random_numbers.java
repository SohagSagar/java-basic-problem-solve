package function_array;
//Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)

import java.util.ArrayList;

public class Find_min_max_duplicate_from_random_numbers {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumbersArrayList = new ArrayList<>();
        System.out.println("Generating 20 random numbers:");
        for (int i = 0; i < 20; i++) {
            int randomNumber = (int) ((Math.random() * (20)) + 0);
            randomNumbersArrayList.add(randomNumber);
        }
        System.out.println(randomNumbersArrayList);

//      convert arraylist to array
        Integer[] random_numbers_array = randomNumbersArrayList.toArray(new Integer[0]);

//        find min max value
        int maxElement = random_numbers_array[0];
        int minElement = random_numbers_array[0];


        for (int i = 0; i < random_numbers_array.length; i++) {
            if (random_numbers_array[i] > maxElement){
                maxElement=random_numbers_array[i];
            }
            if (random_numbers_array[i] < minElement){
                minElement=random_numbers_array[i];
            }

        }
        System.out.println("\nMax element is: "+maxElement);
        System.out.println("Min element is: "+minElement);

        //find duplicate from random numbers array
        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i < random_numbers_array.length; i++) {
            for (int j = i+1; j < random_numbers_array.length; j++) {
                if(i != j && random_numbers_array[i] == random_numbers_array[j]){
                    if(!duplicate.contains(random_numbers_array[i])){
                        duplicate.add(random_numbers_array[i]);
                    }
                }
            }
        }
        if (!duplicate.isEmpty()){
            System.out.print("Duplicate elements are: " + duplicate + "\n");
        }else{
            System.out.println("No duplicate element found!!\n");
        }


    }



}
