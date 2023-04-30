package lr7.E2;

public class Example2 {
    public static void main(String[] args) {
        System.out.println("\n");
        superClass myTest0 = new superClass();
        String superClass0 = myTest0.toString();
        System.out.println(superClass0);

        superClass myTest1 = new superClass("test first");
        String superClass1 = myTest1.toString();
        System.out.println(superClass1);
        System.out.println("\n");

        superClass myTest2 = new subClass();
        String subClass0 = myTest2.toString();
        System.out.println(subClass0);
        System.out.println("\n");

        superClass myTest3 = new subClass("test second");
        String subClass1 = myTest3.toString();
        System.out.println(subClass1);
        System.out.println("\n");

        superClass myTest4 = new subClass(256);
        String subClass2 = myTest4.toString();
        System.out.println(subClass2);
        System.out.println("\n");

        superClass myTest5 = new subClass("test third", 256);
        String subClass3 = myTest5.toString();
        System.out.println(subClass3);
    }
}