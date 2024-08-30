import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double mile = scanning.nextDouble();
        double kilo = mile * 1.6;
        kilo = Double.parseDouble(String.format("%.1f", kilo));
        System.out.println(mile + " miles is " + kilo + " kilometers");

    }
}