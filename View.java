package scoreboardapplication;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class View {

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

	private Model subject;
	
	private JPanel nestedPanel;

	public View(Model model) {
		//instantiate all Jcomponents
		System.out.println("Scoreboard initiated...");
		homeName = new JTextField("HOME",15);
		homeName.setEditable(false);
		awayName = new JTextField("AWAY",15);
		awayName.setEditable(false);
		time = new JTextField("8:00",4);
		quarter = new JTextField("1");
		quarter.setEditable(false);
		arrow = new JTextField("<",1);
		arrow.setEditable(false);
		homeBonus = new JCheckBox("Bonus");
		homeBonus.setEnabled(false);
		awayBonus = new JCheckBox("Bonus");
		awayBonus.setEnabled(false);
		logo = new JTextField("Designing Individuals Perspectives LLC");
		homeScore = new JTextField("0",3);
		awayScore = new JTextField("0",3);
		scoreboardFrame = new JFrame("Scoreboard");
		interfaceFrame = new JFrame();
		home = new JPanel();
		away = new JPanel();
		middle = new JPanel();
		input = new JTextField();
		output = new JTextField();
		homeLabel = new JLabel();
		awayLabel = new JLabel();
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
		subject = model;
		nestedPanel = new JPanel();
		//add JComponents to JPanels
		home.add(homeName);
		home.add(homeScore);
		home.add(homeBonus);
		home.setLayout(new GridLayout(3,0));
		away.add(awayName);
		away.add(awayScore);
		away.add(awayBonus);
		away.setLayout(new GridLayout(3,0));
		middle.add(logo);
		middle.add(time);
		nestedPanel.add(homeBonus);
		nestedPanel.add(quarter);
		nestedPanel.add(awayBonus);
		middle.add(nestedPanel);
		middle.add(arrow);
		middle.setLayout(new GridLayout(4,0));
		//add JPanels to JFrames
		scoreboardFrame.add(home);
		scoreboardFrame.add(middle);
		scoreboardFrame.add(away);
		scoreboardFrame.setLayout(new GridLayout(0,3));
		scoreboardFrame.setSize(725,250);
		scoreboardFrame.setVisible(true);
		System.out.println("Scoreboard created...");
	}

	public void update() {
  }

}
