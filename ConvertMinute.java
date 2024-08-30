import java.util.Scanner;

public class ConvertMinute {
    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minute = scanning.nextLong();

        long year = minute / 525600;
        long remainingMin = minute % 525600;
        long day = remainingMin / 1440;

        System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days.");

    }
}
