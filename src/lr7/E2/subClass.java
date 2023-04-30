package lr7.E2;

public class subClass extends superClass {
    private String str2;
    //В подклассе появляется дополнительное открытое целочисленное поле.
    public int int1;

    //версия метода без параметров,
    subClass() {setStr1();}
    //версия метода с текстовым параметром,
    subClass(String str2) {setStr1(str2);}
    //версия метода с целочисленным параметром,
    subClass(int int1) {setStr1(); this.setInt1(int1);}
    //версия метода с текстовым и целочисленным параметром.
    subClass(String str2, int int1) {setStr1(str2); this.setInt1(int1);}

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1 (){
        this.str2 = "здесь ничего нет";
    }

    public void setStr1 (String str2){
        this.str2 = str2;
    }

    public int getInt1(){
        //   System.out.println(str1);
        return int1;
    }

    public String getStr1(){
        //   System.out.println(str1);
        return str2;
    }

    public int getStr1length(){
        //   System.out.println("Длина текстовой строки="+str1.length());
        return str2.length();
    }

    //@Override - аннотация для указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
    @Override
    public String toString() {
        return "subClass{" + "str2=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}"
                +"\nsubClass{" + "int1=\"" + getInt1() + "\"}";
    }

}