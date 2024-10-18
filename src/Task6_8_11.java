import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6_8_11 {

    private static void solution(double limit) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/EGE.txt"));
        String[] passedSubjects;

        scanner.nextLine();
        while(scanner.hasNextLine()){
            passedSubjects = scanner.nextLine().split(";");
            if(Double.parseDouble(passedSubjects[2]) >= limit){
                System.out.println(passedSubjects[0]);
            }
        }
    }

    public static void execute() throws FileNotFoundException {
        solution(80);
    }
}
