package laba1;

import java.util.Scanner;

/**
 * This is my tasks class, here I will keep my methods
 */
public class tasks {
    /**
     * This method will do exercise №1:
     * A program that iterates over numbers from 1 to 500 and displays them on the screen.
     * If the number is divisible by 5, then the word fizz is displayed instead, if it is divisible by 7, then buzz.
     * If the number is divisible by 5 and 7, then output the word fizzbuzz.
     */
    public static void prim_1() {
        int a = 0, b = 500;
        System.out.println("Пример 1");
        while (++a <= b) {
            if (a % 5 != 0 && a % 7 != 0) {
                System.out.print(a);
            } else {
                if (a % 5 == 0)
                    System.out.print("Fizz");
                if (a % 7 == 0)
                    System.out.print("Buzz");
            }
            System.out.println();
        }
        System.out.println("Пример 1 завершен\n");
    }
    /**
     * This method will do exercise №2:
     * A program in which all arguments passed to the input string are displayed in reverse order.
     * For example, if 2 arguments were passed - make install, then llatsni ekam should be displayed on the screen.
     */
    public static void prim_2() {
        String a,b;
        System.out.println();
        System.out.println("Пример 2");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-ое слово");
        a = in.nextLine();
        System.out.println("Введите 2-ое слово");
        b = in.nextLine();
        String str = a+" "+b;
        System.out.println("Входная строка: " + str);
        char sim;
        String res="";
        for (int i=0; i<str.length(); i++)
        {
            sim= str.charAt(i);
            res= sim+res;
        }
        System.out.println("Выходная строка: " + res);
        System.out.println("Пример 2 завершен\n");
    }
    /**
     * This method will do exercise №3:
     * Write a program that calculates Fibonacci numbers.
     * Fibonacci numbers are a sequence of numbers in which each next number is equal to the sum of the previous two.
     * The beginning of this sequence is the numbers 1, 1, 2, 3, 5, 8, 13…
     */
    public static void prim_3(){
        String a;
        System.out.println();
        System.out.println("Пример 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер ряда: ");
        if(scanner.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            a = scanner.nextLine();
            byte b = Byte.parseByte(a);
            int n0 = 1;
            int n1 = 1;
            int n2;
            System.out.print(n0+" "+n1+" ");
            for(int i = 3; i <= b; i++){
                n2=n0+n1;
                System.out.print(n2+" ");
                n0=n1;
                n1=n2;
            }
            System.out.println();
            System.out.println("Пример 3 завершен\n");
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
    /**
     * This method will do exercise №4:
     * Write a program that calculates the factorial of an integer.
     * This method will return factorial
     * @param f factorial
     * @return f - result
     */
    public static int prim_4(int f) {
        if (f <= 1) {
            return 1;
            }
        else {
            return f * prim_4(f - 1);
            }
        }
    /**
     * This method will do exercise №5:
     * Enter 3 integers from the console.
     * Output to the console: The smallest number.
     */
    public static void prim_5(){
        int a, b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Введите три числа: ");
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
            if(scanner.hasNextInt()){
                b = scanner.nextInt();
                if(scanner.hasNextInt()){
                    c = scanner.nextInt();
                    if (a<b&&a<c) System.out.println("Наименьшее число: "+ a);
                    else if (b<c) {
                        System.out.println("Наименьшее число: "+ b);
                    }
                    else System.out.println("Наименьшее число: "+ c);
                }
                else System.out.println("Вы ввели не целое число");
                }
                else System.out.println("Вы ввели не целое число");
            }
        else System.out.println("Вы ввели не целое число");
        }
}
