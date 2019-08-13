package DelData;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class DelData extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelData frame = new DelData();
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
	public DelData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblVehicleServiceManagement = new JLabel("Vehicle Service Management System");
		lblVehicleServiceManagement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehicleServiceManagement.setBounds(50, 11, 336, 14);
		panel.add(lblVehicleServiceManagement);
		
		JLabel lblAadharNumber = new JLabel("Aadhar Number");
		lblAadharNumber.setBounds(50, 59, 114, 14);
		panel.add(lblAadharNumber);
		
		textField = new JTextField();
		textField.setBounds(222, 56, 139, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnButton = new JButton("Delete");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chu","root","akalol");
					String query1="delete from twoWheel where aadhar_number='"+textField.getText()+"'";
					String query2="delete from fourWheel where aadhar_number='"+textField.getText()+"'";
					String query3="delete from ser where aadhar_number='"+textField.getText()+"'";
					String query="delete from customer where aadhar_number='"+textField.getText()+"'";
					PreparedStatement statement1=connection.prepareStatement(query1);
					statement1.execute();
					PreparedStatement statement2=connection.prepareStatement(query2);
					statement2.execute();
					PreparedStatement statement3=connection.prepareStatement(query3);
					statement3.execute();
					PreparedStatement statement4=connection.prepareStatement(query);
					statement4.execute();
				    JOptionPane.showMessageDialog(null,"Data deleted");
					} catch (ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}  
			}
		});
		btnButton.setBounds(164, 148, 89, 23);
		panel.add(btnButton);
	}

}
