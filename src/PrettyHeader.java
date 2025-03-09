import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args){
        String banner = "";
        String message = "Placeholder";
        Scanner in = new Scanner(System.in);
        message = SafeInput.getNonZeroLenString(in, "What is your message?");
        banner = SafeInput.prettyPrettyHeader(message);

    }
}
