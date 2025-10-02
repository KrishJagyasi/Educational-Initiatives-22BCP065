package com.example.marsrover.direction;

import com.example.marsrover.model.Position;

public class West implements Direction {
    public static final West INSTANCE = new West();
    private West() {}

    @Override public Direction turnLeft() { return South.INSTANCE; }
    @Override public Direction turnRight() { return North.INSTANCE; }
    @Override public Position moveForward(Position pos) { return new Position(pos.x() - 1, pos.y()); }
    @Override public String getCardinalPoint() { return "West"; }
}