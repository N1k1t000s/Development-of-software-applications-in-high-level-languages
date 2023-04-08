/**
 * This is my tasks class, here I will keep my
 * methods
 */


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.pow;

public class tasks {
    private static final Logger logger = LogManager.getLogger(tasks.class);

    /**
     * The method writes variables from a string
     * to an array
     *
     * @param word desired line number.
     * @param kol  the line we want.
     * @return variables - the variable array.
     */
    public static float[] split(String word, int kol) {
        logger.debug("Метод split начал выполнение");
        float[] variables = new float[kol];
        String[] arrSplit = word.split(" ");
        logger.debug("Рассчет массива");
        for (int i = 0; i < kol; i++) variables[i] = Float.parseFloat(arrSplit[i]);
        logger.debug("Метод split закончил выполнение");
        return variables;
    }

    /**
     * This method will do exercise №1:
     * Calculate the values of the expression
     * using the formula:
     * (x^2-7x+10)/(x^2-8x+12)
     */
    public static void task_1() {
        Reader read = new Reader();
        int n;
        float x = 0;
        double res;
        Scanner in = new Scanner(System.in);
            logger.debug("Метод task_1 начал выполнение");
            System.out.println();
            System.out.println("Задание 1");
            System.out.println("Вы хотите ввести данные с " +
                    "консоли(1) или с файла(2)?");
            n = in.nextInt();
            logger.debug("Выбор пользователя принят");
            switch (n) {
                case 1: {
                    logger.debug("Ввод с клавиатуры числа х");
                    System.out.println("Введите x");
                    if (in.hasNextFloat()) {
                        x = in.nextFloat();
                        logger.debug("Значение x получено");
                    } else
                    {
                        System.out.println("Вы ввели не число!\n");
                        logger.warn("Вы ввели не число!");
                    }
                }
                break;
                case 2: {
                    logger.debug("Ввод с файла числа х, запуск" +
                            " метода getWord класса read");
                    x = Float.parseFloat(read.getWord(1));
                    System.out.println("x = " + x);
                    logger.debug("Значение x получено");
                }
                break;
                default:
                    logger.warn("Такого режима нет. Попробуйте " +
                            "выбрать режим заново.");
                    System.out.print("Такого режима нет\n");
                    return;
            }
            logger.debug("Вычисление результата");
            res = ((pow(x, 2) - 7 * x + 10)
                    / (pow(x, 2) - 8 * x + 12));
            logger.debug("Вывод результата");
            System.out.println("(x^2-7x+10)/(x^2-8x+12):" +
                    " " + res);
            System.out.println("Задание 1 завершено\n");
            logger.debug("Метод task_1 закончил выполнение");
    }

    /**
     * This method will do exercise №2:
     * Find the area of a ring whose inner radius is r
     * and the outer radius is a given
     * number R (R > r).
     */
    public static void task_2() {
        int n;
        double R = 0;
        double r = 3;
        double S1; //Площадь большого круга
        double S2; //Площадь маленького круга
        double S3; //Площадь кольца
        Reader read = new Reader();
        Scanner in = new Scanner(System.in);
        /*try(Scanner in = new Scanner(System.in))
        {*/
            logger.debug("Метод task_2 начал выполнение");
            System.out.println();
            System.out.println("Задание 2");
            System.out.println("Вы хотите ввести данные с " +
                    "консоли(1) или с файла(2)?");
            n = in.nextInt();
            logger.debug("Выбор пользователя принят");
            switch (n) {
                case 1: {
                    logger.debug("Ввод с клавиатуры числа х");
                    System.out.println("Введите внешний R(>3): ");
                    if (in.hasNextFloat()) {
                        R = in.nextFloat();
                        logger.debug("Значение R получено");
                    } else
                    {
                        logger.error("Вы ввели не число!");
                        System.out.println("Вы ввели не число!\n");
                    }
                }
                break;
                case 2: {
                    logger.debug("Ввод с файла числа R," +
                            " запуск метода getWord класса read");
                    R = Float.parseFloat(read.getWord(2));
                }
                break;
                default:
                    logger.warn("Такого режима нет. Попробуйте" +
                            " выбрать режим заново.");
                    System.out.print("Такого режима нет\n");
                    return;
            }
            logger.debug("R = " + R);
            System.out.println("R = " + R);
            logger.debug("Вычисление результата");
            if (R > 3) {
                S1 = 3.14 * pow(R, 2);
                S2 = 3.14 * pow(r, 2);
                S3 = S1 - S2;
                logger.debug("Площадь кольца = " + S3);
                logger.debug("Вывод результата");
                System.out.println("Площадь кольца = " + S3);
                System.out.println("Задание 2 завершено\n");
                logger.debug("Метод task_2 закончил выполнение");
            } else
            {
                logger.error("Вы ввели не число!");
                System.out.println("Вы ввели число < 3");
            }
        }
       /* catch (InputMismatchException e)
        {
            logger.fatal("Ошибка " + e + "! Не соответствие типов данных!");
        }
    }*/

