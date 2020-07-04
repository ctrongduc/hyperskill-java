import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String in1 = scanner.nextLine();
        String in2 = scanner.nextLine();

        String str1 = in1.replace(" ", "");
        String str2 = in2.replace(" ", "");

        System.out.println(str1.equals(str2));
    }
}