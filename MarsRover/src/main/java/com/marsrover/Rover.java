package com.marsrover;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by svya7818 on 6/03/2016.
 */
public class Rover {


    private Coordinates coordinates;
    private Map<Character,Object> signalMap;

    public Rover(Coordinates coordinates) {
          this.coordinates = coordinates;
          signalMap = new HashMap<Character,Object>();
          signalMap.put('L', new Left(coordinates));
          signalMap.put('R', new Right(coordinates));
          signalMap.put('M', new Move(coordinates));
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void startRoverNavigation(String signals) {
        for (int idx = 0; idx < signals.length(); idx++  ) {
            navigateRoverBySignal(signals.charAt(idx));
        }
    }
    private void navigateRoverBySignal(Character signal) {
        signal = Character.toUpperCase(signal);
        if(signalMap.containsKey(signal)){
            Signal signalCommand = (Signal) signalMap.get(signal);
            signalCommand.execute();
        }else{
            throw new IllegalArgumentException(
                    "Invalid Signal!");
        }

    }

    public String getRoverPosition() {
        char dir = 'N';
        if (coordinates.getDirection() == 1) {
            dir = 'N';
        } else if (coordinates.getDirection() == 2) {
            dir = 'E';
        } else if (coordinates.getDirection() == 3) {
            dir = 'S';
        } else if (coordinates.getDirection() == 4) {
            dir = 'W';
        }
        System.out.println(this.coordinates.getX() +  " " +  this.coordinates.getY() +  " "  + dir);
        return this.coordinates.getX() +  " " +  this.coordinates.getY() +  " "  + dir;
    }

    public static void main(String args[]) {
        Coordinates coordinates = new Coordinates(1,2,MarsRoverConstant.N);
        Rover rover1 = new Rover(coordinates);
        rover1.setCoordinates(coordinates);
        rover1.startRoverNavigation("LMLMLMLMM");
        rover1.getRoverPosition(); // prints 1 3 N
        Coordinates coordinates1 = new Coordinates(3,3,MarsRoverConstant.E);
        Rover rover2 = new Rover(coordinates1);
        rover2.setCoordinates(coordinates1);
        rover2.startRoverNavigation("MMRMMRMRRM");
        rover2.getRoverPosition(); // prints 5 1 E
    }
}
