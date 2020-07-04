import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();
        System.out.println(in.charAt(0) == 'j' || in.charAt(0) == 'J');
    }
}