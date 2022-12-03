package lr3;

public class Example7 {
    public static void main(String[] args) {

        int charAmount = 's' - 'a' + 1;
        char[] array = new char[charAmount];
        for (int i = 0; i < charAmount; i+=2)
            array[i] = (char) ('a' + i);

        String reverseArray = reverseString(String.valueOf(array));

        System.out.println(array);
        System.out.println(reverseArray);
    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}