import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();

        int total = 0;
        int divider = 10;
        while (n > 0) {
            total += n % divider;
            n = n / divider;
            if (n < 10) {
                total += n;
                break;
            }
        }
        System.out.println(total);
    }
}