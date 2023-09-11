package org.compsys704;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JSlider;
import java.awt.Font; 

public class Canvas {


	private JFrame frmAbs;

	/**
	 * Launch the application.
	 */

	   public static void main(String[] args) {
		   SignalServer<RotaryVizWorker> server = new SignalServer<RotaryVizWorker>(Ports.PORT_LOADER_VIZ, RotaryVizWorker.class);
		   new Thread(server).start(); 
		   EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    Canvas window = new Canvas();
	                    window.frmAbs.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	    }


	/**
	 * Create the application.
	 */
	public Canvas() {
		initialize();		// Listener for Cap at Pos 1
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAbs = new JFrame();
		frmAbs.setTitle("ABS");
		frmAbs.setBounds(100, 100, 700, 600);
		frmAbs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAbs.getContentPane().setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setValue(0);
		slider.setBounds(112, 122, 466, 26);
		frmAbs.getContentPane().add(slider);
		
		JLabel lblNewLabel = new JLabel("Purchase Order System");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 31));
		lblNewLabel.setBounds(159, 48, 358, 46);
		frmAbs.getContentPane().add(lblNewLabel);
		
		JSlider slider_1 = new JSlider();
		slider_1.setValue(0);
		slider_1.setSnapToTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setBounds(112, 188, 466, 26);
		frmAbs.getContentPane().add(slider_1);
		
		JLabel lblNewLabel_1 = new JLabel("Liquid 2");
		lblNewLabel_1.setBounds(56, 260, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_1);
		
		JSlider slider_2 = new JSlider();
		slider_2.setValue(0);
		slider_2.setSnapToTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setBounds(112, 254, 466, 26);
		frmAbs.getContentPane().add(slider_2);
		
		JLabel lblNewLabel_2 = new JLabel("Liquid 3");
		lblNewLabel_2.setBounds(56, 326, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_2);
		
		JSlider slider_3 = new JSlider();
		slider_3.setValue(0);
		slider_3.setSnapToTicks(true);
		slider_3.setPaintLabels(true);
		slider_3.setBounds(112, 320, 466, 26);
		frmAbs.getContentPane().add(slider_3);
		
		JLabel lblNewLabel_3 = new JLabel("Bottles");
		lblNewLabel_3.setBounds(56, 392, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Liquid 1");
		lblNewLabel_1_1.setBounds(56, 194, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("0%");
		lblNewLabel_3_1.setBounds(596, 326, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("0%");
		lblNewLabel_2_1.setBounds(596, 260, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("0%");
		lblNewLabel_1_2.setBounds(596, 194, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("0%");
		lblNewLabel_1_1_1.setBounds(596, 128, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Place Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(294, 474, 89, 23);
		frmAbs.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3_2 = new JLabel("Liquid 4");
		lblNewLabel_3_2.setBounds(56, 128, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_3_2);
		
		JSlider slider_3_1 = new JSlider();
		slider_3_1.setValue(0);
		slider_3_1.setSnapToTicks(true);
		slider_3_1.setPaintLabels(true);
		slider_3_1.setBounds(112, 386, 466, 26);
		frmAbs.getContentPane().add(slider_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("0");
		lblNewLabel_3_1_1.setBounds(596, 392, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_3_1_1);

	}
}
