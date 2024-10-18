import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6_8_17 {
    private static final int MAP_SIZE = 10;

    private static int findMaxQuantity() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("src/forest.txt"));
        int[][] forest = new int[MAP_SIZE][MAP_SIZE];
        int a = 0;

        while (scanner.hasNextLine()){
            String[] currentLine = scanner.nextLine().split(";");
            for(int b = 0; b < MAP_SIZE; b++){
                forest[a][b] = Integer.parseInt(currentLine[b]);
            }
            a++;
        }

        for (int i = 1; i < 10; i++) {
            forest[i][0] += forest[i - 1][0];
            forest[0][i] += forest[0][i - 1];
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                forest[i][j] += Math.max(forest[i - 1][j], forest[i][j - 1]);
            }
        }

        return forest[9][9];
    }

    public static void execute() throws FileNotFoundException {
        System.out.println(findMaxQuantity());
    }
}
