package lr7.l4;

public class Example4 {
    public static void main(String[] args) {
        //super Class test
        Super superFirst = new Super('A');
        String supName = superFirst.toString();
        System.out.println(supName);
        //super Class copy test
        Super superSecond= new Super(superFirst);
        String SupNameSecond = superSecond.toString();
        System.out.println(SupNameSecond);
        //1 subClass test
        SubFirst subFirst1 = new SubFirst('A',"AAA");
        String subName1 = subFirst1.toString();
        System.out.println(subName1);
        //1 subClass copy test
        SubFirst subFirst2 = new SubFirst(subFirst1);
        String subName2 = subFirst2.toString();
        System.out.println(subName2);
        //2 subClass test
        SubSecond SubSecond1 = new SubSecond('A',"AAA",512);
        String subName3 = SubSecond1.toString();
        System.out.println(subName3);
        //2 subClass copy test
        SubSecond subSecond2 = new SubSecond(SubSecond1);
        String subName3Copy = subSecond2.toString();
        System.out.println(subName3Copy);
    }
}