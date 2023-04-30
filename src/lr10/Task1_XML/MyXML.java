package lr10.Task1_XML;


import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

import java.util.Scanner;


public class MyXML {
     static Document doc;
    static Element rootElement;

    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("ВВедите данные новой книги");
        Book book1 = new Book("Война и мир","Лeв Толстой","1869");
        Book book2 = new Book("Мастер и Маргарита","Михаил Булгаков","1967");
        Book book3 = new Book(id.nextLine(),id.nextLine(),id.nextLine());
        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            doc = docBuilder.newDocument();
            rootElement = doc.createElement("Library");
            doc.appendChild(rootElement);
            // Добавление первой книги
            // Добавление второй книги
            addBook(book1);
            addBook(book2);

            addBook(book3);
            // Запись XML-файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result =
                    new StreamResult(new File("D://a/example.xml"));
            transformer.transform(source, result);

            //выводим данные в консоль
            DisplayBooks();
            // запишем отредактированный элемент в файл
            // или выведем в консоль
            doc.getDocumentElement().normalize();
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformer = transformerFactory.newTransformer();
            source = new DOMSource(doc);
            result = new StreamResult(new File("D://a/exampleWriter.xml"));
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(source, result);
            System.out.println("XML успешно изменен! Новые данные:");
            //Возможность искать книгу
            System.out.println("ВВедите название книги, которую хотите найти");
            Scanner in = new Scanner(System.in);
            String delitBook = in.nextLine();
            SeachBook(delitBook );

            //Возможность удалять книгу
            System.out.println("ВВедите название книги, которую хотите удалить");
            removeBook(in.nextLine());
            //Повторно выводим
            System.out.println("Проверка результата");
            DisplayBooks();

        } catch(Exception pce){
            pce.printStackTrace();
        }
    }
    public static void addBook( Book page){
        Element book = doc.createElement("book");
        rootElement.appendChild(book);

        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode(page.title));
        book.appendChild(title);

        Element author = doc.createElement("author");
        author.appendChild(doc.createTextNode(page.author));
        book.appendChild(author);

        Element year = doc.createElement("year");
        year.appendChild(doc.createTextNode(page.year));
        book.appendChild(year);
    }
    public static void DisplayBooks() {
        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("\nТекущий элемент: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Название книги: "
                        + element.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Автор: "
                        + element.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("Год издания: "
                        + element.getElementsByTagName("year").item(0).getTextContent());
            }
        }
    }
    public static void SeachBook(String title){
        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                if (title.equals(element.getElementsByTagName("title").item(0).getTextContent())) {
                System.out.println("Название книги: "
                        + element.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("Автор: "
                        + element.getElementsByTagName("author").item(0).getTextContent());
                System.out.println("Год издания: "
                        + element.getElementsByTagName("year").item(0).getTextContent());

                }
            }
        }
    }
    public static void removeBook(String title){
        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                if (title.equals(element.getElementsByTagName("title").item(0).getTextContent())) {
                    Node parentNode = element.getParentNode();
                    parentNode.removeChild(element);

                }
            }
        }
    }
}
