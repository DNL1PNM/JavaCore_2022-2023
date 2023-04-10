package lr5.Example66;

public class Example6 {
<<<<<<< HEAD
    private int min;
//Целочисленное закрытое поле минимум
    private int max;
//Целочисленное закртыое поле максимум
=======
    //два закрытых целочисленных поля (max и min)
    private int min;
    private int max;
    //конструктор отображающий в консольном окне значения полей объекта
>>>>>>> origin/master
    Example6(int num1, int num2){
        System.out.println("Конструтор c двумя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
<<<<<<< HEAD
//Конструктор отображающий в консольном окне значения полей объекта
=======
    //конструтор,с методом присваивания значений полям
>>>>>>> origin/master
    Example6(int num){
        System.out.println("Конструтор с одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
<<<<<<< HEAD
//Конструтор,с методом присваивания значений полям
    public void Equals(int num1,int num2){
//Значения полям присваиваются с помощью открытого метода
=======
    //значения полям присваиваются с помощью открытого метода
    public void Equals(int num1,int num2){
        //сравниваются текущие значения полей и значения аргументов,переданных методу
>>>>>>> origin/master
        System.out.println("Метод c двумя аргументами");
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
    }
<<<<<<< HEAD
//Сравниваются текущие значения полей и значения аргументов,переданных методу
    public void Equals(int num){
=======
    public void Equals(int num){
        //сравниваются текущие значения полей и значения аргументов,переданных методу
>>>>>>> origin/master
        System.out.println("Метод с одним аргументом");
        min = Math.min(min, num);
        max = Math.max(max, num);
    }
<<<<<<< HEAD
//Сравниваются текущие значения полей и значения аргументов,переданных методу
=======
>>>>>>> origin/master
    void Print(){
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
<<<<<<< HEAD
//Присваиваются  значения объекту
=======
>>>>>>> origin/master
}
