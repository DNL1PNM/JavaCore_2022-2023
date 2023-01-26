package lr7.l3;

public class Example3 {
    public static void main(String[] args) {
        SupOne sup = new SupOne(512);
        String Name1 = sup.toString();
        System.out.println(Name1);

        SubFirst SubClass1 = new SubFirst(1024,'K');
        String Name2 = SubClass1.toString();
        System.out.println(Name2);

        SubSecond SubSecond = new SubSecond(1024,'K',"Килобайт");
        String Name3 = SubSecond.toString();
        System.out.println(Name3);
    }
}