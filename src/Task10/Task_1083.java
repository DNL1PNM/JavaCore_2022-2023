package Task10;
import java.util.*;
public class Task_1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.next().length();
        int result = 1;
        while (n > 0) {
            result *= n;
            n -= k;
        }
        System.out.println(result);
    }
}