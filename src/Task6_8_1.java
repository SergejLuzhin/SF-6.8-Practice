import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task6_8_1 {
    public static void execute() throws IOException {
        try{
            FileInputStream inputStream = new FileInputStream("src/input681.txt");
            Scanner scanner = new Scanner(inputStream);

            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

            System.out.println("\nEnd of file is reached!");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
