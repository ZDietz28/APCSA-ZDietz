package Chapter8;

import java.awt.Point;

public class Robot {
	Point location;
	int direction;
	public Robot(Point startingLocation, int startingDirection) { //Note: 0 = North, 1 = East, 2 = South, 3 = West
		location = startingLocation;
		direction = startingDirection;
	}
	public void turnLeft() {
		direction --;
		if(direction == -1) {
			direction = 3;
		}
	}
	public void turnRight() {
		direction++;
		if(direction == 4) {
			direction = 0;
		}
	}
	public void move() {
		if(direction == 0) {
			location.move((int) location.getX(), (int) location.getY()-1);
			
		} else if(direction == 1) {
			location.move((int) location.getX()+1, (int) location.getY());
			
		} else if(direction == 2) {
			location.move((int) location.getX(), (int) location.getY()+1);
			
		} else {
			location.move((int) location.getX()-1, (int) location.getY());
			
		}
	}
	public Point getLocation() {
		return location;
	}
	public String getDirection() {
		if(direction == 0) {
			return "North";
		}else if(direction == 1) {
			return "East";
		} else if(direction == 2) {
			return "South";
		} 
		return "West";
	}
}
