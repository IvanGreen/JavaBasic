package Lesson1;

import java.util.Scanner;

public class Year {
    public static void main(String[] arqs) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Lesson1.Year: ");
        int num1 = userInput.nextInt();

        boolean result = getResult(num1);
        System.out.print(result);
    }

    static boolean getResult (int num){
        boolean result1;
        if (((num % 4 == 0) && !(num % 100 == 0)) || (num % 400 == 0)){
            result1 = true;
        } else {
            result1 = false;
        }
        return result1;
    }
}
//Task 8