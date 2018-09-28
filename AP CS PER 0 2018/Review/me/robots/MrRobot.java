package me.robots;

import java.awt.Color;

import kareltherobot.Robot;

public class MrRobot extends Robot {
	public static final String DIRECTORY = "\\\\\\\\busd.local\\\\instruction\\\\Student-Home-Directories\\\\19vtovmasian\\\\git\\\\AP-CS-A\\\\AP CS PER 0 2018\\\\Review\\\\worlds\\\\";
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

	public void movePlace() {
		move();
		putBeeper();
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
		movePlace();
		movePlace();
		movePlace();
	}

	public void dropSprint() {
		placeMove();
		placeMove();
		placeMove();
	}

	public void sprintDrop(int i, int s) {
		for (int count = 0; count < i; count++) {
			skipBlocks(s);
			placeMove();
		}
	}

	public void dropSprint(int i, int s) {
		for (int count = 0; count < i; count++) {
			skipBlocks(s);
			movePlace();

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
	
	public void turnAround() {
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

	public void faceNorth() {
		if (!facingNorth()) {
			turnLeft();
		}
		if (!facingNorth()) {
			turnLeft();
		}
		if (!facingNorth()) {
			turnLeft();
		}
	}

	public void faceSouth() {
		if (!facingSouth()) {
			turnLeft();
		}
		if (!facingSouth()) {
			turnLeft();
		}
		if (!facingSouth()) {
			turnLeft();
		}
	}

	public void faceEast() {
		if (!facingEast()) {
			turnLeft();
		}
		if (!facingEast()) {
			turnLeft();
		}
		if (!facingEast()) {
			turnLeft();
		}
	}

	public void faceWest() {
		if (!facingWest()) {
			turnLeft();
		}
		if (!facingWest()) {
			turnLeft();
		}
		if (!facingWest()) {
			turnLeft();
		}
	}

	public boolean southIsBlocked() {
		if (facingSouth() && !frontIsClear()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getDirectory() {
		return DIRECTORY;
	}
	
	

}
