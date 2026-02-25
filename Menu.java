import java.util.Scanner;

public class Menu {
    static double totalAmount = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int mainChoice;
        do {
            System.out.println("\n====== WELCOME TO HOTEL ======");
            System.out.println("1. Tiffin");
            System.out.println("2. Lunch");
            System.out.println("3. Snacks");
            System.out.println("4. Tea & Coffee");
            System.out.println("5. Generate Bill & Exit");
            System.out.print("Enter your choice: ");
            mainChoice = sc.nextInt();
            switch (mainChoice) {
                case 1:
                    tiffin();
                    break;
                case 2:
                    lunch();
                    break;
                case 3:
                    snacks();
                    break;
                case 4:
                    teacoffee();
                    break;
                case 5:
                    Bill();
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (mainChoice != 5);
    }
    static void tiffin() {
        System.out.println("\n--- TIFFIN MENU ---");
        System.out.println("1. Idli - 30");
        System.out.println("2. Dosa - 50");
        System.out.println("3. Poori - 40");
        System.out.print("Select item: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: totalAmount += 30; break;
            case 2: totalAmount += 50; break;
            case 3: totalAmount += 40; break;
            default: System.out.println("Invalid Item!");
        }
    }
    static void lunch() {
        System.out.println("\n--- LUNCH MENU ---");
        System.out.println("1. Veg Thali - 120");
        System.out.println("2. Chicken Biryani - 180");
        System.out.println("3. Meals - 100");
        System.out.print("Select item: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: totalAmount += 120; break;
            case 2: totalAmount += 180; break;
            case 3: totalAmount += 100; break;
            default: System.out.println("Invalid Item!");
        }
    }
    static void snacks() {
        System.out.println("\n--- SNACKS MENU ---");
        System.out.println("1. Samosa - 20");
        System.out.println("2. Burger - 60");
        System.out.println("3. Pizza - 150");
        System.out.print("Select item: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: totalAmount += 20; break;
            case 2: totalAmount += 60; break;
            case 3: totalAmount += 150; break;
            default: System.out.println("Invalid Item!");
        }
    }
    static void teacoffee() {
        System.out.println("\n--- TEA & COFFEE MENU ---");
        System.out.println("1. Tea - 15");
        System.out.println("2. Coffee - 25");
        System.out.println("3. Boost - 30");
        System.out.print("Select item: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1: totalAmount += 15; break;
            case 2: totalAmount += 25; break;
            case 3: totalAmount += 30; break;
            default: System.out.println("Invalid Item!");
        }
    }
    static void Bill() {
        double gst = totalAmount * 0.05;
        double finalAmount = totalAmount + gst;
        System.out.println("\n====== FINAL BILL ======");
        System.out.println("Subtotal: " + totalAmount);
        System.out.println("GST (5%): " + gst);
        System.out.println("Total Amount: " + finalAmount);
        System.out.println("Thank You! Visit Again 😊");
    }
}