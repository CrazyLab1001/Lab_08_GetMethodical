import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;
        Scanner in = new Scanner(System.in);
        birthYear = SafeInput.getRangedInt(in, "What is your birth year? (1950 - 2015)", 1950, 2015);
        new Scanner (System.in);
        birthMonth = SafeInput.getRangedInt(in, "What is your birth month? (1 - 12)", 1, 12);
        switch (birthMonth) {
            case 1,3,5,7,8,10,12:
                new Scanner (System.in);
                birthDay = SafeInput.getRangedInt(in, "What is your birth day? (1 - 31)", 1, 31);
                break;
            case 2:
                new Scanner (System.in);
                birthDay = SafeInput.getRangedInt(in, "What is your birth day? (1 - 29)", 1, 31);
                break;
            default:
                new Scanner (System.in);
                birthDay = SafeInput.getRangedInt(in, "What is your birth day? (1 - 30)", 1, 30);
                break;

        }
        new Scanner(System.in);
        birthHour = SafeInput.getRangedInt(in, "What is your birth hour? (1 - 24)", 1, 24);
        new Scanner(System.in);
        birthMinute = SafeInput.getRangedInt(in, "What is your birth minute? (1 - 60)", 1, 60);
    }
}
