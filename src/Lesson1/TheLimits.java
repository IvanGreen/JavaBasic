package Lesson1;

import java.util.Scanner;

public class TheLimits {
    public static void main(String[] arqs) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Type first number: ");
        double argument1 = userInput.nextDouble();

        System.out.print("Type second number: ");
        double argument2 = userInput.nextDouble();

        boolean answer = getAnswer(argument1,argument2);
        System.out.println(answer);

    }

    static boolean getAnswer(double arg1, double arg2){
        boolean result;
        double argument = arg1 + arg2;

        if(argument <= 20 && argument >= 10){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

//Task 4