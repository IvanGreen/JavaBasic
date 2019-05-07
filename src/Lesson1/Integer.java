package Lesson1;

import java.util.Scanner;

public class Integer {
    public static void main(String[] arqs) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int num1 = userInput.nextInt();

        boolean answer = getAnswer(num1);
    }

    static boolean getAnswer(int number){
        boolean answer1;
        if(number >= 0){
            answer1 = true;
            System.out.print("Positive");
        } else{
            answer1 = false;
            System.out.print("Negative");
        }
            return answer1;
    }
}

//Task 5