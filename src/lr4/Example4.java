package lr4;

public class Example4 {
    public static void main(String[] args) {
        int m[][] = {
                {1 , 0 , 0 , 0 ,0 },
                {1 , 1 , 0 , 0 ,0 },
                {1 , 1 , 1 , 0 ,0 },
                {1 , 1 , 1 , 1 ,0 },
                {1 , 1 , 1 , 1 ,1 }
        };
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(m[i][j] + " ");
                System.out.println();

        }
    }
}