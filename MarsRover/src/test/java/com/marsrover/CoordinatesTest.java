package com.marsrover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import com.marsrover.MarsRoverConstant;

/**
 * Created by svya7818 on 7/03/2016.
 */
public class CoordinatesTest {

    private Coordinates roverCoordinates;

    @Before
    public void beforeRoverTest() {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.N);
    }

    @Test
    public void test_rover_moving_north_direction() throws Exception {
        Integer expected = roverCoordinates.getY() + 1;
        roverCoordinates.moveRoverInNorthDirection();
        assertThat(roverCoordinates.getY()).isEqualTo(expected);
    }

    @Test
    public void test_rover_moving_south_direction() throws Exception {
        Integer expected = roverCoordinates.getY() - 1;
        roverCoordinates.moveRoverInSouthDirection();
        assertThat(roverCoordinates.getY()).isEqualTo(expected);
    }

    @Test
    public void test_rover_moving_east_direction() throws Exception {
        Integer expected = roverCoordinates.getX() + 1;
        roverCoordinates.moveRoverInEastDirection();
        assertThat(roverCoordinates.getX()).isEqualTo(expected);
    }

    @Test
    public void test_rover_moving_west_direction() throws Exception {
        Integer expected = roverCoordinates.getX() - 1;
        roverCoordinates.moveRoverInWestDirection();
        assertThat(roverCoordinates.getX()).isEqualTo(expected);
    }

}
