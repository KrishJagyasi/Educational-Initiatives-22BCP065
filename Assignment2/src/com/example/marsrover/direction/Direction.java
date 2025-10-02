package com.example.marsrover.direction;

import com.example.marsrover.model.Position;

public interface Direction {
    Direction turnLeft();
    Direction turnRight();
    Position moveForward(Position currentPosition);
    String getCardinalPoint();
}