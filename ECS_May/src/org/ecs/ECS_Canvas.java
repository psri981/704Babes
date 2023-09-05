package org.ecs;

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
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Component;
import java.awt.Cursor;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTextPane; 

public class ECS_Canvas {

	private JFrame frmAbs;
	private final ButtonGroup zoneGroup = new ButtonGroup();
	private final ButtonGroup controlGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */

	   public static void main(String[] args) {
		   ECS_SignalServer<ECSVizWorker> server = new ECS_SignalServer<ECSVizWorker>(ECS_Ports.PORT_LOADER_VIZ, ECSVizWorker.class);
		   new Thread(server).start(); 
		   EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    ECS_Canvas window = new ECS_Canvas();
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
	public ECS_Canvas() {
		initialize();		// Listener for Cap at Pos 1
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAbs = new JFrame();
		frmAbs.setResizable(false);
		frmAbs.getContentPane().setBackground(new Color(87, 87, 130));
		frmAbs.getContentPane().setLayout(null);
		
		JPanel COMPONENTS = new JPanel();
		COMPONENTS.setBackground(new Color(87, 87, 130));
		COMPONENTS.setBounds(29, 81, 1096, 408);
		frmAbs.getContentPane().add(COMPONENTS);
		COMPONENTS.setLayout(null);
		
		JPanel UNITS = new JPanel();
		UNITS.setBounds(809, 291, 287, 57);
		COMPONENTS.add(UNITS);
		UNITS.setBackground(new Color(87, 87, 130));
		UNITS.setLayout(null);
		
		JSpinner LightIntensity = new JSpinner();
		LightIntensity.setBounds(238, 0, 49, 23);
		UNITS.add(LightIntensity);
		LightIntensity.setModel(new SpinnerNumberModel(5, null, 10, 1));
		LightIntensity.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JSpinner Temperature = new JSpinner();
		Temperature.setBounds(86, 0, 49, 23);
		UNITS.add(Temperature);
		Temperature.setFont(new Font("Arial", Font.PLAIN, 14));
		Temperature.setModel(new SpinnerNumberModel(10, 10, 30, 1));
		
		JTextPane txtpnRoomTemp = new JTextPane();
		txtpnRoomTemp.setBounds(0, 0, 127, 23);
		UNITS.add(txtpnRoomTemp);
		txtpnRoomTemp.setText("Room Temp");
		txtpnRoomTemp.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JSpinner Humidity = new JSpinner();
		Humidity.setBounds(139, 34, 148, 23);
		UNITS.add(Humidity);
		Humidity.setModel(new SpinnerNumberModel(50, 0, 100, 10));
		Humidity.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JTextPane txtpnRoomHumidity = new JTextPane();
		txtpnRoomHumidity.setBounds(0, 34, 287, 23);
		UNITS.add(txtpnRoomHumidity);
		txtpnRoomHumidity.setText("Room Humidity (%)");
		txtpnRoomHumidity.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JTextPane txtpnLightIntensity = new JTextPane();
		txtpnLightIntensity.setBounds(144, 0, 127, 23);
		UNITS.add(txtpnLightIntensity);
		txtpnLightIntensity.setText("Light Intensity");
		txtpnLightIntensity.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JPanel ZONES = new JPanel();
		ZONES.setBounds(0, 0, 783, 351);
		COMPONENTS.add(ZONES);
		ZONES.setLayout(null);
		
		JLabel Zone4 = new JLabel("");
		Zone4.setBounds(325, 0, 130, 176);
		ZONES.add(Zone4);
		Zone4.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\zones\\z4.png"));
		Zone4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Zone7 = new JLabel("");
		Zone7.setBounds(0, 0, 324, 176);
		ZONES.add(Zone7);
		Zone7.setHorizontalAlignment(SwingConstants.CENTER);
		Zone7.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\zones\\z7.png"));
		
		JLabel Zone1 = new JLabel("");
		Zone1.setBounds(0, 175, 324, 176);
		ZONES.add(Zone1);
		Zone1.setHorizontalAlignment(SwingConstants.CENTER);
		Zone1.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\zones\\z1.png"));
		
		JLabel Zone2 = new JLabel("");
		Zone2.setBounds(324, 175, 232, 176);
		ZONES.add(Zone2);
		Zone2.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\zones\\z2.png"));
		Zone2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Zone6 = new JLabel("");
		Zone6.setBounds(653, 0, 130, 176);
		ZONES.add(Zone6);
		Zone6.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\zones\\z6.png"));
		Zone6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Zone5 = new JLabel("");
		Zone5.setBounds(455, 0, 198, 176);
		ZONES.add(Zone5);
		Zone5.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\zones\\z5.png"));
		Zone5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Zone3 = new JLabel("");
		Zone3.setBounds(552, 175, 231, 176);
		ZONES.add(Zone3);
		Zone3.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\zones\\z3.png"));
		Zone3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel ZONE_BUTTONS = new JPanel();
		ZONE_BUTTONS.setBounds(809, 0, 287, 172);
		COMPONENTS.add(ZONE_BUTTONS);
		ZONE_BUTTONS.setBackground(new Color(87, 87, 130));
		ZONE_BUTTONS.setLayout(null);
		
		JToggleButton z1btn = new JToggleButton("ZONE 1");
		zoneGroup.add(z1btn);
		z1btn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		z1btn.setBounds(0, 0, 89, 50);
		ZONE_BUTTONS.add(z1btn);
		z1btn.setHorizontalTextPosition(SwingConstants.CENTER);
		z1btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		z1btn.setAlignmentX(Component.CENTER_ALIGNMENT);
		z1btn.setFont(new Font("Arial", Font.PLAIN, 14));
		z1btn.setBackground(new Color(255, 255, 255));
		
		JToggleButton z2btn = new JToggleButton("ZONE 2");
		zoneGroup.add(z2btn);
		z2btn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		z2btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		z2btn.setBounds(99, 0, 89, 50);
		ZONE_BUTTONS.add(z2btn);
		z2btn.setHorizontalTextPosition(SwingConstants.CENTER);
		z2btn.setFont(new Font("Arial", Font.PLAIN, 14));
		z2btn.setBackground(new Color(255, 255, 255));
		z2btn.setAlignmentX(0.5f);
		
		JToggleButton z3btn = new JToggleButton("ZONE 3");
		zoneGroup.add(z3btn);
		z3btn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		z3btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		z3btn.setBounds(198, 0, 89, 50);
		ZONE_BUTTONS.add(z3btn);
		z3btn.setHorizontalTextPosition(SwingConstants.CENTER);
		z3btn.setFont(new Font("Arial", Font.PLAIN, 14));
		z3btn.setBackground(new Color(255, 255, 255));
		z3btn.setAlignmentX(0.5f);
		
		JToggleButton z4btn = new JToggleButton("ZONE 4");
		zoneGroup.add(z4btn);
		z4btn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		z4btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		z4btn.setBounds(0, 61, 89, 50);
		ZONE_BUTTONS.add(z4btn);
		z4btn.setHorizontalTextPosition(SwingConstants.CENTER);
		z4btn.setFont(new Font("Arial", Font.PLAIN, 14));
		z4btn.setBackground(new Color(255, 255, 255));
		z4btn.setAlignmentX(0.5f);
		
		JToggleButton z5btn = new JToggleButton("ZONE 5");
		zoneGroup.add(z5btn);
		z5btn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		z5btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		z5btn.setBounds(99, 61, 89, 50);
		ZONE_BUTTONS.add(z5btn);
		z5btn.setHorizontalTextPosition(SwingConstants.CENTER);
		z5btn.setFont(new Font("Arial", Font.PLAIN, 14));
		z5btn.setBackground(new Color(255, 255, 255));
		z5btn.setAlignmentX(0.5f);
		
		JToggleButton z6btn = new JToggleButton("ZONE 6");
		zoneGroup.add(z6btn);
		z6btn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		z6btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		z6btn.setBounds(198, 61, 89, 50);
		ZONE_BUTTONS.add(z6btn);
		z6btn.setHorizontalTextPosition(SwingConstants.CENTER);
		z6btn.setFont(new Font("Arial", Font.PLAIN, 14));
		z6btn.setBackground(new Color(255, 255, 255));
		z6btn.setAlignmentX(0.5f);
		
		JToggleButton z7btn = new JToggleButton("ZONE 7");
		zoneGroup.add(z7btn);
		z7btn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		z7btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		z7btn.setBounds(0, 122, 287, 50);
		ZONE_BUTTONS.add(z7btn);
		z7btn.setHorizontalTextPosition(SwingConstants.CENTER);
		z7btn.setFont(new Font("Arial", Font.PLAIN, 14));
		z7btn.setBackground(new Color(255, 255, 255));
		z7btn.setAlignmentX(0.5f);
		
		JPanel CONTROLS = new JPanel();
		CONTROLS.setBounds(830, 183, 245, 91);
		COMPONENTS.add(CONTROLS);
		CONTROLS.setBackground(new Color(87, 87, 130));
		CONTROLS.setLayout(null);
		
		JToggleButton FIREtglbtn = new JToggleButton("");
		FIREtglbtn.setBounds(0, 2, 49, 69);
		CONTROLS.add(FIREtglbtn);
		FIREtglbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		controlGroup.add(FIREtglbtn);
		FIREtglbtn.setContentAreaFilled(false);
		FIREtglbtn.setPressedIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\controls\\fireSelected.png"));
		FIREtglbtn.setSelectedIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\controls\\fireSelected.png"));
		FIREtglbtn.setBorder(null);
		FIREtglbtn.setBorderPainted(false);
		FIREtglbtn.setBackground(new Color(87, 87, 130));
		FIREtglbtn.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\controls\\fire.png"));
		FIREtglbtn.setOpaque(true);
		
		JToggleButton POWERtglbtn = new JToggleButton("");
		POWERtglbtn.setBounds(170, 2, 75, 79);
		CONTROLS.add(POWERtglbtn);
		POWERtglbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		controlGroup.add(POWERtglbtn);
		POWERtglbtn.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\controls\\power.png"));
		POWERtglbtn.setContentAreaFilled(false);
		POWERtglbtn.setBorderPainted(false);
		POWERtglbtn.setBackground(new Color(87, 87, 130));
		POWERtglbtn.setSelectedIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\controls\\powerSelected.png"));
		
		JToggleButton CLEANtglbtn = new JToggleButton("");
		CLEANtglbtn.setBounds(50, 0, 127, 91);
		CONTROLS.add(CLEANtglbtn);
		CLEANtglbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		controlGroup.add(CLEANtglbtn);
		CLEANtglbtn.setContentAreaFilled(false);
		CLEANtglbtn.setBorderPainted(false);
		CLEANtglbtn.setIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\controls\\dust.png"));
		CLEANtglbtn.setPressedIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\controls\\dustSelected.png"));
		CLEANtglbtn.setBackground(new Color(87, 87, 130));
		CLEANtglbtn.setSelectedIcon(new ImageIcon("C:\\Users\\psri981\\OneDrive - The University of Auckland\\Documents\\704Babes\\ECS_May\\ECS_res\\controls\\dustSelected.png"));
		
		JButton Simulatebtn = new JButton("SIMULATE");
		Simulatebtn.setBounds(497, 383, 99, 25);
		COMPONENTS.add(Simulatebtn);
		Simulatebtn.setEnabled(false);
		Simulatebtn.setBackground(new Color(255, 255, 255));
		Simulatebtn.setFont(new Font("Arial", Font.PLAIN, 14));
		frmAbs.setTitle("ECS");
		frmAbs.setBounds(100, 100, 1160, 600);
		frmAbs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		if(!ECS_States.LID_LOADED_POS_3) {
//			lidLoadedPos3.setVisible(false);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		else {
//			lidLoadedPos3.setVisible(true);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		if(!ECS_States.FILLED_BOT_POS_2) {
//			filledBotPos2.setVisible(false);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//		}
//		else {
//			filledBotPos2.setVisible(true);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		if(!ECS_States.DONE_BOT_POS_6) {
//			doneBotPos6.setVisible(false);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		else {
//			doneBotPos6.setVisible(true);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		if(!ECS_States.DONE_BOT_POS_5) {
//			doneBotPos5.setVisible(false);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		else {
//			doneBotPos5.setVisible(true);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		if(!ECS_States.EMPTY_BOT_POS_0) {
//			//System.out.println("swag");
//			emptyBotPos0.setVisible(false);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		else {
//			//System.out.println("ligma");
//			emptyBotPos0.setVisible(true);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		
//		if(!ECS_States.EMPTY_BOT_POS_1) {
//			//System.out.println("money");
//			emptyBotPos1.setVisible(false);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//		}
//		else {
//			emptyBotPos1.setVisible(true);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//
//		}
//		
//		if(!ECS_States.EMPTY_BOT_POS_2) {
//		//	System.out.println("sbitch");
//			emptyBotPos2.setVisible(false);
//		//	System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//
//		}
//		else {
//			emptyBotPos2.setVisible(true);
//			//System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//
//		}
//		if(!ECS_States.FILLED_BOT_POS_3) {
//		//	System.out.println("3");
//			filledBotPos3.setVisible(false);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//
//		}
//		else {
//			//System.out.println("3_5");
//			filledBotPos3.setVisible(true);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//
//		}
//		if(!ECS_States.CAP_SCREWED_POS_4) {
//			//System.out.println("4");
//			capScrewedPos4.setVisible(false);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//
//		}
//		else {
//			//System.out.println("4_5");
//			capScrewedPos4.setVisible(true);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmAbs.getContentPane().revalidate();
//			frmAbs.getContentPane().repaint();;
//
//
//		}

	}
}
