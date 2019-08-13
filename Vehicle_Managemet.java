package mitaoe.project_DBMS;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Eclipse_inventory_vehicle.Eclipse_inventory;
import mitaoe.project.AfterLogIn.AfterLogIn;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Vehicle_Managemet extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vehicle_Managemet frame = new Vehicle_Managemet();
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
	public Vehicle_Managemet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 424, 10);
		contentPane.add(panel);
		
		JLabel lblVehicleServiceManagement = new JLabel("Vehicle Service Management System");
		lblVehicleServiceManagement.setHorizontalAlignment(SwingConstants.CENTER);
		lblVehicleServiceManagement.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblVehicleServiceManagement.setBounds(50, 11, 379, 25);
		contentPane.add(lblVehicleServiceManagement);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(30, 132, 93, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(30, 172, 93, 14);
		contentPane.add(lblPassword);
		
		JLabel lblLoginIntoSystem = new JLabel("Login into System");
		lblLoginIntoSystem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLoginIntoSystem.setBounds(177, 47, 111, 14);
		contentPane.add(lblLoginIntoSystem);
		
		textField = new JTextField();
		textField.setBounds(235, 131, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(235, 171, 127, 20);
		contentPane.add(passwordField);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chu","root","akalol");
					String query="select username,password from log where username='"+textField.getText()+"' and password='"+passwordField.getText()+"'";
					PreparedStatement stmt=connection.prepareStatement(query);
				    ResultSet rs=stmt.executeQuery(query); 
				    if (rs.next()) {
							JOptionPane.showMessageDialog(null,"LogIN");
							AfterLogIn info =new AfterLogIn();
							AfterLogIn.main(null);
							}
							else {
								JOptionPane.showMessageDialog(null,"Inavlid Login Details","LogIn Error",JOptionPane.ERROR_MESSAGE);
								dispose();
							}
           
				   } catch (SQLException e1) {
					JOptionPane.showMessageDialog(null,e1);
				}   
				
				
				  
				    
				   
			}
		});
		btnLogIn.setBounds(30, 280, 89, 23);
		contentPane.add(btnLogIn);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnReset.setBounds(185, 280, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if u want to exit","Vehicle Service Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{System.exit(0);}
			}
		});
		btnExit.setBounds(340, 280, 89, 23);
		contentPane.add(btnExit);
	}
}
