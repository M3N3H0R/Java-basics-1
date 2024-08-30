import java.util.Scanner;

public class Multiplay {
    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = scanning.nextInt();
        int ans = 1;
        while(num>0){
            int multiply = num % 10;
            ans *= multiply;
            num /= 10;

        }
        System.out.println("The multiplication of all digits in " + num + " is " + ans);
    }
}
