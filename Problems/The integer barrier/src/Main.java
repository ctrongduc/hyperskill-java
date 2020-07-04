import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        final int upper = 1000;
        while (true) {
            int in = scanner.nextInt();
            if (in == 0) {
                System.out.println(total);
                break;
            }
            total += in;
            if (total >= upper) {
                System.out.println(total - upper);
                break;
            }
        }
    }
}