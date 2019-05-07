package Lesson1;

import java.util.Scanner;

public class abcdForm {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("First number: ");
        double argument1 = userInput.nextDouble();

        System.out.print("Second number: ");
        double argument2 = userInput.nextDouble();

        System.out.print("Third number: ");
        double argument3 = userInput.nextDouble();

        System.out.print("Fourth number: ");
        double argument4 = userInput.nextDouble();

        double argument5 = getSum(argument1, argument2 , argument3, argument4);

        System.out.println(argument5);

    }

    static double getSum(double arg1,double arg2, double arg3, double arg4){
        double result = arg1 * (arg2 + (arg3 / arg4));
        return result;
    }
}

//Task 3