package lr10.Task_Examples.E1_XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.Console;
import java.io.File;
import java.util.Scanner;
    public class CreateXMLFile {
        public static void main(String[] args) {
            try {
                Scanner id = new Scanner(System.in);
                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                // Создание корневого элемента
                Document doc = docBuilder.newDocument();
                Element rootElement = doc.createElement("Library");
                doc.appendChild(rootElement);

                // Добовление первой книги
                Element book1 = doc.createElement("book");
                rootElement.appendChild(book1);

                Element title1 = doc.createElement("title");
                title1.appendChild(doc.createTextNode("Война и мир"));
                book1.appendChild(title1);

                Element author1 = doc.createElement("author");
                author1.appendChild(doc.createTextNode("Лeв Толстой"));
                book1.appendChild(author1);

                Element year1 = doc.createElement("year");
                year1.appendChild(doc.createTextNode("1869"));
                book1.appendChild(year1);

                // Добовление второй книги
                Element book2 = doc.createElement("book");
                rootElement.appendChild(book2);

                Element title2 = doc.createElement("title");
                title2.appendChild(doc.createTextNode("Мастер и Маргарита"));
                book2.appendChild(title2);

                Element author2 = doc.createElement("author");
                author2.appendChild(doc.createTextNode("Михаил Булгаков"));
                book2.appendChild(author2);

                Element year2 = doc.createElement("year");
                year2.appendChild(doc.createTextNode("1967"));
                book2.appendChild(year2);

                // Запись XML-файла
                doc.setXmlStandalone(true);
                doc.normalizeDocument();
                javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
                javax.xml.transform.Transformer transformer = tf.newTransformer();
                transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
                transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
                javax.xml.transform.stream.StreamResult result =
                        new javax.xml.transform.stream.StreamResult(new File("D://a/example.xml"));
                transformer.transform(source, result);
                System.out.println("XML-файл успешно создан!");
            } catch (Exception pce) {
                pce.printStackTrace();
            }
        }
    }