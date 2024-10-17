import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6_8_6 {
    private static int getMul() throws FileNotFoundException {
        int result = 1;

        Scanner scanner = new Scanner(new FileInputStream("src/data686.txt"));

        int limit = Integer.parseInt(scanner.nextLine());
        String[] strings = scanner.nextLine().split(" ");
        int[] delimiters = new int[strings.length];

        for (int i = 0; i < delimiters.length; i++) {
            delimiters[i] = Integer.parseInt(strings[i]);
        }

        for (int i = 1; i <= limit; i++) {
            for (int delimiter : delimiters) {
                if (i % delimiter == 0) {
                    result *= i;
                    break;
                }
            }
        }
        return result;
    }

    public static void execute() throws FileNotFoundException {
        System.out.printf("Result: %d", getMul());
    }
}
