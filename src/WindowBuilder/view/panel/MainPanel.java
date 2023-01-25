package WindowBuilder.view.panel;

import java.awt.CardLayout;

import javax.swing.JPanel;

import lombok.Data;
@Data
public class MainPanel extends InitPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static MainPanel instance;
	private CardLayout mainCard;
	public static MainPanel getInstance() {
		if(instance == null) {
			instance = new MainPanel();
		}
		return instance;
	}
	
	
	private MainPanel() {
		mainCard = new CardLayout();
		
		
		setLayout(mainCard);
		
	}
	
	public void init() {
		LoginPanel loginpanel = new LoginPanel();
		add(loginpanel, "loginPanel");
		RegisterPanel registerPanel = new RegisterPanel();
		add(registerPanel, "registerPanel");
		
	}
	
	
}
