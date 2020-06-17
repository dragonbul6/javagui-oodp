package guioodp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class studentmain extends JFrame {

	private JPanel contentPane;
	private String id;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentmain frame = new studentmain();
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
	public studentmain() {
		setTitle("ReANU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 0));
		panel_1.setBorder(null);
		panel_1.setToolTipText("ANNOUCMENT!");
		panel_1.setForeground(Color.BLUE);
		panel_1.setBounds(35, 219, 102, 26);
		contentPane.add(panel_1);
		
		JLabel lblAnnoucment = new JLabel("ANNOUCMENT!");
		lblAnnoucment.setBackground(new Color(255, 204, 0));
		lblAnnoucment.setForeground(new Color(0, 51, 255));
		panel_1.add(lblAnnoucment);
		
		JButton btnYouMustLogin = new JButton("Click Here!");
		btnYouMustLogin.setBackground(Color.WHITE);
		btnYouMustLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String status = null,name = null;
				int cost = 0;

				accountdetail x;
				if(getId().equals("id1")){
					x = new accstudent01();
					name = x.getName();
					status = x.getStatus();
					cost = x.getCost();
				}else if(getId().equals("id2")){
					x = new accstudent02();
					name = x.getName();
					status = x.getStatus();
					cost = x.getCost();
				}else if(getId().equals("id3")){
					x = new accstudent03();
					name = x.getName();
					status = x.getStatus();
					cost = x.getCost();
				}
				
				profile b = new profile(name,status,cost);
				b.setVisible(true);
				setVisible(false);
			
			}
		});
		btnYouMustLogin.setBounds(281, 409, 118, 25);
		contentPane.add(btnYouMustLogin);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(studentmain.class.getResource("/pic/pic5.png")));
		lblNewLabel_1.setBounds(35, 105, 377, 115);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Checking Status of Payment ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(151, 355, 255, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(studentmain.class.getResource("/pic/pic4.png")));
		lblNewLabel.setBounds(0, 0, 438, 510);
		contentPane.add(lblNewLabel);
	}
}
