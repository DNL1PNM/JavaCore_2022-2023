package lr1;
import java.util.Scanner;
public class Example8 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Name Day: ");
            String nameDay = in.nextLine();
            System.out.println("Name Month: ");
            String nameMonth = in.nextLine();
            System.out.println("Number Date: ");
            int numberDate = in.nextInt();
            System.out.println("Name Day:: " + nameDay);
            System.out.println("Name Month: " + nameMonth);
            System.out.println("Number Date: " + numberDate);
            in.close();
    }
}
