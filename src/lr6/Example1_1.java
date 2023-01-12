package lr6;

public class Example1_1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Example1 myex = new Example1();
        myex.SetField('A');
        myex.SetField("B");
        char[] CharArray1 = {'п', 'р', 'и', 'в', 'е', 'т'};
        char[] CharArray2 = {'C'};
        myex.SetField(CharArray1);
        myex.SetField(CharArray2);

    }
}
