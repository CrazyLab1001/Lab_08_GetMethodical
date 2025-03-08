import java.sql.SQLOutput;
import java.util.Scanner;

public class Reggie {
    public static void main (String[] args) {
        String SSNTotally = "";
        Scanner in = new Scanner(System.in);
        new Scanner(System.in);
        SSNTotally = SafeInput.getRegEXString(in, "Insert your SSN ;)", "\\d{3}-\\d{2}-\\d{4}");
        String bearcatID = "";
        new Scanner(System.in);
        bearcatID = SafeInput.getRegEXString(in, "Insert your Bearcat ID ;)", "^(M|m)\\d{5}");
        String menuChoice = "";
        new Scanner(System.in);
        menuChoice = SafeInput.getRegEXString(in, "Open, Save, View, or Quit? (O/S/V/Q)", "^[OoSsVvQq]$");
        switch (menuChoice) {
            case "O":
                System.out.println("Open? Open what? Haha!");
                break;
            case "S":
                System.out.println("I already saved your information, silly. :)");
                break;
            case "V":
                System.out.println(SSNTotally + " " + bearcatID);
                break;
            case "Q":
                System.out.println("Quitting!");
                break;
        }
        System.out.println("I'm going to rob your identity now! Bye bye!!");
    }
}
