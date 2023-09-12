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
		
		JLabel zoneRed = new JLabel("");
		zoneRed.setBackground(Color.RED);
		zoneRed.setBounds(10, 10, 220, 113);
		frmSecurityAccessControl.getContentPane().add(zoneRed);
		
		JLabel zone1 = new JLabel("");
		zone1.setOpaque(true);
		zone1.setBackground(Color.GREEN);
		zone1.setBounds(10, 10, 220, 113);
		frmSecurityAccessControl.getContentPane().add(zone1);
		
		JButton btnNewButton = new JButton("testbtn");
		btnNewButton.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.SIGNAL_DOOR1_UNLOCK));
		btnNewButton.setBounds(157, 226, 85, 21);
		frmSecurityAccessControl.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(e -> {
			if(!States.DOOR1_UNLOCK) {
				System.out.println("bitch");
				zoneRed.setOpaque(true);
				frmSecurityAccessControl.getContentPane().revalidate();
				frmSecurityAccessControl.getContentPane().repaint();
			}
		});
	}
}
