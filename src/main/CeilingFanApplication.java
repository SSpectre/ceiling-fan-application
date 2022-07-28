package main;

import javax.swing.*;

public class CeilingFanApplication {
	
	public CeilingFanApplication() {
		JFrame frame = new JFrame("Ceiling Fan Application");
		frame.setSize(300, 150);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
		
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));
		
		JPanel speedPanel = new JPanel();
		JPanel directionPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		JLabel speedLabel = new JLabel("Speed:");
		JLabel speedValue = new JLabel("0");
		JLabel directionLabel = new JLabel("Direction:");
		JLabel directionValue = new JLabel("Clockwise");
		
		speedPanel.add(speedLabel);
		speedPanel.add(speedValue);
		
		directionPanel.add(directionLabel);
		directionPanel.add(directionValue);
		
		labelPanel.add(speedPanel);
		labelPanel.add(directionPanel);
		
		JButton speedButton = new JButton("Speed Cord");
		JButton directionButton = new JButton("Direction Cord");
		
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
