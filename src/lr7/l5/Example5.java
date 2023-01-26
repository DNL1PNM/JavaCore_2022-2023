package lr7.l5;

public class Example5 {
    public static void main(String[] args) {
        Super Super= new Super("Super");
        Super.PrintToString();

        SubFirst Sub1 = new SubFirst("Sub1", 256);
        Sub1.PrintToString();

        Super Super1 = new Super(Sub1.getStr1());
        Super1.PrintToString();

        SubSecond Sub2 = new SubSecond("Sub2", 'A');
        Sub2.PrintToString();

        Super Super2 = new Super(Sub2.str1);
        Super2.PrintToString();
    }
}