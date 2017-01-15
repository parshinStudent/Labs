package lab16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Main extends JFrame {

	/**
	 * 
	 */
	private ImageIcon img = new ImageIcon("1.jpg");
	private ImageIcon img1 = new ImageIcon("2.jpg");
	private JLabel firstName = new JLabel("Alexander");
	private JLabel lastName = new JLabel("Parshin");
	private JLabel age = new JLabel("21 year");
	private JLabel mark = new JLabel("10");
	private JLabel image = new JLabel(img);
	
	
	private JButton bFirstName = new JButton("Имя");
	private JButton bLastName = new JButton("Фамилия");
	private JButton bAge = new JButton("Возраст");
	private JButton bMark = new JButton("Оценка");
	private JButton bImage1 = new JButton("Портрет");
	private JButton bImage2 = new JButton("Худ");
	
	private JTextField input = new JTextField("Введите текст");
	private JButton bInput= new JButton("Изменить");
	
	int sizeButtonWeight = 150;
	int sizeButtonHeight = 50;
	int margin = 10;
	public Main()
	{
		super("Лабораторная робота 16");
		this.setBounds(0, 0, 800, 360);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bFirstName.setBounds(0, 0, sizeButtonWeight, sizeButtonHeight);
		bFirstName.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 firstName.setVisible(!firstName.isVisible());
		     }
		});
		
		bLastName.setBounds(0, 60, sizeButtonWeight, sizeButtonHeight);
		bLastName.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 lastName.setVisible(!lastName.isVisible());
		     }
		});
		
		bAge.setBounds(0, 120, sizeButtonWeight, sizeButtonHeight);	
		bAge.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 age.setVisible(!age.isVisible());
		     }
		});
		
		bMark.setBounds(0, 180, sizeButtonWeight, sizeButtonHeight);
		bMark.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 mark.setVisible(!mark.isVisible());
		     }
		});
		
		bInput.setBounds(0, 240, sizeButtonWeight, sizeButtonHeight);
		bInput.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 Title(input.getText());
		     }
		});
		
		bImage1.setBounds(bInput.getX()+(sizeButtonWeight*2), bInput.getY(), sizeButtonWeight, sizeButtonHeight);
		bImage1.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 image.setVisible(true);
		    	 image.setIcon(img); 
		     }
		});
		
		bImage2.setBounds(bImage1.getX()+sizeButtonWeight+margin, bInput.getY(), sizeButtonWeight, sizeButtonHeight);
		bImage2.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		    	 image.setVisible(true);
		    	 image.setIcon(img1);
		     }
		});
		
		
		firstName.setVisible(false); firstName.setBounds(bFirstName.getX()+sizeButtonWeight+margin, bFirstName.getY(), 100, 50);
		lastName.setVisible(false); lastName.setBounds(bLastName.getX()+sizeButtonWeight+margin, bLastName.getY(), 100, 50);
		age.setVisible(false); age.setBounds(bAge.getX()+sizeButtonWeight+margin, bAge.getY(), 100, 50);
		mark.setVisible(false); mark.setBounds(bMark.getX()+sizeButtonWeight+margin, bMark.getY(), 100, 50);
		input.setBounds(bInput.getX()+sizeButtonWeight+margin, bInput.getY(), 100, 50);
		image.setVisible(false); image.setBounds(300, 0, 200, 200);
		add(bMark); add(mark);
		add(image);
		add(bFirstName); add(firstName); 
		add(bLastName); add(lastName); 
		add(bAge); add(age); 
		add(bInput); add(input);add(bImage1); add(bImage2);
		JLabel lol = new JLabel("lol"); lol.setVisible(false);
		add(lol);
	}
	
	public void Title(String temp)
	{
		setTitle(temp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.setVisible(true);
	}
}
