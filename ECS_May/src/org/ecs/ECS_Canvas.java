package org.ecs;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import org.ecs.ClockThread;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
import javax.swing.JProgressBar;
import javax.swing.AbstractAction;
import javax.swing.Action; 
import com.systemj.netapi.SimpleClient; 
import com.systemj.netapi.SimpleServer;


public class ECS_Canvas {

	private JFrame frmECS;
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
	                    window.frmECS.setVisible(true);
	                    
	                 // Create an instance of ClockThread and start it
	                    JLabel timeLabel = new JLabel(); // Replace this with your actual time label
	                    ClockThread clockThread = new ClockThread(timeLabel);
	                    clockThread.start();
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
		initialize();
	}

	

	/**
	 * Initialize the contents of the frame.
	 * 
	 * 
	 */
	
	// Create global variables to hold the values
	int lightValue = 5;
    int temperatureValue = 10;
    int humidityValue = 50;
	
	private void initialize() {
		frmECS = new JFrame();
		frmECS.setResizable(false);
		frmECS.getContentPane().setBackground(new Color(87, 87, 130));
		frmECS.getContentPane().setLayout(null);
		JPanel COMPONENTS = new JPanel();
		COMPONENTS.setBackground(new Color(87, 87, 130));
		COMPONENTS.setBounds(29, 81, 1096, 408);
		frmECS.getContentPane().add(COMPONENTS);
		COMPONENTS.setLayout(null);
		JPanel UNITS = new JPanel();
		UNITS.setBounds(809, 291, 287, 57);
		COMPONENTS.add(UNITS);
		UNITS.setBackground(new Color(87, 87, 130));
		UNITS.setLayout(null);
		
		// -------------------- Capture of int values -------------------- //
		
		JSpinner LightIntensity = new JSpinner();
		LightIntensity.setBounds(253, -1, 34, 24);
		UNITS.add(LightIntensity);
		LightIntensity.setModel(new SpinnerNumberModel(5, null, 10, 1));
		LightIntensity.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JSpinner Temperature = new JSpinner();
		Temperature.setBounds(114, 0, 40, 23);
		UNITS.add(Temperature);
		Temperature.setFont(new Font("Arial", Font.PLAIN, 14));
		Temperature.setModel(new SpinnerNumberModel(10, 10, 30, 1));
		
		JTextPane txtpnRoomTemp = new JTextPane();
		txtpnRoomTemp.setBounds(0, 0, 127, 23);
		UNITS.add(txtpnRoomTemp);
		txtpnRoomTemp.setText("Room Temp (*C)");
		txtpnRoomTemp.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JSpinner Humidity = new JSpinner();
		Humidity.setBounds(139, 34, 148, 24);
		UNITS.add(Humidity);
		Humidity.setModel(new SpinnerNumberModel(50, 0, 100, 10));
		Humidity.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JTextPane txtpnRoomHumidity = new JTextPane();
		txtpnRoomHumidity.setBounds(0, 34, 287, 23);
		UNITS.add(txtpnRoomHumidity);
		txtpnRoomHumidity.setText("Room Humidity (%)");
		txtpnRoomHumidity.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JTextPane txtpnLightIntensity = new JTextPane();
		txtpnLightIntensity.setBounds(157, 0, 128, 23);
		UNITS.add(txtpnLightIntensity);
		txtpnLightIntensity.setText("Light Intensity");
		txtpnLightIntensity.setFont(new Font("Arial", Font.PLAIN, 14));
		
		 // Add change listeners to the spinners
		LightIntensity.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                lightValue = (int) LightIntensity.getValue();
            }
        });

		Temperature.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                temperatureValue = (int) Temperature.getValue();

            }
        });

		Humidity.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                humidityValue = (int) Humidity.getValue();
            }
        });
		
		// -------------------- Capture of int values -------------------- //
		
		JPanel ZONES = new JPanel();
		ZONES.setBounds(0, 0, 783, 351);
		COMPONENTS.add(ZONES);
		ZONES.setLayout(null);
		
		JLabel powerZ5 = new JLabel("");
		powerZ5.setIcon(new ImageIcon("ECS_res\\appliances\\power.png"));
		powerZ5.setBounds(555, 137, 25, 30);
		ZONES.add(powerZ5);
		
		JLabel powerZ7 = new JLabel("");
		powerZ7.setIcon(new ImageIcon("ECS_res\\appliances\\power.png"));
		powerZ7.setBounds(113, 134, 25, 30);
		ZONES.add(powerZ7);
		
		JLabel powerZ3 = new JLabel("");
		powerZ3.setIcon(new ImageIcon("ECS_res\\appliances\\power.png"));
		powerZ3.setBounds(651, 312, 25, 30);
		ZONES.add(powerZ3);
		
		JLabel powerZ6 = new JLabel("");
		powerZ6.setIcon(new ImageIcon("ECS_res\\appliances\\power.png"));
		powerZ6.setBounds(751, 137, 25, 30);
		ZONES.add(powerZ6);
		
		JLabel powerZ2 = new JLabel("");
		powerZ2.setIcon(new ImageIcon("ECS_res\\appliances\\power.png"));
		powerZ2.setBounds(424, 312, 25, 30);
		ZONES.add(powerZ2);
		
		JLabel powerZ4 = new JLabel("");
		powerZ4.setIcon(new ImageIcon("ECS_res\\appliances\\power.png"));
		powerZ4.setBounds(422, 137, 25, 30);
		ZONES.add(powerZ4);
		
		JLabel powerZ1 = new JLabel("");
		powerZ1.setIcon(new ImageIcon("ECS_res\\appliances\\power.png"));
		powerZ1.setBounds(115, 312, 25, 30);
		ZONES.add(powerZ1);
		
		JLabel humZ4 = new JLabel("");
		humZ4.setIcon(new ImageIcon("ECS_res\\appliances\\hum.png"));
		humZ4.setEnabled(false);
		humZ4.setBounds(405, 137, 25, 30);
		ZONES.add(humZ4);
		
		JLabel humZ5 = new JLabel("");
		humZ5.setIcon(new ImageIcon("ECS_res\\appliances\\hum.png"));
		humZ5.setEnabled(false);
		humZ5.setBounds(537, 137, 25, 30);
		ZONES.add(humZ5);
		
		JLabel humZ7 = new JLabel("");
		humZ7.setIcon(new ImageIcon("ECS_res\\appliances\\hum.png"));
		humZ7.setEnabled(false);
		humZ7.setBounds(94, 135, 25, 30);
		ZONES.add(humZ7);
		
		JLabel humZ2 = new JLabel("");
		humZ2.setIcon(new ImageIcon("ECS_res\\appliances\\hum.png"));
		humZ2.setEnabled(false);
		humZ2.setBounds(405, 312, 25, 30);
		ZONES.add(humZ2);
		
		JLabel humZ3 = new JLabel("");
		humZ3.setIcon(new ImageIcon("ECS_res\\appliances\\hum.png"));
		humZ3.setEnabled(false);
		humZ3.setBounds(634, 312, 25, 30);
		ZONES.add(humZ3);
		
		JLabel humZ6 = new JLabel("");
		humZ6.setIcon(new ImageIcon("ECS_res\\appliances\\hum.png"));
		humZ6.setEnabled(false);
		humZ6.setBounds(733, 137, 25, 30);
		ZONES.add(humZ6);
		
		JLabel humZ1 = new JLabel("");
		humZ1.setIcon(new ImageIcon("ECS_res\\appliances\\hum.png"));
		humZ1.setEnabled(false);
		humZ1.setBounds(95, 312, 25, 30);
		ZONES.add(humZ1);
		
		JLabel deHumZ1 = new JLabel("");
		deHumZ1.setEnabled(false);
		deHumZ1.setIcon(new ImageIcon("ECS_res\\appliances\\dehum.png"));
		deHumZ1.setBounds(72, 312, 25, 30);
		ZONES.add(deHumZ1);
		
		JLabel deHumZ7 = new JLabel("");
		deHumZ7.setIcon(new ImageIcon("ECS_res\\appliances\\dehum.png"));
		deHumZ7.setEnabled(false);
		deHumZ7.setBounds(72, 135, 25, 30);
		ZONES.add(deHumZ7);
		
		JLabel deHumZ4 = new JLabel("");
		deHumZ4.setIcon(new ImageIcon("ECS_res\\appliances\\dehum.png"));
		deHumZ4.setEnabled(false);
		deHumZ4.setBounds(384, 137, 25, 30);
		ZONES.add(deHumZ4);
		
		JLabel deHumZ6 = new JLabel("");
		deHumZ6.setIcon(new ImageIcon("ECS_res\\appliances\\dehum.png"));
		deHumZ6.setEnabled(false);
		deHumZ6.setBounds(712, 137, 25, 30);
		ZONES.add(deHumZ6);
		
		JLabel deHumZ2 = new JLabel("");
		deHumZ2.setIcon(new ImageIcon("ECS_res\\appliances\\dehum.png"));
		deHumZ2.setEnabled(false);
		deHumZ2.setBounds(384, 312, 25, 30);
		ZONES.add(deHumZ2);
		
		JLabel deHumZ5 = new JLabel("");
		deHumZ5.setIcon(new ImageIcon("ECS_res\\appliances\\dehum.png"));
		deHumZ5.setEnabled(false);
		deHumZ5.setBounds(516, 137, 25, 30);
		ZONES.add(deHumZ5);
		
		JLabel deHumZ3 = new JLabel("");
		deHumZ3.setIcon(new ImageIcon("ECS_res\\appliances\\dehum.png"));
		deHumZ3.setEnabled(false);
		deHumZ3.setBounds(612, 312, 25, 30);
		ZONES.add(deHumZ3);
		
		JLabel heatAirConZ3 = new JLabel("");
		heatAirConZ3.setEnabled(false);
		heatAirConZ3.setIcon(new ImageIcon("ECS_res\\appliances\\heatAirOn.png"));
		heatAirConZ3.setBounds(588, 312, 26, 30);
		ZONES.add(heatAirConZ3);
		
		JLabel heatAirConZ5 = new JLabel("");
		heatAirConZ5.setEnabled(false);
		heatAirConZ5.setIcon(new ImageIcon("ECS_res\\appliances\\heatAirOn.png"));
		heatAirConZ5.setBounds(492, 137, 26, 30);
		ZONES.add(heatAirConZ5);
		
		JLabel heatAirConZ4 = new JLabel("");
		heatAirConZ4.setEnabled(false);
		heatAirConZ4.setIcon(new ImageIcon("ECS_res\\appliances\\heatAirOn.png"));
		heatAirConZ4.setBounds(361, 137, 26, 30);
		ZONES.add(heatAirConZ4);
		
		JLabel heatAirConZ6 = new JLabel("");
		heatAirConZ6.setEnabled(false);
		heatAirConZ6.setIcon(new ImageIcon("ECS_res\\appliances\\heatAirOn.png"));
		heatAirConZ6.setBounds(689, 137, 26, 30);
		ZONES.add(heatAirConZ6);
		
		JLabel heatAirConZ2 = new JLabel("");
		heatAirConZ2.setEnabled(false);
		heatAirConZ2.setIcon(new ImageIcon("ECS_res\\appliances\\heatAirOn.png"));
		heatAirConZ2.setBounds(361, 312, 26, 30);
		ZONES.add(heatAirConZ2);
		
		JLabel sAlarmDActZ2 = new JLabel("");
		sAlarmDActZ2.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmDActZ2.setEnabled(false);
		sAlarmDActZ2.setBounds(426, 180, 32, 30);
		ZONES.add(sAlarmDActZ2);
		
		JLabel sAlarmDActZ1 = new JLabel("");
		sAlarmDActZ1.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmDActZ1.setEnabled(false);
		sAlarmDActZ1.setBounds(146, 180, 32, 30);
		ZONES.add(sAlarmDActZ1);
		
		JLabel sAlarmDActZ7 = new JLabel("");
		sAlarmDActZ7.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmDActZ7.setEnabled(false);
		sAlarmDActZ7.setBounds(146, 5, 32, 30);
		ZONES.add(sAlarmDActZ7);
		
		JLabel sAlarmDActZ6 = new JLabel("");
		sAlarmDActZ6.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmDActZ6.setEnabled(false);
		sAlarmDActZ6.setBounds(704, 5, 32, 30);
		ZONES.add(sAlarmDActZ6);
		
		JLabel sAlarmDActZ4 = new JLabel("");
		sAlarmDActZ4.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmDActZ4.setEnabled(false);
		sAlarmDActZ4.setBounds(374, 5, 32, 30);
		ZONES.add(sAlarmDActZ4);
		
		JLabel sAlarmDActZ5 = new JLabel("");
		sAlarmDActZ5.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmDActZ5.setEnabled(false);
		sAlarmDActZ5.setBounds(539, 4, 32, 30);
		ZONES.add(sAlarmDActZ5);
		
		JLabel sAlarmDActZ3 = new JLabel("");
		sAlarmDActZ3.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmDActZ3.setEnabled(false);
		sAlarmDActZ3.setBounds(653, 180, 32, 30);
		ZONES.add(sAlarmDActZ3);
		
		JLabel coolAirZ4 = new JLabel("");
		coolAirZ4.setIcon(new ImageIcon("ECS_res\\appliances\\coolAirCon.png"));
		coolAirZ4.setEnabled(false);
		coolAirZ4.setBounds(334, 137, 30, 30);
		ZONES.add(coolAirZ4);
		
		JLabel coolAirZ6 = new JLabel("");
		coolAirZ6.setIcon(new ImageIcon("ECS_res\\appliances\\coolAirCon.png"));
		coolAirZ6.setEnabled(false);
		coolAirZ6.setBounds(663, 137, 30, 30);
		ZONES.add(coolAirZ6);
		
		JLabel coolAirZ5 = new JLabel("");
		coolAirZ5.setIcon(new ImageIcon("ECS_res\\appliances\\coolAirCon.png"));
		coolAirZ5.setEnabled(false);
		coolAirZ5.setBounds(465, 137, 30, 30);
		ZONES.add(coolAirZ5);
		
		JLabel coolAirZ3_1 = new JLabel("");
		coolAirZ3_1.setIcon(new ImageIcon("ECS_res\\appliances\\coolAirCon.png"));
		coolAirZ3_1.setEnabled(false);
		coolAirZ3_1.setBounds(561, 312, 30, 30);
		ZONES.add(coolAirZ3_1);
		
		JLabel coolAirZ3 = new JLabel("");
		coolAirZ3.setEnabled(false);
		coolAirZ3.setBounds(566, 312, 30, 30);
		ZONES.add(coolAirZ3);
		
		JLabel coolAirZ2 = new JLabel("");
		coolAirZ2.setEnabled(false);
		coolAirZ2.setIcon(new ImageIcon("ECS_res\\appliances\\coolAirCon.png"));
		coolAirZ2.setBounds(334, 314, 30, 30);
		ZONES.add(coolAirZ2);
		
		JLabel heatOnZ7 = new JLabel("");
		heatOnZ7.setDisabledIcon(null);
		heatOnZ7.setEnabled(false);
		heatOnZ7.setIcon(new ImageIcon("ECS_res\\appliances\\heaterOn.png"));
		heatOnZ7.setBounds(46, 133, 26, 32);
		ZONES.add(heatOnZ7);
		
		JLabel heatOnZ1 = new JLabel("");
		heatOnZ1.setDisabledIcon(null);
		heatOnZ1.setEnabled(false);
		heatOnZ1.setIcon(new ImageIcon("ECS_res\\appliances\\heaterOn.png"));
		heatOnZ1.setBounds(46, 310, 26, 32);
		ZONES.add(heatOnZ1);
		
		JLabel fanOnZ7 = new JLabel("");
		fanOnZ7.setBackground(new Color(255, 255, 255));
		fanOnZ7.setEnabled(false);
		fanOnZ7.setDisabledIcon(null);
		fanOnZ7.setIcon(new ImageIcon("ECS_res\\appliances\\fanOn.png"));
		fanOnZ7.setBounds(10, 132, 34, 34);
		ZONES.add(fanOnZ7);
		
		JLabel fanOnZ1 = new JLabel("");
		fanOnZ1.setEnabled(false);
		fanOnZ1.setDisabledIcon(null);
		fanOnZ1.setIcon(new ImageIcon("ECS_res\\appliances\\fanOn.png"));
		fanOnZ1.setBounds(10, 308, 34, 34);
		ZONES.add(fanOnZ1);
		
		JLabel Zone4 = new JLabel("");
		Zone4.setBounds(325, 0, 130, 176);
		ZONES.add(Zone4);
		Zone4.setIcon(new ImageIcon("ECS_res\\zones\\z4.png"));
		Zone4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Zone7 = new JLabel("");
		Zone7.setBounds(0, 0, 324, 176);
		ZONES.add(Zone7);
		Zone7.setHorizontalAlignment(SwingConstants.CENTER);
		Zone7.setIcon(new ImageIcon("ECS_res\\zones\\z7.png"));
		
		JLabel Zone1 = new JLabel("");
		Zone1.setBounds(0, 175, 324, 176);
		ZONES.add(Zone1);
		Zone1.setHorizontalAlignment(SwingConstants.CENTER);
		Zone1.setIcon(new ImageIcon("ECS_res\\zones\\z1.png"));
		
		JLabel Zone2 = new JLabel("");
		Zone2.setBounds(324, 175, 232, 176);
		ZONES.add(Zone2);
		Zone2.setIcon(new ImageIcon("ECS_res\\zones\\z2.png"));
		Zone2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Zone6 = new JLabel("");
		Zone6.setBounds(653, 0, 130, 176);
		ZONES.add(Zone6);
		Zone6.setIcon(new ImageIcon("ECS_res\\zones\\z6.png"));
		Zone6.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Zone5 = new JLabel("");
		Zone5.setBounds(455, 0, 198, 176);
		ZONES.add(Zone5);
		Zone5.setIcon(new ImageIcon("ECS_res\\zones\\z5.png"));
		Zone5.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Zone3 = new JLabel("");
		Zone3.setBounds(552, 175, 231, 176);
		ZONES.add(Zone3);
		Zone3.setIcon(new ImageIcon("ECS_res\\zones\\z3.png"));
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
		FIREtglbtn.setPressedIcon(new ImageIcon("ECS_res\\controls\\fireSelected.png"));
		FIREtglbtn.setSelectedIcon(new ImageIcon("ECS_res\\controls\\fireSelected.png"));
		FIREtglbtn.setBorder(null);
		FIREtglbtn.setBorderPainted(false);
		FIREtglbtn.setBackground(new Color(87, 87, 130));
		FIREtglbtn.setIcon(new ImageIcon("ECS_res\\controls\\fire.png"));
		FIREtglbtn.setOpaque(true);
		
		JToggleButton POWERtglbtn = new JToggleButton("");
		POWERtglbtn.setBounds(170, 2, 75, 79);
		CONTROLS.add(POWERtglbtn);
		POWERtglbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		controlGroup.add(POWERtglbtn);
		POWERtglbtn.setIcon(new ImageIcon("ECS_res\\controls\\power.png"));
		POWERtglbtn.setContentAreaFilled(false);
		POWERtglbtn.setBorderPainted(false);
		POWERtglbtn.setBackground(new Color(87, 87, 130));
		POWERtglbtn.setSelectedIcon(new ImageIcon("ECS_res\\controls\\powerSelected.png"));
		
		JToggleButton CLEANtglbtn = new JToggleButton("");
		CLEANtglbtn.setBounds(50, 0, 127, 91);
		CONTROLS.add(CLEANtglbtn);
		CLEANtglbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		controlGroup.add(CLEANtglbtn);
		CLEANtglbtn.setContentAreaFilled(false);
		CLEANtglbtn.setBorderPainted(false);
		CLEANtglbtn.setIcon(new ImageIcon("ECS_res\\controls\\dust.png"));
		CLEANtglbtn.setPressedIcon(new ImageIcon("ECS_res\\controls\\dustSelected.png"));
		CLEANtglbtn.setBackground(new Color(87, 87, 130));
		CLEANtglbtn.setSelectedIcon(new ImageIcon("ECS_res\\controls\\dustSelected.png"));
		
		// -------------- CODE FOR SELECTION OF ZONES -------------- //
		// Create an array of zone JToggleButtons //
		JToggleButton[] zoneButtons = new JToggleButton[7];
		JButton Simulatebtn = new JButton("RUN");
		Simulatebtn.setEnabled(false);

		// Add zone buttons to the array
		zoneButtons[0] = z1btn;
		zoneButtons[1] = z2btn;
		zoneButtons[2] = z3btn;
		zoneButtons[3] = z4btn;
		zoneButtons[4] = z5btn;
		zoneButtons[5] = z6btn;
		zoneButtons[6] = z7btn;

		// Define the ItemListener for zone buttons
		ItemListener zoneSelectionListener = new ItemListener() {
		    @SuppressWarnings("resource")
			public void itemStateChanged(ItemEvent e) {
		        int selectedZoneButton = -1; // Initialize to -1 or another default value
		        // Check if any zone button is selected
		        for (int i = 0; i < zoneButtons.length; i++) {
		            if (zoneButtons[i].isSelected()) {
		                // Store the index of the selected button
		                selectedZoneButton = i;
		                // Emit the value to ECS Plant CD
		                SimpleClient selectedZoneClient = null;
						try {
							selectedZoneClient = new SimpleClient("127.0.0.1", 10001, "ECSPlantCD", "zone");
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
		                try {
		                	// emit for 20ms
							selectedZoneClient.emit(i, 20);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}        
		                break;
		            }
		        }

		        // Enable/disable the "RUN" button based on zone selection
		        Simulatebtn.setEnabled(selectedZoneButton != -1);
		    }
		};

		// Add the same listener to all zone buttons
		for (JToggleButton button : zoneButtons) {
		    button.addItemListener(zoneSelectionListener);
		}

		// Create an action for the "RUN" button
		Action runAction = new AbstractAction("RUN") {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Check the condition, e.g., if a zone is pressed
		        boolean zoneIsPressed = true;

		        if (zoneIsPressed) {
		            // do what with what signal
//		        	System.out.println(selectedZoneButton);
		        }
		    }
		};

		// Create the "RUN" button and set its action
		Simulatebtn.setAction(runAction);
		Simulatebtn.setBounds(905, 383, 99, 25);
		COMPONENTS.add(Simulatebtn);
		Simulatebtn.setBackground(new Color(255, 255, 255));
		Simulatebtn.setFont(new Font("Arial", Font.PLAIN, 14));
		Simulatebtn.setEnabled(false); // Initially, disable the "RUN" button
		
		// -------------- CODE FOR CLOCK ------------- //
		JLabel timeLabel = new JLabel("00:00:00");
		timeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		timeLabel.setForeground(new Color(255, 255, 255));
		timeLabel.setBounds(76, 51, 68, 19);
		frmECS.getContentPane().add(timeLabel);
		frmECS.setTitle("ECS");
		frmECS.setBounds(100, 100, 1160, 600);
		frmECS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Start the clock thread yay!!
	    ClockThread clockThread = new ClockThread(timeLabel);
	    
	    JTextPane txtpnTime = new JTextPane();
	    txtpnTime.setOpaque(false);
	    txtpnTime.setEditable(false);
	    txtpnTime.setText("Time:");
	    txtpnTime.setFont(new Font("Arial", Font.PLAIN, 16));
	    txtpnTime.setBackground(new Color(87, 87, 130));
	    txtpnTime.setForeground(new Color(255, 255, 255));
	    txtpnTime.setBounds(29, 47, 68, 20);
	    frmECS.getContentPane().add(txtpnTime);
	    clockThread.start();
	    
	    	    
