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
		frmSecurityAccessControl.setBounds(500, 500, 500, 500);
		frmSecurityAccessControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSecurityAccessControl.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("testbtn");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		btnNewButton.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_DOOR1_UNLOCK));
		
		JButton btnNewButton_1 = new JButton("Office");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_2_1 = new JButton("Manual");
		btnNewButton_2_1.setBounds(148, 407, 85, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2 = new JButton("Automatic");
		btnNewButton_2.setBounds(28, 407, 85, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1_1_1_1_1_1 = new JButton("Zone 2");
		btnNewButton_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1_1_1_1_1.setBounds(350, 423, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_3 = new JButton("Zone 1");
		btnNewButton_1_1_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1_1_3.setBounds(300, 392, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1_1_3);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("Zone 2");
		btnNewButton_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1_1_1_1.setBounds(350, 392, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_2_1 = new JButton("Zone 3");
		btnNewButton_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1_1_2_1.setBounds(399, 392, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1_1_2_1);
		
		JButton btnNewButton_1_1_1_1_2 = new JButton("Zone 3");
		btnNewButton_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1_1_2.setBounds(399, 361, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1_1_2);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Zone 2");
		btnNewButton_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1_1_1.setBounds(350, 361, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Zone 1");
		btnNewButton_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1_1.setBounds(300, 361, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Fire");
		btnNewButton_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1_1.setBounds(425, 296, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("Manu");
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btnNewButton_1_1.setBounds(373, 296, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1_1);
		btnNewButton_1.setBounds(325, 296, 39, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Access:");
		lblNewLabel_7.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lblNewLabel_7.setBounds(283, 290, 133, 33);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_7);
		btnNewButton.setBounds(94, 316, 85, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(e -> {
			if(!States.DOOR1_UNLOCK) {
				System.out.println("bitch");
				zoneRed.setOpaque(true);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
		
		JLabel zone1 = new JLabel("");
		zone1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zone1.setHorizontalAlignment(SwingConstants.CENTER);
		zone1.setOpaque(true);
		zone1.setBackground(Color.GREEN);
		zone1.setBounds(79, 289, 117, 73);
		frmSecurityAccessControl.getContentPane().add(zone1);
		
		JLabel zoneRed = new JLabel("");
		zoneRed.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		zoneRed.setHorizontalAlignment(SwingConstants.CENTER);
		zoneRed.setBackground(Color.RED);
		zoneRed.setBounds(79, 289, 117, 73);
		frmSecurityAccessControl.getContentPane().add(zoneRed);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("Person Location");
		lblNewLabel_6_3_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6_3_1.setOpaque(true);
		lblNewLabel_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_6_3_1.setBackground(new Color(204, 242, 255));
		lblNewLabel_6_3_1.setBounds(283, 333, 181, 120);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_6_3_1);
		
		JLabel lblNewLabel_6 = new JLabel("ABS Status");
		lblNewLabel_6.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBackground(Color.PINK);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBounds(10, 275, 243, 90);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Door 1");
		lblNewLabel_5_1_1.setOpaque(true);
		lblNewLabel_5_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_5_1_1.setBackground(Color.RED);
		lblNewLabel_5_1_1.setBounds(253, 219, 70, 10);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Door 1");
		lblNewLabel_5_1.setOpaque(true);
		lblNewLabel_5_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_5_1.setBackground(Color.RED);
		lblNewLabel_5_1.setBounds(223, 141, 10, 70);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5 = new JLabel("Door 1");
		lblNewLabel_5.setBackground(Color.RED);
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_5.setBounds(33, 141, 10, 70);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Zone7");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_4_1_1.setOpaque(true);
		lblNewLabel_4_1_1.setBounds(373, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Zone 5\r\n(ABS ZONE)");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_4_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_4_1.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_4_1.setBackground(Color.PINK);
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setBounds(313, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("Zone6");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBounds(253, 41, 60, 70);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_4);
		
		JLabel label_1 = new JLabel("Zone3");
		label_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setOpaque(true);
		label_1.setBackground(new Color(204, 242, 255));
		label_1.setBounds(342, 126, 110, 100);
		frmSecurityAccessControl.getContentPane().add(label_1);
		
		JLabel label = new JLabel("Zone2");
		label.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(new Color(204, 242, 255));
		label.setOpaque(true);
		label.setBounds(232, 126, 110, 100);
		frmSecurityAccessControl.getContentPane().add(label);
		
		JLabel lblNewLabel_3 = new JLabel("Proximity Sensor Zone\r\n");
		lblNewLabel_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setBackground(Color.GREEN);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(232, 26, 220, 100);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Zone1");
		lblNewLabel_2_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setBackground(new Color(204, 242, 255));
		lblNewLabel_2_1.setBounds(33, 126, 200, 100);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("Zone7");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_2.setBackground(new Color(204, 242, 255));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(33, 26, 200, 100);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Office Section");
		lblNewLabel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(204, 211, 255));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setBounds(10, 10, 232, 255);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Manufacturing Section");
		lblNewLabel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(204, 211, 255));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setBounds(233, 10, 243, 255);
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
		lblNewLabel_6_3.setBounds(273, 275, 203, 178);
		frmSecurityAccessControl.getContentPane().add(lblNewLabel_6_3);
	}
}
