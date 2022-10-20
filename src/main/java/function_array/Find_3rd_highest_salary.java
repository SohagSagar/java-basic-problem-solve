package function_array;
//Suppose, in a company , here are some employee salaries in an array
//        [35000, 25000, 28000, 32500, 44000, 32800]
//        Find out the 3rd highest salary

import java.util.Arrays;
public class Find_3rd_highest_salary {
    public static void main(String[] args) {
        int salaryArr [] = {35000, 25000, 28000, 32500, 44000, 32800};
        Arrays.sort(salaryArr);
        int thirdLargestSalary=0;
        if(salaryArr.length>3){
            for (int i = 0; i < salaryArr.length-2; i++) {
                thirdLargestSalary=salaryArr[i];
            }
            System.out.println("\nThird largest salary is: "+thirdLargestSalary);
        }

    }
}
