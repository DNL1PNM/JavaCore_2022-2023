package lr1;
import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input age: ");
        int year = in.nextInt();
        year = 2022 - year;
        System.out.println("Years: " + year);
        in.close();
    }
}
