package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mafia_Chat extends JFrame {
	
	private JPanel contentPane;
	static JFrame frame;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Mafia_Chat start = new Mafia_Chat();
	}
	
	public Mafia_Chat() {

		frame = new JFrame("Voting_mafia");
		contentPane = new JPanel();
		contentPane.setLayout(null);

		frame.setContentPane(contentPane);
		frame.setBounds(200, 50, 500, 500);
		frame.setVisible(true);
	}
}
