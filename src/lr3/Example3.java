package lr3;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input correct size of number of numbers");
        int size = in.nextInt();

        int[] fibonacci = new int[size];

        int f1 = 0;
        int f2 = 1;
        int count;

        System.out.print(f1 + " " + f2+ " ");
        for (int i = 2; i < fibonacci.length; i++) {
            count = f1 + f2;
            System.out.print(count + " ");
            f1 = f2;
            f2 = count;
        }

        int j = 0;

        while  (j <fibonacci.length) {
            count = f1 + f2;
            System.out.println(count + " ");
            f1 = f2;
            f2 = count;
            j++;

        }
    }


}