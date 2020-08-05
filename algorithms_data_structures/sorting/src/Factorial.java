import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Give me a number for calculating the factorial of it!");
        int input = myScanner.nextInt();
        System.out.println(fact(input));
    }

    public static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}
