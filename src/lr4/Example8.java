package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования");
        String value = in.nextLine();
        System.out.println("Введите ключ для шифрования");
        int keyclose = in.nextInt();
        char[] chars = value.toCharArray();
        int[] ints = new int[value.length()];
        char[] charsOpen = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + keyclose;
            chars[i] = (char) ints[i];
            System.out.print("[" + chars[i] + "]"+ " ");
        }
        System.out.println("");
        boolean playing = true;
        char replayCheck;
        do {
            System.out.print("Выполнить обратное преобразование? (y/n): ");
            boolean validInput = false;
            while (validInput == false){
                replayCheck = input.next().charAt(0);
                switch (replayCheck) {
                    case 'y':
                    case 'Y':
                        System.out.println("Введите ключ для шифрования");
                        int keyOpen = in.nextInt();
                        for (int i = 0; i < chars.length; i++) {
                            charsOpen[i]= (char)( ints[i]- keyOpen);
                        }
                        System.out.println(charsOpen);
                        validInput = true;
                        playing = true;
                        break;
                    case 'n':
                    case 'N':
                        validInput = true;
                        playing = false;
                        break;
                    default:
                        System.out.println("Введите корректный ответ (y/n)");
                        validInput = false;
                        break;
                }
            }
        } while (playing == true);
        System.out.println("До свидания!");
    }
}
