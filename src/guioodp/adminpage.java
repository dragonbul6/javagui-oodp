package guioodp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class adminpage extends JFrame {

	private JPanel contentPane;
	private String name,status;
	private int cost;

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
			private String name;
			private String status;
			private int cost;

			public void run() {
				try {
					adminpage frame = new adminpage();
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
	public adminpage() {
		setTitle("admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 86, 432, 115);
		contentPane.add(scrollPane);
		
		JTextArea area = new JTextArea();
		scrollPane.setViewportView(area);
		
		array a = new array();
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBackground(Color.WHITE);
		btnPrint.setBounds(394, 225, 97, 25);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				a.setX(new accountadmin ("Finlay Gordon","Yes",35000) );
				a.setX(new accountadmin ("Dominic Harrison","Wait",28900) );
				a.setX(new accountadmin ("Willow Marshall","No",45000) );
				
				area.append("NAME     |     Status     | Cost \n");
				ArrayList<accountadmin> x = a.getX();
				

				if(getName() != null){
					x.add(new accountadmin (name,status,cost));
				}
				
				for(accountadmin a : x){
					area.append(a.toString());
				}
				
			
	
			}
		});
		contentPane.add(btnPrint);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.setBounds(60, 226, 97, 25);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update x = new update();
				x.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.add(btnUpdate);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(adminpage.class.getResource("/pic/pic6.png")));
		label.setBounds(-3, -5, 560, 335);
		contentPane.add(label);
		
		
		
		
		
	}
}
