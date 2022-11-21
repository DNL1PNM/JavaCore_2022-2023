package lr1;
import java.util.Scanner;
public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first: ");
        int first = in.nextInt();
        int square = first - 1 + first + first + 1;
        square *= square;
        System.out.println(first - 1);
        System.out.println(first);
        System.out.println(first + 1);
        System.out.println(square);
        in.close();
    }
}
