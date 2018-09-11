package me.robots;

import java.util.Scanner;
import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class RobotPractice implements Directions{
	public static void main(String[]args) {
		boolean doEnd = false;
		UrRobot karel = new UrRobot(2, 7, West, 0);
		Scanner input = new Scanner(System.in);
		while(!doEnd) {
			doEnd = input.nextBoolean();
		
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
			karel.move();
		}
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
