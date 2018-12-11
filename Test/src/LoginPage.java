import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
//import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
//import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import javax.swing.JTextPane;
import javax.swing.JPasswordField;
public class LoginPage {

	private JFrame frame;
	private JTextField username;
	private JLabel lblLoginAs;
	private JRadioButton rdbtnPurchaseComm;
	private JRadioButton rdbtnIntendor;
	private JLabel lblPurchaseManagement;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Login");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(23, 52, 134, 28);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(23, 105, 134, 37);
		
		username = new JTextField();
		username.setBounds(158, 57, 225, 19);
		username.setColumns(10);
		
		lblLoginAs = new JLabel("Login As");
		lblLoginAs.setBounds(179, 145, 60, 15);
		
		rdbtnPurchaseComm = new JRadioButton("Purchase Comm.");
		rdbtnPurchaseComm.setBounds(50, 168, 142, 23);
		
		rdbtnIntendor = new JRadioButton("Intendor");
		rdbtnIntendor.setBounds(300, 168, 86, 23);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnPurchaseComm);
		group.add(rdbtnIntendor);
		
		JLabel tend = new JLabel("");
		tend.setBounds(301, 242, 125, 15);
		tend.setText("<html><a href=\"\">View Tenders... </a></html>");
        tend.setCursor(new Cursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(tend);
		
		lblPurchaseManagement = new JLabel("Purchase Management");
		lblPurchaseManagement.setBounds(137, 30, 205, 15);
		frame.getContentPane().add(lblPurchaseManagement);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 114, 225, 19);
		passwordField.setEditable(false);
		frame.getContentPane().add(passwordField);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//char[] password = passwordField.getPassword();
				String usname = username.getText();
				if (rdbtnIntendor.isSelected()) {
					//Intender Welcome Page
					new IntendLoginCont(usname);
				}
				else {
					//Purchase committee welcome page
					new PurchaseLoginCont(usname);
					
				}
				frame.setVisible(false);
			}
		});
		btnSubmit.setBounds(170, 209, 100, 25);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblUsername);
		frame.getContentPane().add(username);
		frame.getContentPane().add(lblPassword);
		frame.getContentPane().add(lblLoginAs);
		frame.getContentPane().add(rdbtnPurchaseComm);
		frame.getContentPane().add(rdbtnIntendor);
		frame.getContentPane().add(btnSubmit);
		
		
	}
}
