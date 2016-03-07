package com.marsrover;

/**
 * Created by svya7818 on 7/03/2016.
 */
public class Left implements Signal {
    private Coordinates coordinates;

    public Left(Coordinates coordinates){
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates(){
        return this.coordinates;
    }

    public void execute() {
        coordinates.setDirection((coordinates.getDirection() - 1) < MarsRoverConstant.N ? MarsRoverConstant.W : coordinates.getDirection() - 1);
    }
}
