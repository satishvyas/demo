package com.marsrover;

/**
 * Created by svya7818 on 7/03/2016.
 */
public class Right implements Signal {

    private Coordinates coordinates;

    public Right(Coordinates coordinates){
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates(){
        return this.coordinates;
    }

    public void execute() {
        coordinates.setDirection((coordinates.getDirection() +  1) > MarsRoverConstant.W ? MarsRoverConstant.N : coordinates.getDirection() + 1);
    }
}
