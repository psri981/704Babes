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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
		frmAbs.getContentPane().setBackground(new Color(87, 87, 130));
		frmAbs.setForeground(new Color(87, 87, 130));
		frmAbs.getContentPane().setForeground(new Color(87, 87, 130));
		frmAbs.setTitle("ABS");
		frmAbs.setBounds(100, 100, 700, 600);
		frmAbs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAbs.getContentPane().setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setBackground(new Color(87, 87, 130));
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setValue(0);
		slider.setBounds(141, 151, 437, 26);
		frmAbs.getContentPane().add(slider);
		
		
		JLabel lblNewLabel = new JLabel("Sangria Cocktail Mix");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 31));
		lblNewLabel.setBounds(181, 47, 321, 46);
		frmAbs.getContentPane().add(lblNewLabel);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBackground(new Color(87, 87, 130));
		slider_1.setValue(0);
		slider_1.setSnapToTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setBounds(141, 214, 437, 26);
		frmAbs.getContentPane().add(slider_1);
		
		JLabel lblNewLabel_1 = new JLabel("Orange Juice");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(46, 282, 85, 16);
		frmAbs.getContentPane().add(lblNewLabel_1);
		
		JSlider slider_2 = new JSlider();
		slider_2.setBackground(new Color(87, 87, 130));
		slider_2.setValue(0);
		slider_2.setSnapToTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setBounds(141, 277, 437, 26);
		frmAbs.getContentPane().add(slider_2);
		
		JLabel lblNewLabel_2 = new JLabel("Sugar Syrup");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(52, 345, 79, 16);
		frmAbs.getContentPane().add(lblNewLabel_2);
				
		JSlider slider_3 = new JSlider();
		slider_3.setBackground(new Color(87, 87, 130));
		slider_3.setValue(0);
		slider_3.setSnapToTicks(true);
		slider_3.setPaintLabels(true);
		slider_3.setBounds(141, 340, 437, 26);
		frmAbs.getContentPane().add(slider_3);
		
		JLabel lblNewLabel_3 = new JLabel("Bottles");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(88, 408, 43, 16);
		frmAbs.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Lemonade");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setBounds(63, 219, 68, 16);
		frmAbs.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("0%");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setBounds(596, 346, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("0%");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(596, 283, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_2_1);
		

		JLabel lblNewLabel_1_2 = new JLabel("0%");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setBounds(596, 220, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1_1.setBounds(596, 157, 46, 14);
		lblNewLabel_1_1_1.setText(slider.getValue() + "%");
		
		frmAbs.getContentPane().add(lblNewLabel_1_1_1);
		

		
		JButton btnNewButton = new JButton("Place Order");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 14));
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(286, 470, 111, 23);
		frmAbs.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3_2 = new JLabel("Red Wine");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_2.setBounds(69, 156, 62, 16);
		frmAbs.getContentPane().add(lblNewLabel_3_2);
	

		JSlider slider_3_1 = new JSlider();
		slider_3_1.setMinimum(10);
		slider_3_1.setBackground(new Color(87, 87, 130));
		slider_3_1.setValue(0);
		slider_3_1.setSnapToTicks(true);
		slider_3_1.setPaintLabels(true);
		slider_3_1.setBounds(141, 403, 437, 26);
		frmAbs.getContentPane().add(slider_3_1);
		

		JLabel lblNewLabel_3_1_1 = new JLabel("10");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1_1.setBounds(596, 409, 46, 14);
		frmAbs.getContentPane().add(lblNewLabel_3_1_1);
		
	    slider_3_1.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	lblNewLabel_3_1_1.setText(slider_3_1.getValue() + "");
	        }
	      });

	    
	    slider.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	lblNewLabel_1_1_1.setText(slider.getValue() + "%");
	    		slider_3.setExtent(100 - (100 - slider.getValue() - slider_1.getValue() - slider_2.getValue()));
	    		slider_2.setExtent(100 - (100 - slider.getValue() - slider_3.getValue() - slider_1.getValue()));
	    		slider_1.setExtent(100 - (100 - slider_2.getValue() - slider_3.getValue() - slider.getValue()));
	    		if (slider.getValue() + slider_1.getValue() + slider_2.getValue() + slider_3.getValue() == 100) {
	    			btnNewButton.setEnabled(true);
	    		}
	    		else {
	    			btnNewButton.setEnabled(false);
	    		}
	        }
	      });

	    slider_1.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	lblNewLabel_1_2.setText(slider_1.getValue() + "%");
	    		slider_3.setExtent(100 - (100 - slider.getValue() - slider_1.getValue() - slider_2.getValue()));
	    		slider_2.setExtent(100 - (100 - slider.getValue() - slider_3.getValue() - slider_1.getValue()));
	    		slider.setExtent(100 - (100 - slider_2.getValue() - slider_3.getValue() - slider_1.getValue()));
	    		if (slider.getValue() + slider_1.getValue() + slider_2.getValue() + slider_3.getValue() == 100) {
	    			btnNewButton.setEnabled(true);
	    		}
	    		else {
	    			btnNewButton.setEnabled(false);
	    		}

	        }
	      });

	    slider_2.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	lblNewLabel_2_1.setText(slider_2.getValue() + "%");
//	    		slider_3.setMaximum(100 - slider.getValue() - slider_1.getValue() - slider_2.getValue());
	    		slider_3.setExtent(100 - (100 - slider.getValue() - slider_1.getValue() - slider_2.getValue()));
	    		slider.setExtent(100 - (100 - slider_2.getValue() - slider_3.getValue() - slider_1.getValue()));
	    		slider_1.setExtent(100 - (100 - slider_2.getValue() - slider_3.getValue() - slider.getValue()));
	    		if (slider.getValue() + slider_1.getValue() + slider_2.getValue() + slider_3.getValue() == 100) {
	    			btnNewButton.setEnabled(true);
	    		}
	    		else {
	    			btnNewButton.setEnabled(false);
	    		}

	        }
	      });

	    slider_3.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	lblNewLabel_3_1.setText(slider_3.getValue() + "%");
	    		slider.setExtent(100 - (100 - slider_3.getValue() - slider_1.getValue() - slider_2.getValue()));
	    		slider_2.setExtent(100 - (100 - slider.getValue() - slider_3.getValue() - slider_1.getValue()));
	    		slider_1.setExtent(100 - (100 - slider_2.getValue() - slider_3.getValue() - slider.getValue()));
	    		if (slider.getValue() + slider_1.getValue() + slider_2.getValue() + slider_3.getValue() == 100) {
	    			btnNewButton.setEnabled(true);
	    		}
	    		else {
	    			btnNewButton.setEnabled(false);
	    		}

	        }
	      });


		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("res\\sangriamix.png"));
		lblNewLabel_4.setBounds(96, 32, 75, 73);
		frmAbs.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon("res\\sangriamix.png"));
		lblNewLabel_4_1.setBounds(522, 32, 75, 73);
		frmAbs.getContentPane().add(lblNewLabel_4_1);
				
	}
}
