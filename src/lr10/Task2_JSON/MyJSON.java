package lr10.Task2_JSON;
import lr10.Task1_XML.Book;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class MyJSON {

    static Object obj;
    static JSONObject jsonObject;

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {
            obj = parser
                    .parse(new FileReader("D://a/example-JSON.json"));
            jsonObject = (JSONObject) obj;
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        Scanner id = new Scanner(System.in);
        System.out.println("ВВедите данные новой книги");
        Book book1 = new Book("Война и мир", "Лeв Толстой", "1869");
        Book book2 = new Book("Мастер и Маргарита", "Михаил Булгаков", "1967");
        Book book3 = new Book(id.nextLine(), id.nextLine(), id.nextLine());
        addBook(book3);
        DisplayBooks();

        System.out.println("ВВедите название книги, которую хотите найти");
        SeachBook(id.nextLine());
        System.out.println("ВВедите название книги, которую хотите удалить");
        removeBook(id.nextLine());
        System.out.println("Проверка результата");
        DisplayBooks();
    }

    public static void DisplayBooks() {
        try {

            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
}
    public static void SeachBook(String title) {
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        for (Object o : jsonArray) {
            JSONObject book = (JSONObject) o;
            if (title.equals(book.get("title"))) {
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }

        }
    }
    public static void addBook( Book page){
        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        JSONObject newBook = new JSONObject();
        newBook.put("title",page.title);
        newBook.put("author", page.author);
        newBook.put("year", page.year);
        jsonArray.add(newBook);

    }
    public static void removeBook(String title){

        JSONArray jsonArray = (JSONArray) jsonObject.get("books");
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
            }}
    }
}
