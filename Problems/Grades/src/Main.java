import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Map<Integer, Integer> grads = new HashMap<>();
        grads.put(5, 0);
        grads.put(4, 0);
        grads.put(3, 0);
        grads.put(2, 0);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int g = scanner.nextInt();
            grads.put(g, grads.get(g) + 1);
        }
        for (int i = 2; i <= 5; i++) {
            System.out.print(grads.get(i) + (i != 5 ? " " : ""));
        }
    }
}