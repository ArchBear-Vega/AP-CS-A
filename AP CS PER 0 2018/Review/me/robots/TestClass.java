package me.robots;

import java.awt.Color;

import kareltherobot.Directions;
import kareltherobot.World;

public class TestClass implements Directions {

	public static void main(String[] args) {
		MrRobot jay = new MrRobot(1, 1, South, 0, Color.GRAY);
		
		jay.faceNorth();
		
	}
	static {
		World.setVisible();
		World.setNeutroniumColor(Color.MAGENTA);
	}

}
