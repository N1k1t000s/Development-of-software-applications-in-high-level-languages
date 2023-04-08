package lab2;
import java.util.Scanner;

/**
 * This is my main class, here I will write my code
 * @author <strong>Nikita Derevlev</strong>
 * @version 0.0.7
 * @since 0.0.1
 */

public class main {

    /**
     * Here start point of the program.
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        tasks lab2 = new tasks();
        boolean isQuit = false;
        while (!isQuit) {
            int n;
            System.out.println("Запуск задания: \n 1 - Calculate formula | 2 - Ring area | 3 - Isosceles triangle | 4 - Four numbers|\n 5 - How old am I | 6 - Digit check | 7 - Row sum | 8 - Find the sum | 0 - Exit!");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            switch (n) {
                case 1:
                    lab2.task_1();
                    break;
                case 2:
                    lab2.task_2();
                    break;
                case 3:
                    lab2.task_3();
                    break;
                case 4:
                    lab2.task_4();
                    break;
                case 5:
                    lab2.task_5();
                    break;
                case 6:
                    lab2.task_6();
                    break;
                case 7:
                    lab2.task_7();
                    break;
                case 8:
                    lab2.task_8();
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
