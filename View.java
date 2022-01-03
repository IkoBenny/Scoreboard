package scoreboardapplication;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class View {
	//view components
	private JTextField homeName;
	private JTextField awayName;
	private JTextField time;
	private JTextField quarter;
	private JTextField arrow;
	private JCheckBox homeBonus;
	private JCheckBox awayBonus;
	private JTextField logo;
	private JTextField homeScore;
	private JTextField awayScore;
	private JFrame scoreboardFrame;
	private JFrame interfaceFrame;
	private JPanel home;
	private JPanel away;
	private JPanel middle;
	private JTextField input;
	private JTextField output;
	private JLabel homeLabel;
	private JLabel awayLabel;
	private JButton incrementButtonHome;
	private JButton incrementButtonAway;
	private JButton decrementButtonHome;
	private JButton decrementButtonAway;
	private JButton powerButton;
	private JPanel leftRemote;
	private JPanel middleRemote;
	private JPanel rightRemote;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton zero;
	private JButton menu;
	private JButton startButton;
	private JButton stopButton;	
	private JPanel nestedPanel;
	private JPanel nestedPanelRemote;
	private JButton possessionButton;

	//constructor for View
	public View() {
		System.out.println("View created...");
	}

	//adds Controller to listen to View events
	public void addListener(ActionListener listener) {
		//add listeners to components
		possessionButton.addActionListener(listener);
		stopButton.addActionListener(listener);
		startButton.addActionListener(listener);
		menu.addActionListener(listener);
		zero.addActionListener(listener);
		one.addActionListener(listener);
		two.addActionListener(listener);
		three.addActionListener(listener);
		four.addActionListener(listener);
		five.addActionListener(listener);
		six.addActionListener(listener);
		seven.addActionListener(listener);
		eight.addActionListener(listener);
		nine.addActionListener(listener);
		powerButton.addActionListener(listener);
		incrementButtonHome.addActionListener(listener);
		incrementButtonAway.addActionListener(listener);
		decrementButtonHome.addActionListener(listener);
		decrementButtonAway.addActionListener(listener);
	  }
	
	//returns the component for storing home team name
	public JTextField getHomeName() {
		return homeName;
	}

	//returns the component for storing away team name
	public JTextField getAwayName() {
		return awayName;
	}

	//returns the component for storing quarter value
	public JTextField getQuarter() {
		return quarter;
	}

	//returns the component for storing possession arrow
	public JTextField getArrow() {
		return arrow;
	}
	
	//returns the component for storing home team bonus
	public JCheckBox getHomeBonus() {
		return homeBonus;
	}

	//returns the component for storing away team bonus
	public JCheckBox getAwayBonus() {
		return awayBonus;
	}

	//returns the component for storing home team score
	public JTextField getHomeScore() {
		return homeScore;
	}

	//returns the component for storing away team score
	public JTextField getAwayScore() {
		return awayScore;
	}

	//returns the component for entering input into remote
	public JTextField getInput() {
		return input;
	}

	//returns the component for displaying output to remote
	public JTextField getOutput() {
		return output;
	}

	//sets the component used for storing time
	public void setTime(JTextField time) {
		this.time = time;
	}

	//sets the possession arrow component
	public void setArrow(JTextField arrow) {
		this.arrow = arrow;
	}

	//sets the String value for logo portion of Scoreboard
	public void setLogo(JTextField logo) {
		this.logo = logo;
	}

	//sets the Frame for this Scoreboard
	public void setScoreboardFrame(JFrame scoreboardFrame) {
		this.scoreboardFrame = scoreboardFrame;
	}

	//sets the Frame for the remote
	public void setInterfaceFrame(JFrame interfaceFrame) {
		this.interfaceFrame = interfaceFrame;
	}

	//sets the panel to hold components on home side of Scoreboard
	public void setHome(JPanel home) {
		this.home = home;
	}
	
	//sets the panel to hold away components 
	public void setAway(JPanel away) {
		this.away = away;
	}
	
	//sets the panel holding middle comonents
	public void setMiddle(JPanel middle) {
		this.middle = middle;
	}

	//sets the label for home side of remote 
	public void setHomeLabel(JLabel homeLabel) {
		this.homeLabel = homeLabel;
	}
	
	//sets the label for home side of remote
	public void setAwayLabel(JLabel awayLabel) {
		this.awayLabel = awayLabel;
	}

	//sets the increment button for home side of remote
	public void setIncrementButtonHome(JButton incrementButtonHome) {
		this.incrementButtonHome = incrementButtonHome;
	}
	
	//sets the increment button for away side of remote
	public void setIncrementButtonAway(JButton incrementButtonAway) {
		this.incrementButtonAway = incrementButtonAway;
	}

	//sets decrement button for home side of remote
	public void setDecrementButtonHome(JButton decrementButtonHome) {
		this.decrementButtonHome = decrementButtonHome;
	}

	//sets the decrement button for away side of remote
	public void setDecrementButtonAway(JButton decrementButtonAway) {
		this.decrementButtonAway = decrementButtonAway;
	}

	//sets power button for this Scoreboard
	public void setPowerButton(JButton powerButton) {
		this.powerButton = powerButton;
	}

	//sets left panel for remote
	public void setLeftRemote(JPanel leftRemote) {
		this.leftRemote = leftRemote;
	}
	
	//sets middle panel for remote
	public void setMiddleRemote(JPanel middleRemote) {
		this.middleRemote = middleRemote;
	}

	//sets right panel for remote
	public void setRightRemote(JPanel rightRemote) {
		this.rightRemote = rightRemote;
	}
	
	//sets one button for remote
	public void setOne(JButton one) {
		this.one = one;
	}
	
	//sets two button for remote
	public void setTwo(JButton two) {
		this.two = two;
	}

	//sets three button for remote
	public void setThree(JButton three) {
		this.three = three;
	}

	//sets four button for remote
	public void setFour(JButton four) {
		this.four = four;
	}

	//sets five button for remote
	public void setFive(JButton five) {
		this.five = five;
	}

	//sets six button for remote
	public void setSix(JButton six) {
		this.six = six;
	}

	//sets seven button for remote
	public void setSeven(JButton seven) {
		this.seven = seven;
	}

	//sets eight button for remote
	public void setEight(JButton eight) {
		this.eight = eight;
	}

	//sets nine button for remote
	public void setNine(JButton nine) {
		this.nine = nine;
	}
	
	//sets zero button for remote
	public void setZero(JButton zero) {
		this.zero = zero;
	}

	//sets menu button for remote
	public void setMenu(JButton menu) {
		this.menu = menu;
	}	

	//sets start button for remote
	public void setStartButton(JButton startButton) {
		this.startButton = startButton;
	}

	//sets stop button for remote
	public void setStopButton(JButton stopButton) {
		this.stopButton = stopButton;
	}

	//sets the nested panel for Scoreboard
	public void setNestedPanel(JPanel nestedPanel) {
		this.nestedPanel = nestedPanel;
	}
	
	//sets the nested panel for remote
	public void setNestedPanelRemote(JPanel nestedPanelRemote) {
		this.nestedPanelRemote = nestedPanelRemote;
	}

	//sets the possession button for the remote
	public void setPossessionButton(JButton possessionButton) {
		this.possessionButton = possessionButton;
	}

	//sets home team name component 
	public void setHomeName(JTextField homeName) {
		this.homeName = homeName;
	}

	//sets away team name component 
	public void setAwayName(JTextField awayName) {
		this.awayName = awayName;
	}
	
	//sets quarter component 
	public void setQuarter(JTextField quarter) {
		this.quarter = quarter;
	}
	
	//sets bonus component for home team
	public void setHomeBonus(JCheckBox homeBonus) {
		this.homeBonus = homeBonus;
	}
	
	//sets component for away bonus
	public void setAwayBonus(JCheckBox awayBonus) {
		this.awayBonus = awayBonus;
	}
	
	//sets component for home score
	public void setHomeScore(JTextField homeScore) {
		this.homeScore = homeScore;
	}
	
	//sets component for away score
	public void setAwayScore(JTextField awayScore) {
		this.awayScore = awayScore;
	}
	
	//sets component for remote input
	public void setInput(JTextField input) {
		this.input = input;
	}
	
	//sets component for remote input
	public void setOutput(JTextField output) {
		this.output = output;
	}

	//accessor method - returns selected button
	public JButton getButton(String name) {
		switch(name) {
		case "possessionButton":
			return possessionButton;
		case "stopButton":
			return stopButton;
		case "startButton":
			return startButton;
		case "menuButton":
			return menu;
		case "zeroButton":
			return zero;
		case "oneButton":
			return one;
		case "twoButton":
			return two;
		case "threeButton":
			return three;
		case "fourButton":
			return four;
		case "fiveButton":
			return five;
		case "sixButton":
			return six;
		case "sevenButton":
			return seven;
		case "eightButton":
			return eight;
		case "nineButton":
			return nine;
		case "powerButton":
			return powerButton;
		case "incrementButtonHome":
			return incrementButtonHome;
		case "incrementButtonAway":
			return incrementButtonAway;
		case "decrementButtonHome":
			return decrementButtonHome;
		case "decrementButtonAway":
			return decrementButtonAway;			
		}
		return null;
	}
	
	//creates and shows GUI
	 public void createAndShowGUI() {
		//instantiate all Jcomponents
			possessionButton = new JButton("POSS </>");
			homeName = new JTextField("HOME",15);
			homeName.setEditable(false);
			awayName = new JTextField("AWAY",15);
			awayName.setEditable(false);
			time = new JTextField("8:00",4);
			quarter = new JTextField("1");
			quarter.setEditable(false);
			arrow = new JTextField("POSS - <",13);
			arrow.setEditable(false);
			homeBonus = new JCheckBox("Bonus");
			homeBonus.setEnabled(false);
			awayBonus = new JCheckBox("Bonus");
			awayBonus.setEnabled(false);
			logo = new JTextField("YOUR LOGO HERE");
			homeScore = new JTextField("0",3);
			awayScore = new JTextField("0",3);
			scoreboardFrame = new JFrame("Scoreboard");
			interfaceFrame = new JFrame();
			home = new JPanel();
			away = new JPanel();
			middle = new JPanel();
			input = new JTextField();
			output = new JTextField();
			homeLabel = new JLabel("HOME");
			awayLabel = new JLabel("AWAY");
			incrementButtonHome = new JButton("+");
			incrementButtonAway = new JButton("+");
			decrementButtonHome = new JButton("-");
			decrementButtonAway = new JButton("-");
			powerButton = new JButton("POWER");
			leftRemote = new JPanel();
			middleRemote = new JPanel();
			rightRemote = new JPanel();
			one = new JButton("1");
			two = new JButton("2");
			three = new JButton("3");
			four = new JButton("4");
			five = new JButton("5");
			six = new JButton("6");
			seven = new JButton("7");
			eight = new JButton("8");
			nine = new JButton("9");
			zero = new JButton("0");
			menu = new JButton("MENU");
			startButton = new JButton("START");
			stopButton = new JButton("STOP");
			nestedPanel = new JPanel();
			nestedPanelRemote = new JPanel();
			//add JComponents to JPanels
			home.add(homeName);
			home.add(homeScore);
			home.add(homeBonus);
			home.setLayout(new GridLayout(3,0));
			away.add(awayName);
			away.add(awayScore);
			away.add(awayBonus);
			away.setLayout(new GridLayout(3,0));
			//middle.add(logo);
			middle.add(time);
			nestedPanel.add(homeBonus);
			nestedPanel.add(quarter);
			nestedPanel.add(awayBonus);
			middle.add(nestedPanel);
			middle.add(arrow);
			middle.setLayout(new GridLayout(4,0));
			leftRemote.add(homeLabel);
			leftRemote.add(incrementButtonHome);
			leftRemote.add(decrementButtonHome);
			leftRemote.add(menu);
			leftRemote.add(powerButton);
			leftRemote.setLayout(new GridLayout(5,0));
			rightRemote.setLayout(new GridLayout(5,0));
			middleRemote.add(input);
			middleRemote.add(output);
			nestedPanelRemote.add(one);
			nestedPanelRemote.add(two);
			nestedPanelRemote.add(three);
			nestedPanelRemote.add(four);
			nestedPanelRemote.add(five);
			nestedPanelRemote.add(six);
			nestedPanelRemote.add(seven);
			nestedPanelRemote.add(eight);
			nestedPanelRemote.add(nine);
			nestedPanelRemote.add(zero);
			nestedPanelRemote.add(possessionButton);
			nestedPanelRemote.setLayout(new GridLayout(4,3));
			rightRemote.add(awayLabel);
			rightRemote.add(incrementButtonAway);
			rightRemote.add(decrementButtonAway);
			rightRemote.add(startButton);
			rightRemote.add(stopButton);
			middleRemote.add(nestedPanelRemote);
			middleRemote.setLayout(new GridLayout(3,0));
			//add JPanels to JFrames
			interfaceFrame.add(leftRemote);
			interfaceFrame.add(middleRemote);
			interfaceFrame.add(rightRemote);
			interfaceFrame.setLayout(new GridLayout(0,3));
			scoreboardFrame.add(home);
			scoreboardFrame.add(middle);
			scoreboardFrame.add(away);
			scoreboardFrame.setLayout(new GridLayout(0,3));
			interfaceFrame.setSize(1000,250);
			interfaceFrame.setVisible(true);
			scoreboardFrame.setSize(725,250);
			scoreboardFrame.setVisible(true);
			System.out.println("View displayed...");
	  }
}
