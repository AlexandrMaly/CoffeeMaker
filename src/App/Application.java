package App;

import Coffee.CoffeeCappuccino;
import Coffee.CoffeeEspresso;
import Coffee.CoffeeLatte;
import View.Display;

import java.util.Scanner;

public class Application {
    private static Display display = new Display();
    private static Scanner sc = new Scanner(System.in);

    public static void appStart() {
        display.display();
        handleChoice(choice());
    }

    private static int choice() {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
            return -1;
        }
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1 -> new CoffeeEspresso().drinkCoffee();
            case 2 -> new CoffeeCappuccino().drinkCoffee();
            case 3 -> new CoffeeLatte().drinkCoffee();
            case 4 -> System.exit(0);
            default -> Application.appStart();
        }
    }
}
