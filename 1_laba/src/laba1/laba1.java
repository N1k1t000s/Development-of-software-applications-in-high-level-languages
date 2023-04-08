package laba1;

import java.util.Scanner;

/**
 * This is my laba1 class, here I will write my code
 * @author <strong>Nikita Derevlev</strong>
 * @version 0.0.7
 * @since 0.0.1
 */
public class laba1 {
    /**
     * Here start point of the program.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tasks lab1 = new tasks();
        int f = 0;
        boolean isQuit = false;
        while (!isQuit) {
            int n;
            System.out.println("Запуск задания: \n 1 - Fizz/Buzz | 2 - Revers | 3 - Фибаначи | 4 - Факториал | 5 - Индивидуальное задание | 0 - Выход!");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            switch (n) {
                case 1:
                    lab1.prim_1();
                    break;
                case 2:
                    lab1.prim_2();
                    break;
                case 3:
                    lab1.prim_3();
                    break;
                case 4:
                    System.out.println("Введите число, факториал которого хотите вычислить:");
                    if(in.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
                        f=in.nextInt();
                        System.out.println("Факториал = " + lab1.prim_4(f) + "\n");
                        break;
                    } else {
                        System.out.println("Вы ввели не целое число");
                        break;
                    }
                case 5:
                    lab1.prim_5();
                    break;
                case 0:
                    isQuit = true;
                    System.out.print("Работа завершена!");
                    break;
                default:
                    System.out.print("Такого режима нет");
            }
        }
    }
}
