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
        rangedInt = SafeInput.getRangedInt(in, "Now I need a ranged number, 1 through 12! ", 1, 12);
        double rangedDouble = 0;
        new Scanner(System.in);
        rangedDouble = SafeInput.getRangedDouble(in, "Now a ranged number between 0.5 and 32.84! ", .5, 32.84);
        boolean forTrueYforFalseN;
        new Scanner(System.in);
        do {
        forTrueYforFalseN = SafeInput.getYNConfirm(in, "Do you want to stop with this question?"); } while (!forTrueYforFalseN);
        String regExOption = "";
        new Scanner(System.in);
        regExOption = getRegEXString(in, "Now insert your SSN ;)", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("DevTest over!");
    }
    private static String getRegEXString (Scanner pipe, String prompt, String regEXPattern) {
        String value = "";
        boolean done = false;
        do {
            System.out.println( "\n" + prompt + ": ");
            value = pipe.nextLine();
            value = value.toUpperCase();
            if (value.matches(regEXPattern)){
                done = true;
            } else {
                System.out.println("Invalid input! Please input a valid option, unlike: " + value);
            }
        } while (!done);
        return value; } 
}
