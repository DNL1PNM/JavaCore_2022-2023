package lr7.E1;

public class subClassTest extends superClassTest {

    //У него появляется еще одно приватное текстовое ноле.
    private String str2;
    private String str3;

    //подкласс должен иметь версии конструктора с одним и двумя текстовыми аргументами,
    //конструктор с одним параметром
    subClassTest(String strEx) {
        super(strEx);
    }

    //конструктор с двумя параметрами
    subClassTest(String strEx2, String strEx3) {
        this.str2 = strEx2;
        this.str3 = strEx3;
    }

    //в подклассе должен быть переопределен метод toString ().
    //@Override - аннотация для указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
    @Override
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue = "sub" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1() + "\n" +
                " str 2 = " + this.str2 + "\n" +
                " str 3 = " + this.str3;
        return ClassNameAndFieldValue;
    }
}