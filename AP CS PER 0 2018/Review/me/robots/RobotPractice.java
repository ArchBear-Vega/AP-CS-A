package me.robots;

import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class RobotPractice implements Directions{
	public static void main(String[]args) {
		
		UrRobot karel = new UrRobot(2, 7, West, 0);
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.pickBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.putBeeper();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnOff();
		
	}
	
	static {
		World.reset();
		World.setDelay(20);
		World.setVisible(true);
		World.placeBeepers(2, 5, 1);
		World.placeNSWall(2, 5, 1);
	}
}