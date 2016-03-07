package com.marsrover;

/**
 * Created by svya7818 on 7/03/2016.
 */
public class Move implements Signal {
    private Coordinates coordinates;

    public Move(Coordinates coordinates){
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates(){
        return this.coordinates;
    }

    public void execute() {
        if (coordinates.getDirection() == MarsRoverConstant.N) {
            this.coordinates.moveRoverInNorthDirection();
        } else if (coordinates.getDirection() == MarsRoverConstant.E) {
            this.coordinates.moveRoverInEastDirection();
        } else if (coordinates.getDirection() == MarsRoverConstant.S) {
            this.coordinates.moveRoverInSouthDirection();
        } else if (coordinates.getDirection() == MarsRoverConstant.W) {
            this.coordinates.moveRoverInWestDirection();
        }
    }
}
