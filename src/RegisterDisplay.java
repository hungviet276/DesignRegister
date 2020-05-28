import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class RegisterDisplay extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	int xx,xy;

	public static void main(String[] args) {

				try {
					RegisterDisplay frame = new RegisterDisplay();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

	}
	

	public RegisterDisplay() {
		setBackground(new Color(252, 252, 252));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(249, 249, 249));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(198, 87, 87));
		panel.setBounds(0, 0, 346, 490);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Codegym Messenger");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setForeground(new Color(250, 247, 247));
		lblNewLabel.setBounds(35, 305, 300, 27);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				 xx = e.getX();
			     xy = e.getY();
			}
		});
		label.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				
				int x = arg0.getXOnScreen();
	            int y = arg0.getYOnScreen();
	            RegisterDisplay.this.setLocation(x - xx, y - xy);
			}
		});
		label.setBounds(-20, 0, 400, 275);
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setIcon(new ImageIcon(RegisterDisplay.class.getResource("/images/bg.jpg")));
		panel.add(label);

		JLabel lblWeGotYou = new JLabel("Hãy code theo cách của bạn");
		lblWeGotYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeGotYou.setForeground(new Color(219, 238, 233));
		lblWeGotYou.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWeGotYou.setBounds(35, 343, 300, 27);
		panel.add(lblWeGotYou);

		JLabel lblWeGotYou1 = new JLabel("Và trả tiền theo cách của chúng tôi");
		lblWeGotYou1.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeGotYou1.setForeground(new Color(229, 239, 237));
		lblWeGotYou1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWeGotYou1.setBounds(35, 363, 300, 27);
		panel.add(lblWeGotYou1);


		// Signup
		Button button = new Button("SignUp");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(17, 1, 146));
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(395, 363, 283, 36);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(395, 83, 283, 36);
		contentPane.add(textField);
		textField.setColumns(10);

		// FullName
		JLabel fullName = new JLabel("FULLNAME");
		fullName.setBounds(395, 58, 114, 14);
		fullName.setForeground(new Color(17, 1, 146));
		contentPane.add(fullName);

		// userName
		JLabel userName = new JLabel("USERNAME");
		userName.setBounds(395, 132, 114, 14);
		userName.setForeground(new Color(17, 1, 146));
		contentPane.add(userName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(395, 157, 283, 36);
		contentPane.add(textField_1);

		//passWord
		JLabel password = new JLabel("PASSWORD");
		password.setBounds(395, 204, 96, 14);
		password.setForeground(new Color(17, 1, 146));
		contentPane.add(password);
		
		JLabel repeatPassword = new JLabel("REPEAT PASSWORD");
		repeatPassword.setBounds(395, 275, 133, 14);
		repeatPassword.setForeground(new Color(17, 1, 146));
		contentPane.add(repeatPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(395, 229, 283, 36);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(395, 293, 283, 36);
		contentPane.add(passwordField_1);
		
		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				System.exit(0);
			}
		});
		lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close.setForeground(new Color(241, 57, 83));
		lbl_close.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_close.setBounds(691, 0, 37, 27);
		contentPane.add(lbl_close);
	}
}
