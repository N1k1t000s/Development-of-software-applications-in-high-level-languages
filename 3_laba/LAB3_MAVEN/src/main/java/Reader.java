/**
 * This is my Reader class, here I will read variables for my task from file
 */

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.Scanner;


public class Reader {

    // построчное считывание файла
    /**
     * This method will return the desired string from the file.
     * @param pos desired line number.
     * @return word - the line we want.
     */
    private static final Logger logger = LogManager.getLogger(Reader.class);
    public static String getWord(int pos) {
        String word="";
        int i=0;
        Scanner sc = null;
        try {
            logger.debug("Метод getWord начал выполнение");
            sc = new Scanner(new File("E:\\Документы\\" +
                    "Учёба_(Универ)" +
                    "\\6_семестр\\" +
                    "Разработка_на_языках_высокого_уровня\\" +
                    "3_lab\\lab_3.txt"));
        } catch (FileNotFoundException e) {
            logger.fatal("Ошибка " + e + "! Файл не найден!");
            throw new RuntimeException(e);
        }
        logger.debug("Чтение файла");
        while (i!=pos) {
            i++;
            sc.nextLine();
            if(i==pos){
                word=sc.nextLine();
            }
        }
        logger.debug("Метод getWord закончил выполнение");
        return word;
    }
}
