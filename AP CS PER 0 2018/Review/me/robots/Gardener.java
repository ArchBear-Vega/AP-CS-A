package me.robots;

import java.awt.Color;

import kareltherobot.Directions;
import kareltherobot.World;

public class Gardener implements Directions {
	public static void main(String[] args) {
		MrRobot gardener = new MrRobot(2, 2, South, 28);
		
		gardener.turnLeft();
		gardener.sprint();
		gardener.move();
		gardener.turnLeft();
		gardener.putBeeper();
		
		gardener.sprintDrop();
		gardener.turnRight();
		gardener.gardenHero();
		
		gardener.turnRight();
		gardener.gardenHero();
		
		gardener.turnRight();
		gardener.gardenHero();
		
		gardener.turnRight();
		gardener.sprintDrop();
		
		gardener.turnRight();
		gardener.sprint();
		gardener.turnLeft();
		gardener.turnOff();
		
	}
	static {
		World.setDelay(15);
		World.readWorld("Lab2.wld");
		World.setVisible();
		World.setBeeperColor(Color.green);
	}
}
