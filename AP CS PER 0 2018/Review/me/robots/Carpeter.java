package me.robots;

import java.awt.Color;

public class Carpeter extends MrRobot {

	public Carpeter(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);

	}

	public Carpeter(int street, int avenue, Direction direction, int beepers, Color badgeColor) {
		super(street, avenue, direction, beepers, badgeColor);

	}

	public boolean isRoom() {
		boolean isRoom;
		while (!frontIsClear()) {
			turnLeft();
		}
		isRoom = facingSouth() ? true : false;

		faceSouth();

		return isRoom;

	}

	@Override
	public void move() {
		turnLeft();
		super.move();
		faceEast();
	}

	public void exitRoom() {
		super.move();
		turnLeft();
		super.move();
	}

}
