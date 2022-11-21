package lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Yours date of born: ");
        int dateBorn = in.nextInt();
        dateBorn = 2022 - dateBorn;
        System.out.println("Yours Age: " + dateBorn);
        in.close();
    }
}
