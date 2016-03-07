package com.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by svya7818 on 7/03/2016.
 */
public class MoveTest {

    private Coordinates roverCoordinates;

    private Move moveSingal;

    @Before
    public void beforeMoveTest() {

    }

    @Test
    public void test_rover_when_recive_move_signal_remains_in_same_direction() throws Exception {
        roverCoordinates = new Coordinates(1,2,MarsRoverConstant.N);
        moveSingal = new Move(roverCoordinates);
        Integer expected = MarsRoverConstant.N;
        moveSingal.execute();
        assertThat(moveSingal.getCoordinates().getDirection()).isEqualTo(expected);
    }

}
