import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wnd extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	
	
	private void setTit(String str)
	{
		this.setTitle(str);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wnd frame = new wnd();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public wnd() {
		setTitle("\u041B\u0430\u0431\u043E\u0440\u0430\u0442\u043E\u0440\u043D\u0430\u044F \u0440\u043E\u0431\u043E\u0442\u0430 17");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		input = new JTextField();
		input.setText("\u0417\u0430\u0433\u043E\u043B\u043E\u0432\u043E\u043A \u0444\u043E\u0440\u043C\u044B");
		input.setBounds(10, 251, 135, 20);
		contentPane.add(input);
		input.setColumns(10);
		
		JLabel name = new JLabel("\u0421\u0430\u0448\u0430");
		name.setVisible(false);
		name.setBounds(109, 11, 56, 23);
		contentPane.add(name);
		
		JLabel lastName = new JLabel("\u041F\u0430\u0440\u0448\u0438\u043D");
		lastName.setVisible(false);
		lastName.setBounds(109, 42, 56, 23);
		contentPane.add(lastName);
		
		JLabel mark = new JLabel("10");
		mark.setVisible(false);
		mark.setBounds(109, 76, 19, 23);
		contentPane.add(mark);
		
		
		JLabel age = new JLabel("21");
		age.setVisible(false);
		age.setBounds(109, 110, 56, 23);
		contentPane.add(age);
		
		
		JLabel image = new JLabel("");
		image.setVisible(false);
		image.setIcon(new ImageIcon("C:\\Users\\parsh\\workspace\\Lab 17\\1.jpg"));
		image.setBounds(175, 0, 260, 257);
		contentPane.add(image);
		
		JButton button = new JButton("\u0418\u043C\u044F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setVisible(!name.isVisible());
			}
		});
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0424\u0430\u043C\u0438\u043B\u0438\u044F");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lastName.setVisible(!lastName.isVisible());
			}
		});
		button_1.setBounds(10, 42, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u041E\u0446\u0435\u043D\u043A\u0430");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mark.setVisible(!mark.isVisible());
			}
		});
		button_2.setBounds(10, 76, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("\u0412\u043E\u0437\u0440\u0430\u0441\u0442");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				age.setVisible(!age.isVisible());
			}
		});
		button_3.setBounds(10, 110, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("\u0418\u0437\u043C\u0435\u043D\u0438\u0442\u044C \u0437\u0430\u0433\u043E\u043B\u043E\u0432\u043E\u043A");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 setTit(input.getText());
			}
		});
		button_4.setBounds(10, 277, 135, 23);
		contentPane.add(button_4);
		
		JLabel image2 = new JLabel("");
		image2.setIcon(new ImageIcon("C:\\Users\\parsh\\workspace\\Lab 17\\2.jpg"));
		image2.setVisible(false);
		image2.setBounds(175, 0, 260, 257);
		contentPane.add(image2);
		
		JButton img1 = new JButton("\u041F\u043E\u0440\u0442\u0440\u0435\u0442");
		img1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				image2.setVisible(false);
				image.setVisible(true);	
			}
		});
		img1.setBounds(202, 277, 89, 23);
		contentPane.add(img1);
		
		JButton img2 = new JButton("\u041A\u0430\u0440\u0442\u0438\u043D\u043A\u0430");
		img2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				image.setVisible(false);
				image2.setVisible(true);	
			}
		});
		img2.setBounds(301, 277, 89, 23);
		contentPane.add(img2);
	}
	
}
