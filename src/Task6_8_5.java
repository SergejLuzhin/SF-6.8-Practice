import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6_8_5 {
    private static int getCountWords() throws FileNotFoundException {
        int wordCount = 0;

        Scanner scanner = new Scanner(new FileInputStream("src/test685.txt"));

        while (scanner.hasNextLine()){
            String[] words = scanner.nextLine().split(" ");
            wordCount += words.length;
        }

        return wordCount;
    }

    public static void execute() throws FileNotFoundException {
        System.out.println(getCountWords());
    }
}
