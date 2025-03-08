import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        double costOfItem = 0;
        double costTotal = 0;
        boolean complete = false;
        System.out.println("Welcome to the $10 store checkout!");
        Scanner in = new Scanner(System.in);
        do {
            new Scanner(System.in);
            costOfItem = SafeInput.getRangedDouble(in, "Please enter the value of your item", .5, 10);
            costTotal = costTotal + costOfItem;
            new Scanner(System.in);
            complete = SafeInput.getYNConfirm(in, "Is that all? (Answer Y/N)");
        } while (!complete);
        System.out.printf("%s%.2f%n", "Your total is ", costTotal);
    }
}
