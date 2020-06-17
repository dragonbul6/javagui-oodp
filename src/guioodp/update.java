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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class update extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField cost;
	private JTextField status;
	private JButton btnUpdate;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					update frame = new update();
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
	public update() {
		setTitle("update");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name = new JTextField();
		name.setBounds(190, 109, 217, 22);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(103, 107, 56, 16);
		contentPane.add(lblName);
		
		cost = new JTextField();
		cost.setBounds(193, 156, 214, 22);
		contentPane.add(cost);
		cost.setColumns(10);
		
		JLabel lblCost = new JLabel("Cost :");
		lblCost.setForeground(Color.WHITE);
		lblCost.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCost.setBounds(113, 153, 56, 16);
		contentPane.add(lblCost);
		
		JLabel lblNewLabel = new JLabel("Status :");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(103, 198, 56, 16);
		contentPane.add(lblNewLabel);
		
		status = new JTextField();
		status.setBounds(194, 204, 212, 22);
		contentPane.add(status);
		status.setColumns(10);
		
		
		
	
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(Color.WHITE);
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				adminpage x = new adminpage();
				x.setVisible(true);
				setVisible(false);
				
			}
			
		});
		
		
		btnBack.setBounds(103, 276, 97, 25);
		contentPane.add(btnBack);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBackground(Color.WHITE);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				adminpage x = new adminpage();
				x.setName(name.getText());
				x.setCost(Integer.parseInt(cost.getText()));
				x.setStatus(status.getText());
				
				x.setVisible(true);
				setVisible(false);
				}catch(Exception b){
					JOptionPane.showMessageDialog(null, "Checking the information carefully.");
				}
			}
		});
		btnUpdate.setBounds(300, 275, 97, 25);
		contentPane.add(btnUpdate);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(update.class.getResource("/pic/pic7.png")));
		label.setBounds(0, -1, 566, 341);
		contentPane.add(label);
	}

}
