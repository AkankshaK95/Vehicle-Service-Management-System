package showAll;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.JLabel;
import java.awt.Font;

public class showAll extends JFrame {

	private JPanel contentPane;
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					showAll frame = new showAll();
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
	public showAll() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 84, 769, 302);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chu","root","akalol");
					String query="select distinct * from customer natural join twoWheel natural join ser union select distinct * from customer natural join fourWheel natural join ser";

							
				    Statement stmt=connection.createStatement();
				    ResultSet rs=stmt.executeQuery(query);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
           
				} catch (Exception e1) {
					System.err.println(e1);
				}  
				
			}
		});
		btnLoadData.setBounds(296, 50, 296, 23);
		contentPane.add(btnLoadData);
		
		JLabel lblVehicleManagementSystem = new JLabel("Vehicle Management System");
		lblVehicleManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVehicleManagementSystem.setBounds(286, 11, 379, 14);
		contentPane.add(lblVehicleManagementSystem);
	}
}
