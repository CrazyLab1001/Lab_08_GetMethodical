import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = "";
        username = SafeInput.getNonZeroLenString(in, "What is your username? ");
    }
}
