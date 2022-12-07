package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] twoArray = {{random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9)},
                {random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9)},
                {random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9),random.nextInt(9)}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + twoArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("После сортировки ");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(" " + twoArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}