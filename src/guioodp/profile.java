package guioodp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class profile extends JFrame {
	
	
	private JPanel contentPane;
	private static String name;
	private static String status;
	private static int cost;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profile frame = new profile(name,status,cost);
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
	public profile(String name,String status , int cost) {
		setTitle("ReAnu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtname = new JLabel("Name: "+name);
		txtname.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtname.setForeground(new Color(255, 255, 255));
		txtname.setBounds(212, 108, 221, 16);
		contentPane.add(txtname);
		
		JLabel txtstatus = new JLabel("Status: "+status);
		txtstatus.setForeground(new Color(255, 255, 255));
		txtstatus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtstatus.setBounds(212, 165, 190, 16);
		contentPane.add(txtstatus);
		
		JLabel txtcost = new JLabel("Cost: "+Integer.toString(cost));
		txtcost.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtcost.setForeground(new Color(255, 255, 255));
		txtcost.setBounds(212, 224, 167, 16);
		contentPane.add(txtcost);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setForeground(Color.WHITE);
		btnPay.setBackground(Color.ORANGE);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				payment x = new payment(name);
				x.setVisible(true);
				setVisible(false);
			}
		});
		btnPay.setBounds(436, 215, 86, 25);
		contentPane.add(btnPay);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login login = new login();
				login.setVisible(true);
				setVisible(false);
			}
		});
		btnHome.setBounds(37, 283, 70, 25);
		contentPane.add(btnHome);
		
		JLabel show = new JLabel("We recievd you payment. Please wait for checking.");
		show.setFont(new Font("Tahoma", Font.BOLD, 13));
		show.setForeground(new Color(255, 255, 0));
		show.setBounds(209, 64, 331, 16);
		contentPane.add(show);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(profile.class.getResource("/pic/pic11.png")));
		label.setBounds(0, 0, 564, 342);
		contentPane.add(label);
		show.setVisible(false);
		
		this.name = name;
		this.status = status;
		this.cost = cost;
		
		if(status.equals("Yes") || status.equals("Wait")){
			btnPay.setEnabled(false);;
		}
		if(status.equals("Wait")){
			show.setVisible(true);
		}
	}
	

	
	

}
