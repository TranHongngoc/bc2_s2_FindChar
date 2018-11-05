import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = "I love Viet Nam";

        int count = 0;

        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i) == ' '){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
