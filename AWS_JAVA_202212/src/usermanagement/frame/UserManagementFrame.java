package usermanagement.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserManagementFrame extends JFrame {

	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField registerUsernameField;
	private JPasswordField registerPasswordField;
	private JTextField registerNameField;
	private JTextField registerEmailField;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public UserManagementFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setForeground(Color.BLACK);
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));

		
		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		JLabel logText = new JLabel("UserManagement");
		logText.setFont(new Font("D2Coding", Font.BOLD, 20));
		logText.setHorizontalAlignment(SwingConstants.CENTER);
		logText.setBounds(92, 49, 198, 41);
		loginPanel.add(logText);
		
		JLabel logText2 = new JLabel("Login");
		logText2.setHorizontalAlignment(SwingConstants.CENTER);
		logText2.setFont(new Font("D2Coding", Font.BOLD, 20));
		logText2.setBounds(51, 77, 295, 52);
		loginPanel.add(logText2);
		
		usernameField = new JTextField();
		usernameField.setBounds(48, 189, 287, 21);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(48, 253, 287, 21);
		loginPanel.add(passwordField);
		
		JLabel UsernameLabel = new JLabel("Username or email");
		UsernameLabel.setFont(new Font("D2Coding", Font.BOLD, 15));
		UsernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UsernameLabel.setBounds(114, 158, 150, 21);
		loginPanel.add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("Password");
		PasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		PasswordLabel.setFont(new Font("D2Coding", Font.BOLD, 15));
		PasswordLabel.setBounds(114, 220, 150, 23);
		loginPanel.add(PasswordLabel);
		
		JButton loginButton = new JButton("Login");
		loginButton.setFont(new Font("D2Coding", Font.BOLD, 30));
		loginButton.setBounds(48, 284, 287, 82);
		loginPanel.add(loginButton);
		
		JLabel donthaveanaccountLabel = new JLabel("Don't have an account?");
		donthaveanaccountLabel.setHorizontalAlignment(SwingConstants.CENTER);
		donthaveanaccountLabel.setFont(new Font("D2Coding", Font.BOLD, 13));
		donthaveanaccountLabel.setBounds(48, 376, 176, 23);
		loginPanel.add(donthaveanaccountLabel);
		
		JLabel SignupLabel = new JLabel("Sign up");
		SignupLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel ,"registerPanel");
			}
		});
		SignupLabel.setForeground(Color.BLUE);
		SignupLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SignupLabel.setFont(new Font("D2Coding", Font.BOLD, 13));
		SignupLabel.setBounds(236, 376, 99, 23);
		loginPanel.add(SignupLabel);
		
		JLabel ForgotLabel = new JLabel("Forgot your password?");
		ForgotLabel.setForeground(Color.BLUE);
		ForgotLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ForgotLabel.setFont(new Font("D2Coding", Font.BOLD, 13));
		ForgotLabel.setBounds(93, 409, 188, 23);
		loginPanel.add(ForgotLabel);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(Color.WHITE);
		registerPanel.setLayout(null);
		mainPanel.add(registerPanel, "registerPanel");
		
		JLabel registerLogo = new JLabel("UserManagement");
		registerLogo.setHorizontalAlignment(SwingConstants.CENTER);
		registerLogo.setFont(new Font("D2Coding", Font.BOLD, 20));
		registerLogo.setBounds(92, 49, 198, 41);
		registerPanel.add(registerLogo);
		
		JLabel registerText = new JLabel("Register");
		registerText.setHorizontalAlignment(SwingConstants.CENTER);
		registerText.setFont(new Font("D2Coding", Font.BOLD, 20));
		registerText.setBounds(51, 77, 295, 52);
		registerPanel.add(registerText);
		
		JLabel registersigninLink = new JLabel("Sign in");
		registersigninLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
			}
		});
		registersigninLink.setHorizontalAlignment(SwingConstants.CENTER);
		registersigninLink.setForeground(Color.BLUE);
		registersigninLink.setFont(new Font("D2Coding", Font.BOLD, 13));
		registersigninLink.setBounds(247, 412, 99, 23);
		registerPanel.add(registersigninLink);
		
		JLabel registerUsernameText = new JLabel("Username");
		registerUsernameText.setHorizontalAlignment(SwingConstants.CENTER);
		registerUsernameText.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerUsernameText.setBounds(117, 139, 150, 21);
		registerPanel.add(registerUsernameText);
		
		registerUsernameField = new JTextField();
		registerUsernameField.setColumns(10);
		registerUsernameField.setBounds(51, 170, 287, 21);
		registerPanel.add(registerUsernameField);
		
		JLabel registerPasswordText = new JLabel("Password");
		registerPasswordText.setHorizontalAlignment(SwingConstants.CENTER);
		registerPasswordText.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerPasswordText.setBounds(117, 201, 150, 23);
		registerPanel.add(registerPasswordText);
		
		registerPasswordField = new JPasswordField();
		registerPasswordField.setBounds(51, 234, 287, 21);
		registerPanel.add(registerPasswordField);
		
		registerNameField = new JTextField();
		registerNameField.setColumns(10);
		registerNameField.setBounds(51, 306, 287, 21);
		registerPanel.add(registerNameField);
		
		JLabel registerNameText = new JLabel("name");
		registerNameText.setHorizontalAlignment(SwingConstants.CENTER);
		registerNameText.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerNameText.setBounds(117, 275, 150, 21);
		registerPanel.add(registerNameText);
		
		JLabel registerEmailText = new JLabel("Email");
		registerEmailText.setHorizontalAlignment(SwingConstants.CENTER);
		registerEmailText.setFont(new Font("D2Coding", Font.BOLD, 15));
		registerEmailText.setBounds(117, 337, 150, 21);
		registerPanel.add(registerEmailText);
		
		registerEmailField = new JTextField();
		registerEmailField.setColumns(10);
		registerEmailField.setBounds(51, 368, 287, 21);
		registerPanel.add(registerEmailField);
		
		JButton registerLoginButton = new JButton("Login");
		registerLoginButton.setFont(new Font("D2Coding", Font.BOLD, 30));
		registerLoginButton.setBounds(51, 406, 198, 34);
		registerPanel.add(registerLoginButton);
	}
}
