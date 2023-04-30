package lr7.E4;

public class Super {
    //В первом классе есть открытое символьное поле
    public char char1;

    public void setChar1(char char1) {
        this.char1 = char1;
    }
    //конструктор с одним параметром
    Super(char char1){
        this.setChar1(char1);
    }
    //конструктор копии
    Super(Super copy){ this.setChar1(copy.char1); }

    @Override
    public String toString() {
        String InfoSup;
        InfoSup =
                "\n Class name: " + this.getClass().getSimpleName() + "\n" +
                        " char 1 = " + this.getChar1();
        return InfoSup;
    }
    public char getChar1() {
        return char1;
    }
}