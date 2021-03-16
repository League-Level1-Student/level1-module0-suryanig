package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Random rand = new Random();
	Robot rob = new Robot();
	public void run() {
		
		rob.moveTo(785, 510);
		rob.setSpeed(10);
		rob.penDown();
		rob.setPenWidth(5);
	for (int i = 0; i < 10; i++) {
		//drawHouse(i * 50 + 50); 
		int r = rand.nextInt(3);
		if (r == 0) {
			drawHouse("small", Color.magenta);
		}
		else if(r == 1) {
			drawHouse("medium", Color.cyan);
		}
		else {
			drawHouse("large", Color.ORANGE);
		}
	}
	}
	public void drawHouse(int height, Color color) {
		rob.setAngle(0);
		rob.setPenColor(40,100,40);
		rob.turn(-90);
		rob.move(30);
		rob.setPenColor(color);
		rob.turn(90);
		rob.move(height);
		if (height > 200) {
			drawFlatRoof();
		}
		else {
			drawPointyRoof();
		}
		rob.move(height);
		rob.turn(90);
	}
	public void drawHouse(String size, Color color) {
		if (size.equals("small")) {
			drawHouse(60, color);
		}
		else if (size.equals("medium")) {
			drawHouse(120, color);
		}
		else {
			drawHouse(250, color);
		}
	}
	public void drawPointyRoof() {
		rob.turn(-45);
		rob.move(25);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-45);
	}
	public void drawFlatRoof() {
		rob.turn(-90);
		rob.move(40);
		rob.turn(-90);
	}
}
