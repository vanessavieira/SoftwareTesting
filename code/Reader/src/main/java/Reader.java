import java.io.FileInputStream;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) {
        String path = "/Users/vanessa.vieira/Documents/GitHub/aluno-15/code/Reader/testReader.txt";

        readAll(path);

    }

    public static void readAll(String path) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(path);

            System.out.println("Total file size to read (in bytes) : "+ fileInputStream.available());

            int content;
            while ((content = fileInputStream.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
