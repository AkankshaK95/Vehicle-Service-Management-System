package updateData.mitaoe;

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

public class UpdateData extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateData frame = new UpdateData();
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
	public UpdateData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblServiceId = new JLabel("Service ID");
		lblServiceId.setBounds(50, 72, 60, 14);
		panel.add(lblServiceId);
		
		JLabel lblDeliveryDate = new JLabel("Delivery Date");
		lblDeliveryDate.setBounds(51, 114, 78, 14);
		panel.add(lblDeliveryDate);
		
		JLabel lblVehicleServiceManagement = new JLabel("Vehicle Service Management System");
		lblVehicleServiceManagement.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVehicleServiceManagement.setBounds(20, 11, 404, 14);
		panel.add(lblVehicleServiceManagement);
		
		textField = new JTextField();
		textField.setBounds(240, 69, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(240, 111, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chu","root","akalol");
				String query="update ser set delivery='"+textField_1.getText()+"'where service_id='"+textField.getText()+"'";
				PreparedStatement statement=connection.prepareStatement(query);
				statement.execute();
			    JOptionPane.showMessageDialog(null,"Data Updated");
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}  
				
			}
		});
		btnUpdate.setBounds(161, 182, 89, 23);
		panel.add(btnUpdate);
	}
}
