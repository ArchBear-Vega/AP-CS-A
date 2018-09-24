package me.robots;

import kareltherobot.Directions;
import kareltherobot.World;

public class RobotPractice implements Directions {
	public static void main(String[] args) {
		MrRobot karel = new MrRobot(2, 7, West, 0);

		karel.move();
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
