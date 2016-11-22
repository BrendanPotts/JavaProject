package Assignment2;

import java.awt.*;
import javax.swing.*;

public class MainPannel extends JFrame {
	private JLabel ChampView = new JLabel("Favorite Champion Viewer");
	private JLabel champName = new JLabel("Champion Name: ");
	private JLabel champPassive = new JLabel("Passive: ");
	private JLabel champQ = new JLabel("Q Abillity: ");
	private JLabel champW = new JLabel("W Abillity: ");
	private JLabel champE = new JLabel("E Abillity: ");
	private JLabel champR = new JLabel("R Abillity: ");
	private JLabel champBanRate = new JLabel("Ban Rate: ");
	private JLabel champBio = new JLabel("Bio: ");
	
	// Displaying an image
	
	private JButton addChamp = new JButton("Add Champion");
	private JButton removeChamp = new JButton("Remove Champion");
	private JButton updateChampion = new JButton("Update Champion");
	private JButton listChampions = new JButton("List all Champions");
	
	private JPanel buttonPanel = new JPanel();
	private JPanel favChampPanel = new JPanel();
	
	public MainPannel(String str){
		super(str);
		
		add(buttonPanel, BorderLayout.WEST);
		add(favChampPanel, BorderLayout.CENTER);
		setTitle("Favorite Champion List");
		setSize(300,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
	}

}
