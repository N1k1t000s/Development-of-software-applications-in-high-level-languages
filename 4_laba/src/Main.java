/**
 * This is my main class, here I will write my code
 * @author <strong>Nikita Derevlev</strong>
 * @version 0.0.7
 * @since 0.0.1
 */

import java.io.File;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

    /**
     * Here start point of the program.
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        // Читаем HTML файл из файла
        File input = new File("E:\\Документы\\Учёба_(Универ)\\6_семестр\\Разработка_на_языках_высокого_уровня\\4_lab\\lab4\\lab4\\src\\data.html");
        Document doc = Jsoup.parse(input, "UTF-8");

        // Находим все ссылки и записываем их в TreeSet для сортировки
        SortedSet<String> sites = new TreeSet<>();
        Pattern pattern = Pattern.compile("^https?://([^/]+)");

        doc.select("a[href]").forEach(a -> {
            String href = a.attr("href");
            Matcher matcher = pattern.matcher(href);
            if (matcher.find()) {
                sites.add(matcher.group(1));
            }
        });

        // Выводим список сайтов в алфавитном порядке
        for (String site : sites) {
            System.out.println(site);
        }
    }
}