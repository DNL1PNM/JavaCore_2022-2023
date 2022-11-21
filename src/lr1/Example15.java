package lr1;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first: ");
        int first = in.nextInt();
        System.out.println("Input second: ");
        int second = in.nextInt();
        first -= second;
        second += first;
        System.out.println(first);
        System.out.println(second);
        in.close();
    }
}
