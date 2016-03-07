package com.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by svya7818 on 7/03/2016.
 */
public class LeftTest {

    private Coordinates roverCoordinates;

    private Left leftSingal;

    @Before
    public void beforeLeftTest() {

    }

    @Test
    public void test_rover_moving_left_with_direction_north() throws Exception {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.N);
        leftSingal = new Left(roverCoordinates);
        Integer expected = MarsRoverConstant.W;
        leftSingal.execute();
        assertThat(leftSingal.getCoordinates().getDirection()).isEqualTo(expected);
    }


    @Test
    public void test_rover_moving_left_with_direction_east() throws Exception {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.E);
        leftSingal = new Left(roverCoordinates);
        Integer expected = MarsRoverConstant.N;
        leftSingal.execute();
        assertThat(leftSingal.getCoordinates().getDirection()).isEqualTo(expected);
    }

    @Test
    public void test_rover_moving_left_with_direction_south() throws Exception {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.S);
        leftSingal = new Left(roverCoordinates);
        Integer expected = MarsRoverConstant.E;
        leftSingal.execute();
        assertThat(leftSingal.getCoordinates().getDirection()).isEqualTo(expected);
    }

    @Test
    public void test_rover_moving_left_with_direction_west() throws Exception {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.W);
        leftSingal = new Left(roverCoordinates);
        Integer expected = MarsRoverConstant.S;
        leftSingal.execute();
        assertThat(leftSingal.getCoordinates().getDirection()).isEqualTo(expected);
    }


}
