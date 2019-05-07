package Lesson1;

import java.util.Scanner;

public class StrangeInteger {
    public static void main(String[] arqs) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int num1 = userInput.nextInt();

        boolean answer = getAnswer(num1);
        System.out.println(answer);
    }

    static boolean getAnswer(int number){
        boolean answer1;
        if(number >= 0){
            answer1 = false;
        } else{
            answer1 = true;
        }
        return answer1;
    }
}

//Task 6