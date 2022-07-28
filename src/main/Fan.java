package main;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Fan {
	private PropertyChangeSupport changes = new PropertyChangeSupport(this);
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
		int oldSpeed = speed;
		
		speed++;
		
		if (speed > 3)
			speed = 0;
		
		changes.firePropertyChange("speed", oldSpeed, speed);
	}
	
	public void reverseDirection() {
		changes.firePropertyChange("direction", clockwise, clockwise = !clockwise);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener listener) {
        changes.addPropertyChangeListener(listener);
    }
}
