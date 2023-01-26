package lr5.Example22;

public class Example2 {
    private char ch1;
    private char ch2;

    public void Sketch(char ch1, char ch2){
        this.ch1 = ch1;
        this.ch2 = ch2;
    }
    public void showCharArray(){
        int int1 = ch1;
        int int2 = ch2;
        int score = 1;
        for (int i = int1; i <= int2; i++) {
            System.out.println(score + " Symbol = "+(char)i );
            score++;
        }

    }

}
