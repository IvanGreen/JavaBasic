package Lesson1;

import java.util.Scanner;

import static java.lang.System.out;

public class HelloName {
    public static void main(String[] arqs) {

        Scanner in = new Scanner(System.in);

        out.print("Type your name: ");
        String name = in.nextLine();

        out.printf("Hello, %s " ,name);
    }
}

//Task 7