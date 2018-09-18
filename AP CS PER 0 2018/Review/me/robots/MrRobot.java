package me.robots;

import java.awt.Color;

import kareltherobot.UrRobot;

public class MrRobot extends UrRobot {

	public MrRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public MrRobot(int street, int avenue, Direction direction, int beepers, Color badgeColor) {
		super(street, avenue, direction, beepers, badgeColor);
	}

	public void placeMove() {
		putBeeper();
		move();

	}

	public void sprint() {
		move();
		move();
		move();
	}

	public void sprint(int i) {
		for (int count = 0; count < i; count++) {
			move();
		}
	}

	public void sprintDrop() {
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
	}

	public void sprintDrop(int i, int s) {
		for (int count = 0; count < i; count++) {
			skipBlocks(s);
			putBeeper();
			move();

		}
	}

	public void skipBlocks(int s) {
		for (int count = 0; count < s; count++) {
			move();
		}
	}

	public void uTurn(boolean isLeft) {
		if (isLeft) {
			turnLeft();
			move();
			turnLeft();
			move();
		} else {
			turnRight();
			move();
			turnRight();
			move();
		}
	}

	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

	public void plantCorners() {
		turnLeft();
		move();
		putBeeper();
		turnLeft();
	}

	public void gardenHero() {
		sprintDrop();
		plantCorners();
		sprintDrop();
	}

	public void returnOrigin() {

	}

}
