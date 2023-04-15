package lr9.Task2.e3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayException();
        SumArray(StatArray);
    }

    private static byte[] StatArray;

    private static void ArrayException() {
        try {
            SetArray();
        } catch (InputMismatchException e) {
            System.out.println("введите корректное значение (" + e + ")");
            ArrayException();
        } catch (Exception e) {
            System.out.println("ошибка (" + e + ")");
            ArrayException();
        }
    }

    static class ByteRangeException extends InputMismatchException {
        ByteRangeException() {
            super("Число за пределом диапазона byte");
        }
    }

    private static void InputException(int i) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("ВВедите byte элемент массива " + "[" + (i + 1) + "]");
            int temp = 0;
            try {
                temp = scan.nextInt();
                if (temp < -128 || temp > 127) {
                    throw new ByteRangeException();
                }
            } catch (ByteRangeException e) {
                System.out.println("Значение за пределами диапазона byte (" + e + ")");
                InputException(i);
            }
            StatArray[i] = (byte) temp;
        } catch (InputMismatchException e) {
            System.out.println("ВВедите число (" + e + ")");
            InputException(i);
        }

    }
    private static void SetArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ВВедите размер массива");
        int a = scan.nextInt();
        StatArray = new byte[a];
        for(int i=0;i<a;i++){
            InputException(i);
        }
    }
    private static void SumArray(byte [] InputArray){
        int A = 0;
        for (int j : InputArray){
            A +=(int) j;
        }
        System.out.println("Сумма элементов массива = [" + (A) + "]");
    }
}