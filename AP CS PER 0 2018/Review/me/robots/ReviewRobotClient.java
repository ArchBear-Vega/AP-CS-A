package me.robots;

import kareltherobot.*;

public class ReviewRobotClient implements Directions {
	public static void main(String[] args) {
		ReviewRobot robot1 = new ReviewRobot(1, 2, East, 0);
		robot1.jump();

		ReviewRobot robot2 = new ReviewRobot(1, 6, North, 0);
		robot2.harvestAllToWall();

		ReviewRobot robot3 = new ReviewRobot(9, 2, North, 1);
		if (robot3.backIsClear())
			robot3.putBeeper();

		ReviewRobot robot4 = new ReviewRobot(9, 4, North, 1);
		if (robot4.backIsClear())
			robot4.putBeeper();

		ReviewRobot robot5 = new ReviewRobot(9, 8, East, 12);
		int numBeepers = robot5.countBeepers();
		System.out.println(numBeepers);
		robot5.move();
		numBeepers = robot5.countBeepers();
		System.out.println(numBeepers);
	}

	static {
		World.reset();
		World.setDelay(10);
		World.readWorld("\\\\busd.local\\instruction\\Student-Home-Directories\\19vtovmasian\\git\\AP-CS-A\\AP CS PER 0 2018\\Review\\worlds\\Review.wld");
		World.setVisible(true);
	}
}
