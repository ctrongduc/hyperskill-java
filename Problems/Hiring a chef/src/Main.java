//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String firstName;
        String cuisinePref;

        firstName = scanner.next();
        scanner.next();
        scanner.next();
        scanner.next();
        cuisinePref = scanner.next();

        System.out.print("The form for " + firstName +
                " is completed. We will contact you if we need a chef that cooks "
                + cuisinePref +" dishes.");

        scanner.close();
    }
}