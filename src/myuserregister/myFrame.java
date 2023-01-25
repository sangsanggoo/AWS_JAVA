package myuserregister;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class myFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel mainFrame;
	private JTextField UserNameField;
	private JPasswordField passwordField;
	private JTextField RegisterUsernameField;
	private JPasswordField RegisterPasswordField;
	private JTextField RegisterNameField;
	private JTextField RegisterERmailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFrame frame = new myFrame();
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
	public myFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainFrame = new JPanel();
		mainFrame.setBorder(null);

		setContentPane(mainFrame);
		mainFrame.setLayout(new CardLayout(0, 0));
		
		JPanel loginFrame = new JPanel();
		mainFrame.add(loginFrame, "name_1298330911111500");
		loginFrame.setLayout(null);
		
		JLabel loginText = new JLabel("Login");
		loginText.setHorizontalAlignment(SwingConstants.CENTER);
		loginText.setFont(new Font("굴림", Font.BOLD, 35));
		loginText.setBounds(43, 42, 274, 129);
		loginFrame.add(loginText);
		
		JLabel UserNameText = new JLabel("Username");
		UserNameText.setHorizontalAlignment(SwingConstants.CENTER);
		UserNameText.setBounds(136, 211, 82, 26);
		loginFrame.add(UserNameText);
		
		UserNameField = new JTextField();
		UserNameField.setBounds(43, 241, 274, 21);
		loginFrame.add(UserNameField);
		UserNameField.setColumns(10);
		
		JLabel PasswordText = new JLabel("Password");
		PasswordText.setHorizontalAlignment(SwingConstants.LEFT);
		PasswordText.setBounds(147, 276, 82, 26);
		loginFrame.add(PasswordText);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(43, 312, 274, 21);
		loginFrame.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Sign up");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel.setBounds(230, 392, 87, 26);
		loginFrame.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 25));
		btnNewButton.setBounds(43, 375, 175, 54);
		loginFrame.add(btnNewButton);
		
		JPanel registerFrame = new JPanel();
		mainFrame.add(registerFrame, "name_1298330922396900");
		registerFrame.setLayout(null);
		
		JLabel RegisterText = new JLabel("Register");
		RegisterText.setFont(new Font("굴림", Font.BOLD, 22));
		RegisterText.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterText.setBounds(69, 47, 237, 84);
		registerFrame.add(RegisterText);
		
		JLabel RegisterUsernameText = new JLabel("Username");
		RegisterUsernameText.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterUsernameText.setBounds(147, 117, 82, 26);
		registerFrame.add(RegisterUsernameText);
		
		RegisterUsernameField = new JTextField();
		RegisterUsernameField.setColumns(10);
		RegisterUsernameField.setBounds(54, 147, 274, 21);
		registerFrame.add(RegisterUsernameField);
		
		JLabel RegisterPasswordText = new JLabel("Password");
		RegisterPasswordText.setHorizontalAlignment(SwingConstants.LEFT);
		RegisterPasswordText.setBounds(158, 182, 82, 26);
		registerFrame.add(RegisterPasswordText);
		
		RegisterPasswordField = new JPasswordField();
		RegisterPasswordField.setBounds(54, 218, 274, 21);
		registerFrame.add(RegisterPasswordField);
		
		JLabel RegisterNameText = new JLabel("name");
		RegisterNameText.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterNameText.setBounds(147, 271, 82, 26);
		registerFrame.add(RegisterNameText);
		
		RegisterNameField = new JTextField();
		RegisterNameField.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterNameField.setColumns(10);
		RegisterNameField.setBounds(54, 301, 274, 21);
		registerFrame.add(RegisterNameField);
		
		JLabel RegisterEmailText = new JLabel("Username");
		RegisterEmailText.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterEmailText.setBounds(147, 349, 82, 26);
		registerFrame.add(RegisterEmailText);
		
		RegisterERmailField = new JTextField();
		RegisterERmailField.setColumns(10);
		RegisterERmailField.setBounds(54, 379, 274, 21);
		registerFrame.add(RegisterERmailField);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 24));
		btnNewButton_1.setBounds(54, 411, 274, 26);
		registerFrame.add(btnNewButton_1);
	}
}
