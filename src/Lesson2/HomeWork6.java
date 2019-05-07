package Lesson2;

public class HomeWork6 {
    public static void main(String[] args) {

        int[] mas = {1,12,24,52,12,23};
        int[] wrongMas = {5,2,4,5,5,1};
        System.out.print("First: " + checkBalance(mas) + "\t");
        System.out.print("Second: " + checkBalance(wrongMas));
    }

    static boolean checkBalance(int[] arr) {
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;

    }
}
