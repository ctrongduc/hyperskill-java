import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int nBridges = scanner.nextInt();
        int crashedBridge = 0;

        for (int i = 1; i <= nBridges; i++) {
            int nH = scanner.nextInt();
            if (nH <= height) {
                crashedBridge = i;
                break;
            }
        }

        if (crashedBridge == 0) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + crashedBridge);
        }
    }
}