    /**
     * This method will do exercise №3:
     * Determine whether a triangle with sides
     * a, b, c is isosceles.
     */
    public static void task_3() {
        float a = 0, b=0, c=0;
        int n;
        Reader read = new Reader();
        Scanner in = new Scanner(System.in);
            logger.debug("Метод task_3 начал выполнение");
            System.out.println();
            System.out.println("Задание 3");
            System.out.println("Вы хотите ввести " +
                    "данные с консоли(1) или с файла(2)?");
            n = in.nextInt();
            logger.debug("Выбор пользователя принят");
            switch (n) {
                case 1: {
                    logger.debug("Ввод с клавиатуры числа a");
                    System.out.println("Введите 1-ю " +
                            "сторону треугольника: ");
                    if (in.hasNextFloat()) {
                        a = in.nextFloat();
                        logger.debug("Ввод с клавиатуры числа b");
                        System.out.println("Введите 2-ю " +
                                "сторону треугольника: ");
                        if (in.hasNextFloat()) {
                            b = in.nextFloat();
                            logger.debug("Ввод с клавиатуры числа c");
                            System.out.println("Введите 3-ю " +
                                    "сторону треугольника: ");
                            if (in.hasNextFloat()) {
                                c = in.nextFloat();
                            } else
                            {
                                logger.info("Вы ввели не число!");
                                System.out.println("Вы ввели не число!\n");
                            }
                        } else
                        {
                            logger.info("Вы ввели не число!");
                            System.out.println("Вы ввели не число!\n");
                        }
                    } else
                    {
                        logger.info("Вы ввели не число!");
                        System.out.println("Вы ввели не число!\n");
                    }
                }
                ;
                break;
                case 2: {
                    float[] variables = new float[3];
                    logger.debug("Ввод с файла чисел a, b, c, " +
                            "запуск метода getWord класса read" +
                            " внутри метода split.");
                    variables = split(read.getWord(3), 3);
                    a=variables[0];
                    b=variables[1];
                    c=variables[2];
                    System.out.println("a = " + variables[0] + "; " +
                            "b = " + variables[1] + "; c = " + variables[2]);
                };break;
                default:
                    logger.warn("Такого режима нет. Попробуйте" +
                            " выбрать режим заново.");
                    System.out.print("Такого режима нет\n");
                    return;
            }
            if (a == b && a == c) {
                logger.debug("Треугольник равносторонний");
                System.out.println("Треугольник равносторонний");
                logger.debug("Задание 3 завершено\n");
                System.out.println("Задание 3 завершено\n");
            } else if (a == b) {
                logger.debug("Треугольник равнобедренный");
                System.out.println("Треугольник равнобедренный");
                logger.debug("Задание 3 завершено\n");
                System.out.println("Задание 3 завершено\n");
            } else if (a == c) {
                logger.debug("Треугольник равнобедренный");
                System.out.println("Треугольник равнобедренный");
                logger.debug("Задание 3 завершено\n");
                System.out.println("Задание 3 завершено\n");
            } else if (b == c) {
                logger.debug("Треугольник равнобедренный");
                System.out.println("Треугольник равнобедренный");
                logger.debug("Задание 3 завершено\n");
                System.out.println("Задание 3 завершено\n");
            } else {
                logger.debug("Треугольник не равнобедренный");
                System.out.println("Треугольник не равнобедренный");
                logger.debug("Задание 3 завершено\n");
                System.out.println("Задание 3 завершено\n");
            }
        }