//	    if (selectedZoneButton == 1) {
//	    	
//	    	if(ECS_States.CLEAN_ZONE_1) {
//	    		 
//	    	}else if(ECS_States.FAN_ZONE_1_7) {
//	    		
//	    	}
//	    	
//	    }else if (selectedZoneButton == 2){
//	    	
//	    }else if (selectedZoneButton == 3){
//	    	
//	    }else if (selectedZoneButton == 4){
//	    	
//	    }else if (selectedZoneButton == 5){
//	    	
//	    }else if (selectedZoneButton == 6){
//	    	
//	    }else{
//	    	
//	    }
		
//	    btnNewButton.addActionListener(e -> {
	    
//		if(!ECS_States.LID_LOADED_POS_3) {
//			lidLoadedPos3.setVisible(false);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		else {
//			lidLoadedPos3.setVisible(true);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		if(!ECS_States.FILLED_BOT_POS_2) {
//			filledBotPos2.setVisible(false);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//		}
//		else {
//			filledBotPos2.setVisible(true);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		if(!ECS_States.DONE_BOT_POS_6) {
//			doneBotPos6.setVisible(false);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		else {
//			doneBotPos6.setVisible(true);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		if(!ECS_States.DONE_BOT_POS_5) {
//			doneBotPos5.setVisible(false);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		else {
//			doneBotPos5.setVisible(true);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		if(!ECS_States.EMPTY_BOT_POS_0) {
//			emptyBotPos0.setVisible(false);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		else {
//			emptyBotPos0.setVisible(true);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		
//		if(!ECS_States.EMPTY_BOT_POS_1) {
//			emptyBotPos1.setVisible(false);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//		}
//		else {
//			emptyBotPos1.setVisible(true);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//
//		}
//		
//		if(!ECS_States.EMPTY_BOT_POS_2) {
//			emptyBotPos2.setVisible(false);
//		//	System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//
//		}
//		else {
//			emptyBotPos2.setVisible(true);
//			//System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//
//		}
//		if(!ECS_States.FILLED_BOT_POS_3) {
//		//	System.out.println("3");
//			filledBotPos3.setVisible(false);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//
//		}
//		else {
//			//System.out.println("3_5");
//			filledBotPos3.setVisible(true);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//
//		}
//		if(!ECS_States.CAP_SCREWED_POS_4) {
//			//System.out.println("4");
//			capScrewedPos4.setVisible(false);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//
//		}
//		else {
//			//System.out.println("4_5");
//			capScrewedPos4.setVisible(true);
////			System.out.println(ECS_States.EMPTY_BOT_POS_1);
//			frmECS.getContentPane().revalidate();
//			frmECS.getContentPane().repaint();;
//
//
//		}});

	}
}
