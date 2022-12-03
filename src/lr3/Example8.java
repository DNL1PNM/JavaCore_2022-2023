package lr3;
public class Example8 {
    public static void main(String[] args) {
        String letters =
                "BCDFGHJKLM";
        char[] symbols = new char[ letters.length()];
        int i = 0;
        for (char letter : letters.toCharArray()) {
            symbols[i] = letter;
            i++;
        }
        System.out.println(symbols);
    }
}