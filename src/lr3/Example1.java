package lr3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Input correct data ");
        int numberOfDay = in.nextInt();

        String name;

        switch (numberOfDay) {
                case 1:
                    name = "Sunday";
                    break;
                case 2:
                    name = "Monday";
                    break;
                case 3:
                    name = "Tuesday";
                    break;
                case 4:
                    name = "Wednesday";
                    break;
                case 5:
                    name = "Thursday";
                    break;
                case 6:
                    name = "Friday";
                    break;
                case 7:
                    name = "Saturday";
                    break;

                default:
                    name= "input not correct";
                    break;
            }

            out.println(name);
            out.flush();

        }
}
