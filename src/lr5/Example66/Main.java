package lr5.Example66;

public class Main {
    public static void main(String[] args) {
        //Конструтор с двумя аргументами
        Example6 example1 = new Example6(1, 2);
        example1.Print();
        //Конструтор с одним аргументом
        example1 = new Example6(6);
        example1.Print();
        //Метод с двумя аргументами
        example1.Equals(4, 5);
        example1.Print();
        //Метод с одним аргументом
        example1.Equals(10);
        example1.Print();
    }
}
