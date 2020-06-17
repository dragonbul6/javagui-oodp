package guioodp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(main.class.getResource("/pic/pic3.png")));
		setTitle("ReANU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 564);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnYouMustLogin = new JButton("Login");
		btnYouMustLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnYouMustLogin.setForeground(new Color(0, 0, 0));
		btnYouMustLogin.setBackground(new Color(255, 255, 255));
		btnYouMustLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login login = new login();
				login.setVisible(true);
				setVisible(false);
			}
		});
		btnYouMustLogin.setBounds(314, 459, 90, 25);
		contentPane.add(btnYouMustLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 255));
		panel_1.setBorder(null);
		panel_1.setToolTipText("ANNOUCMENT!");
		panel_1.setForeground(Color.BLUE);
		panel_1.setBounds(38, 225, 122, 25);
		contentPane.add(panel_1);
		
		JLabel lblAnnoucment = new JLabel("ANNOUCMENT!");
		lblAnnoucment.setForeground(new Color(255, 255, 255));
		panel_1.add(lblAnnoucment);
		
		JLabel lblStudentMust = new JLabel("");
		lblStudentMust.setIcon(new ImageIcon(main.class.getResource("/pic/pic2.png")));
		lblStudentMust.setForeground(new Color(255, 255, 255));
		lblStudentMust.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 16));
		lblStudentMust.setBounds(38, 249, 366, 120);
		contentPane.add(lblStudentMust);
		
		JLabel lblWelcomeToReanu = new JLabel("Welcome to reANU");
		lblWelcomeToReanu.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblWelcomeToReanu.setForeground(new Color(255, 255, 255));
		lblWelcomeToReanu.setBounds(140, 156, 185, 41);
		contentPane.add(lblWelcomeToReanu);
		
		JLabel lblYouMustLogin = new JLabel("You must login First!");
		lblYouMustLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblYouMustLogin.setForeground(new Color(255, 255, 255));
		lblYouMustLogin.setBounds(257, 434, 147, 18);
		contentPane.add(lblYouMustLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/pic/pic.png")));
		lblNewLabel.setBounds(0, 0, 444, 522);
		contentPane.add(lblNewLabel);
	}
}
