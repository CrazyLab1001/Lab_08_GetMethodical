import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = "";
        username = SafeInput.getNonZeroLenString(in, "What is your username? ");
        int randoNum = 0;
        new Scanner(System.in);
        randoNum = SafeInput.getInt(in, "Give me a random number! ");
        double randoDouble = 0.00;
        new Scanner(System.in);
        randoDouble = getDouble(in, "Now give me a number with a few decimals! ");

    }
    private static double getDouble(Scanner pipe, String prompt) {
        double result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Please print a valid input, unlike: " + trash);
            }
        } while (!done);
        return result;
    }
}
