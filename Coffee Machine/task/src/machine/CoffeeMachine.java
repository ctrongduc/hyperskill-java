package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400, milk = 540, beans = 120, cups = 9, money = 550;

    public static void main(String[] args) {
        coffeeMachineStage4();
    }

    private static void coffeeMachineStage4() {
        Scanner scanner = new Scanner(System.in);
        printMachineState();
        System.out.println();
        System.out.println("Write action (buy, fill, take):");
        String in = scanner.next();
        switch (in) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            default:
                System.out.println("invalid option!");
                break;
        }
        System.out.println();
        printMachineState();
    }

    private static void buy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int in = scanner.nextInt();
        switch (in) {
            case 1: // espresso
                if (water >= 250 && beans >= 16) {
                    water -= 250;
                    beans -= 16;
                    cups -= 1;
                    money += 4;
                } else {
                    System.out.println("Do not have enough ingredients!");
                }
                break;
            case 2: // latte
                if (water >= 350 && milk >= 75 && beans >= 20) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    cups -= 1;
                    money += 7;
                } else {
                    System.out.println("Do not have enough ingredients!");
                }
                break;
            case 3: // cappuccino
                if (water >= 200 && milk >= 100 && beans >= 12) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                } else {
                    System.out.println("Do not have enough ingredients!");
                }
                break;
            default:
                System.out.println("invalid option!");
                break;
        }
    }

    private static void fill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
    }

    private static void take(){
        money = 0;
    }

    private static void printMachineState() {
        System.out.println("The coffee machine has:");
        System.out.println(String.format("%d of water", water));
        System.out.println(String.format("%d of milk", milk));
        System.out.println(String.format("%d of coffee beans", beans));
        System.out.println(String.format("%d of disposable cups", cups));
        System.out.println(String.format("%d of money", money));
    }

    private static void coffeeMachineStage1() {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }

    private static  void coffeeMachineStage2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int n = scanner.nextInt();
        final int water = 200; // ml
        final int milk = 50; // ml
        final int bean = 15; // g
        System.out.println("For " + n + " cups of coffee you will need:");
        System.out.println(n * water + " ml of water");
        System.out.println(n * milk + " ml of milk");
        System.out.println(n * bean + " g of coffee beans");
    }

    private static void coffeeMachineStage3() {
        Scanner scanner = new Scanner(System.in);

        final int waterRequired = 200; // ml
        final int milkRequired = 50; // ml
        final int beanRequired = 15; // g

        System.out.println("Write how many ml of water the coffee machine has:");
        int waterInStock = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkInStock = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeInStock = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int n = scanner.nextInt();

        int waterToCup = waterInStock / waterRequired;
        int milkToCup = milkInStock / milkRequired;
        int coffeeToCup = coffeeInStock / beanRequired;

        int cupCanMake = Math.min(Math.min(waterToCup,milkToCup), coffeeToCup);
        if (cupCanMake == n) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupCanMake > n) {
            System.out.println(String.format("Yes, I can make that amount of coffee (and even %d more than that)"
                    , cupCanMake - n));
        } else {
            System.out.println(String.format("No, I can make only %d cup(s) of coffee", cupCanMake));
        }

    }
}
