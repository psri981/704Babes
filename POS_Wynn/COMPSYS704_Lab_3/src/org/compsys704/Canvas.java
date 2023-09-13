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
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
import com.systemj.netapi.SimpleClient;
import com.systemj.netapi.SimpleServer;


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
		
		// INITIALISING LIQUID MIX 
		
		int[] liquidMix = {0, 0, 0, 0};
		
		// CREATING PANE
		frmAbs = new JFrame();
		frmAbs.getContentPane().setBackground(new Color(87, 87, 130));
		frmAbs.setForeground(new Color(87, 87, 130));
		frmAbs.getContentPane().setForeground(new Color(87, 87, 130));
		frmAbs.setTitle("Purchase Order System");
		frmAbs.setBounds(100, 100, 700, 600);
		frmAbs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAbs.getContentPane().setLayout(null);
		
		// TITLE LABEL
		JLabel titleSangria = new JLabel("Sangria Cocktail Mix");
		titleSangria.setHorizontalAlignment(SwingConstants.CENTER);
		titleSangria.setForeground(new Color(255, 255, 255));
		titleSangria.setFont(new Font("Arial", Font.BOLD, 31));
		titleSangria.setBounds(181, 47, 321, 46);
		frmAbs.getContentPane().add(titleSangria);

		// RED WINE LABEL
		JLabel labelRedWine = new JLabel("Red Wine");
		labelRedWine.setFont(new Font("Arial", Font.BOLD, 13));
		labelRedWine.setHorizontalAlignment(SwingConstants.RIGHT);
		labelRedWine.setForeground(new Color(255, 255, 255));
		labelRedWine.setBounds(69, 156, 62, 16);
		frmAbs.getContentPane().add(labelRedWine);
		
		// LEMONADE LABEL
		JLabel labelLemonade = new JLabel("Lemonade");
		labelLemonade.setFont(new Font("Arial", Font.BOLD, 13));
		labelLemonade.setHorizontalAlignment(SwingConstants.RIGHT);
		labelLemonade.setForeground(new Color(255, 255, 255));
		labelLemonade.setBounds(63, 219, 68, 16);
		frmAbs.getContentPane().add(labelLemonade);

		// RED WIN SLIDER
		JSlider sliderRedWine = new JSlider();
		sliderRedWine.setBackground(new Color(87, 87, 130));
		sliderRedWine.setPaintLabels(true);
		sliderRedWine.setSnapToTicks(true);
		sliderRedWine.setValue(0);
		sliderRedWine.setBounds(141, 151, 437, 26);
		frmAbs.getContentPane().add(sliderRedWine);
				
		// LEMONADE SLIDER
		JSlider sliderLemonade = new JSlider();
		sliderLemonade.setBackground(new Color(87, 87, 130));
		sliderLemonade.setValue(0);
		sliderLemonade.setSnapToTicks(true);
		sliderLemonade.setPaintLabels(true);
		sliderLemonade.setBounds(141, 214, 437, 26);
		frmAbs.getContentPane().add(sliderLemonade);
		
		// ORANGE JUICE LABEL
		JLabel labelOrangeJuice = new JLabel("Orange Juice");
		labelOrangeJuice.setFont(new Font("Arial", Font.BOLD, 13));
		labelOrangeJuice.setHorizontalAlignment(SwingConstants.RIGHT);
		labelOrangeJuice.setForeground(new Color(255, 255, 255));
		labelOrangeJuice.setBounds(46, 282, 85, 16);
		frmAbs.getContentPane().add(labelOrangeJuice);
		
		// SUGAR SYRUP LABBEL
		JLabel labelSugarSyrup = new JLabel("Sugar Syrup");
		labelSugarSyrup.setFont(new Font("Arial", Font.BOLD, 13));
		labelSugarSyrup.setHorizontalAlignment(SwingConstants.RIGHT);
		labelSugarSyrup.setForeground(new Color(255, 255, 255));
		labelSugarSyrup.setBounds(52, 345, 79, 16);
		frmAbs.getContentPane().add(labelSugarSyrup);

		// BOTTLE LABEL
		JLabel labelBottles = new JLabel("Bottles");
		labelBottles.setFont(new Font("Arial", Font.BOLD, 13));
		labelBottles.setHorizontalAlignment(SwingConstants.RIGHT);
		labelBottles.setForeground(new Color(255, 255, 255));
		labelBottles.setBounds(88, 408, 43, 16);
		frmAbs.getContentPane().add(labelBottles);

		// ORANGE JUICE SLIDER
		JSlider sliderOrangeJuice = new JSlider();
		sliderOrangeJuice.setBackground(new Color(87, 87, 130));
		sliderOrangeJuice.setValue(0);
		sliderOrangeJuice.setSnapToTicks(true);
		sliderOrangeJuice.setPaintLabels(true);
		sliderOrangeJuice.setBounds(141, 277, 437, 26);
		frmAbs.getContentPane().add(sliderOrangeJuice);
		
		
		// SUGAR SYRUP SLIDER
		JSlider sliderSugarSyrup = new JSlider();
		sliderSugarSyrup.setBackground(new Color(87, 87, 130));
		sliderSugarSyrup.setValue(0);
		sliderSugarSyrup.setSnapToTicks(true);
		sliderSugarSyrup.setPaintLabels(true);
		sliderSugarSyrup.setBounds(141, 340, 437, 26);
		frmAbs.getContentPane().add(sliderSugarSyrup);		
		
		// BOTTLE SLIDER
		JSlider sliderBottles = new JSlider();
		sliderBottles.setMinimum(10);
		sliderBottles.setBackground(new Color(87, 87, 130));
		sliderBottles.setValue(0);
		sliderBottles.setSnapToTicks(true);
		sliderBottles.setPaintLabels(true);
		sliderBottles.setBounds(141, 403, 437, 26);
		frmAbs.getContentPane().add(sliderBottles);

		// RED WINE PERCENTAGE
		JLabel totalRedWine = new JLabel("");
		totalRedWine.setFont(new Font("Arial", Font.PLAIN, 15));
		totalRedWine.setForeground(new Color(255, 255, 255));
		totalRedWine.setBounds(596, 157, 46, 14);
		totalRedWine.setText(sliderRedWine.getValue() + "%");
		frmAbs.getContentPane().add(totalRedWine);

		// LEMONADE PERCENTAGE
		JLabel totalLemonade = new JLabel("0%");
		totalLemonade.setFont(new Font("Arial", Font.PLAIN, 15));
		totalLemonade.setForeground(new Color(255, 255, 255));
		totalLemonade.setBounds(596, 220, 46, 14);
		frmAbs.getContentPane().add(totalLemonade);

		// ORANGE JUICE PERCENTAGE
		JLabel totalOrangeJuice = new JLabel("0%");
		totalOrangeJuice.setFont(new Font("Arial", Font.PLAIN, 15));
		totalOrangeJuice.setForeground(new Color(255, 255, 255));
		totalOrangeJuice.setBounds(596, 283, 46, 14);
		frmAbs.getContentPane().add(totalOrangeJuice);

		// SUGAR SYRUP PERCENTAGE
		JLabel totalSugarSyrup = new JLabel("0%");
		totalSugarSyrup.setFont(new Font("Arial", Font.PLAIN, 15));
		totalSugarSyrup.setForeground(new Color(255, 255, 255));
		totalSugarSyrup.setBounds(596, 346, 46, 14);
		frmAbs.getContentPane().add(totalSugarSyrup);
											
		// BOTTLE QUANTITY
		JLabel totalBottles = new JLabel("10");
		totalBottles.setFont(new Font("Arial", Font.PLAIN, 15));
		totalBottles.setForeground(new Color(255, 255, 255));
		totalBottles.setBounds(596, 409, 46, 14);
		frmAbs.getContentPane().add(totalBottles);
		
		// PLACE ORDER BUTTON
		JButton buttonPlaceOrder = new JButton("Place Order");
		buttonPlaceOrder.setFont(new Font("Arial", Font.PLAIN, 14));
		buttonPlaceOrder.setEnabled(false);
		buttonPlaceOrder.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ORDER_START));
		buttonPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String stringLiquidMix = IntStream.of(liquidMix).mapToObj(String::valueOf).collect(Collectors.joining(","));
					SimpleClient sendBottleQuantity = new SimpleClient("127.0.0.1", 10001, "PlantCD", "bottleQuantity");
					sendBottleQuantity.emit(sliderBottles.getValue(), 10);
					SimpleClient sendLiquidMix = new SimpleClient("127.0.0.1", 10001, "PlantCD", "liquidMix");
					sendLiquidMix.emit(stringLiquidMix, 10);
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonPlaceOrder.setBounds(286, 470, 111, 23);
		frmAbs.getContentPane().add(buttonPlaceOrder);
	    
	    // RED WINE EVENT LISTENER
	    sliderRedWine.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	totalRedWine.setText(sliderRedWine.getValue() + "%");
	        	liquidMix[0] = sliderRedWine.getValue();
	    		sliderSugarSyrup.setExtent(100 - (100 - sliderRedWine.getValue() - sliderLemonade.getValue() - sliderOrangeJuice.getValue()));
	    		sliderOrangeJuice.setExtent(100 - (100 - sliderRedWine.getValue() - sliderSugarSyrup.getValue() - sliderLemonade.getValue()));
	    		sliderLemonade.setExtent(100 - (100 - sliderOrangeJuice.getValue() - sliderSugarSyrup.getValue() - sliderRedWine.getValue()));
	    		if (sliderRedWine.getValue() + sliderLemonade.getValue() + sliderOrangeJuice.getValue() + sliderSugarSyrup.getValue() == 100) {
	    			buttonPlaceOrder.setEnabled(true);
	    		}
	    		else {
	    			buttonPlaceOrder.setEnabled(false);
	    		}
	        }
	      });
	    
	    // LEMONADE EVENT LISTENER
	    sliderLemonade.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	totalLemonade.setText(sliderLemonade.getValue() + "%");
	        	liquidMix[1] = sliderLemonade.getValue();
	    		sliderSugarSyrup.setExtent(100 - (100 - sliderRedWine.getValue() - sliderLemonade.getValue() - sliderOrangeJuice.getValue()));
	    		sliderOrangeJuice.setExtent(100 - (100 - sliderRedWine.getValue() - sliderSugarSyrup.getValue() - sliderLemonade.getValue()));
	    		sliderRedWine.setExtent(100 - (100 - sliderOrangeJuice.getValue() - sliderSugarSyrup.getValue() - sliderLemonade.getValue()));
	    		if (sliderRedWine.getValue() + sliderLemonade.getValue() + sliderOrangeJuice.getValue() + sliderSugarSyrup.getValue() == 100) {
	    			buttonPlaceOrder.setEnabled(true);
	    		}
	    		else {
	    			buttonPlaceOrder.setEnabled(false);
	    		}

	        }
	      });

	    // ORANGE JUICE EVENT LISTENER
	    sliderOrangeJuice.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	totalOrangeJuice.setText(sliderOrangeJuice.getValue() + "%");
	        	liquidMix[2] = sliderOrangeJuice.getValue();
	    		sliderSugarSyrup.setExtent(100 - (100 - sliderRedWine.getValue() - sliderLemonade.getValue() - sliderOrangeJuice.getValue()));
	    		sliderRedWine.setExtent(100 - (100 - sliderOrangeJuice.getValue() - sliderSugarSyrup.getValue() - sliderLemonade.getValue()));
	    		sliderLemonade.setExtent(100 - (100 - sliderOrangeJuice.getValue() - sliderSugarSyrup.getValue() - sliderRedWine.getValue()));
	    		if (sliderRedWine.getValue() + sliderLemonade.getValue() + sliderOrangeJuice.getValue() + sliderSugarSyrup.getValue() == 100) {
	    			buttonPlaceOrder.setEnabled(true);
	    		}
	    		else {
	    			buttonPlaceOrder.setEnabled(false);
	    		}

	        }
	      });

	    // SUGAR SYRUP EVENT LISTENER
	    sliderSugarSyrup.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	totalSugarSyrup.setText(sliderSugarSyrup.getValue() + "%");
	        	liquidMix[3] = sliderSugarSyrup.getValue();
	        	sliderRedWine.setExtent(100 - (100 - sliderSugarSyrup.getValue() - sliderLemonade.getValue() - sliderOrangeJuice.getValue()));
	    		sliderOrangeJuice.setExtent(100 - (100 - sliderRedWine.getValue() - sliderSugarSyrup.getValue() - sliderLemonade.getValue()));
	    		sliderLemonade.setExtent(100 - (100 - sliderOrangeJuice.getValue() - sliderSugarSyrup.getValue() - sliderRedWine.getValue()));
	    		if (sliderRedWine.getValue() + sliderLemonade.getValue() + sliderOrangeJuice.getValue() + sliderSugarSyrup.getValue() == 100) {
	    			buttonPlaceOrder.setEnabled(true);
	    		}
	    		else {
	    			buttonPlaceOrder.setEnabled(false);
	    		}

	        }
	      });

		// BOTTLE EVENT LISTENER
	    sliderBottles.addChangeListener(new ChangeListener() {
	        public void stateChanged(ChangeEvent event) {
	        	totalBottles.setText(sliderBottles.getValue() + "");
	        }
	      });

	    // SANGRIA IMAGES
		JLabel sangriaImageLeft = new JLabel("");
		sangriaImageLeft.setIcon(new ImageIcon("res\\sangriamix.png"));
		sangriaImageLeft.setBounds(96, 32, 75, 73);
		frmAbs.getContentPane().add(sangriaImageLeft);
		
		JLabel sangriaImageRight = new JLabel("");
		sangriaImageRight.setIcon(new ImageIcon("res\\sangriamix.png"));
		sangriaImageRight.setBounds(522, 32, 75, 73);
		frmAbs.getContentPane().add(sangriaImageRight);
				
	}
}
