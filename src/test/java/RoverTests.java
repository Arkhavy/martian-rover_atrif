import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTests {
    @Test
    public void GivenNoCommands_Move_ReturnsTheSamePosition()
    {
        Command[] commands = {  };
        Position result = Rover.move(new Position(0,0,Orientation.N), Arrays.asList(commands));
        assertEquals(new Position(0,0,Orientation.N), result);
    }
}
