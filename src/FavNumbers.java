import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        int favNum = 0;
        Scanner in = new Scanner(System.in);
        favNum = SafeInput.getInt(in, "What's your favorite integer?");
        double favDecimal = 0.00;
        new Scanner(System.in);
        favDecimal = SafeInput.getDouble(in, "How about your favorite number with a decimal?");
    }
}
