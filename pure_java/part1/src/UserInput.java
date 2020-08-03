import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter<=9) {
            System.out.printf("Please enter your #%d number\n", counter);
            boolean isInt = myScanner.hasNextInt();

            if (isInt) {
                sum += myScanner.nextInt();
                counter++;

            } else {
                System.out.println("invalid number");
            }


        }

        System.out.println("The sum of numbers is " + sum);
    }
}