    /**
     * This method will do exercise №4:
     * It is known that of the four numbers
     * a1, a2, a3 and a4,
     * one is different from the other three,
     * equal to each other;
     * assign the number of this number to the
     * variable n.
     */
    public static void task_4(){
        Reader read = new Reader();
        int k, n=0;
        float[] arr = new float[4];
        Scanner in = new Scanner(System.in);
            logger.debug("Метод task_4 начал выполнение");
            System.out.println();
            System.out.println("Задание 4");
            System.out.println("Вы хотите ввести данные" +
                    " с консоли(1) или с файла(2)?");
            k=in.nextInt();
            logger.debug("Выбор пользователя принят");
            switch (k)
            {
                case 1:
                {
                    logger.debug("Ввод с клавиатуры 4 чисел");
                    System.out.println("Введите 4 числа: ");
                    for(int i=0;i<4;i++){
                        if(in.hasNextFloat())
                        {
                            arr[i]=in.nextFloat();
                        }
                        else
                        {
                            logger.warn("Вы ввели не число!");
                            System.out.println("Вы ввели не число!\n");
                            return;
                        }
                    }
                };
                break;
                case 2:
                {
                    logger.debug("Ввод с файла 4 чисел");
                    arr=split(read.getWord(4), 4);
                    System.out.println("a = "+arr[0] + "; b = " +
                            "" + arr[1] + "; c = " +arr[2] + "; " +
                            "d = " +arr[3]);
                };
                break;
                default:
                    logger.warn("Такого режима нет. Попробуйте" +
                            " выбрать режим заново.");
                    System.out.print("Такого режима нет\n");
                    return;
            }
            logger.debug("Вычисление результата");
            for(int i=0;i<3;i++){
                if (arr[i]!=arr[i+1]){
                    n=i+1;
                }
            }
            if (n==0){
                logger.info("Вы ввели одинаковые числа!");
                System.out.println("Вы ввели одинаковые числа!");
            }
            else {
                logger.info("Номер числа = " + n);
                System.out.println("Номер числа = " + n);
                logger.debug("Задание 4 завершено\n");
                System.out.println("Задание 4 завершено\n");
            }
        }

    /**
     * This method will do exercise №5:
     * For an integer k from 1 to 99, print the
     * phrase "I am k years old",
     * taking into account that for some values
     * of k, the word "years"
     * should be replaced with the word "year"
     * or "years".
     * For example, 11 years, 22 years,
     * 51 years. (switch)
     */
    public static void task_5(){
        int k = 0, n, z;
        Reader read = new Reader();
        Scanner in = new Scanner(System.in);
            logger.debug("Метод task_5 начал выполнение");
            System.out.println("Задание 5");
            System.out.println("Вы хотите ввести данные с " +
                    "консоли(1) или с файла(2)?");
            z=in.nextInt();
            logger.debug("Выбор пользователя принят");
            switch (z)
            {
                case 1:{
                    logger.debug("Ввод с клавиатуры числа");
                    System.out.println("Сколько вам лет(введите" +
                            " число): ");
                    if(in.hasNextInt())
                    {
                        k=in.nextInt();
                    }
                    else
                    {
                        logger.error("Вы ввели не число!");
                        System.out.println("Вы ввели не число!\n");
                    }
                };break;
                case 2:{
                    logger.debug("Ввод с файла числа");
                    k = Integer.parseInt(read.getWord(5));
                    System.out.println("k = "+k);
                };break;
                default:
                    logger.warn("Такого режима нет\n");
                    System.out.print("Такого режима нет\n");
                    return;
            }
            logger.debug("Расчет результата.");
            n=k;
            if(k%10==1 && k!=11)
            {
                k=3;
            }
            else if (k%10>1 && k%10<5 && k!=12 && k!=13 && k!=14)
            {
                k=1;
            } else if (k%10>4 || k%10==0 && k>=11 && k<=20) {
                k=2;
            }
            else k=4;
            logger.debug("Вывод результата.");
            switch (k)
            {
                case 1:
                    System.out.println("Мне "+n+" года!");
                    break;
                case 2:
                    System.out.println("Мне "+n+" лет!");
                    break;
                case 3:
                    System.out.println("Мне "+n+" год!");
                    break;
                default:
                    System.out.print("Вам не может быть " +
                            "столько лет xD\n");
            }
            logger.debug("Задание 5 завершено\n");
            System.out.println("Задание 5 завершено\n");
        }

