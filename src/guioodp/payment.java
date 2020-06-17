package guioodp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class payment extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField mail;
	private JTextField phone;
	private JTextField textField_3;
	private JTextField nameon;
	private JPasswordField scod;
	private static String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment(name);
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
	public payment(String name) {
		setTitle("Payment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(39, 103, 56, 16);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setText(name);
		textField.setEnabled(false);
		textField.setBounds(107, 100, 152, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(39, 149, 56, 16);
		contentPane.add(lblEmail);
		
		mail = new JTextField();
		mail.setBounds(107, 146, 152, 22);
		contentPane.add(mail);
		mail.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setForeground(Color.WHITE);
		lblPhone.setBounds(39, 197, 56, 16);
		contentPane.add(lblPhone);
		
		phone = new JTextField();
		phone.setBounds(107, 194, 152, 22);
		contentPane.add(phone);
		phone.setColumns(10);
		
		JLabel lblCardDetails = new JLabel("Card Details");
		lblCardDetails.setForeground(Color.WHITE);
		lblCardDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCardDetails.setBounds(39, 257, 103, 16);
		contentPane.add(lblCardDetails);
		
		JLabel lblCardType = new JLabel("Card Type");
		lblCardType.setForeground(Color.WHITE);
		lblCardType.setBounds(47, 304, 83, 16);
		contentPane.add(lblCardType);
		JRadioButton visa = new JRadioButton("VISA");
		JRadioButton mc = new JRadioButton("Master card");
		JRadioButton amex = new JRadioButton("AmEx");
		mc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visa.setSelected(false);
				amex.setSelected(false);
			}
		});
		
		amex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				visa.setSelected(false);
				mc.setSelected(false);
			}
		});
		
		visa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amex.setSelected(false);
				mc.setSelected(false);
			}
		});
		visa.setBounds(125, 300, 73, 25);
		contentPane.add(visa);
		
		
		amex.setBounds(216, 300, 73, 25);
		contentPane.add(amex);
		
		
		mc.setBounds(302, 300, 103, 25);
		contentPane.add(mc);
		
		JLabel lblNewLabel = new JLabel("Card Number");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(47, 347, 83, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblPayment = new JLabel("PAYMENT");
		lblPayment.setForeground(Color.WHITE);
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPayment.setBounds(39, 41, 118, 34);
		contentPane.add(lblPayment);
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 344, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSecurityCode = new JLabel("Security Code");
		lblSecurityCode.setForeground(Color.WHITE);
		lblSecurityCode.setBounds(267, 347, 83, 16);
		contentPane.add(lblSecurityCode);
		
		JLabel lblNameOnCard = new JLabel("Name on Card");
		lblNameOnCard.setForeground(Color.WHITE);
		lblNameOnCard.setBounds(47, 394, 83, 16);
		contentPane.add(lblNameOnCard);
		
		nameon = new JTextField();
		nameon.setBounds(137, 391, 116, 22);
		contentPane.add(nameon);
		nameon.setColumns(10);
		
		JButton btnPay = new JButton("Pay");
		btnPay.setForeground(new Color(255, 255, 255));
		btnPay.setBackground(Color.ORANGE);
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				int number = Integer.parseInt(phone.getText());
				int code = Integer.parseInt(scod.getText());
				int card = Integer.parseInt(textField_3.getText());

				
					main a = new main();
					a.setVisible(true);
					setVisible(false);
				

				}catch(Exception x){
					JOptionPane.showMessageDialog(null, "Please re-enter your information.");
				}
			}
		});
		
		btnPay.setBounds(326, 444, 73, 25);
		contentPane.add(btnPay);
		
		scod = new JPasswordField();
		scod.setBounds(362, 344, 46, 22);
		contentPane.add(scod);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(payment.class.getResource("/pic/pic4.png")));
		label.setBounds(0, 0, 444, 522);
		contentPane.add(label);
	}
}
