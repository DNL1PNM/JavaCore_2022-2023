package lr9.Task2.e2;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        MatrixException();
        ColumnException();
    }

    private static void MatrixException() {
        try {PrintMatrix(CreateMatrix());}
        catch (NegativeArraySizeException e){
            System.out.println("Введен неверный размер матрицы (" + e + ")");
            MatrixException();
        }
        catch(InputMismatchException e){
            System.out.println("Введен неверный параметр матрицы (" + e + ")");
            MatrixException();
        }
    }

    private static void ColumnException(){
        try{PrintColumn();}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Столбик за пределами матрицы ("+ e +")");
            ColumnException();
        }
        catch (InputMismatchException e){
            System.out.println("ВВеден неверный параметр столбца "+ e +")");
            ColumnException();
        }
    }

    private static int width;
    private static int height;
    private static int[][] MatrixStat;
    private static int[][] CreateMatrix(){
        Random random = new Random(200);
        Scanner id = new Scanner(System.in);
        System.out.println("Введите ширину матрицы: ");
        width = id.nextInt();
        System.out.println("ВВедите высоту матрицы: ");
        height = id.nextInt();
        int [][] Matrix = new int [width][height];
        for (int i = 0 ; i <width; i++) {//заполнение массива
            for (int j = 0 ; j <height; j++) {
                Matrix[i][j] = random.nextInt(200); //подстановка случайных значений
            }
        }
        MatrixStat = Matrix;
        return Matrix;
    }
    private static void PrintMatrix(int[][] Array){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("[" + (j+1) + "][" + (i+1) + "]=" + Array[j][i]+"\t");
            }
            System.out.println();
        }
    }
    private static void PrintColumn(){
        Scanner id = new Scanner(System.in);
        System.out.println("Выберите столбик матрицы: ");
        int column =id.nextInt();
        for (int i = 0; i<height ; i++){
            System.out.println("[" + column + "][" + (i+1) + "]=" + MatrixStat[column-1][i]+"\n");
        }
    }
}
