package org.compsys704;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class ACS_Canvas {

	private JFrame frmSecurityAccessControl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACS_Canvas window = new ACS_Canvas();
					window.frmSecurityAccessControl.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ACS_Canvas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSecurityAccessControl = new JFrame();
		frmSecurityAccessControl.setTitle("Security Access Control GUI");
		frmSecurityAccessControl.setBounds(500, 500, 550, 500);
		frmSecurityAccessControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSecurityAccessControl.getContentPane().setLayout(null);
		
		JButton enable = new JButton("enable");
		enable.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_DOOR1_UNLOCK));
		
		JButton accessOffice = new JButton("O");
		accessOffice.setHorizontalAlignment(SwingConstants.LEFT);
		accessOffice.setFont(new Font("Tahoma", Font.PLAIN, 6));
		enable.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_OFFICEACCESS));
		
		JButton btnNewButton_1_1_1 = new JButton("Fire");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton locZone0 = new JButton("0");
		locZone0.setHorizontalAlignment(SwingConstants.LEFT);
		locZone0.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone0.setBounds(406, 420, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone0);
		
		JLabel door1Unlock = new JLabel("");
		door1Unlock.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		door1Unlock.setBackground(Color.GREEN);
		door1Unlock.setBounds(53, 141, 10, 70);
		frmSecurityAccessControl.getContentPane().add(door1Unlock);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1.setBounds(444, 296, 60, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Manual");
		btnNewButton_2_1.setBounds(148, 407, 85, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2 = new JButton("Automatic");
		btnNewButton_2.setBounds(28, 407, 85, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_2);
		
		JButton locZone7 = new JButton("7");
		locZone7.setHorizontalAlignment(SwingConstants.LEFT);
		locZone7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone7.setBounds(357, 420, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone7);
		
		JButton locZone4 = new JButton("4");
		locZone4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		locZone4.setHorizontalAlignment(SwingConstants.LEFT);
		locZone4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone4.setBounds(332, 392, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone4);
		
		JButton locZone5 = new JButton("5");
		locZone5.setHorizontalAlignment(SwingConstants.LEFT);
		locZone5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone5.setBounds(382, 392, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone5);
		
		JButton locZone6 = new JButton("6");
		locZone6.setHorizontalAlignment(SwingConstants.LEFT);
		locZone6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone6.setBounds(431, 392, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone6);
		
		JButton locZone3 = new JButton("3");
		locZone3.setHorizontalAlignment(SwingConstants.LEFT);
		locZone3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone3.setBounds(431, 361, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone3);
		
		JButton locZone2 = new JButton("2");
		locZone2.setHorizontalAlignment(SwingConstants.LEFT);
		locZone2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone2.setBounds(382, 361, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone2);
		
		JButton locZone1 = new JButton("1");
		locZone1.setHorizontalTextPosition(SwingConstants.CENTER);
		locZone1.setHorizontalAlignment(SwingConstants.LEFT);
		locZone1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone1.setBounds(332, 361, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone1);
		
		JButton btnNewButton_1_1 = new JButton("M");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1.setBounds(395, 296, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1);
		accessOffice.setBounds(347, 296, 39, 21);
		frmSecurityAccessControl.getContentPane().add(accessOffice);
		
		JLabel lblNewLabel_7 = new JLabel("Access:");
		lblNewLabel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_7.setBounds(305, 290, 133, 33);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_7);
		enable.setBounds(80, 380, 85, 21);
		frmSecurityAccessControl.getContentPane().add(enable);
		
		enable.addActionListener(e -> {
			if(States.DOOR1_LOCK) {
				System.out.println("shit");
				door1Unlock.setOpaque(true);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
			if(States.DOOR1_UNLOCK){
				System.out.println("fuck");
				door1Unlock.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		
		JLabel lblNewLabel_6_3_1 = new JLabel("Person Location");
		lblNewLabel_6_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6_3_1.setOpaque(true);
		lblNewLabel_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_6_3_1.setBackground(new Color(204, 242, 255));
		lblNewLabel_6_3_1.setBounds(315, 333, 181, 120);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_6_3_1);
		
		JLabel lblNewLabel_6 = new JLabel("ABS Status");
		lblNewLabel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBackground(Color.PINK);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBounds(10, 275, 243, 90);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_6);
		
		JLabel Door3Lock = new JLabel("");
		Door3Lock.setOpaque(true);
		Door3Lock.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Door3Lock.setBackground(Color.RED);
		Door3Lock.setBounds(273, 219, 70, 10);
		frmSecurityAccessControl.getContentPane().add(Door3Lock);
		
		JLabel Door2Lock = new JLabel("");
		Door2Lock.setOpaque(true);
		Door2Lock.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Door2Lock.setBackground(Color.RED);
		Door2Lock.setBounds(243, 141, 10, 70);
		frmSecurityAccessControl.getContentPane().add(Door2Lock);
		
		JLabel Door1Lock = new JLabel("");
		Door1Lock.setBackground(Color.RED);
		Door1Lock.setOpaque(true);
		Door1Lock.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		Door1Lock.setBounds(53, 141, 10, 70);
		frmSecurityAccessControl.getContentPane().add(Door1Lock);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Zone7");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_4_1_1.setOpaque(true);
		lblNewLabel_4_1_1.setBounds(393, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Zone 5\r\n(ABS ZONE)");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_4_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_4_1.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_4_1.setBackground(Color.PINK);
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setBounds(333, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("Zone6");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBounds(273, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_4);
		
		JLabel label_1 = new JLabel("Zone3");
		label_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setOpaque(true);
		label_1.setBackground(new Color(204, 242, 255));
		label_1.setBounds(362, 126, 110, 100);
		frmSecurityAccessControl.getContentPane().add(label_1);
		
		JLabel label = new JLabel("Zone2");
		label.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(new Color(204, 242, 255));
		label.setOpaque(true);
		label.setBounds(252, 126, 110, 100);
		frmSecurityAccessControl.getContentPane().add(label);
		
		JLabel lblNewLabel_3 = new JLabel("Proximity Sensor Zone\r\n");
		lblNewLabel_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBackground(Color.GREEN);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(252, 26, 220, 100);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Zone1");
		lblNewLabel_2_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setBackground(new Color(204, 242, 255));
		lblNewLabel_2_1.setBounds(53, 126, 200, 100);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Zone7");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_2.setBackground(new Color(204, 242, 255));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(53, 26, 200, 100);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Office Section");
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(204, 211, 255));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(30, 10, 232, 255);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Manufacturing Section");
		lblNewLabel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(204, 211, 255));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setBounds(253, 10, 243, 255);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Mode Select");
		lblNewLabel_6_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6_2.setOpaque(true);
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_6_2.setBackground(new Color(204, 211, 255));
		lblNewLabel_6_2.setBounds(10, 363, 243, 90);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Manual Input");
		lblNewLabel_6_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6_3.setOpaque(true);
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_6_3.setBackground(new Color(204, 211, 255));
		lblNewLabel_6_3.setBounds(283, 275, 243, 178);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_6_3);
	}
}
