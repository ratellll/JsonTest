import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {

    public static void main(String[] args) throws IOException {
        String filePath = "/Users/ratel/Desktop/study/JsonTest/src/top20.csv";

        File file = new File(filePath);
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            System.out.println("파일내용 출력----------");
            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("--------------------");

            reader.close();
        }
    }
}
