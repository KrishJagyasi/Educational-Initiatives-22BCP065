package com.example.marsrover.model;

import com.example.marsrover.direction.Direction;
import java.util.logging.Logger;

public class Rover {
    private static final Logger LOGGER = Logger.getLogger(Rover.class.getName());
    private Position position;
    private Direction direction;
    private final Grid grid;
    private int obstaclesDetected = 0; 

    public Rover(Position startPosition, Direction startDirection, Grid grid) {
        this.position = startPosition;
        this.direction = startDirection;
        this.grid = grid;
        LOGGER.info("Rover initialized at " + getStatus());
    }

    public void move() {
        Position nextPosition = direction.moveForward(this.position);
        if (grid.isValidPosition(nextPosition)) {
            this.position = nextPosition;
            LOGGER.info("Rover moved to " + this.position);
        } else {
            LOGGER.warning("Move blocked. Cannot move to " + nextPosition + ". Obstacle or boundary detected.");
            if (grid.isObstacle(nextPosition)) {
                this.obstaclesDetected++;
                LOGGER.info("Obstacle detected at " + nextPosition + ". Total obstacles detected: " + this.obstaclesDetected);
            }
        }
    }

    public void turnLeft() {
        this.direction = direction.turnLeft();
        LOGGER.info("Rover turned left, now facing " + direction.getCardinalPoint());
    }

    public void turnRight() {
        this.direction = direction.turnRight();
        LOGGER.info("Rover turned right, now facing " + direction.getCardinalPoint());
    }

    // --- UPDATED: The getStatus() method now includes the obstacle count ---
    public String getStatus() {
        String report = String.format("Rover is at %s facing %s.", position, direction.getCardinalPoint());
        if (this.obstaclesDetected > 0) {
            report += String.format(" %d obstacle(s) were detected during the mission.", this.obstaclesDetected);
        } else {
            report += " No obstacles were detected during the mission.";
        }
        return report;
    }
}