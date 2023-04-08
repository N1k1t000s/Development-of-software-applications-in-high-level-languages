package lab2;
import java.io.*;
import java.util.Scanner;
import static java.lang.Math.pow;

/**
 * This is my tasks class, here I will keep my methods
 */

public class tasks {

    /**
     The method writes variables from a string to an array
     * @param word desired line number.
     * @param kol  the line we want.
     * @return variables - the variable array.
     */
    public static float[] split(String word, int kol){
        float[] variables = new float[kol];
        String[] arrSplit = word.split(" ");
        for (int i=0; i<kol; i++) variables[i] = Float.parseFloat(arrSplit[i]);
        return variables;
    }
    /**
     * This method will do exercise №1:
     * Calculate the values of the expression using the formula:
     * (x^2-7x+10)/(x^2-8x+12)
     */
    public static void task_1(){
        Reader read = new Reader();
        Scanner in = new Scanner(System.in);
        int n;
        float x;
        double res;
        System.out.println();
        System.out.println("Задание 1");
        System.out.println("Вы хотите ввести данные с консоли(1) или с файла(2)?");
        n=in.nextInt();
        switch(n){
            case 1:{
                System.out.println("Введите x");
                if(in.hasNextFloat())
                {
                    x = in.nextFloat();
                    res=((pow(x,2)-7*x+10)/(pow(x,2)-8*x+12));
                    System.out.println("(x^2-7x+10)/(x^2-8x+12): " + res);
                    System.out.println("Задание 1 завершено\n");
                }
                else System.out.println("Вы ввели не число!\n");
            };break;
            case 2:{
                try {
                    x = Float.parseFloat(read.getWord(1));
                    System.out.println("x = "+x);
                    res=((pow(x,2)-7*x+10)/(pow(x,2)-8*x+12));
                    System.out.println("(x^2-7x+10)/(x^2-8x+12): " + res);
                    System.out.println("Задание 1 завершено\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };break;
            default:
                System.out.print("Такого режима нет\n");
        }
    }
    /**
     * This method will do exercise №2:
     * Find the area of a ring whose inner radius is r
     * and the outer radius is a given
     * number R (R > r).
     */
    public static void task_2(){
        Reader read = new Reader();
        Scanner in = new Scanner(System.in);
        int n;
        double R;
        double r=3;
        double S1; //Площадь большого круга
        double S2; //Площадь маленького круга
        double S3; //Площадь кольца
        System.out.println();
        System.out.println("Задание 2");
        System.out.println("Вы хотите ввести данные с консоли(1) или с файла(2)?");
        n=in.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Введите внешний R(>3): ");
                if(in.hasNextFloat())
                {
                    R = in.nextFloat();
                    if(R>3)
                    {
                        S1=3.14*pow(R,2);
                        S2=3.14*pow(r,2);
                        S3=S1-S2;
                        System.out.println("Площадь кольца = " + S3);
                        System.out.println("Задание 2 завершено\n");
                    }
                    else System.out.println("Вы ввели число < 3");
                }
                else System.out.println("Вы ввели не число!\n");
            };
            break;
            case 2:
            {
                try {
                    R = Float.parseFloat(read.getWord(2));
                    System.out.println("R = "+R);
                    S1=3.14*pow(R,2);
                    S2=3.14*pow(r,2);
                    S3=S1-S2;
                    System.out.println("Площадь кольца = " + S3);
                    System.out.println("Задание 2 завершено\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };
            break;
            default:
                System.out.print("Такого режима нет\n");
        }
    }
    /**
     * This method will do exercise №3:
     * Determine whether a triangle with sides
     * a, b, c is isosceles.
     */
    public static void task_3(){
        float a, b, c;
        int n;
        float[] variables = new float[3];
        Reader read = new Reader();
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Задание 3");
        System.out.println("Вы хотите ввести данные с консоли(1) или с файла(2)?");
        n=in.nextInt();
        switch (n){
            case 1: {
                System.out.println("Введите 1-ю сторону треугольника: ");
                if(in.hasNextFloat())
                {
                    a = in.nextFloat();
                    System.out.println("Введите 2-ю сторону треугольника: ");
                    if(in.hasNextFloat())
                    {
                        b = in.nextFloat();
                        System.out.println("Введите 3-ю сторону треугольника: ");
                        if(in.hasNextFloat())
                        {
                            c = in.nextFloat();
                            if (a==b&&a==c) {System.out.println("Треугольник равносторонний");
                                System.out.println("Задание 3 завершено\n");
                                return;
                            }
                            else if (a==b) {System.out.println("Треугольник равнобедренный");
                                System.out.println("Задание 3 завершено\n");}
                            else if (a==c) {System.out.println("Треугольник равнобедренный");
                                System.out.println("Задание 3 завершено\n");}
                            else if (b==c) {System.out.println("Треугольник равнобедренный");
                                System.out.println("Задание 3 завершено\n");}
                            else {System.out.println("Треугольник не равнобедренный");
                                System.out.println("Задание 3 завершено\n");}
                        }
                        else System.out.println("Вы ввели не число!\n");
                    }
                    else System.out.println("Вы ввели не число!\n");
                }
                else System.out.println("Вы ввели не число!\n");};break;
            case 2:{
                try {
                    variables=split(read.getWord(3), 3);
                    System.out.println("a = "+variables[0] + "; b = " + variables[1] + "; c = " +variables[2]);
                    if (variables[0]==variables[1]&&variables[0]==variables[2]) {System.out.println("Треугольник равносторонний");
                        System.out.println("Задание 3 завершено\n");
                        return;
                    }
                    else if (variables[0]==variables[1]) {System.out.println("Треугольник равнобедренный");
                        System.out.println("Задание 3 завершено\n");}
                    else if (variables[0]==variables[2]) {System.out.println("Треугольник равнобедренный");
                        System.out.println("Задание 3 завершено\n");}
                    else if (variables[1]==variables[2]) {System.out.println("Треугольник равнобедренный");
                        System.out.println("Задание 3 завершено\n");}
                    else {System.out.println("Треугольник не равнобедренный");
                        System.out.println("Задание 3 завершено\n");}
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };break;
            default:
                System.out.print("Такого режима нет\n");
        }
    }
    /**
     * This method will do exercise №4:
     * It is known that of the four numbers a1, a2, a3 and a4,
     * one is different from the other three, equal to each other;
     * assign the number of this number to the variable n.
     */
    public static void task_4(){
        Reader read = new Reader();
        float[] arr = new float[4];
        int k, n=0;
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Задание 4");
        System.out.println("Вы хотите ввести данные с консоли(1) или с файла(2)?");
        k=in.nextInt();
        switch (k)
        {
            case 1:
            {
                System.out.println("Введите 4 числа: ");
                for(int i=0;i<4;i++){
                    if(in.hasNextFloat())
                    {
                        arr[i]=in.nextFloat();
                    }
                    else
                    {
                        System.out.println("Вы ввели не число!\n");
                        return;
                    }
                }
                for(int i=0;i<3;i++){
                    if (arr[i]!=arr[i+1]){
                        n=i+1;
                    }
                }
                if (n==0){
                    System.out.println("Вы ввели одинаковые числа!");
                }
                else {
                    System.out.println("Номер числа = " + n);
                    System.out.println("Задание 4 завершено\n");
                }
            };
            break;
            case 2:
            {
                try {
                    arr=split(read.getWord(4), 4);
                    System.out.println("a = "+arr[0] + "; b = " + arr[1] + "; c = " +arr[2] + "; d = " +arr[3]);
                    for(int i=0;i<3;i++){
                        if (arr[i]!=arr[i+1]){
                            n=i+1;
                        }
                    }
                    if (n==0){
                        System.out.println("Вы ввели одинаковые числа!");
                    }
                    else {
                        System.out.println("Номер числа = " + n);
                        System.out.println("Задание 4 завершено\n");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };
            break;
            default:
                System.out.print("Такого режима нет\n");
        }
    }
    /**
     * This method will do exercise №5:
     * For an integer k from 1 to 99, print the phrase "I am k years old",
     * taking into account that for some values of k, the word "years"
     * should be replaced with the word "year" or "years".
     * For example, 11 years, 22 years, 51 years. (switch)
     */
    public static void task_5(){
        int k, n, z;
        Reader read = new Reader();
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 5");
        System.out.println("Вы хотите ввести данные с консоли(1) или с файла(2)?");
        z=in.nextInt();
        switch (z)
        {
            case 1:{
                System.out.println("Сколько вам лет(введите число): ");
                if(in.hasNextInt())
                {
                    k=in.nextInt();
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
                            System.out.print("Вам не может быть столько лет xD\n");
                    }
                    System.out.println("Задание 5 завершено\n");
       /* switch (k)
        {
            case 2,3,4,22,23,24,32,33,34,42,43,44,52,53,54,62,63,64,72,73,74,82,83,84,92,93,94:
                System.out.println("Мне "+k+" года!");
                break;
            case 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,25,26,27,28,29,30,35,36,37,38,39,40,45,46,47,48,49,50,55,56,57,58,59,60,65,66,67,68,69,70,75,76,77,78,79,80,85,86,87,88,89,90,95,96,97,98,99:
                System.out.println("Мне "+k+" лет!");
                break;
            case 1,21,31,41,51,61,71,81,91:
                System.out.println("Мне "+k+" год!");
                break;
            default:
                System.out.print("Вам не может быть столько лет xD");
        }*/
                }
                else System.out.println("Вы ввели не число!\n");
            };break;
            case 2:{
                try {
                    k = Integer.parseInt(read.getWord(5));
                    System.out.println("k = "+k);
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
                            System.out.print("Вам не может быть столько лет xD\n");
                    }
                    System.out.println("Задание 5 завершено\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };break;
            default:
                System.out.print("Такого режима нет\n");
        }
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
        String chislo;
        int z;
        Scanner in = new Scanner(System.in);
        System.out.println("Вы хотите ввести данные с консоли(1) или с файла(2)?");
        z=in.nextInt();
        switch (z)
        {
            case 1:{
                System.out.println("Введите число: ");
                if(in.hasNextInt()) {
                    chislo = in.next();
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
                            System.out.println("Не все цифры числа различные!");
                            break;
                        }
                    }
                    if (n == chislo.length()) {
                        System.out.println("Все цифры числа различны!");
                    }
                }
                else {
                    System.out.println("Вы ввели не целое число");
                }
                System.out.println("Задание 6 завершено\n");};break;
            case 2:{
                try
                {
                chislo = (read.getWord(6));
                System.out.println("число = "+chislo);
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
                        System.out.println("Не все цифры числа различные!");
                        break;
                    }
                }
                if (n == chislo.length()) {
                    System.out.println("Все цифры числа различны!");
                }
                System.out.println("Задание 6 завершено\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }};break;
            default:
                System.out.print("Такого режима нет\n");
        }
    }
    /**
     * This method will do exercise №7:
     * Given a natural number n and a real x.
     * Find the sum of n terms of the series.
     */
    public static void task_7(){
        System.out.println("Задание 7");
        Reader read = new Reader();
        Scanner in = new Scanner(System.in);
        float[] variables = new float[2];
        int n,z;
        double x, sum=0;
        System.out.println("Вы хотите ввести данные с консоли(1) или с файла(2)?");
        z=in.nextInt();
        switch (z)
        {
            case 1:{
                System.out.println("Введите натуральное число: ");
                if(in.hasNextInt())
                {
                    n = in.nextInt();
                    System.out.println("Введите число: ");
                    if (in.hasNextDouble())
                    {
                        x=in.nextDouble();
                        for (int i=1; i<=n; i++)
                        {
                            sum += pow(x,i)/i;
                        }
                        System.out.println("Сумма ряда = " + sum);
                    }
                    else System.out.println("Вы ввели что-то странное!\n");
                }
                else System.out.println("Вы ввели не натуральное число!\n");
                System.out.println("Задание 7 завершено\n");
            };break;
            case 2:{
                try {
                    variables=split(read.getWord(7), 2);
                    System.out.println("натуральное число = "+variables[0] + "; число = " + variables[1]);
                    for (int i=1; i<=variables[0]; i++)
                    {
                        sum += pow(variables[1],i)/i;
                    }
                    System.out.println("Сумма ряда = " + sum);
                    System.out.println("Задание 7 завершено\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };break;
            default:
                System.out.print("Такого режима нет\n");
        }
    }
    /**
     * This method will do exercise №8:
     * Find the sum of all n-digit numbers
     * that are multiples of k (1 less or equal n less or equal 4).
     */
    public static void task_8(){
        System.out.println("Задание 8");
        Reader read = new Reader();
        Scanner in = new Scanner(System.in);
        float[] variables = new float[2];
        String chislo;
        int sum=0;
        int n,n1,z;
        int k;
        System.out.println("Вы хотите ввести данные с консоли(1) или с файла(2)?");
        z=in.nextInt();
        switch (z){
            case 1:{
                System.out.println("Введите количесво знаков числа: ");
                if(in.hasNextInt())
                {
                    chislo = in.next();
                    n1= Integer.parseInt(chislo);
                    if(chislo.length()<=1||chislo.length()>=4)
                    {
                        switch (n1)
                        {
                            case 1:
                            {
                                chislo="9";
                                n= Integer.parseInt(chislo);
                                System.out.println("Введите число k: ");
                                if(in.hasNextInt())
                                {
                                    k=in.nextInt();
                                    for (int i=0; i<=n; i++)
                                    {
                                        if(i%k==0) sum+=i;
                                    }
                                    System.out.println("Сумма всех "+n1+"-значных чисел кратных " + k + " = " + sum + "\n");
                                }
                                else System.out.println("Вы ввели не целое число!\n");
                                break;
                            }
                            case 2:
                            {
                                chislo="99";
                                n= Integer.parseInt(chislo);
                                System.out.println("Введите число k: ");
                                if(in.hasNextInt())
                                {
                                    k=in.nextInt();
                                    for (int i=10; i<=n; i++)
                                    {
                                        if(i%k==0) sum+=i;
                                    }
                                    System.out.println("Сумма всех "+n1+"-значных чисел кратных " + k + " = " + sum + "\n");
                                }
                                else System.out.println("Вы ввели не целое число!\n");
                                break;
                            }
                            case 3:
                            {
                                chislo="999";
                                n= Integer.parseInt(chislo);
                                System.out.println("Введите число k: ");
                                if(in.hasNextInt())
                                {
                                    k=in.nextInt();
                                    for (int i=100; i<=n; i++)
                                    {
                                        if(i%k==0) sum+=i;
                                    }
                                    System.out.println("Сумма всех "+n1+"-значных чисел кратных " + k + " = " + sum + "\n");
                                }
                                else System.out.println("Вы ввели не целое число!\n");
                                break;
                            }
                            case 4:
                            {
                                chislo="9999";
                                n= Integer.parseInt(chislo);
                                System.out.println("Введите число k: ");
                                if(in.hasNextInt())
                                {
                                    k=in.nextInt();
                                    for (int i=1000; i<=n; i++)
                                    {
                                        if(i%k==0) sum+=i;
                                    }
                                    System.out.println("Сумма всех "+n1+"-значных чисел кратных " + k + " = " + sum + "\n");
                                }
                                else System.out.println("Вы ввели не целое число!\n");
                                break;
                            }
                        }
                    }
                    else System.out.println("Вы ввели что-то не так!\n");
                }
                else System.out.println("Вы ввели не число!\n");
                System.out.println("Задание 8 завершено\n");
            };break;
            case 2:{
                try {
                    variables=split(read.getWord(8), 2);
                    System.out.println("кол-во знаков числа = "+variables[0] + "; число = " + variables[1]);

                    chislo = Integer.toString((int) variables[0]);
                    k = (int) variables[1];
                    n1= Integer.parseInt(chislo);
                    if(chislo.length()<=1||chislo.length()>=4)
                    {
                        switch (n1)
                        {
                            case 1:
                            {
                                chislo="9";
                                n= Integer.parseInt(chislo);
                                for (int i=0; i<=n; i++)
                                {
                                    if(i%k==0) sum+=i;
                                }
                                System.out.println("Сумма всех "+n1+"-значных чисел кратных " + k + " = " + sum + "\n");
                                break;
                            }
                            case 2:
                            {
                                chislo="99";
                                n= Integer.parseInt(chislo);
                                for (int i=10; i<=n; i++)
                                {
                                    if(i%k==0) sum+=i;
                                }
                                System.out.println("Сумма всех "+n1+"-значных чисел кратных " + k + " = " + sum + "\n");
                                break;
                            }
                            case 3:
                            {
                                chislo="999";
                                n= Integer.parseInt(chislo);
                                for (int i=100; i<=n; i++)
                                {
                                    if(i%k==0) sum+=i;
                                }
                                System.out.println("Сумма всех "+n1+"-значных чисел кратных " + k + " = " + sum + "\n");
                                break;
                            }
                            case 4:
                            {
                                chislo="9999";
                                n= Integer.parseInt(chislo);
                                for (int i=1000; i<=n; i++)
                                {
                                    if(i%k==0) sum+=i;
                                }
                                System.out.println("Сумма всех "+n1+"-значных чисел кратных " + k + " = " + sum + "\n");
                                break;
                            }
                        }
                    }
                    else System.out.println("Вы ввели что-то не так в файл!\n");
                    System.out.println("Задание 8 завершено\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };break;
            default:
                System.out.print("Такого режима нет\n");
        }
    }
}
