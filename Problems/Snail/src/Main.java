import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int days = 0;
        int curr = 0;
        while (curr < h) {
            days++;
            curr += a;
            if (curr >= h) {
                break;
            }
            curr -= b;
        }

        System.out.println(days);
    }
}