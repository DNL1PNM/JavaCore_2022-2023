package lr7.E3;
public class SupOne {

    public int int1;//в первом суперклассе есть открытое целочисленное поле

    public void setInt1(int int1) {
        this.int1 = int1;//метод с одним параметром для присваивания значения полю
    }

    SupOne(int int1){
        this.setInt1(int1);//конструктор с одним параметром
    }

    public String toString() {
        String SupInfo;
        SupInfo =
                "Name: " + this.getClass().getSimpleName() + "\n" +
                        " Int 1 = " + this.getInt1();
        return SupInfo;//Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса и значениями всех полей объекта.
    }
    public int getInt1() {
        return int1;
    }
}