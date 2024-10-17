import java.io.FileInputStream;
import java.io.IOException;

public class Task6_8_3 {
    public static void execute() throws IOException{
        FileInputStream fin = new FileInputStream("src/input683.txt");
        int currentChar;
        int numberCount = 0;
        while((currentChar = fin.read()) != -1){
            if(currentChar >= '0' && currentChar <= '9'){
                numberCount++;
            }
        }
        System.out.println("Numbers count: " + numberCount);
        fin.close();
    }
}
