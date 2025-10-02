package com.example.marsrover.direction;

import com.example.marsrover.model.Position;

public class South implements Direction {
    public static final South INSTANCE = new South();
    private South() {}

    @Override public Direction turnLeft() { return East.INSTANCE; }
    @Override public Direction turnRight() { return West.INSTANCE; }
    @Override public Position moveForward(Position pos) { return new Position(pos.x(), pos.y() - 1); }
    @Override public String getCardinalPoint() { return "South"; }
}