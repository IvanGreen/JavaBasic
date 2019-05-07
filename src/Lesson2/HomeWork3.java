package Lesson2;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int num = 0; num < mas.length; num++) {
            if(mas[num] < 6){
                mas[num] = mas[num] * 6;
            }
            System.out.println(mas[num]);
        }

    }
}
