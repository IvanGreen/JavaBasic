package Lesson2;

public class HomeWork4 {

    public static void main(String[] args) {
        int counter = 1;
        int[][] mas = new int[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                mas[i][j] = counter;
                counter++;
            }
        }
        oneAtack(mas);
        printArr(mas);
    }

    public static void printArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void oneAtack(int[][] arr){
        for(int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            int c = arr.length - 1;
            int b = 0;
            for (; c >= 0; c--) {
                arr[c][b] = 1;
                b++;
            }
        }
    }

}
