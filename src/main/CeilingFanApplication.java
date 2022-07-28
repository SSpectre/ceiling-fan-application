package main;

import java.awt.Component;

import javax.swing.*;

public class CeilingFanApplication {
	
	public CeilingFanApplication() {
		Fan fan = new Fan();
		
		JFrame frame = new JFrame("Ceiling Fan Application");
		frame.setSize(350, 110);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		
		JPanel labelPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));
		
		JLabel speedLabel = new JLabel("Speed: " + Integer.toString(fan.getSpeed()));
		speedLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		fan.addPropertyChangeListener(e -> {
			if (e.getPropertyName() == "speed") {
				speedLabel.setText("Speed: " + Integer.toString(fan.getSpeed()));
			}
		});
		
		JLabel directionLabel = new JLabel("Direction: " + (fan.isClockwise() ? "Clockwise" : "Counter-Clockwise"));
		directionLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		fan.addPropertyChangeListener(e -> {
			if (e.getPropertyName() == "direction") {
				directionLabel.setText("Direction: " + (fan.isClockwise() ? "Clockwise" : "Counter-Clockwise"));
			}
		});
		
		labelPanel.add(speedLabel);
		labelPanel.add(directionLabel);
		
		JButton speedButton = new JButton("Speed Cord");
		JButton directionButton = new JButton("Direction Cord");
		speedButton.addActionListener(e -> fan.changeSpeed());
		directionButton.addActionListener(e -> fan.reverseDirection());
		
		buttonPanel.add(speedButton);
		buttonPanel.add(directionButton);
		
		frame.add(labelPanel);
		frame.add(buttonPanel);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new CeilingFanApplication();
	}

}
