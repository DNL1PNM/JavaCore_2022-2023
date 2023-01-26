package lr5.Example66;

public class Example6 {
    //два закрытых целочисленных поля (max и min)
    private int min;
    private int max;
    //конструктор отображающий в консольном окне значения полей объекта
    Example6(int num1, int num2){
        System.out.println("Конструтор c двумя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
    //конструтор,с методом присваивания значений полям
    Example6(int num){
        System.out.println("Конструтор с одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
    //значения полям присваиваются с помощью открытого метода
    public void Equals(int num1,int num2){
        //сравниваются текущие значения полей и значения аргументов,переданных методу
        System.out.println("Метод c двумя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
    public void Equals(int num){
        //сравниваются текущие значения полей и значения аргументов,переданных методу
        System.out.println("Метод с одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
    void Print(){
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
