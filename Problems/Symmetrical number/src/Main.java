import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int unit = n % 10;
        int thousandth = n / 1000;
        int hundredth = (n % 1000) / 100;
        int tenth = (n % 100) / 10;

        if (unit == thousandth && hundredth == tenth) {
            System.out.println(1);
        } else {
            System.out.println(31);
        }
    }
}