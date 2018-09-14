package me.robots;

import java.awt.Color;

import kareltherobot.UrRobot;

public class MrRobot extends UrRobot {

	public MrRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		// TODO Auto-generated constructor stub
	}

	public MrRobot(int street, int avenue, Direction direction, int beepers, Color badgeColor) {
		super(street, avenue, direction, beepers, badgeColor);
		// TODO Auto-generated constructor stub
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
	
	public void sprintDrop() {
		move();
		putBeeper();
		move();
		putBeeper();
		move();
		putBeeper();
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
	

}
