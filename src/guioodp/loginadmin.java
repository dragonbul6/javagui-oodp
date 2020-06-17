package guioodp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class loginadmin extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JPasswordField pw;
	private JButton btnHome;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginadmin frame = new loginadmin();
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
	public loginadmin() {
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminId = new JLabel("Admin ID :");
		lblAdminId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdminId.setForeground(Color.WHITE);
		lblAdminId.setBounds(235, 109, 81, 16);
		contentPane.add(lblAdminId);
		
		id = new JTextField();
		id.setBounds(340, 106, 116, 22);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(235, 163, 81, 16);
		contentPane.add(lblPassword);
		
		pw = new JPasswordField();
		pw.setBounds(343, 160, 113, 22);
		contentPane.add(pw);
		
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id.getText().equals("admin") && pw.getText().equals("1234")){
					adminpage x = new adminpage();
					x.setVisible(true);
					setVisible(false);
					
				}else{
					JOptionPane.showMessageDialog(null, "Re-enter the admin account..");
				}
			}
		});
		btnSubmit.setBounds(359, 220, 97, 25);
		contentPane.add(btnSubmit);
		
		btnHome = new JButton("Home");
		btnHome.setBackground(Color.WHITE);
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main a =new main();
				a.setVisible(true);
				setVisible(false);
			}
		});
		btnHome.setBounds(235, 220, 97, 25);
		contentPane.add(btnHome);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(loginadmin.class.getResource("/pic/pic10.png")));
		lblNewLabel.setBounds(100, 65, 90, 83);
		contentPane.add(lblNewLabel);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(loginadmin.class.getResource("/pic/pic9.png")));
		label.setBounds(67, 89, 108, 100);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setBackground(Color.WHITE);
		label_1.setIcon(new ImageIcon(loginadmin.class.getResource("/pic/pic8.png")));
		label_1.setBounds(0, 0, 573, 335);
		contentPane.add(label_1);
		
	}

}
