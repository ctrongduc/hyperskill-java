import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        do {
            int el = scanner.nextInt();
            if (el != 0) {
                cnt++;
            } else {
                break;
            }
        } while (true);

        System.out.println(cnt);
    }
}