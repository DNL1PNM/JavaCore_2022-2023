package lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Second Name: ");
        String SecondName = in.nextLine();
        System.out.println("Middle Name: ");
        String middleName = in.nextLine();
        System.out.print("Hello " + " " + name + " " + SecondName + " " + middleName );
        in.close();
    }
}
