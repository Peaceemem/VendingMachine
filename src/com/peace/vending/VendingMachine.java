package com.peace.vending;
import java.util.Scanner;
public class VendingMachine {
        public static void main(String[] args) {
            String[] menu = {"tea", "Espresso", "Americans", "water", "Hot chocolate"};

            Scanner scanner = new Scanner(System.in);
            int choice = getUserChoice(scanner, menu.length);

            if (choice != -1) {
                String selectedDrink = menu[choice];
                System.out.println("You have selected: " + selectedDrink);
            } else {
                System.out.println("Error: Invalid choice! Please select a number between 1 and " + menu.length + ".");
            }
        }

        public static int getUserChoice(Scanner scanner, int menuSize) {
            System.out.println("Welcome to the vending machine! Please select a drink (1-" + menuSize + "): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= menuSize) {
                return choice - 1;
            } else {
                return -1; // Indicates invalid choice
            }
        }
    }

