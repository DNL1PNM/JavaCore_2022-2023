package lr7.l5;

public class SubFirst extends Super {

    //защищенное целочисленное поле
    protected int int1;

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    //конструктор с двумя параметрами
    SubFirst(String str1, int int1) {
        super(str1);
        this.setInt1(int1);
    }

    //переопределен метод для отображения значений полей объекта и названия класса
    @Override
    public void PrintToString() {
        String SecondValue =
                " int (sub) = \"" + this.getInt1()+"\"";
        super.PrintToString();
        System.out.println(SecondValue);
    }
    public int getInt1() {
        return int1;
    }
}