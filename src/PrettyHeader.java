import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args){
        String banner = "";
        String message = "Placeholder";
        Scanner in = new Scanner(System.in);
        message = SafeInput.getNonZeroLenString(in, "What is your message?");
        banner = prettyPrettyHeader(message);

    }
    private static String prettyPrettyHeader(String message){
        int messageLength = message.length();
        int spaceForCentering = (60 - messageLength - 6);
        spaceForCentering = spaceForCentering/2;
        for (int cnt = 1; cnt <= 60; cnt++) {
            System.out.print("*");
        }
        System.out.println();
        for (int cnt = 1; cnt <= 3; cnt++) {
            System.out.print("*");
        }
        for (int cnt = 1; cnt <= spaceForCentering; cnt++) {
            System.out.print(" ");
        }
        System.out.print(message);
        for (int cnt = 1; cnt <= spaceForCentering; cnt++) {
            System.out.print(" ");
        }
        for (int cnt = 1; cnt <= 3; cnt++) {
            System.out.print("*");
        }
        System.out.println();
        for (int cnt = 1; cnt <= 60; cnt++) {
            System.out.print("*");
        }
    return message;}
}