    /**
     * This method will do exercise №6:
     * Given a natural number n.
     * Check whether all digits of the number will be different.
     */
    public static void task_6(){
        Reader read = new Reader();
        System.out.println();
        System.out.println("Задание 6");
        String chislo = null;
        int z;
        Scanner in = new Scanner(System.in);
            logger.debug("Метод task_6 начал выполнение");
            System.out.println("Вы хотите ввести данные с" +
                    " консоли(1) или с файла(2)?");
            z=in.nextInt();
            logger.debug("Выбор пользователя принят");
            switch (z)
            {
                case 1:{
                    logger.debug("Ввод с клавиатуры числа");
                    System.out.println("Введите число: ");
                    if(in.hasNextInt()) {
                        chislo = in.next();
                    }
                    else
                    {
                        logger.error("Вы ввели не целое число");
                        System.out.println("Вы ввели не целое число");
                    }
                };break;
                case 2:{
                    logger.debug("Ввод с файла числа");
                    chislo = (read.getWord(6));
                    System.out.println("число = "+chislo);
                };break;
                default:
                    logger.warn("Такого режима нет\n");
                    System.out.print("Такого режима нет\n");
                    return;
            }
            logger.debug("Расчет результата.");
            int[] sim1 = new int[chislo.length()];
            char[] sim = new char[chislo.length()];
            for (int i = 0; i < chislo.length(); i++) {
                sim[i] = chislo.charAt(i);
                sim1[i] = sim[i];
            }
            int n = 1;
            for (int i = 0; i < chislo.length()-1; i++) {
                if (sim1[i] != sim1[i + 1]) {
                    n = n + 1;
                } else {
                    logger.debug("Вывод результата.");
                    System.out.println("Не все цифры " +
                            "числа различные!");
                    break;
                }
            }
            if (n == chislo.length()) {
                logger.debug("Вывод результата.");
                System.out.println("Все цифры числа различны!");
            }
            logger.debug("Задание 6 завершено\n");
            System.out.println("Задание 6 завершено\n");
        }

    /**
     * This method will do exercise №7:
     * Given a natural number n and a real x.
     * Find the sum of n terms of the series.
     */
    public static void task_7(){
        System.out.println("Задание 7");
        Reader read = new Reader();
        int n = 0,z;
        double x = 0, sum=0;
        Scanner in = new Scanner(System.in);
            logger.debug("Метод task_7 начал выполнение");
            System.out.println("Вы хотите ввести данные с " +
                    "консоли(1) или с файла(2)?");
            z=in.nextInt();
            logger.debug("Выбор пользователя принят");
            switch (z)
            {
                case 1:{
                    logger.debug("Ввод с клавиатуры числа");
                    System.out.println("Введите натуральное число: ");
                    if(in.hasNextInt())
                    {
                        n = in.nextInt();
                        System.out.println("Введите число: ");
                        if (in.hasNextDouble())
                        {
                            x=in.nextDouble();
                        }
                        else
                        {
                            logger.error("Вы ввели что-то странное!\n");
                            System.out.println("Вы ввели что-то странное!\n");
                        }
                    }
                    else
                    {
                        logger.error("Вы ввели не натуральное число!\n");
                        System.out.println("Вы ввели не натуральное" +
                                " число!\n");
                    }
                };break;
                case 2:{
                    float[] variables = new float[2];
                    logger.debug("Ввод с файла чисел");
                    variables=split(read.getWord(7), 2);
                    n= (int) variables[0];
                    x=variables[1];
                    System.out.println("натуральное число = " +
                            ""+variables[0] + "; число = " + variables[1]);
                };break;
                default:
                    logger.warn("Такого режима нет\n");
                    System.out.print("Такого режима нет\n");
                    return;
            }
            logger.debug("Расчет результата.");
            for (int i=1; i<=n; i++)
            {
                sum += pow(x,i)/i;
            }
            logger.debug("Вывод результата.");
            System.out.println("Сумма ряда = " + sum);
            logger.debug("Задание 7 завершено\n");
            System.out.println("Задание 7 завершено\n");
        }

