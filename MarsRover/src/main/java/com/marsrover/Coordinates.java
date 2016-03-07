package com.marsrover;

/**
 * Created by svya7818 on 6/03/2016.
 */
public class Coordinates {

    private Integer x = 0;
    private Integer y = 0;
    private Integer direction = 0;

    public Coordinates(Integer x, Integer y,Integer direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getX() {

        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer moveRoverInEastDirection(){
       return this.x++;
    }

    public Integer moveRoverInWestDirection(){
        return this.x--;
    }

    public Integer moveRoverInNorthDirection(){
        return this.y++;
    }

    public Integer moveRoverInSouthDirection(){
        return this.y--;
    }
}
