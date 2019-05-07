package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] mas = new int[8];
        int foot = 3;
        for (int num = 0; num < mas.length; num++) {
            switch (num) {
                case 0: mas[num] = 0;
                    break;
                default: mas[num] = mas[num - 1] + foot;
                    break;
            }
            System.out.println(mas[num]);
        }

    }
}
