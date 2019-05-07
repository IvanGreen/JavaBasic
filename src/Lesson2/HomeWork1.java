package Lesson2;

/**Всем привет на второй домашке!
 * Я все задачки буду подписывать комментами, чтобы Вы
 * понимали, где тут что =) Надеюсь на хороший и полезный
 * отзыв, и на высший бал за ДЗ!
 *
 * P.S. Все программы можно запускать, они работают.
 * Всем советую делать в таком виде (на разных страницах)
 * А то проверять крайне не удобно сплошной код, который
 * не работает через консоль.
 */


public class HomeWork1 {
    //Тут начинается первая домашка
    public static void main(String[] arqs) {
        int[] mas = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int num = 0; num < mas.length; num++) {
            if (mas[num] == 1) {
                mas[num] -= 1;
            } else {
                mas[num] += 1;
            }
        }
        printArr(mas); //решил организовать метод вывода массива
    }

 public static void printArr( int [] arr){
        for (int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
            }
            System.out.println();
        }

    }

