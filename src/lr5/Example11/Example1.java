package lr5.Example11;

public class Example1 {

    private char ch1;
//Есть закрытое символьное поле
    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
//Первый открытый метод позволяет присвоить значение пол
    public int getCodeSymbol(){return ch1;}
//Второй открытый метод возвращает результатом код символа
    public void showCodeAndValue(){
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }
//Третий открытый метод позволяет вывести в консольное окно символ(значение поля) и его код.
}
