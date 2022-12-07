package lr4;

public class Example7 {
    public static void main(String[] args) {

        int[][] arrowSnake = new int[5][5];
        for (int i = 0; i < arrowSnake.length; ++i) {
           out: for (int j = 0; j < arrowSnake.length; ++j) {

                if (i == 0) {
                    arrowSnake[i][j] = i + j +1;
                    System.out.print(arrowSnake[i][j] + "  ");
                    continue out;
               }
               if (j == 4) {
                   arrowSnake[i][j] = j + i+1;
                   System.out.print(arrowSnake[i][j] + " ");
                   continue out;
               }
               if (i == 1) {
                   arrowSnake[i][j] = i + j+9;
                   System.out.print(arrowSnake[i][j] + " ");
                   continue out;

               }
               if (j == 3){
                   arrowSnake[i][j] = j + i+9;
                   System.out.print(arrowSnake[i][j] + " ");
                   continue out;
               }
               if (i == 2 ){
                   arrowSnake[i][j] = j + i+15;
                   System.out.print(arrowSnake[i][j] + " ");
                   continue out;
               }
               if (j == 2){
                   arrowSnake[i][j] = j + i+15;
                   System.out.print(arrowSnake[i][j] + " ");
                   continue out;
               }
               if (i == 3){
                   arrowSnake[i][j] = j + i+19;
                   System.out.print(arrowSnake[i][j] + " ");
                   continue out;
               }
               if (j == 1) {
                   arrowSnake[i][j] = j + i + 19;
                   System.out.print(arrowSnake[i][j] + " ");
                   continue out;
               }
               if (i == 4) {
                   arrowSnake[i][j] = j + i + 21;
                   System.out.print(arrowSnake[i][j] + " ");
                   continue out;
               }//Сделал сверху вниз, потом еще раз прочитал задание и не успеваю переделать .

                   System.out.print(arrowSnake[i][j] + " ");}
                System.out.println();
            }
        }
    }