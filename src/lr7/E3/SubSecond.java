package lr7.E3;

public class SubSecond extends SubFirst {
    //В третьем классе появляется открытое текстовое ноле
    public String str2;
    //метод с тремя аргументами для присваивания значений полям (перегрузка метода из суперкласса)
    public void setInt1Str1Str2(int int1, char char1, String str2) {
        super.int1 = int1;
        super.char1 = char1;
        this.str2 = str2;
    }
    //конструктор с тремя параметрами
    SubSecond(int int1, char char1, String str2) {
        super(int1,char1);
        setInt1Str1Str2(int1, char1, str2);
    }

    public String toString() {
        String Info =
                "\n Str 3 = " + this.getStr();
        return super.toString()+Info;
    }
    public String getStr() {
        return str2;
    }
}