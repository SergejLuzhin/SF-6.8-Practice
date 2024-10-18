import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task6_8_14 {
    private static void solution() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/ariphmetic6814.txt"));
        FileWriter writer = new FileWriter("src/answers6814.txt");
        String[] elements;
        while (scanner.hasNextLine()){
            elements = scanner.nextLine().split(" ");
            int num1 = Integer.parseInt(elements[0]);
            int num2 = Integer.parseInt(elements[2]);

            switch (elements[1]){
                case "+":
                    writer.write(String.format("%d + %d = %d \n", num1, num2, num1 + num2));
                    break;
                case "-":
                    writer.write(String.format("%d - %d = %d \n", num1, num2, num1 - num2));
                    break;
                case "*":
                    writer.write(String.format("%d * %d = %d \n", num1, num2, num1 * num2));
                    break;
                case "/":
                    writer.write(String.format("%d / %d = %d \n", num1, num2, num1 / num2));
                    break;
            }
        }

        writer.flush();
    }

    public static void execute() throws IOException{
        solution();
    }
}
