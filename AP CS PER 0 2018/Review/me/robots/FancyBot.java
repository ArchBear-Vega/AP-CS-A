package me.robots;

import kareltherobot.Directions;
import kareltherobot.Directions.Direction;

public class FancyBot {
	private MyRobot myRobot;
	private Direction dir;

	public FancyBot(MyRobot myRobot) {
		this.myRobot = myRobot;
	}
	
	public void turnRight() {
		dir = myRobot.getDirection();
		
		if(dir == Directions.East) {
			myRobot.setDirection(Directions.South);
		}
		else if(dir == Directions.West) {
			myRobot.setDirection(Directions.North);
		}
		else if(dir == Directions.South) {
			myRobot.setDirection(Directions.West);
		}
		else if(dir == Directions.North) {
			myRobot.setDirection(Directions.East);
		}
	}

	

}
