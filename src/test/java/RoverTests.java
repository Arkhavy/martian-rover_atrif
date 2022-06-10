import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTests
{
	@Test
	public void GivenNoCommands_Move_ReturnsTheSamePosition()
	{
		Command[] commands = {  };
		Position start = new Position(0,0,Orientation.N);
		Position result = Rover.move(start, Arrays.asList(commands));
		assertEquals(new Position(0,0,Orientation.N), result);
	}

	//Turn Left Tests
	@Test
	public void GivenTurnLeftFromNorth_TurnLeft_ReturnsOrientation()
	{
		Command[] commands = { Command.Left };
		Position start = new Position(0,0,Orientation.N);
		Position result = Rover.turnLeft(start);
		assertEquals(new Position(start.getX(), start.getY(), Orientation.W), result);
	}
	
	@Test
	public void GivenTurnLeftFromWest_TurnLeft_ReturnsOrientation()
	{
		Command[] commands = { Command.Left };
		Position start = new Position(0,0,Orientation.W);
		Position result = Rover.turnLeft(start);
		assertEquals(new Position(start.getX(), start.getY(), Orientation.S), result);
	}
	
	@Test
	public void GivenTurnLeftFromSouth_TurnLeft_ReturnsOrientation()
	{
		Command[] commands = { Command.Left };
		Position start = new Position(0,0,Orientation.S);
		Position result = Rover.turnLeft(start);
		assertEquals(new Position(start.getX(), start.getY(), Orientation.E), result);
	}
	
	@Test
	public void GivenTurnLeftFromEast_TurnLeft_ReturnsOrientation()
	{
		Command[] commands = { Command.Left };
		Position start = new Position(0,0,Orientation.E);
		Position result = Rover.turnLeft(start);
		assertEquals(new Position(start.getX(), start.getY(), Orientation.N), result);
	}
	
	//Turn Right Tests
	@Test
	public void GivenTurnRightFromNorth_TurnRight_ReturnsOrientation()
	{
		Command[] commands = { Command.Right };
		Position start = new Position(0,0,Orientation.N);
		Position result = Rover.turnRight(start);
		assertEquals(new Position(start.getX(), start.getY(), Orientation.E), result);
	}
	
	@Test
	public void GivenTurnRightFromWest_TurnRight_ReturnsOrientation()
	{
		Command[] commands = { Command.Right };
		Position start = new Position(0,0,Orientation.W);
		Position result = Rover.turnRight(start);
		assertEquals(new Position(start.getX(), start.getY(), Orientation.N), result);
	}
	
	@Test
	public void GivenTurnRightFromSouth_TurnRight_ReturnsOrientation()
	{
		Command[] commands = { Command.Right };
		Position start = new Position(0,0,Orientation.S);
		Position result = Rover.turnRight(start);
		assertEquals(new Position(start.getX(), start.getY(), Orientation.W), result);
	}
	
	@Test
	public void GivenTurnRightFromEast_TurnRight_ReturnsOrientation()
	{
		Command[] commands = { Command.Right };
		Position start = new Position(0,0,Orientation.E);
		Position result = Rover.turnRight(start);
		assertEquals(new Position(start.getX(), start.getY(), Orientation.S), result);
	}

	//Advance Tests
	@Test
	public void GivenAdvanceFromNorth_Advance_ReturnsPosition()
	{
		Command[] commands = { Command.Advance };
		Position start = new Position(0,0,Orientation.N);
		Position result = Rover.Advance(start);
		assertEquals(new Position(start.getX(),start.getY() + 1,start.getO()), result);
	}
	
	@Test
	public void GivenAdvanceFromSouth_Advance_ReturnsPosition()
	{
		Command[] commands = { Command.Advance };
		Position start = new Position(0,0,Orientation.S);
		Position result = Rover.Advance(start);
		assertEquals(new Position(start.getX(),start.getY() - 1,start.getO()), result);
	}
	
	@Test
	public void GivenAdvanceFromEast_Advance_ReturnsPosition()
	{
		Command[] commands = { Command.Advance };
		Position start = new Position(0,0,Orientation.E);
		Position result = Rover.Advance(start);
		assertEquals(new Position(start.getX() + 1,start.getY(),start.getO()), result);
	}
	
	@Test
	public void GivenAdvanceFromWest_Advance_ReturnsPosition()
	{
		Command[] commands = { Command.Advance };
		Position start = new Position(0,0,Orientation.W);
		Position result = Rover.Advance(start);
		assertEquals(new Position(start.getX() - 1,start.getY(),start.getO()), result);
	}

	@Test
	public void GivenAdvanceFromWest_Move_ReturnsPosition()
	{
		Command[] commands = { Command.Advance };
		Position start = new Position(0,0,Orientation.W);
		Position result = Rover.Advance(start);
		assertEquals(new Position(start.getX() - 1,start.getY(),start.getO()), result);
	}

}
