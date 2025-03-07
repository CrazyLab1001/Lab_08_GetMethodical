import java.util.Scanner;

public class SafeInput {
    public static void main(String[] args) {

    }

//        * @param pipe a Scanner opened to read from System.in
//     * @param prompt prompt for the user
//     * @return a String response that is not zero length
//     */

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;

    }
    public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Please print a valid input, unlike: " + trash);
            }
        } while (!done);
        return result;
} }
