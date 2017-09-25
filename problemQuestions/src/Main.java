import java.util.Scanner;

/**
 * Created by tracxn-lp-175 on 25/9/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        Validatator validatator = new Validatator(message);
        validatator.validate();

    }
}
