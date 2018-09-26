package me.robots;

import java.awt.Color;

public class MazeWalker extends MrRobot {

	public MazeWalker(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public MazeWalker(int street, int avenue, Direction direction, int beepers, Color badgeColor) {
		super(street, avenue, direction, beepers, badgeColor);
		// TODO Auto-generated constructor stub
	}

	public void followWallRight() {
		if (!frontIsClear()) {
			turnLeft();
		} else {
			move();
			turnRight();
			if (frontIsClear()) {
				move();
				turnRight();
				if (frontIsClear()) {
					move();
				} else {
					turnLeft();
				}
			} else {
				turnLeft();
			}
		}
	}

}
