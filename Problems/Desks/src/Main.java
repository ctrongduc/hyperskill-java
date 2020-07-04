import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int g1 = scanner.nextInt();
        int g2 = scanner.nextInt();
        int g3 = scanner.nextInt();

        int total = 0;
        total = g1 / 2;
        total += g1 % 2;
        total += g2 / 2;
        total += g2 % 2;
        total += g3 / 2;
        total += g3 % 2;

        System.out.println(total);
    }
}