import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        double foodCostPerDay = scanner.nextDouble();
        double flightCost = scanner.nextDouble() * 2;
        double hotelCostPerNight = scanner.nextDouble();

        System.out.println(Math.round(duration * foodCostPerDay + flightCost + (duration - 1) * hotelCostPerNight));
    }
}