package lr10.Task_Examples.E3_HTML;
import org.jsoup.Jsoup;
import org. jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class LinkParser {

    public static void main(String[] args) {
        WriteLinksFromHTML();
    }

    public static void WriteLinksFromHTML() {
        String url = " https://itlearn.ru/first-steps ";
        try {
            File inputFile = new File("D://a/ArrayLinkFromHTML.txt");
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            FileWriter writer = new FileWriter(inputFile);
            for (Element link : links) {
                writer.write(link.attr("abs:href"));
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            WriteLinksFromHTML();
        }
        System.out.println("Данные успешно записаны");
    }
}
