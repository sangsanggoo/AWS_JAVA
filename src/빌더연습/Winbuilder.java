package 빌더연습;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Winbuilder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField inputIp;
	private JTextField inputPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Winbuilder frame = new Winbuilder();
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
	public Winbuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane contentpane = new JScrollPane();
		contentpane.setBounds(12, 20, 330, 229);
		contentPane.add(contentpane);
		
		JTextArea contentview = new JTextArea();
		contentpane.setViewportView(contentview);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(22, 259, 384, 43);
		contentPane.add(scrollPane_1);
		
		textField = new JTextField();
		scrollPane_1.setViewportView(textField);
		textField.setColumns(10);
		
		inputIp = new JTextField();
		inputIp.setBounds(346, 20, 62, 21);
		contentPane.add(inputIp);
		inputIp.setColumns(10);
		
		inputPort = new JTextField();
		inputPort.setColumns(10);
		inputPort.setBounds(412, 20, 62, 21);
		contentPane.add(inputPort);
		
		JButton joinButton = new JButton("연결");
		joinButton.setBounds(371, 51, 97, 23);
		contentPane.add(joinButton);
		
		JButton btnNewButton_1 = new JButton("전송");
		btnNewButton_1.setBounds(409, 269, 97, 23);
		contentPane.add(btnNewButton_1);
	}
}
