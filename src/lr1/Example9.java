package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Name Month: ");
        String nameMonth = in.nextLine();
        System.out.println("Number of days: ");
        int numberOfDays = in.nextInt();
        System.out.println("Name Day:: " + nameMonth);
        System.out.println("Number Date: " + numberOfDays);
        in.close();
    }
}
