package lr11.Task2_JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class AddJSON {public static void main(String[] args) {

    try {
        JSONObject jsonObject = null;
        JSONParser parser = new JSONParser();
        Object obj = parser
                .parse(new FileReader("D://a/example-JSON.json"));
        jsonObject = (JSONObject) obj;
        System.out.println("Корневой элемент: "
                + jsonObject.keySet().iterator().next());
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        for (Object o : jsonArray) {
            JSONObject book = (JSONObject) o;
            System.out.println("\nТекущий элемент: book");
            System.out.println("Название книги: " + book.get("title"));
            System.out.println("Автор: " + book.get("author"));
            System.out.println("Год издания: " + book.get("year"));
            String author = "Иванов";
        }
        for (Object o : jsonArray) {
            JSONObject book2 = (JSONObject) o;
            String author = "Иванов";
            jsonArray.stream()
                    .filter(book -> book2 instanceof JSONObject)
                    .map(book -> book2)
                    .filter(book -> author.equals(book2.get("author")))
                    .forEach(book -> {
                        System.out.println("\nТекущий элемент: book");
                        System.out.println("Название книги: " + book2.get("title"));
                        System.out.println("Автор: " + book2.get("author"));
                        System.out.println("Год издания: " + book2.get("year"));
                    });


        }
    } catch (Exception e) {
        e.printStackTrace();
    }

}
}
