package lr7.l3;

public class SubFirst extends SupOne{
    SubFirst(int int1) {
        super(int1);
    }
    public char char1;//Во втором классе появляется открытое символьное поле

    public void setInt1Str1(int int1, char char1) {//метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса)
        super.int1 = int1;
        this.char1 = char1;
    }
    //конструктор с двумя параметрами
    SubFirst(int int1, char char1) {
        super(int1);
        this.setInt1Str1(int1, char1);
    }


    public String toString() {
        String FirstInfo =
                "\n Ch 2 = " + this.getChar();
        return super.toString()+FirstInfo;
    }
    public char getChar() {
        return char1;
    }
}