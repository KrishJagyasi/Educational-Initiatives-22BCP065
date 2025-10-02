package com.example.marsrover.direction;

import com.example.marsrover.model.Position;

public class East implements Direction {
    public static final East INSTANCE = new East();
    private East() {}

    @Override public Direction turnLeft() { return North.INSTANCE; }
    @Override public Direction turnRight() { return South.INSTANCE; }
    @Override public Position moveForward(Position pos) { return new Position(pos.x() + 1, pos.y()); }
    @Override public String getCardinalPoint() { return "East"; }
}