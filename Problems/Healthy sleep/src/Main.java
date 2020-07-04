import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int lower = scanner.nextInt();
        int higher = scanner.nextInt();
        int slept = scanner.nextInt();

        if (slept < lower) {
            System.out.println("Deficiency");
        } else if (slept > higher) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}