package com.example.marsrover.model;

import java.util.Set;

public class Grid {
    private final int width;
    private final int height;
    private final Set<Position> obstacles;

    public Grid(int width, int height, Set<Position> obstacles) {
        this.width = width;
        this.height = height;
        this.obstacles = obstacles;
    }

    public boolean isValidPosition(Position position) {
        boolean withinBounds = position.x() >= 0 && position.x() < width &&
                               position.y() >= 0 && position.y() < height;
        return withinBounds && !obstacles.contains(position);
    }
    public boolean isObstacle(Position position) {
        return obstacles.contains(position);
    }
}