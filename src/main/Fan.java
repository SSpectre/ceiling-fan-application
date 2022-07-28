package main;

public class Fan {
	private int speed;
	private boolean clockwise;
	
	public Fan() {
		speed = 0;
		clockwise = true;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public boolean isClockwise() {
		return clockwise;
	}
	
	public void changeSpeed() {
		speed++;
		
		if (speed > 3)
			speed = 0;
	}
	
	public void reverseDirection() {
		clockwise = !clockwise;
	}
}
