import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task6_8_9 {
    private static void solution() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/data689.txt"));
        int affordableDifference = Integer.parseInt(scanner.nextLine());
        int charSum = 0;
        int wordCount = 0;
        double median;
        while (scanner.hasNextLine()){
            charSum += scanner.nextLine().length();
            wordCount++;
        }
        if(wordCount > 0){
            median = (double) charSum / wordCount;
        }
        else{
            return;
        }

        FileWriter writer = new FileWriter("src/output689.txt");
        writer.write(String.format("%.2f \n" , median));

        Scanner scanner1 = new Scanner(new FileInputStream("src/data689.txt"));
        scanner1.nextLine();

        while (scanner1.hasNextLine()){
            String currentLine = scanner1.nextLine();
            if (Math.abs(currentLine.length()-median) <= affordableDifference){
                writer.write(currentLine + "\n");
            }
        }

        writer.flush();

    }

    public static void execute() throws IOException {
        solution();
    }
}
