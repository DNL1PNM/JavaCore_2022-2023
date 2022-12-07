package lr4;
import java.util.Random;
public class Example6 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] randomArray = {{random.nextInt(9), random.nextInt(9), random.nextInt(9), random.nextInt(9), random.nextInt(9)},
                {random.nextInt(9), random.nextInt(9), random.nextInt(9), random.nextInt(9), random.nextInt(9)},
                {random.nextInt(9), random.nextInt(9), random.nextInt(9), random.nextInt(9), random.nextInt(9)}};

        for (int i =0; i < 3; i++) {

                for (int j = 0; j < 5; j++) {

                    System.out.print(" " + randomArray[i][j] + " ");
                }
            System.out.println();
            }

        System.out.println("После сортировки");

        outer :for (int i =0; i < 3; i++) {
            if (i == 1){//Через рандом не работает
                System.out.print("");
                continue outer;
            }

            outer1 : for (int j = 0; j < 5; j++) {
                  if (j == 2){//Тоже через рандом не работает,но смысл я понял;)
                      System.out.print("");
                      continue outer1;
                      }
                  System.out.print(" " + randomArray[i][j] + " ");
              }
            System.out.println();
        }
    }
}