package Lesson2;

public class HomeWork5 {
    public static void main(String[] args) {

        int[] mas = {1,14,4,52,34,634,23,35,3};
        int plus = mas[0];
        int min = mas[0];

        for( int i = 0; i < mas.length; i++){
            if(mas[i] >= plus ){
                plus = mas[i];
            }else if(mas[i] <= min){
                min = mas[i];
            }
        }

        System.out.print("Max: " + plus + "\t");
        System.out.print("Min: " + min);
    }
}
