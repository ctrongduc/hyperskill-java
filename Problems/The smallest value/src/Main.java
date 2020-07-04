import java.util.Scanner;
import java.util.stream.LongStream;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        int n = 2;
        while (factorial(n) <= m) {
            n++;
        }
        System.out.println(n);
    }

    private static long factorial(int n) {
        return LongStream.rangeClosed(1, n)
                .reduce(1, (long x, long y) -> x * y);
    }
}