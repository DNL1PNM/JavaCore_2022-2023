package lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first: ");
        int first = in.nextInt();
        System.out.println("Input double: ");
        int second = in.nextInt();
        int count = second + first;
        System.out.println("Count: " + count);
        in.close();
    }
}
