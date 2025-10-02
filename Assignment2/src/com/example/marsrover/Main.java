package com.example.marsrover;

import com.example.marsrover.command.Command;
import com.example.marsrover.command.MoveCommand;
import com.example.marsrover.command.TurnLeftCommand;
import com.example.marsrover.command.TurnRightCommand;
import com.example.marsrover.direction.*;
import com.example.marsrover.model.Grid;
import com.example.marsrover.model.Position;
import com.example.marsrover.model.Rover;
import java.util.*;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static final Map<Character, Direction> DIRECTION_FACTORY = Map.of(
        'N', North.INSTANCE,
        'S', South.INSTANCE,
        'E', East.INSTANCE,
        'W', West.INSTANCE
    );

    private static final Map<Character, Function<Rover, Command>> COMMAND_FACTORY = Map.of(
        'M', MoveCommand::new,
        'L', TurnLeftCommand::new,
        'R', TurnRightCommand::new
    );

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--- Mars Rover Interactive Simulation Setup ---");

            // 1. Get Grid Size
            System.out.print("Enter Grid Width: ");
            int gridWidth = scanner.nextInt();
            System.out.print("Enter Grid Height: ");
            int gridHeight = scanner.nextInt();
            scanner.nextLine(); 

            // 2. Get Rover's Starting Position
            Position startPosition = null;
            char startDirectionChar = ' ';
            while (startPosition == null) {
                System.out.print("Enter Starting Position (e.g., 0 0 N): ");
                String startLine = scanner.nextLine().trim().toUpperCase();
                String[] startParts = startLine.split("\\s+");
                try {
                    int startX = Integer.parseInt(startParts[0]);
                    int startY = Integer.parseInt(startParts[1]);
                    startDirectionChar = startParts[2].charAt(0);
                    if (!DIRECTION_FACTORY.containsKey(startDirectionChar)) {
                        throw new IllegalArgumentException("Invalid direction. Use N, S, E, or W.");
                    }
                    startPosition = new Position(startX, startY);
                } catch (Exception e) {
                    System.out.println("Invalid format. Please use format: X Y D (e.g., 1 2 N). Error: " + e.getMessage());
                }
            }

            // 3. Get Obstacles
            Set<Position> obstacles = new HashSet<>();
            System.out.println("Enter obstacle positions (e.g., 2 2), one per line. Type 'done' to finish.");
            while (true) {
                System.out.print("> ");
                String obstacleLine = scanner.nextLine().trim();
                if (obstacleLine.equalsIgnoreCase("done")) {
                    break;
                }
                String[] obstacleParts = obstacleLine.split("\\s+");
                try {
                    int obsX = Integer.parseInt(obstacleParts[0]);
                    int obsY = Integer.parseInt(obstacleParts[1]);
                    obstacles.add(new Position(obsX, obsY));
                    System.out.println("Added obstacle at (" + obsX + ", " + obsY + ").");
                } catch (Exception e) {
                    System.out.println("Invalid format. Please use format: X Y (e.g., 3 5).");
                }
            }

            // 4. Get Command String
            System.out.print("Enter the command string (e.g., MMRMLM): ");
            String commandString = scanner.nextLine().trim().toUpperCase();

            //  Simulation Starts Here 
            System.out.println("\n--- Starting Simulation ---");

            // 5. Setup environment from user input
            Grid grid = new Grid(gridWidth, gridHeight, obstacles);
            Direction startDirection = DIRECTION_FACTORY.get(startDirectionChar);
            Rover rover = new Rover(startPosition, startDirection, grid);

            System.out.println("\nInitial State: " + rover.getStatus());
            System.out.println("Commands to execute: " + commandString + "\n");

            // 6. Parse and execute commands (this logic is unchanged)
            List<Command> commands = commandString.chars()
                .mapToObj(c -> (char) c)
                .map(COMMAND_FACTORY::get)
                .filter(Objects::nonNull)
                .map(factoryFunc -> factoryFunc.apply(rover))
                .collect(Collectors.toList());

            commands.forEach(Command::execute);

            System.out.println("\n--- Simulation Complete ---");
            System.out.println("Final Position: " + rover.getStatus());

        } catch (Exception e) {
            LOGGER.severe("An unexpected error occurred: " + e.getMessage());
        }
    }
}