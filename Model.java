package scoreboardapplication;

public class Model {
	//internal state of a ScoreBoard
	private String homeName;
	private String awayName;
	private String logo;
	private String homeScore;
	private String awayScore;
	private String quarter;
	private String time;
	private boolean homeBonus;
	private boolean awayBonus;
	private String possessionArrow;
	private boolean power = false;

	//constructor for Model
	public Model() {
		System.out.println("Model created...");
		togglePower();
	}

	//turns scoreboard on
	public synchronized void togglePower() {
		if(power) 
			power = false;
		else {
			homeName = "HOME";
			awayName = "AWAY";
			logo = "Designing Individuals Perspectives LLC";
			homeScore = "0";
			awayScore = "0";
			quarter = "1";
			time = "8:00";
			homeBonus = false;
			awayBonus = false;
			possessionArrow = "POSS - <";
		}
	}

	//Sets home team name for this Scoreboard
	public synchronized void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	//Sets away team name for this Scoreboard
	public synchronized void setAwayName(String awayName) {
		this.awayName = awayName;
	}

	//Sets home team score for this Scoreboard
	public synchronized void setHomeScore(String homeScore) {
		this.homeScore = homeScore;
	}

	//Sets away team score for this Scoreboard
	public synchronized void setAwayScore(String awayScore) {
		this.awayScore = awayScore;
	}

	//Sets the quarter for this Scoreboard
	public synchronized void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	//Sets the time for this Scoreboard
	public synchronized void setTime(String time) {
		this.time = time;
	}

	//Sets the home bonus for this Scoreboard
	public synchronized void setHomeBonus(boolean homeBonus) {
		this.homeBonus = homeBonus;
	}

	//Sets the away bonus for this Scoreboard
	public synchronized void setAwayBonus(boolean awayBonus) {
		this.awayBonus = awayBonus;
	}

	//sets Power for this Scoreboard
	public synchronized void setPower(boolean power) {
		this.power = power;
	}

	//sets new team name on scoreboard
	public synchronized void changeHomeName(String input) {
		homeName = input;
	}

	//sets new team name on scoreboard
	public synchronized void changeAwayName(String input) {
		awayName = input;
	}

	//increments the home team score by one
	public synchronized void incrementHomeScore() {
		//get int value of homeScore
		int hs = Integer.parseInt(homeScore);
		//record String value of new value
		homeScore = Integer.toString(++hs);	
	}

	//decrements the home team score by one
	public synchronized void decrementHomeScore() {
		//get int value of homeScore
		int hs = Integer.parseInt(homeScore);
		//record String value of new value
		homeScore = Integer.toString(--hs);		
	}

	//increments the away team score by one
	public synchronized void incrementAwayScore() {
		//get int value of awayScore
		int as = Integer.parseInt(awayScore);
		//record String value of new value
		awayScore = Integer.toString(++as);	
	}

	//decrements the away team score by one
	public synchronized void decrementAwayScore() {
		//get int value of awayScore
		int as = Integer.parseInt(awayScore);
		//record String value of new value
		awayScore = Integer.toString(--as);	
	}

	//turns on indicator for home team bonus penalty
	public synchronized void toggleBonusHome() {
		if(homeBonus)
			homeBonus = false;
		else 
			homeBonus = true;
	}

	//turns on indicator for away team bonus penalty
	public synchronized void toggleBonusAway() {
		if(awayBonus)
			awayBonus = false;
		else 
			awayBonus = true;
	}

	//controls the possesion arrow indicator on scoreboard 
	public synchronized void togglePossesionArrow() {
		System.out.println(possessionArrow);
		if(possessionArrow.equals("POSS - <"))
			possessionArrow = "POSS - >";
		else 
			possessionArrow = "POSS - <";	
		System.out.println(possessionArrow);
	}

	//sets String value for this Scoreboard's possession arrow
	public void setPossessionArrow(String possessionArrow) {
		this.possessionArrow = possessionArrow;
	}

	public synchronized void startTime() {
	}

	public synchronized void stopTime() {
	}

	//changes the quarter, incrementally, one quarter at a time
	public synchronized void changeQuarter() {
		//get int value of quarter
		int qtr = Integer.parseInt(quarter);
		//max qtr value is 10
		if(qtr > 10)
			qtr = 1;
		else
			qtr++;			
	}

	//returns the String value of the home team name 'Panthers', 'Bulls', etc.
	public synchronized String getHomeName() {
		return homeName;
	}

	//returns the String value of the away team name 'Panthers', 'Bulls', etc. 
	public synchronized String getAwayName() {
		return awayName;
	}

	//returns the value of the home team score
	public synchronized String getHomeScore() {
		return homeScore;
	}

	//returns the value of the away team score
	public synchronized String getAwayScore() {
		return awayScore;
	}

	//sets the logo for the Scoreboard
	public synchronized void setLogo(String name) {
		logo = name;
	}

	//returns String representing the scoreboard logo
	public synchronized String getLogo() {
		return logo;
	}

	//returns true if this scoreboard is turned 'on'
	public synchronized boolean getPowerStatus() {
		return power;
	}

	//returns the status of the arrow - default is to face home
	public synchronized String getPossessionArrow() {
		return possessionArrow;
	}

	//returns the bonus status for away team - default is home
	public synchronized boolean getHomeBonus() {
		return homeBonus;
	}

	//returns the bonus status for away team - default is false
	public synchronized boolean getAwayBonus() {
		return awayBonus;
	}

	//accessor method - returns current time remaining on clock
	public synchronized String getTime() {
		return time;
	}

	//accesor method - returns current quarter of play
	public synchronized String getQuarter() {
		return quarter;
	}

}
