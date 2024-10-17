import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task6_8_4 {
    public static void execute() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/receipt684.txt"));

        double result = 0;

        while (scanner.hasNextLine()){
            String[] productInfo = scanner.nextLine().split(";");
            result += Integer.parseInt(productInfo[1]) * Double.parseDouble(productInfo[2]);
        }

        String resultLine = String.format(Locale.US, "\nTotal price: %.2f", result);
        System.out.println(resultLine);
    }
}
