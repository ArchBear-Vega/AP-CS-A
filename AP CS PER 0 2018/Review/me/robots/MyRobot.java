package me.robots;

import java.awt.Color;

import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.Directions.Direction;

public class MyRobot extends UrRobot {
	private Direction direction;
	private int street;
	private int avenue;
	private int beepers;
	private Color color;
	private Direction dir;
	private Direction newDir;
	private int dirVal;

	public MyRobot(int street, int avenue, Direction direction, int beepers, Color badgeColor) {
		super(street, avenue, direction, beepers, badgeColor);
		this.setStreet(street);
		this.setAvenue(avenue);
		this.setBeepers(beepers);
		this.setDirection(direction);

	}

	public Direction getDirection() {
		
		return direction;
	}

	public void setDirection(Direction direction) {
		
		remove();
		
		new MyRobot(street,avenue,direction,beepers,color);
			
	}

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public int getAvenue() {
		return avenue;
	}

	public void setAvenue(int avenue) {
		this.avenue = avenue;
	}

	public int getBeepers() {
		return beepers;
	}

	public void setBeepers(int beepers) {
		this.beepers = beepers;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void remove() {
		turnLeft();
		turnOff();
	}
}
