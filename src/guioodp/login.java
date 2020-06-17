package guioodp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JPasswordField pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/pic/pic3.png")));
		setType(Type.UTILITY);
		setTitle("ReAnu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel aa = new JLabel("Account ID :");
		aa.setForeground(Color.WHITE);
		aa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		aa.setBounds(242, 90, 83, 16);
		contentPane.add(aa);
		
		id = new JTextField();
		id.setBounds(351, 88, 134, 22);
		contentPane.add(id);
		id.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(242, 146, 83, 16);
		contentPane.add(lblPassword);
		
		

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ids = null ; 
				// 84 is poly 
				account check = null;
				
				try{
					String aid = id.getText();
					int pwz = Integer.parseInt(pw.getText());
				
					if(aid.equals("student01")){
					check = new student01(aid,pwz);
					JOptionPane.showMessageDialog(null, check.checkacc());
					ids = "id1";
					
				}else if(aid.equals("student02")){
					check = new student02(aid,pwz);
					JOptionPane.showMessageDialog(null, check.checkacc());
					ids = "id2";
				}else if(aid.equals("student03")){
					check = new student03(aid,pwz);
					JOptionPane.showMessageDialog(null, check.checkacc());
					ids = "id3";
				}
				
				else{
					try{
						
						id.setText(null);
						pw.setText(null);
						}catch(NullPointerException x){
							JOptionPane.showMessageDialog(null, "It doesn't have any account that you fill ..");
						}
				}
					try{
					if(check.isChecking() == true){
						studentmain next = new studentmain();
						next.setId(ids);
						next.setVisible(true);
						setVisible(false);
					}
					}catch(NullPointerException sd){
						JOptionPane.showMessageDialog(null, "It doesn't have any account that you fill ..");
						id.setText(null);
						pw.setText(null);
					}
					
					//try catch
				}catch(NumberFormatException q){
					msg b;
					b = new check();
					JOptionPane.showMessageDialog(null, b.ms());
					pw.setText(null);
				}
				
			}
		});
		btnNewButton.setBounds(388, 221, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg a;
				id.setText(null);
				pw.setText(null);
				a = new msg1();
				JOptionPane.showMessageDialog(null, a.ms());
			}
		});
		btnNewButton_1.setBounds(242, 222, 97, 25);
		contentPane.add(btnNewButton_1);
		
		pw = new JPasswordField();
		pw.setBounds(351, 153, 134, 22);
		contentPane.add(pw);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBackground(Color.WHITE);
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginadmin x = new loginadmin();
				x.setVisible(true);
				setVisible(false);
			}
		});
		btnAdmin.setBounds(79, 220, 77, 25);
		contentPane.add(btnAdmin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/pic/pic9.png")));
		lblNewLabel.setBounds(66, 75, 108, 100);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(login.class.getResource("/pic/pic8.png")));
		label.setBounds(0, -13, 557, 349);
		contentPane.add(label);
	}
}
