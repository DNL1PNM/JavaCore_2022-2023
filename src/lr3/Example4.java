package lr3;
import java.util.Arrays;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input correct first number");
        int firstNumber = in.nextInt();

        System.out.println("Input correct second number");
        int secondNumber = in.nextInt();

        int[] fibonacci = {firstNumber,secondNumber};
        Arrays.sort(fibonacci);

        for (int i = 0 ; i < fibonacci.length ; i++ ){
            System.out.println(" [" + i  +"] After sorting = " + fibonacci[i]);
        }
        int j = 0;
        while  (j<fibonacci.length) {
            System.out.println(" [" + j + "] After sorting = " + fibonacci[j]);
            j++;
        }
    }
}