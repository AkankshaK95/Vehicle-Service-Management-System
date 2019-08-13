package Eclipse_inventory_vehicle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
public class Eclipse_inventory extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblTradeInA;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eclipse_inventory frame = new Eclipse_inventory();
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
	public Eclipse_inventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1380,800);
		contentPane = new JPanel();
		contentPane.setToolTipText("car bike\r\n");
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel.setBounds(10, 48, 563, 288);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 24, 103, 25);
		panel.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Address");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(10, 72, 103, 25);
		panel.add(lblName);
		
		JLabel lblAddress = new JLabel("Aadhar Number");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(10, 124, 166, 25);
		panel.add(lblAddress);
		
		JLabel lblPostcode = new JLabel("Mobile Number");
		lblPostcode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPostcode.setBounds(10, 179, 152, 25);
		panel.add(lblPostcode);
		
		JLabel lblMobileNumber = new JLabel("Email ID");
		lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMobileNumber.setBounds(10, 237, 132, 25);
		panel.add(lblMobileNumber);
		
		textField = new JTextField();
		textField.setBounds(267, 24, 209, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(267, 72, 209, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(267, 124, 209, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(267, 179, 209, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(267, 237, 209, 20);
		panel.add(textField_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_1.setBounds(599, 48, 402, 297);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCostOfCar = new JLabel("Cost of Servicing");
		lblCostOfCar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCostOfCar.setBounds(32, 11, 148, 25);
		panel_1.add(lblCostOfCar);
		
		textField_10 = new JTextField();
		textField_10.setBounds(42, 47, 124, 20);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblLabour = new JLabel("Labour");
		lblLabour.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLabour.setBounds(32, 102, 84, 20);
		panel_1.add(lblLabour);
		
		textField_11 = new JTextField();
		textField_11.setBounds(42, 133, 124, 20);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cost Of Consumables");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(32, 197, 189, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_17 = new JTextField();
		textField_17.setBounds(42, 236, 124, 20);
		panel_1.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Service_ID");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(266, 12, 106, 23);
		panel_1.add(lblNewLabel_4);
		
		textField_19 = new JTextField();
		textField_19.setText("");
		textField_19.setBounds(266, 47, 86, 20);
		panel_1.add(textField_19);
		textField_19.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_2.setBounds(10, 370, 563, 270);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(176, 32, 10, 10);
		panel_2.add(panel_6);
		
		lblTradeInA = new JLabel("Two WheelerType");
		lblTradeInA.setBounds(10, 11, 163, 25);
		panel_2.add(lblTradeInA);
		lblTradeInA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField_16 = new JTextField();
		textField_16.setBounds(33, 47, 124, 20);
		panel_2.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblDateOfArrival = new JLabel("Date Of Arrival");
		lblDateOfArrival.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDateOfArrival.setBounds(33, 93, 157, 14);
		panel_2.add(lblDateOfArrival);
		
		textField_5 = new JTextField();
		textField_5.setBounds(33, 118, 124, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDeliveryDate = new JLabel("Delivery Date");
		lblDeliveryDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDeliveryDate.setBounds(398, 93, 127, 14);
		panel_2.add(lblDeliveryDate);
		
		textField_6 = new JTextField();
		textField_6.setBounds(401, 118, 124, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblServiceRequirement = new JLabel("Service Requirement");
		lblServiceRequirement.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblServiceRequirement.setBounds(19, 175, 184, 14);
		panel_2.add(lblServiceRequirement);
		
		textField_7 = new JTextField();
		textField_7.setBounds(269, 174, 284, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblConsumables = new JLabel("Consumables");
		lblConsumables.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblConsumables.setBounds(19, 222, 170, 14);
		panel_2.add(lblConsumables);
		
		textField_8 = new JTextField();
		textField_8.setBounds(269, 216, 284, 20);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblVehicleNumber = new JLabel("Vehicle Number1");
		lblVehicleNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehicleNumber.setBounds(214, 16, 152, 14);
		panel_2.add(lblVehicleNumber);
		
		textField_9 = new JTextField();
		textField_9.setBounds(224, 47, 116, 20);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblVehicleNumber_1 = new JLabel("Vehicle Number2");
		lblVehicleNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVehicleNumber_1.setBounds(214, 91, 152, 14);
		panel_2.add(lblVehicleNumber_1);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(224, 118, 116, 20);
		panel_2.add(textField_18);
		
		JLabel lblFourWheelerType = new JLabel("Four Wheeler Type");
		lblFourWheelerType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFourWheelerType.setBounds(390, 11, 173, 25);
		panel_2.add(lblFourWheelerType);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(413, 47, 124, 20);
		panel_2.add(textField_20);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_3.setLayout(null);
		panel_3.setBounds(599, 370, 402, 270);
		contentPane.add(panel_3);
		
		JLabel lblTax = new JLabel("Subtotal");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTax.setBounds(22, 29, 124, 25);
		panel_3.add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Tax");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSubtotal.setBounds(22, 90, 124, 25);
		panel_3.add(lblSubtotal);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 145, 354, 25);
		panel_3.add(separator);
		
		JLabel lblTotalCost = new JLabel("Total Cost");
		lblTotalCost.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotalCost.setBounds(22, 181, 124, 25);
		panel_3.add(lblTotalCost);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_12.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_12.setBounds(253, 29, 101, 20);
		panel_3.add(textField_12);
		textField_12.setColumns(10);
		textField_12.setText("0");
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_13.setColumns(10);
		textField_13.setText("0");
		textField_13.setBounds(253, 90, 101, 20);
		panel_3.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_14.setColumns(10);
		textField_14.setText("0");
		textField_14.setBounds(253, 181, 101, 20);
		panel_3.add(textField_14);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_4.setLayout(null);
		panel_4.setBounds(10, 651, 991, 87);
		contentPane.add(panel_4);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] carCost=new double[10];
				carCost[0]=Double.parseDouble(textField_10.getText());
				carCost[1]=Double.parseDouble(textField_11.getText());
				carCost[2]=Double.parseDouble(textField_17.getText());
				carCost[3]=carCost[0]+carCost[1]+carCost[2];
				carCost[4]=(carCost[3]*0.45)/100;
				String subTotal=String.format("Rs%.2f", carCost[3]);
				textField_12.setText(subTotal);
				String tax=String.format("Rs%.2f", carCost[4]);
				textField_13.setText(tax);
				String Total=String.format("Rs%.2f", (carCost[3]+carCost[4]));
				textField_14.setText(Total);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(26, 25, 118, 43);
		panel_4.add(btnNewButton);
		
		JButton btnRecipt = new JButton("Exit");
		btnRecipt.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if u want to exit","Vehicle Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{System.exit(0);}
			}
		});
		btnRecipt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRecipt.setBounds(501, 25, 118, 43);
		panel_4.add(btnRecipt);
		
		JButton button = new JButton("Receipt");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String cName=(textField.getText());
				String address=(textField_1.getText());
				String postCode=(textField_2.getText());
				String mobileNumber=(textField_3.getText());
				String eMail=(textField_4.getText());
				String rTax=(textField_13.getText());
				String subTot=(textField_12.getText());
				String Total=(textField_14.getText());
				String carCst=(textField_10.getText());
				String Mileage=(textField_11.getText());
				textField_15.setText("\t Car Dealer Sysytem \n"+
				"\n===================================="
				+"\nName\t\t"+cName
				+"\nAddress\t\t"+address
				+"\nPost Code\t\t"+postCode
				+"\nMobile\t\t"+mobileNumber
				+"\nEMail\t\t"+eMail
				+"\nCost of Car\t\t"+carCst
				+"\nMielage\t\t"+Mileage
				+"\nTax\t\t"+rTax
				+"\nSubtotal\t\t"+subTot
				+"\nTotal\t\t"+Total
				);
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(182, 25, 118, 43);
		panel_4.add(button);
		
		JButton button_1 = new JButton("Reset");
		button_1.addActionListener(new ActionListener() {
			private JLabel formattedTextField;

			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText("0");
				textField_11.setText("0");
				textField_12.setText("0");
				textField_13.setText("0");
				textField_14.setText("0");
				textField_17.setText("0");
				textField_15.setText(null);
				textField_18.setText(null);
				textField_19.setText(null);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_1.setBounds(341, 25, 118, 43);
		panel_4.add(button_1);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/chu","root","akalol");
						String query="insert into customer values(?,?,?,?,?)";
						PreparedStatement statement=connection.prepareStatement(query);
						statement.setString(1, textField_2.getText());
						statement.setString(2, textField.getText());
						statement.setString(3, textField_1.getText());
						statement.setString(4, textField_3.getText());
						statement.setString(5, textField_4.getText());
						statement.execute();
						String query1="insert into twoWheel values(?,?,?)";
						PreparedStatement statement1=connection.prepareStatement(query1);
						statement1.setString(1, textField_9.getText());
						statement1.setString(2, textField_16.getText());
						statement1.setString(3, textField_2.getText());
						statement1.execute();
						String query2="insert into fourWheel values(?,?,?)";
						PreparedStatement statement2=connection.prepareStatement(query2);
						statement2.setString(1, textField_18.getText());
						statement2.setString(2, textField_20.getText());
						statement2.setString(3, textField_2.getText());
					    statement2.execute();
					    String query3="insert into ser values(?,?,?,?,?,?,?)";
						PreparedStatement statement3=connection.prepareStatement(query3);
						statement3.setString(1, textField_19.getText());
						statement3.setString(2, textField_5.getText());
						statement3.setString(3, textField_6.getText());
						statement3.setString(4, textField_7.getText());
						statement3.setString(5, textField_8.getText());
						statement3.setString(6, textField_14.getText());
						statement3.setString(7, textField_2.getText());
					    statement3.execute();
					    JOptionPane.showMessageDialog(null,"Data Inserted");
	           
					} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
					}  
					
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(661, 25, 118, 43);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show All");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnNewButton_2.setBounds(851, 25, 108, 43);
		panel_4.add(btnNewButton_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_5.setBounds(1027, 49, 313, 689);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setBounds(10, 11, 293, 667);
		panel_5.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Vehicle Management System");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(383, 11, 348, 14);
		contentPane.add(lblNewLabel_2);
	}
}
