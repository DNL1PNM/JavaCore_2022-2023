package lr5.Example66;

public class Example6 {
    private int min;
//Целочисленное закрытое поле минимум
    private int max;
//Целочисленное закртыое поле максимум
    Example6(int num1, int num2){
        System.out.println("Конструтор c двумя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
//Конструктор отображающий в консольном окне значения полей объекта
    Example6(int num){
        System.out.println("Конструтор с одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
//Конструтор,с методом присваивания значений полям
    public void Equals(int num1,int num2){
//Значения полям присваиваются с помощью открытого метода
        System.out.println("Метод c двумя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
//Сравниваются текущие значения полей и значения аргументов,переданных методу
    public void Equals(int num){
        System.out.println("Метод с одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
//Сравниваются текущие значения полей и значения аргументов,переданных методу
    void Print(){
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
//Присваиваются  значения объекту
}
