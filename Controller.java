package scoreboardapplication;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

public class Controller implements ActionListener{
	View gui;
	Model m;

	public Controller() {
		System.out.println("Controller created...");
	}

	public void togglePower() {
		System.out.println("hitting power button...");
		m.togglePower();
	}

	public void menu() {
		System.out.println("hitting menu button...");
	}

	public void incrementHomeScore() {
		System.out.println("Incrementing home score...");
		m.incrementHomeScore();
	}

	public void incrementAwayScore() {
		System.out.println("Incrementing away score...");
		m.incrementAwayScore();
	}

	public void decrementHomeScore() {
		System.out.println("Decrementing home score...");
		m.decrementHomeScore();
	}

	public void decrementAwayScore() {
		System.out.println("Decrementing away score...");
		m.decrementAwayScore();
	}

	public void toggleHomeBonus() {
		System.out.println("Hitting home bonus button...");
		m.toggleBonusHome();
	}

	public void toggleAwayBonus() {
		System.out.println("Hitting away bonus button...");
		m.toggleBonusAway();
		gui.getAwayBonus().setEnabled(m.getAwayBonus());
	}

	public void startTime() {
		System.out.println("Hitting start time button...");
		m.startTime();
	}

	public void stopTime() {
		System.out.println("Hitting stop time button...");
		m.stopTime();
	}

	public void togglePossessionArrow() {
		System.out.println("Hitting possesion arrow button...");
		m.togglePossesionArrow();
	}

	//listens for events from buttons in View class
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("A button press is being responded to...");
		if(e.getSource() == gui.getButton("incrementButtonHome"))
			incrementHomeScore();
		else if(e.getSource() == gui.getButton("stopButton"))
			stopTime();
		else if(e.getSource() == gui.getButton("possesionButton"))
			togglePossessionArrow();
		else if(e.getSource() == gui.getButton("startButton"))
			startTime();
		else if(e.getSource() == gui.getButton("menuButton"))
			menu();
		else if(e.getSource()== gui.getButton("zeroButton"))
			;
		else if(e.getSource()== gui.getButton("oneButton"))
			;
		else if(e.getSource()== gui.getButton("twoButton"))
			;
		else if(e.getSource()== gui.getButton("threeButton"))
			;
		else if(e.getSource()== gui.getButton("fourButton"))
			;
		else if(e.getSource()== gui.getButton("fiveButton"))
			;
		else if(e.getSource()== gui.getButton("sixButton"))
			;
		else if(e.getSource()== gui.getButton("sevenButton"))
			;
		else if(e.getSource()== gui.getButton("eightButton"))
			;
		else if(e.getSource()== gui.getButton("nineButton"))
			;
		else if(e.getSource()== gui.getButton("powerButton"))
			togglePower();
		else if(e.getSource()== gui.getButton("incrementButtonAway"))
			incrementAwayScore();
		else if(e.getSource()== gui.getButton("decrementButtonHome"))
			decrementHomeScore();
		else if(e.getSource()== gui.getButton("decrementButtonAway"))
			decrementAwayScore();		
	}

	//establishes a Model and View for this Controller
	public void setViewAndModel(Model m, View gui) {
		this.gui = gui;
		this.m = m;
	}

	// called whenever GUI needs to update
	public void update() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				gui.getHomeName().setText(m.getHomeName());
				gui.getAwayName().setText(m.getAwayName());
				//gui.getsetText(subject.getTime());
				gui.getQuarter().setText(m.getQuarter());
				gui.getArrow().setText(m.getPossessionArrow());
				gui.getHomeBonus().setSelected(m.getHomeBonus());
				gui.getAwayBonus().setSelected(m.getAwayBonus());
				//gui.getlogo.setText(subject.getLogo());
				gui.getHomeScore().setText(m.getHomeScore());
				//gui.getHomeScore().repaint();
				gui.getAwayScore().setText(m.getAwayScore());
			}
		});
	}

}