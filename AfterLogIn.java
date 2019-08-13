package mitaoe.project.AfterLogIn;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import DelData.DelData;
import Eclipse_inventory_vehicle.Eclipse_inventory;
import showAll.showAll;
import updateData.mitaoe.UpdateData;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class AfterLogIn {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterLogIn window = new AfterLogIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AfterLogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblVehicleServiceManagement = new JLabel("Vehicle Service Management System");
		lblVehicleServiceManagement.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVehicleServiceManagement.setBounds(79, 11, 311, 14);
		panel.add(lblVehicleServiceManagement);
		
		JButton btnNewButton = new JButton("New Customer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eclipse_inventory info=new Eclipse_inventory();
				Eclipse_inventory.main(null);
			}
		});
		btnNewButton.setBounds(178, 47, 118, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdateData info=new UpdateData();
				UpdateData.main(null);
			}
		});
		btnNewButton_1.setBounds(178, 81, 118, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show All");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				showAll info =new showAll();
				showAll.main(null);
			}
		});
		btnNewButton_2.setBounds(178, 115, 118, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DelData info=new DelData();
				DelData.main(null);
			}
		});
		btnNewButton_3.setBounds(178, 149, 118, 23);
		panel.add(btnNewButton_3);
	}
}
