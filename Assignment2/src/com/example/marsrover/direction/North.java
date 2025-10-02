package com.example.marsrover.direction;

import com.example.marsrover.model.Position;

public class North implements Direction {
    public static final North INSTANCE = new North();
    private North() {}

    @Override public Direction turnLeft() { return West.INSTANCE; }
    @Override public Direction turnRight() { return East.INSTANCE; }
    @Override public Position moveForward(Position pos) { return new Position(pos.x(), pos.y() + 1); }
    @Override public String getCardinalPoint() { return "North"; }
}