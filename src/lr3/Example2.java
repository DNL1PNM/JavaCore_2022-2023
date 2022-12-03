package lr3;

import java.io.PrintWriter;
import java.util.Scanner;

public class Example2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Input correct name of day ");
        String name = in.nextLine();

        int numberOfDay;

        switch (name) {
            case "Sunday":
                numberOfDay = 1;
                break;
            case "Monday":
                numberOfDay = 2;
                break;
            case "Tuesday":
                numberOfDay = 3;
                break;
            case "Wednesday":
                numberOfDay = 4;
                break;
            case "Thursday":
                numberOfDay = 5;
                break;
            case "Friday":
                numberOfDay = 6;
                break;
            case "Saturday":
                numberOfDay = 7;
                break;

            default:
                numberOfDay= 0;
                break;

        }
        if (numberOfDay == 0) {
            out.println("The Day is doesn't exist");
        }
        out.flush();

    }
}

