package lr5.Example44;
import java.util.Scanner;
public class Example4 {
    private char ch1;
//Символьное поле
    private int int1;
//Целочисленное поле
    Example4(int i,char a){
        ch1 = a;
        int1 = i;
        int lenght =(int) (Math.log10(int1) + 1);
        double result = (double)ch1 + (double)int1*1/Math.pow(10, lenght);
        System.out.println("result1 = " + result +" ch = " + (double)ch1 + " ; int = "+lenght);
    }
//Версия конструктора с двумя аргументами
    Example4(double d){
        char ch1 = (char)d;
        //Действительная часть аргумента определяет код символа (значение символьного поля)
        int1 = (int)((d-(int)d)*100);
        System.out.println("ch = " + ch1 + " int = " + int1);
        //Дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля
    }
//Версия конструтора с одним аргументом типа double
}