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
        randoDouble = SafeInput.getDouble(in, "Now give me a number with a decimal! ");
        int rangedInt = 0;
        new Scanner(System.in);
        rangedInt = getRangedInt(in, "Now I need a ranged number, 1 through 12! ", 1, 12);
    }

    private static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": ");
        if (pipe.hasNextInt())
        {
            result = pipe.nextInt();
            pipe.nextLine();
            if (result >= low && result <= high) {
                done = true;
            } else {
                System.out.println("Please put in the ranged input unlike the value: " + result );
            }
        } else
            trash = pipe.nextLine();
            System.out.println("Please insert a valid input unlike: " + trash );
        } while (!done);
    return result; }
}
