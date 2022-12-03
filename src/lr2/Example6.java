package lr2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Example6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size = in.nextInt();
            if (size > 0) {

                Random random = new Random();
                int[] array = new int[size];

                for (int i = 0; i < array.length; i++) {

                    boolean iterator = true;
                    int x = 0;
                    while (iterator) {
                        x = random.nextInt(100);
                        if (x % 5 == 2) {
                            iterator = false;
                        }
                    }
                    array[i] = x;
                }

                System.out.println(Arrays.toString(array));
            } else {

                System.out.println("Input incorrect data");
            }
        }
}
