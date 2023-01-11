import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mod37 {
    public static void main(String[] args) {
        String flag = "";
        String MAP  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
        File msg = new File("message.txt");
        try {
            Scanner read = new Scanner(msg);
            String contant = read.nextLine();
            String[] numbers =  contant.split(" ");

            for( String value : numbers)
            {
                int number  = Integer.parseInt(value);
                flag += MAP.charAt(number % 37);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("picoCTF{"+flag+"}");

    }
}
