import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();

        int y = 0;
        while (m * Math.pow(1.0 + p * 1.0 / 100, y) < k) {
            y++;
        }
        System.out.println(y);
    }
}