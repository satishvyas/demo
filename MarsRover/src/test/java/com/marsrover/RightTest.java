package com.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by svya7818 on 7/03/2016.
 */
public class RightTest {

    private Coordinates roverCoordinates;

    private Right rightSingal;

    @Before
    public void beforeRightTest() {

    }

    @Test
    public void test_rover_moving_right_with_direction_north() throws Exception {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.N);
        rightSingal = new Right(roverCoordinates);
        Integer expected = MarsRoverConstant.E;
        rightSingal.execute();
        assertThat(rightSingal.getCoordinates().getDirection()).isEqualTo(expected);
    }


    @Test
    public void test_rover_moving_right_with_direction_east() throws Exception {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.E);
        rightSingal = new Right(roverCoordinates);
        Integer expected = MarsRoverConstant.S;
        rightSingal.execute();
        assertThat(rightSingal.getCoordinates().getDirection()).isEqualTo(expected);
    }

    @Test
    public void test_rover_moving_right_with_direction_south() throws Exception {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.S);
        rightSingal = new Right(roverCoordinates);
        Integer expected = MarsRoverConstant.W;
        rightSingal.execute();
        assertThat(rightSingal.getCoordinates().getDirection()).isEqualTo(expected);
    }

    @Test
    public void test_rover_moving_right_with_direction_west() throws Exception {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.W);
        rightSingal = new Right(roverCoordinates);
        Integer expected = MarsRoverConstant.N;
        rightSingal.execute();
        assertThat(rightSingal.getCoordinates().getDirection()).isEqualTo(expected);
    }

}
