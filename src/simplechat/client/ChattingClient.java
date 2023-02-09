package simplechat.client;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChattingClient extends JFrame {
	private Socket socket;
	private String username;
	private JPanel contentPane;
	private JTextField portInput;
	private JTextField ipInput;
	private JTextArea contentView;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = new ChattingClient();
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
	public ChattingClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1037, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		portInput = new JTextField();
		portInput.setBounds(828, 10, 65, 34);
		contentPane.add(portInput);
		portInput.setColumns(10);
		
		JButton connectButton = new JButton("연결");
	      connectButton.addMouseListener(new MouseAdapter() {
	         @Override
	         public void mouseClicked(MouseEvent e) {
	            String ip = null;
	            int port = 0;
	            
	            ip = ipInput.getText();
	            port = Integer.parseInt(portInput.getText());
	            
	            try {
	               
	               socket = new Socket(ip, port);
	               JOptionPane.showMessageDialog(null, 
	                     socket.getInetAddress() + "서버 접속" , 
	                     "접속성공",
	                     JOptionPane.INFORMATION_MESSAGE);
	               
	               InputStream inputStream = socket.getInputStream();  
	               BufferedReader in = new BufferedReader(new InputStreamReader(inputStream)); //받을수 있는 통로를 열어줌 -----(2)
	               if(in.readLine().equals("join")) {  //in.readLine에서 (1)에서 보내준 join을 받음
	                  username = JOptionPane.showInputDialog(null,"사용자 이름을 입력하세요.",JOptionPane.INFORMATION_MESSAGE);
	                  OutputStream outputStream = socket.getOutputStream(); 
	                  PrintWriter out = new PrintWriter(outputStream,true); //서버에게 보내줄 통로를 열어줌 ----(3)
	                  
	                  out.println(username + "님이 접속하였습니다."); // 서버에게 username + "님이 접속하였습니다." 이걸 보내줌 ----(4)
	                  
	                  String welcomeMessage = in.readLine(); // 서버에서 보내준 (5)를 다시 받음
	                  contentView.append(welcomeMessage); //그리고 contenview에 welcomemessage를 넣어줌
	               }
	               
	               
	            }catch (ConnectException e1) {
	               
	               JOptionPane.showMessageDialog(null, 
	                     "서버 접속 실패" , 
	                     "접속실패",
	                     JOptionPane.ERROR_MESSAGE);
	            }catch (UnknownHostException e1) {
	               e1.printStackTrace();
	            }catch (IOException e1) {
	               e1.printStackTrace();
	            }
	         }
	      });
		connectButton.setBounds(905, 9, 78, 35);
		contentPane.add(connectButton);
		
		ipInput = new JTextField();
		ipInput.setBounds(705, 10, 111, 34);
		contentPane.add(ipInput);
		ipInput.setColumns(10);
		
		JScrollPane contentScroll = new JScrollPane();
		contentScroll.setBounds(12, 10, 662, 570);
		contentPane.add(contentScroll);
		
		contentView = new JTextArea();
		contentScroll.setViewportView(contentView);
		
		JScrollPane userListScroll = new JScrollPane();
		userListScroll.setBounds(705, 54, 278, 526);
		contentPane.add(userListScroll);
		
		JList userList = new JList();
		userListScroll.setViewportView(userList);
		
		JScrollPane messageScroll = new JScrollPane();
		messageScroll.setBounds(12, 584, 887, 35);
		contentPane.add(messageScroll);
		
		JTextArea messageInput = new JTextArea();
		messageScroll.setViewportView(messageInput);
		
		JButton joinButton_1 = new JButton("입력");
		joinButton_1.setBounds(905, 584, 78, 35);
		contentPane.add(joinButton_1);
	}
}
