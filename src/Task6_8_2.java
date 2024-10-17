import java.util.Scanner;

public class Task6_8_2 {
    public static void execute(){
        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++) {
            System.out.print(scanner.nextInt());
        }
        System.out.println();
    }
}
