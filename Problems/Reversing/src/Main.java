import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt();
        int hundredth = n / 100;
        int tenth = (n % 100) / 10;
        int unit = (n % 100) % 10;
        System.out.println(unit * 100 + tenth * 10 + hundredth);
    }
}