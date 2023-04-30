package lr7.E5;

public class SubSecond extends Super {

    //защищенное символьное поле
    protected char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }
    //конструктор с двумя параметрами
    SubSecond(String str1, char char1) {
        super(str1);
        this.setChar1(char1);
    }

    //переопределен метод для отображения значений полей объекта и названия класса
    @Override
    public void PrintToString() {
        String SecondValue =
                " char (sub) = \"" + this.getChar1()+"\"";
        super.PrintToString();
        System.out.println(SecondValue);
    }
    public char getChar1() {
        return char1;
    }
}