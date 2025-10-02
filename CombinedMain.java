import com.example.marsrover.Main;
import java.util.Scanner;

public class CombinedMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            printMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            try {
                switch (choice.toLowerCase()) {
                    case "1":
                        StrategyDemo.main(null);
                        break;
                    case "2":
                        ObserverDemo.main(null);
                        break;
                    case "3":
                        FactoryMethodDemo.main(null);
                        break;
                    case "4":
                        BuilderDemo.main(null);
                        break;
                    case "5":
                        AdapterDemo.main(null);
                        break;
                    case "6":
                        DecoratorDemo.main(null);
                        break;
                    case "7":
                        // We call the Mars Rover's main method by its full package name
                        Main.main(null);
                        break;
                    case "exit":
                        keepRunning = false;
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("An error occurred while running the demo: " + e.getMessage());
                e.printStackTrace();
            }

            if (keepRunning) {
                System.out.println("\nPress Enter to return to the menu...");
                scanner.nextLine();
            }
        }
        System.out.println("Exiting application. Thank you!");
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Main Menu ---");
        System.out.println("Assignment 1: Design Patterns");
        System.out.println("  Behavioural:");
        System.out.println("    1. Strategy Pattern Demo");
        System.out.println("    2. Observer Pattern Demo");
        System.out.println("  Creational:");
        System.out.println("    3. Factory Method Pattern Demo");
        System.out.println("    4. Builder Pattern Demo");
        System.out.println("  Structural:");
        System.out.println("    5. Adapter Pattern Demo");
        System.out.println("    6. Decorator Pattern Demo");
        System.out.println("---------------------------------");
        System.out.println("Assignment 2: Mars Rover Simulation");
        System.out.println("    7. Run Mars Rover");
        System.out.println("---------------------------------");
        System.out.println("Type 'exit' to quit.");
    }
}