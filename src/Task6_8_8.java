import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6_8_8 {
    private static boolean arePalindromes() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/strings688.txt"));

        while (scanner.hasNextLine()) {
            String currentLine = scanner.nextLine().toLowerCase().replace(" ", "");
            if (!currentLine.equals(new StringBuilder(currentLine).reverse().toString())) return false;
        }

        return true;
    }

    public static void execute() throws FileNotFoundException {
        System.out.println(arePalindromes());
    }
}
