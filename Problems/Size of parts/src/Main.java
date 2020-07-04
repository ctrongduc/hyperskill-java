import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int nParts = scanner.nextInt();
        int nRejects = 0;
        int nRepairs = 0;
        int nShips = 0;
        for (int i = 0; i < nParts; i++) {
            int p = scanner.nextInt();
            if (p > 0) {
                nRepairs++;
            } else if (p < 0) {
                nRejects++;
            } else {
                nShips++;
            }
        }

        System.out.println(String.format("%d %d %d", nShips, nRepairs, nRejects));
    }
}