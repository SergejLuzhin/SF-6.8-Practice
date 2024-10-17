import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task6_8_7 {
    private static String writeOrder() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/numbers687.txt"));
        String resultString = "";
        int index = 1;

        while (scanner.hasNextLine()) {
            String currentNumber = scanner.nextLine();
            if (Integer.parseInt(currentNumber) == index) {
                resultString += currentNumber + " ";
            }
            index++;
        }

        if (resultString.equals(" ")) {
            resultString = "0";
        }

        return resultString;
    }

    public static void execute() throws IOException {
        FileWriter writer = new FileWriter("src/output687.txt");
        writer.write(writeOrder().trim());
        writer.flush();

        Scanner scanner = new Scanner(new FileInputStream("src/output687.txt"));
        String result = scanner.nextLine();
        System.out.println(result);
    }
}
