package lr5.Example55;

public class Main {
    public static void main(String[] args) {

        Example5 example1 = new Example5(44);
        System.out.println("Число 44 = " + example1.PrintInt());
//Присвоение значения полю через конструтор
        example1.Set(11);
        System.out.println("Значение полю через метод ");
        System.out.println("Число 11 = " + example1.PrintInt());
//Присвоение значения полю через метод с аргументом
        example1.Set(150);
        System.out.println("Число 150 = " + example1.PrintInt());
//Присвоение значения больше 100 полю через метод с аргументом
        example1.Set(-7);
        System.out.println("Число -7 = " + example1.PrintInt());
//Присвоение значения меньше 0 полю через метод с аргументом
        example1.Set();
        System.out.println("Число  ! = " + example1.PrintInt());
//Присвоение значения полю через метод без аргументов
    }
}