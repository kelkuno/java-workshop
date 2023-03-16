package exceptions;

import java.io.File;
import java.io.IOException;

public class ExceptionsHandling
{
    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch(IOException e) {
            System.out.println("sorry, an error occurred: " + e.getMessage());
        }
    }
}
