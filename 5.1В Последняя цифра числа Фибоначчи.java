import java.util.Scanner;

public class LastDigitFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(lastDigitFibonacci(n));
    }

    private static int lastDigitFibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        int previousLastDigit = 0;
        int currentLastDigit = 1;

        for (int i = 2; i <= n; i++) {
            int temp = currentLastDigit;
            currentLastDigit = (previousLastDigit + currentLastDigit) % 10;
            previousLastDigit = temp;
        }

        return currentLastDigit;
    }
}
