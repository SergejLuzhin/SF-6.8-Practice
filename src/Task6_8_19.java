import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//ZIP BMP TXT
public class Task6_8_19 {
    private static String convertToMaxUnits(int sizeInBytes){
        if (sizeInBytes == 0){
            return "0 B";
        }
        else if (sizeInBytes / 1024 >= 1024){
            return String.format("%d MB", sizeInBytes / (1024 * 1024));
        } else if (sizeInBytes / 1024 < 1) {
            return String.format("%d B", sizeInBytes);
        }
        else{
            return String.format("%d KB", sizeInBytes / 1024);
        }
    }

    private static int sizeToBytes(int size, String measure){
        return switch (measure) {
            case "B" -> size;
            case "KB" -> size * 1024;
            case "MB" -> size * 1024 * 1024;
            default -> 0;
        };
    }

    private static void solution() throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/files6819.txt"));
        int totalZIPsize = 0; //Bytes
        int totalBMPsize = 0;
        int totalTXTsize = 0;
        StringBuilder ZIPfilesNames = new StringBuilder();
        StringBuilder BMPfilesNames = new StringBuilder();
        StringBuilder TXTfilesNames = new StringBuilder();

        while(scanner.hasNextLine()){
            String[] currentLine = scanner.nextLine().split(" ");
            if(currentLine[0].contains(".zip")){
                ZIPfilesNames.append(currentLine[0]).append("\n");
                totalZIPsize += sizeToBytes(Integer.parseInt(currentLine[1]), currentLine[2]);
            }
            else if (currentLine[0].contains(".bmp")){
                BMPfilesNames.append(currentLine[0]).append("\n");
                totalBMPsize += sizeToBytes(Integer.parseInt(currentLine[1]), currentLine[2]);
            }
            else if (currentLine[0].contains(".txt")){
                TXTfilesNames.append(currentLine[0]).append("\n");
                totalTXTsize += sizeToBytes(Integer.parseInt(currentLine[1]), currentLine[2]);
            }
        }

        FileWriter writer = new FileWriter("src/output6819.txt");

        if (totalZIPsize > 0){
           writer.write(String.format("%s------------\nSummary: %s \n\n", ZIPfilesNames, convertToMaxUnits(totalZIPsize)));
        }
        if (totalBMPsize > 0){
            writer.write(String.format("%s------------\nSummary: %s \n\n", BMPfilesNames, convertToMaxUnits(totalBMPsize)));
        }
        if (totalTXTsize > 0){
            writer.write(String.format("%s------------\nSummary: %s \n\n", TXTfilesNames, convertToMaxUnits(totalTXTsize)));
        }

        writer.flush();
    }

    public static void execute() throws IOException{
        solution();
    }
}
