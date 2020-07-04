import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        boolean isSorted = true;
        int prevEl = Integer.MIN_VALUE;
        char sorted = ' ';
        while (true) {
            int in = scanner.nextInt();
            if (in == 0) {
                break;
            }
            if (prevEl == Integer.MIN_VALUE) {
                prevEl = in;
                continue;
            }
            if (sorted == ' ') {
                if (prevEl > in) {
                    sorted = 'D';
                } else if (prevEl < in) {
                    sorted = 'A';
                }
            }
            if (sorted == 'A' && prevEl > in) {
                isSorted = false;
                break;
            }
            if (sorted == 'D' && prevEl < in) {
                isSorted = false;
                break;
            }
            prevEl = in;
        }
        System.out.println(isSorted);
    }
}