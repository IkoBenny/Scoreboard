package scoreboardapplication;

import java.util.ArrayList;

public class Model {

	private String homeTeam;

	private String awayTeam;

	private String logo;

	private String homeScore;

	private String awayScore;

	private String quarter;

	private String time;

	private boolean homeBonus;

	private boolean awayBonus;

	private String possesionArrow;

	private boolean power;

	private ArrayList<View> observers;

	public Model() {
	}

	public void togglePower() {
	}

	public void changeHomeName(String input) {
	}

	public void changeAwayName(String input) {
	}

	public void incrementHomeScore() {
	}

	public void decrementHomeScore() {
	}

	public void incrementAwayScore() {
	}

	public void toggleBonusHome() {
	}

	public void toggleBonusAway() {
	}

	public void togglePossesionArrow() {
	}

	public void startTime() {
	}

	public void stopTime() {
	}

	public void changeQuarter() {
	}

	public String getHomeName() {
		return null;
	}

	public String getAwayName() {
		return null;
	}

	public String getHomeScore() {
		return null;
	}

	public String getAwayScore() {
		return null;
	}

	public void setLogo(String name) {
	}

	public String getLogo() {
		return null;
	}

	public boolean getPowerStatus() {
		return false;
	}

	public String getPossessionArrow() {
		return null;
	}

	public boolean getHomeBonus() {
		return false;
	}

	public boolean getAwayBonus() {
		return false;
	}

	public String getTime() {
		return null;
	}

	public String getQuarter() {
		return null;
	}

	public void attatch(View observer) {
	}

	public void detatch(View observer) {
	}

	public void notfiy() {
	}

}
