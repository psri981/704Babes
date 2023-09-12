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

public class ACS_GUI {

	private JFrame frmSecurityAccessControl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACS_GUI window = new ACS_GUI();
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
	public ACS_GUI() {
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
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 32, 466, 161);
		frmSecurityAccessControl.getContentPane().add(layeredPane);
		
		JPanel panel = new JPanel();
		panel.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
			}
		});
		panel.setBounds(0, 90, 200, 71);
		panel.setForeground(Color.CYAN);
		panel.setBackground(Color.CYAN);
		panel.setBounds(10, 32, 199, 81);
		frmSecurityAccessControl.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 90, 200, 71);
		layeredPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
			}
		});
		panel_2.setBounds(0, 0, 200, 80);
		layeredPane.add(panel_2);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(10, 203, 230, 104);
		frmSecurityAccessControl.getContentPane().add(layeredPane_1);
		
		JLayeredPane layeredPane_1_1 = new JLayeredPane();
		layeredPane_1_1.setBounds(250, 203, 230, 272);
		frmSecurityAccessControl.getContentPane().add(layeredPane_1_1);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(10, 10, 210, 92);
		layeredPane_1_1.add(layeredPane_2);
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBounds(10, 112, 210, 150);
		layeredPane_1_1.add(layeredPane_3);
		
		JLayeredPane layeredPane_1_2 = new JLayeredPane();
		layeredPane_1_2.setBounds(10, 317, 230, 104);
		frmSecurityAccessControl.getContentPane().add(layeredPane_1_2);
		

		
		
	}
}
