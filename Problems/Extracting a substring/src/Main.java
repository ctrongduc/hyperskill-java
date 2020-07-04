import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt() + 1;

        System.out.println(in.substring(start, end));
    }
}