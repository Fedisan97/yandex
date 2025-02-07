import java.util.Scanner;

public class DuplicateChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] numbers = input.split(" ");
        boolean[] seen = new boolean[1000001]; // Предполагаем, что числа не превышают 1 миллиона

        for (String number : numbers) {
            int value = Integer.parseInt(number);
            if (seen[value]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                seen[value] = true;
            }
        }
    }
}
