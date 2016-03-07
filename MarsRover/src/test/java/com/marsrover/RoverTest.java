

package com.marsrover;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import com.marsrover.MarsRoverConstant;

/**
 * Created by svya7818 on 6/03/2016.†
 */


public class RoverTest {
    private Rover rover;
    private Coordinates roverCoordinates;


    @Before
    public void beforeRoverTest() {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.N);
        rover = new Rover(roverCoordinates);
        rover.setCoordinates(roverCoordinates);
    }

    @Test
    public void test_rover_moving_forward_with_signal_m_with_direction_North() throws Exception {
        Integer expected = roverCoordinates.getY() + 1;
        rover.startRoverNavigation("M");
        assertThat(rover.getCoordinates().moveRoverInNorthDirection()).isEqualTo(expected);
    }

    @Test
    public void test_rover_turning_left_with_signal_l_with_direction_West() throws Exception {
        rover.startRoverNavigation("L");
        assertThat(rover.getCoordinates().getDirection()).isEqualTo(MarsRoverConstant.W);
    }

    @Test
    public void test_rover_turning_left_with_signal_R_with_direction_East() throws Exception {
        rover.startRoverNavigation("R");
        assertThat(rover.getCoordinates().getDirection()).isEqualTo(MarsRoverConstant.E);
    }

   @Test
    public void test_rover_signal_should_ignore_case() throws Exception {
        rover.startRoverNavigation("r");
        assertThat(rover.getCoordinates().getDirection()).isEqualTo(MarsRoverConstant.E);
    }

     @Test(expected = Exception.class)
    public void test_rover_should_throw_exception_when_signal_is_unknown() throws Exception {
        rover.startRoverNavigation("X");
    }

    @Test
    public void receiveCommandsShouldBeAbleToReceiveMultipleCommands() throws Exception {
        int expected = roverCoordinates.getX() + 1;
        rover.startRoverNavigation("RMR");
        assertThat(rover.getCoordinates().getX()).isEqualTo(expected);
        assertThat(rover.getCoordinates().getDirection()).isEqualTo(MarsRoverConstant.S);
    }


    @Test
    public void positionShouldReturnXYAndDirection() throws Exception {
        rover.startRoverNavigation("LMLMLMLMM");
        assertThat(rover.getRoverPosition()).isEqualTo("1 3 N");
    }

}
