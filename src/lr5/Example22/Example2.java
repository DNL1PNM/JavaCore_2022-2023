package lr5.Example22;

public class Example2 {
    private char ch1;
<<<<<<< HEAD
//первое символьное поле
    private char ch2;
//второе символьное поле
=======
    private char ch2;
>>>>>>> origin/master

    public void Sketch(char ch1, char ch2){
        this.ch1 = ch1;
        this.ch2 = ch2;
    }
<<<<<<< HEAD
//метод который возвращает результат и у него нет аргументов
    public void showCharArray() {
=======
    public void showCharArray(){
>>>>>>> origin/master
        int int1 = ch1;
        int int2 = ch2;
        int score = 1;
        for (int i = int1; i <= int2; i++) {
<<<<<<< HEAD
            System.out.println(score + " " + (int)ch1++ + " Symbol = " + (char) i);
=======
            System.out.println(score + " Symbol = "+(char)i );
>>>>>>> origin/master
            score++;
        }

    }

}
