import java.util.Scanner;

public class Rot13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        String out = "";

        for(int i = 0 ;i < in.length();i++)
        {
            if(in.charAt(i) >= 'a' && in.charAt(i) <'n' || in.charAt(i) >= 'A' && in.charAt(i) <'N' )
                out += (char) ( in.charAt(i) + 13);
            else if (in.charAt(i) >= 'n' && in.charAt(i) <= 'z' || in.charAt(i) >= 'N' && in.charAt(i) <='Z')
                out += (char) (in.charAt(i) - 13);
            else out += in.charAt(i);
        }

        System.out.println(out);

    }

}