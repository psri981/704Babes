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
import javax.swing.ButtonGroup;

public class ACS_Canvas {

	private JFrame frmSecurityAccessControl;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();

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
		
		JLabel Door2Unlock = new JLabel("");
		Door2Unlock.setBorder(null);
		Door2Unlock.setBackground(Color.GREEN);
		Door2Unlock.setBounds(243, 141, 10, 70);
		frmSecurityAccessControl.getContentPane().add(Door2Unlock);
		
		
		JLabel door1Unlock = new JLabel("");
		door1Unlock.setBorder(null);
		door1Unlock.setBackground(Color.GREEN);
		door1Unlock.setBounds(53, 141, 10, 70);
		frmSecurityAccessControl.getContentPane().add(door1Unlock);
		
		JLabel door3Unlock = new JLabel("");
		door3Unlock.setBorder(null);
		door3Unlock.setBackground(Color.GREEN);
		door3Unlock.setBounds(273, 219, 70, 10);
		frmSecurityAccessControl.getContentPane().add(door3Unlock);
		
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
		
		JButton accessOffice = new JButton("O");
		buttonGroup_3.add(accessOffice);
		accessOffice.setHorizontalAlignment(SwingConstants.LEFT);
		accessOffice.setFont(new Font("Tahoma", Font.PLAIN, 6));
		accessOffice.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ACCESSOFFICE));
		accessOffice.setBounds(347, 296, 39, 21);
		frmSecurityAccessControl.getContentPane().add(accessOffice);
		
		
		JButton accessManu = new JButton("M");
		buttonGroup_4.add(accessManu);
		accessManu.setHorizontalAlignment(SwingConstants.LEFT);
		accessManu.setFont(new Font("Tahoma", Font.PLAIN, 6));
		accessManu.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ACCESSMANU));
		accessManu.setBounds(395, 296, 39, 21);
		frmSecurityAccessControl.getContentPane().add(accessManu);
		
		
		JButton btnNewButton_2_1 = new JButton("Manual");
		buttonGroup_2.add(btnNewButton_2_1);
		btnNewButton_2_1.setBounds(148, 407, 85, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_2_1);
		
		JLabel zone4 = new JLabel("Zone4");
		zone4.setHorizontalAlignment(SwingConstants.CENTER);
		zone4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone4.setBounds(393, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(zone4);
		
		JButton locZone3 = new JButton("3");
		buttonGroup_3.add(locZone3);
		locZone3.setHorizontalAlignment(SwingConstants.LEFT);
		locZone3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone3.setBounds(431, 361, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone3);
		
		JButton locZone7 = new JButton("7");
		buttonGroup_4.add(locZone7);
		locZone7.setHorizontalAlignment(SwingConstants.LEFT);
		locZone7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone7.setBounds(357, 420, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone7);
		
		JLabel lblNewLabel_7 = new JLabel("Access:");
		lblNewLabel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_7.setBounds(305, 290, 133, 33);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton_2 = new JButton("Automatic");
		buttonGroup_2.add(btnNewButton_2);
		btnNewButton_2.setBounds(28, 407, 85, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_2);
		
		JButton locZone4 = new JButton("4");
		buttonGroup_3.add(locZone4);
		locZone4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		locZone4.setHorizontalAlignment(SwingConstants.LEFT);
		locZone4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone4.setBounds(332, 392, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone4);
		
		JButton locZone2 = new JButton("2");
		buttonGroup_3.add(locZone2);
		locZone2.setHorizontalAlignment(SwingConstants.LEFT);
		locZone2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone2.setBounds(382, 361, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone2);
		
		JLabel zone2 = new JLabel("Zone2");
		zone2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone2.setHorizontalAlignment(SwingConstants.CENTER);
		zone2.setBackground(new Color(204, 242, 255));
		zone2.setBounds(252, 126, 110, 100);
		frmSecurityAccessControl.getContentPane().add(zone2);
		
		JLabel zone6 = new JLabel("Zone6");
		zone6.setHorizontalAlignment(SwingConstants.CENTER);
		zone6.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone6.setBounds(273, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(zone6);
		
		JLabel zone5 = new JLabel("Zone 5\r\n(ABS ZONE)");
		zone5.setHorizontalAlignment(SwingConstants.CENTER);
		zone5.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone5.setHorizontalTextPosition(SwingConstants.CENTER);
		zone5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		zone5.setVerticalTextPosition(SwingConstants.TOP);
		zone5.setBackground(Color.PINK);
		zone5.setBounds(333, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(zone5);
		
		JButton locZone6 = new JButton("6");
		buttonGroup_3.add(locZone6);
		locZone6.setHorizontalAlignment(SwingConstants.LEFT);
		locZone6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone6.setBounds(431, 392, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone6);
		
		JButton btnNewButton_1_1_1 = new JButton("Fire");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1.setBounds(444, 296, 60, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1);
		
		JLabel zone3 = new JLabel("Zone3");
		zone3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone3.setHorizontalAlignment(SwingConstants.CENTER);
		zone3.setBackground(new Color(204, 242, 255));
		zone3.setBounds(362, 126, 110, 100);
		frmSecurityAccessControl.getContentPane().add(zone3);
		
		JButton locZone5 = new JButton("5");
		buttonGroup_3.add(locZone5);
		locZone5.setHorizontalAlignment(SwingConstants.LEFT);
		locZone5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone5.setBounds(382, 392, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone5);
		
		JLabel lblNewLabel_6 = new JLabel("ABS Status");
		lblNewLabel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBackground(Color.PINK);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBounds(10, 275, 243, 90);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_6);
		
		JButton locZone1 = new JButton("1");
		buttonGroup_4.add(locZone1);
		locZone1.setHorizontalTextPosition(SwingConstants.CENTER);
		locZone1.setHorizontalAlignment(SwingConstants.LEFT);
		locZone1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone1.setBounds(332, 361, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone1);
		
		JLabel zone1 = new JLabel("Zone1");
		zone1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone1.setHorizontalAlignment(SwingConstants.CENTER);
		zone1.setBackground(new Color(204, 242, 255));
		zone1.setBounds(53, 126, 200, 100);
		frmSecurityAccessControl.getContentPane().add(zone1);
		
		JLabel zone7 = new JLabel("Zone7");
		zone7.setHorizontalAlignment(SwingConstants.CENTER);
		zone7.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone7.setBackground(new Color(204, 242, 255));
		zone7.setBounds(53, 28, 200, 100);
		frmSecurityAccessControl.getContentPane().add(zone7);
		
		JButton locZone0 = new JButton("0");
		buttonGroup.add(locZone0);
		locZone0.setHorizontalAlignment(SwingConstants.LEFT);
		locZone0.setFont(new Font("Tahoma", Font.PLAIN, 6));
		locZone0.setBounds(406, 420, 39, 21);
		frmSecurityAccessControl.getContentPane().add(locZone0);
		locZone0.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ZONE_OCC_0));
		locZone0.addActionListener(e -> {
			if(States.ROOM0_PRECENSE){
				System.out.println("INZONE0");
				zone1.setOpaque(false);
				zone2.setOpaque(false);
				zone3.setOpaque(false);
				zone4.setOpaque(false);
				zone5.setOpaque(false);
				zone6.setOpaque(false);
				zone7.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		
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
		
		JLabel zone4_1 = new JLabel("Zone4");
		zone4_1.setBackground(new Color(204, 211, 255));
		zone4_1.setOpaque(true);
		zone4_1.setHorizontalAlignment(SwingConstants.CENTER);
		zone4_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone4_1.setBounds(393, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(zone4_1);
		
		JLabel zone6_1 = new JLabel("Zone6");
		zone6_1.setBackground(new Color(204, 211, 255));
		zone6_1.setOpaque(true);
		zone6_1.setHorizontalAlignment(SwingConstants.CENTER);
		zone6_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone6_1.setBounds(273, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(zone6_1);
		
		JLabel zone7_1 = new JLabel("Zone7");
		zone7_1.setOpaque(true);
		zone7_1.setHorizontalAlignment(SwingConstants.CENTER);
		zone7_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone7_1.setBackground(new Color(204, 211, 255));
		zone7_1.setBounds(53, 28, 200, 100);
		frmSecurityAccessControl.getContentPane().add(zone7_1);
		
		JLabel zone5_1 = new JLabel("Zone 5\r\n(ABS ZONE)");
		zone5_1.setVerticalTextPosition(SwingConstants.TOP);
		zone5_1.setOpaque(true);
		zone5_1.setHorizontalTextPosition(SwingConstants.CENTER);
		zone5_1.setHorizontalAlignment(SwingConstants.CENTER);
		zone5_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		zone5_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone5_1.setBackground(new Color(204, 211, 255));
		zone5_1.setBounds(333, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(zone5_1);
		
		JLabel zone1_1 = new JLabel("Zone1");
		zone1_1.setOpaque(true);
		zone1_1.setHorizontalAlignment(SwingConstants.CENTER);
		zone1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone1_1.setBackground(new Color(204, 211, 255));
		zone1_1.setBounds(53, 126, 200, 100);
		frmSecurityAccessControl.getContentPane().add(zone1_1);
		
		JLabel zone3_1 = new JLabel("Zone3");
		zone3_1.setOpaque(true);
		zone3_1.setHorizontalAlignment(SwingConstants.CENTER);
		zone3_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone3_1.setBackground(new Color(204, 211, 255));
		zone3_1.setBounds(362, 126, 110, 100);
		frmSecurityAccessControl.getContentPane().add(zone3_1);
		
		JLabel zone2_1 = new JLabel("Zone2");
		zone2_1.setOpaque(true);
		zone2_1.setHorizontalAlignment(SwingConstants.CENTER);
		zone2_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone2_1.setBackground(new Color(204, 211, 255));
		zone2_1.setBounds(252, 126, 110, 100);
		frmSecurityAccessControl.getContentPane().add(zone2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Manufacturing Section");
		lblNewLabel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(204, 211, 255));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setBounds(253, 10, 243, 255);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("Person Location");
		lblNewLabel_6_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6_3_1.setOpaque(true);
		lblNewLabel_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_6_3_1.setBackground(new Color(204, 242, 255));
		lblNewLabel_6_3_1.setBounds(315, 333, 181, 120);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_6_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("Proximity Sensor Zone\r\n");
		lblNewLabel_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBackground(Color.GREEN);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(252, 26, 220, 100);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Office Section");
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(204, 211, 255));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(30, 10, 232, 255);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel);
		
		locZone7.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ZONE_OCC_7));
		locZone6.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ZONE_OCC_4));
		locZone5.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ZONE_OCC_5));
		locZone4.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ZONE_OCC_6));
		locZone3.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ZONE_OCC_3));
		locZone2.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ZONE_OCC_2));
		locZone1.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_ZONE_OCC_1));		
		
		locZone1.addActionListener(e -> {
			if(States.ROOM1_PRECENSE){
				System.out.println("INZONE1");
				zone1.setOpaque(true);
				zone2.setOpaque(false);
				zone3.setOpaque(false);
				zone4.setOpaque(false);
				zone5.setOpaque(false);
				zone6.setOpaque(false);
				zone7.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		locZone2.addActionListener(e -> {
			if(States.ROOM2_PRECENSE){
				System.out.println("INZONE2");
				zone1.setOpaque(false);
				zone2.setOpaque(true);
				zone3.setOpaque(false);
				zone4.setOpaque(false);
				zone5.setOpaque(false);
				zone6.setOpaque(false);
				zone7.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		locZone3.addActionListener(e -> {
			if(States.ROOM3_PRECENSE){
				System.out.println("INZONE3");
				zone1.setOpaque(false);
				zone2.setOpaque(false);
				zone3.setOpaque(true);
				zone4.setOpaque(false);
				zone5.setOpaque(false);
				zone6.setOpaque(false);
				zone7.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		locZone4.addActionListener(e -> {
			if(States.ROOM4_PRECENSE){
				System.out.println("INZONE4");
				zone1.setOpaque(false);
				zone2.setOpaque(false);
				zone3.setOpaque(false);
				zone4.setOpaque(true);
				zone5.setOpaque(false);
				zone6.setOpaque(false);
				zone7.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		locZone5.addActionListener(e -> {
			if(States.ROOM5_PRECENSE){
				System.out.println("INZONE5");
				zone1.setOpaque(false);
				zone2.setOpaque(false);
				zone3.setOpaque(false);
				zone4.setOpaque(false);
				zone5.setOpaque(true);
				zone6.setOpaque(false);
				zone7.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		locZone6.addActionListener(e -> {
			if(States.ROOM6_PRECENSE){
				System.out.println("INZONE6");
				zone1.setOpaque(false);
				zone2.setOpaque(false);
				zone3.setOpaque(false);
				zone4.setOpaque(false);
				zone5.setOpaque(false);
				zone6.setOpaque(true);
				zone7.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		locZone7.addActionListener(e -> {
			if(States.ROOM7_PRECENSE){
				System.out.println("INZONE7");
				zone1.setOpaque(false);
				zone2.setOpaque(false);
				zone3.setOpaque(false);
				zone4.setOpaque(false);
				zone5.setOpaque(false);
				zone6.setOpaque(false);
				zone7.setOpaque(true);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		accessOffice.addActionListener(e -> {
			if(States.ACCESS_OFFICE){
				//System.out.println("ACCESSOFFICE");
				door1Unlock.setOpaque(true);
				door3Unlock.setOpaque(false);
				locZone1.setEnabled(true);
				locZone2.setEnabled(false);
				locZone3.setEnabled(false);
				locZone4.setEnabled(false);
				locZone5.setEnabled(false);
				locZone6.setEnabled(false);
				locZone7.setEnabled(true);
				zone1.setOpaque(false);
				zone2.setOpaque(false);
				zone3.setOpaque(false);
				zone4.setOpaque(false);
				zone5.setOpaque(false);
				zone6.setOpaque(false);
				zone7.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		
		accessManu.addActionListener(e -> {
			if(States.ACCESS_MANU){
		//		System.out.println("ACCESSMANU");
				door3Unlock.setOpaque(true);
				door1Unlock.setOpaque(false);
				locZone1.setEnabled(false);
				locZone2.setEnabled(true);
				locZone3.setEnabled(true);
				locZone4.setEnabled(true);
				locZone5.setEnabled(true);
				locZone6.setEnabled(true);
				locZone7.setEnabled(false);
				zone1.setOpaque(false);
				zone2.setOpaque(false);
				zone3.setOpaque(false);
				zone4.setOpaque(false);
				zone5.setOpaque(false);
				zone6.setOpaque(false);
				zone7.setOpaque(false);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		
		
		
		
	}
}