    /**
     * This method will do exercise №8:
     * Find the sum of all n-digit numbers
     * that are multiples of k (1 less or equal n
     * less or equal 4).
     */
    public static void task_8() {
        System.out.println("Задание 8");
        Reader read = new Reader();
        String chislo = null;
        int sum = 0;
        int n, n1 = 0, z;
        int k = 0;
        Scanner in = new Scanner(System.in);
            logger.debug("Метод task_8 начал выполнение");
            System.out.println("Вы хотите ввести данные " +
                    "с консоли(1) или с файла(2)?");
            z = in.nextInt();
            logger.debug("Выбор пользователя принят");
            switch (z) {
                case 1: {
                    logger.debug("Ввод количества знаков числа");
                    System.out.println("Введите количесво " +
                            "знаков числа: ");
                    if (in.hasNextInt()) {
                        chislo = in.next();
                        n1 = Integer.parseInt(chislo);
                        logger.debug("Ввод числа");
                        if (in.hasNextInt()) {
                            k = in.nextInt();
                        } else
                        {
                            logger.error("Вы ввели не число!\n");
                            System.out.println("Вы ввели не число!\n");
                        }
                    } else
                    {
                        logger.error("Вы ввели не число!\n");
                        System.out.println("Вы ввели не число!\n");
                    }
                }
                ;
                break;
                case 2: {
                    logger.debug("Ввод с файла чисел");
                    float[] variables = new float[2];
                    variables = split(read.getWord(8), 2);
                    System.out.println("кол-во знаков числа = " +
                            "" + variables[0] + "; число = " + variables[1]);
                    chislo = Integer.toString((int) variables[0]);
                    k = (int) variables[1];
                    n1 = Integer.parseInt(chislo);
                }
                ;
                break;
                default:
                    logger.warn("Такого режима нет\n");
                    System.out.print("Такого режима нет\n");
                    return;
            }
            logger.debug("Расчет результата.");
            if (chislo.length() <= 1 || chislo.length() >= 4) {
                switch (n1) {
                    case 1: {
                        chislo = "9";
                        n = Integer.parseInt(chislo);
                        for (int i = 0; i <= n; i++) {
                            if (i % k == 0) sum += i;
                        }
                        logger.debug("Вывод результата.");
                        System.out.println("Сумма всех " + n1 + "" +
                                "-значных чисел кратных " +
                                "" + k + " = " + sum + "\n");
                        break;
                    }
                    case 2: {
                        chislo = "99";
                        n = Integer.parseInt(chislo);
                        for (int i = 10; i <= n; i++) {
                            if (i % k == 0) sum += i;
                        }
                        logger.debug("Вывод результата.");
                        System.out.println("Сумма всех " + n1 + "" +
                                "-значных чисел кратных " + k + "" +
                                " = " + sum + "\n");
                        break;
                    }
                    case 3: {
                        chislo = "999";
                        n = Integer.parseInt(chislo);
                        for (int i = 100; i <= n; i++) {
                            if (i % k == 0) sum += i;
                        }
                        logger.debug("Вывод результата.");
                        System.out.println("Сумма всех " + n1 + "" +
                                "-значных чисел кратных " + k + "" +
                                " = " + sum + "\n");
                        break;
                    }
                    case 4: {
                        chislo = "9999";
                        n = Integer.parseInt(chislo);
                        for (int i = 1000; i <= n; i++) {
                            if (i % k == 0) sum += i;
                        }
                        logger.debug("Вывод результата.");
                        System.out.println("Сумма всех " + n1 + "" +
                                "-значных чисел кратных " + k + "" +
                                " = " + sum + "\n");
                        break;
                    }
                }
            } else
            {
                logger.warn("Вы ввели что-то не так!\n");
                System.out.println("Вы ввели что-то не так!\n");
            }
        }
}
