import java.util.Scanner;

public class CoffeeHW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Coffee");
        System.out.println("1 - Espresso");
        System.out.println("2 - Americano");
        System.out.println("3 - Cappuccino");
        System.out.println("4 - Water");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Your Espresso is ready");
        } else if (choice == 2) {
            System.out.println("Your Americano is ready");
        } else if (choice == 3) {
            System.out.println("Your Cappuccino is ready");
        } else if (choice == 4) {
            System.out.println("Your water is ready");
        } else {
            System.out.println("Wrong choice");
        }
    }

    public static void Switch(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a Coffee");
        System.out.println("1 - Espresso");
        System.out.println("2 - Americano");
        System.out.println("3 - Cappuccino");
        System.out.println("4 - Water");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your Espresso is ready");
                break;
            case 2:
                System.out.println("Your Americano is ready");
                break;
            case 3:
                System.out.println("Your Cappuccino is ready");
                break;
            case 4:
                System.out.println("Your Water is ready");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }

    }

}
