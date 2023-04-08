package laba1;

import java.util.Scanner;

public class zad {
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
    public static void prim_3(){
//        добавить проверку ввода
        String a;
        System.out.println();
        System.out.println("Пример 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер ряда: ");
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
    }

    public static int prim_4(int f) {
        //        добавить проверку ввода
        if (f <= 1) {
            return 1;
            }
        else {
            return f * prim_4(f - 1);
            }
        }
    public static void prim_5(){
        //        добавить проверку ввода
        int a, b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Введите три числа: \n");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a<b&&a<c) System.out.println("Наименьшее число: "+ a);
        else if (b<c) {
            System.out.println("Наименьшее число: "+ b);
        }
        else System.out.println("Наименьшее число: "+ c);
    }
}
