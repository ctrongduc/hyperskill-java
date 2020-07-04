import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        long n1 = scanner.nextLong();
        String op = scanner.next();
        long n2 = scanner.nextLong();
        switch (op) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(n1 / n2);
                }
                break;
            case "*":
                System.out.println(n1 * n2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}