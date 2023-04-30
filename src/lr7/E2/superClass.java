package lr7.E2;

public class superClass {
    //приватным текстовым полем.
    private String str1;

    superClass() {setStr1();}
    //Объект суперкласса создается передачей одного текстового аргумента конструктору.
    superClass (String str1){setStr1(str1);}
    //метод для присваивания значения полю без параметров
    public void setStr1 (){
        this.str1 = "здесь ничего нет";
    }
    //метод для присваивания значения полю с одним текстовым параметром
    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){
        //   System.out.println(str1);
        return str1;
    }
    //Доступное только для чтения свойство результатом возвращает длину текстовой строки.
    public int getStr1length(){
        if(null== this.str1){
            return 0;
        }
        //   System.out.println("Длина текстовой строки="+str1.length());
        return str1.length();
    }


    @Override
    public String toString() {
         return "superClass{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";

    }
}