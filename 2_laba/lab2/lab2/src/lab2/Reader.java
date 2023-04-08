package lab2;

import java.io.*;
import java.util.Scanner;

/**
 * This is my Reader class, here I will read variables for my task from file
 */
public class Reader {

    // построчное считывание файла
    /**
     * This method will return the desired string from the file.
     * @param pos desired line number.
     * @return word - the line we want.
     */
    public static String getWord(int pos) throws IOException{
        String word="";
        int i=0;
        Scanner sc = new Scanner(new File("E:\\Документы\\Учёба_(Универ)\\6_семестр\\Разработка_на_языках_высокого_уровня\\2_laba_mac\\2_laba/lab_2.txt"));
        while (i!=pos) {
            i++;
            sc.nextLine();
            if(i==pos){
                word=sc.nextLine();
            }
        }
        return word;
    }
}
