package scoreboardapplication;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

public class Controller implements ActionListener{
	//the model and view that this controller will communicate with
	View gui;
	Model m;
	
	//constructor for Controller class
	public Controller() {
		System.out.println("Controller created...");
	}

	//turn this scoreboard on/off
	public void togglePower() {
		System.out.println("hitting power button...");
		m.togglePower();
	}

	//displays menu for user
	public void menu() {
		System.out.println("hitting menu button...");
	}

	//increments score for home team for this scoreboard
	public void incrementHomeScore() {
		System.out.println("Incrementing home score...");
		m.incrementHomeScore();
	}

	//increments score for away team for this scoreboard
	public void incrementAwayScore() {
		System.out.println("Incrementing away score...");
		m.incrementAwayScore();
	}

	//decrements home score for this scoreboard
	public void decrementHomeScore() {
		System.out.println("Decrementing home score...");
		m.decrementHomeScore();
	}

	//decrements away score for this scoreboard
	public void decrementAwayScore() {
		System.out.println("Decrementing away score...");
		m.decrementAwayScore();
	}

	//toggle home bonus on/off
	public void toggleHomeBonus() {
		System.out.println("Hitting home bonus button...");
		m.toggleBonusHome();
	}

	//toggle away bonus on/off
	public void toggleAwayBonus() {
		System.out.println("Hitting away bonus button...");
		m.toggleBonusAway();
	}

	//starts time on Scoreboard
	public void startTime() {
		System.out.println("Hitting start time button...");
		m.startTime();
	}

	//stops time on Scoreboard
	public void stopTime() {
		System.out.println("Hitting stop time button...");
		m.stopTime();
	}

	//toggles possession arrow on Scoreboard
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
		else if(e.getSource() == gui.getButton("possessionButton"))
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
				gui.getQuarter().setText(m.getQuarter());
				gui.getArrow().setText(m.getPossessionArrow());
				gui.getHomeBonus().setSelected(m.getHomeBonus());
				gui.getAwayBonus().setSelected(m.getAwayBonus());
				gui.getHomeScore().setText(m.getHomeScore());
				gui.getAwayScore().setText(m.getAwayScore());
			}
		});
	}

}