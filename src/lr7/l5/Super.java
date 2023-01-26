package lr7.l5;

public class Super {
    //суперкласс с защищенным текстовым полем
    protected String str1;

    public void setStr1(String str1) {
        this.str1 = str1;
    }
    //конструктор с текстовым параметром
    Super(String str1){
        this.setStr1(str1);
    }
    //метод, при вызове которого в консольном окне отображается название класса и значение поля
    public void PrintToString() {
        String NameAndValue;
        NameAndValue =
                "\n Class name (super): " + this.getClass().getSimpleName() + "\n" +
                        " String (super) = \"" + this.getStr1()+"\"";
        System.out.println(NameAndValue);
    }
    public String getStr1() {
        return str1;
    }
}