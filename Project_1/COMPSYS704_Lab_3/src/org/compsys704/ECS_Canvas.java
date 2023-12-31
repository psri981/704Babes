package org.compsys704;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import org.compsys704.ClockThread;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
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
import com.systemj.ipc.SignalClient;
import com.systemj.netapi.SimpleClient; 
import com.systemj.netapi.SimpleServer;


public class ECS_Canvas {

	private JFrame frmECS;
	private final ButtonGroup zoneGroup = new ButtonGroup();

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
	int selectedZoneButton = -1; // Initialize to -1
	boolean firebtnPressed = false;

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

		JLabel sAlarmZ2 = new JLabel("");
		sAlarmZ2.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmZ2.setEnabled(false);
		sAlarmZ2.setBounds(426, 180, 32, 30);
		ZONES.add(sAlarmZ2);

		JLabel sAlarmZ1 = new JLabel("");
		sAlarmZ1.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmZ1.setEnabled(false);
		sAlarmZ1.setBounds(146, 180, 32, 30);
		ZONES.add(sAlarmZ1);

		JLabel sAlarmZ7 = new JLabel("");
		sAlarmZ7.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmZ7.setEnabled(false);
		sAlarmZ7.setBounds(146, 5, 32, 30);
		ZONES.add(sAlarmZ7);

		JLabel sAlarmZ6 = new JLabel("");
		sAlarmZ6.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmZ6.setEnabled(false);
		sAlarmZ6.setBounds(704, 5, 32, 30);
		ZONES.add(sAlarmZ6);

		JLabel sAlarmZ4 = new JLabel("");
		sAlarmZ4.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmZ4.setEnabled(false);
		sAlarmZ4.setBounds(374, 5, 32, 30);
		ZONES.add(sAlarmZ4);

		JLabel sAlarmZ5 = new JLabel("");
		sAlarmZ5.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmZ5.setEnabled(false);
		sAlarmZ5.setBounds(539, 4, 32, 30);
		ZONES.add(sAlarmZ5);

		JLabel sAlarmZ3 = new JLabel("");
		sAlarmZ3.setIcon(new ImageIcon("ECS_res\\appliances\\smokeAlarmAct.png"));
		sAlarmZ3.setEnabled(false);
		sAlarmZ3.setBounds(653, 180, 32, 30);
		ZONES.add(sAlarmZ3);

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

		JLabel coolAirZ3 = new JLabel("");
		coolAirZ3.setIcon(new ImageIcon("ECS_res\\appliances\\coolAirCon.png"));
		coolAirZ3.setEnabled(false);
		coolAirZ3.setBounds(561, 312, 30, 30);
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
		FIREtglbtn.setBounds(160, 11, 49, 69);
		CONTROLS.add(FIREtglbtn);
		FIREtglbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		FIREtglbtn.setContentAreaFilled(false);
		FIREtglbtn.setPressedIcon(new ImageIcon("ECS_res\\controls\\fireSelected.png"));
		FIREtglbtn.setSelectedIcon(new ImageIcon("ECS_res\\controls\\fireSelected.png"));
		FIREtglbtn.setBorder(null);
		FIREtglbtn.setBorderPainted(false);
		FIREtglbtn.setBackground(new Color(87, 87, 130));
		FIREtglbtn.setIcon(new ImageIcon("ECS_res\\controls\\fire.png"));
		FIREtglbtn.setOpaque(true);
		FIREtglbtn.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {
				if(firebtnPressed) {
					firebtnPressed = false;
					try {
						System.out.println("Fire Button State: " + firebtnPressed);
						SimpleClient sendFire = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "fire");
						sendFire.emit(0, 10);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					firebtnPressed = true;
					try {
						System.out.println("Fire Button State: " + firebtnPressed);
						SimpleClient sendFire = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "fire");
						sendFire.emit(1, 10);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});

		JToggleButton CLEANtglbtn = new JToggleButton("");
		CLEANtglbtn.setBounds(10, 0, 127, 91);
		CONTROLS.add(CLEANtglbtn);
		CLEANtglbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		Simulatebtn.addActionListener(new ECS_SignalClient(ECS_Ports.PORT_LOADER_PLANT, ECS_Ports.RUN_SIGNAL));
		Simulatebtn.addActionListener(new ActionListener() {
			@SuppressWarnings("resource")
			public void actionPerformed(ActionEvent e) {
				try {

					if (selectedZoneButton == 1 || selectedZoneButton == 7) {
						SimpleClient sendTemp = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "tempZone1_7");
						SimpleClient sendHumid = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "humidZone1_7");
						SimpleClient sendLight = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "lightInt");
						sendLight.emit(lightValue, 10);
						sendTemp.emit(temperatureValue, 10);
						sendHumid.emit(humidityValue, 10);	
					}else if(selectedZoneButton == 2 || selectedZoneButton == 3) {
						SimpleClient sendTemp = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "tempZone2_3");
						SimpleClient sendHumid = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "humidZone2_3");
						SimpleClient sendLight = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "lightInt");
						sendLight.emit(lightValue, 10);
						sendTemp.emit(temperatureValue, 10);
						sendHumid.emit(humidityValue, 10);	
					}else if(selectedZoneButton == 4 || selectedZoneButton == 5 || selectedZoneButton == 6) {
						SimpleClient sendTemp = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "tempZone4_5_6");
						SimpleClient sendHumid = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "humidZone4_5_6");
						SimpleClient sendLight = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "lightInt");
						sendLight.emit(lightValue, 10);
						sendTemp.emit(temperatureValue, 10);
						sendHumid.emit(humidityValue, 10);
					}
					
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		//		ECS_Ports.PORT_LOADER_PLANT, ECS_Ports.RUN_SIGNAL

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
				// Check if any zone button is selected
				for (int i = 0; i < zoneButtons.length; i++) {
					if (zoneButtons[i].isSelected()) {
						// Store the index of the selected button
						System.out.println("Zone " + (i+1) + " selected");
						selectedZoneButton = i + 1;
						// Emit the value to ECS Plant CD
						try {
							SimpleClient selectedZoneClient = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "selectedZone");
							selectedZoneClient.emit((i+1), 10);
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
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
		@SuppressWarnings("serial")
		Action runAction = new AbstractAction("RUN") {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Check the condition, e.g., if a zone is pressed
				boolean zoneIsPressed = true;    

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
		
		if(ECS_States.FIRE_ZONE_1 ) {
			sAlarmZ1.setEnabled(true);
			powerZ1.setEnabled(false);
			sAlarmZ2.setEnabled(true);
			powerZ2.setEnabled(false);
			sAlarmZ3.setEnabled(true);
			powerZ3.setEnabled(false);
			sAlarmZ4.setEnabled(true);
			powerZ4.setEnabled(false);
			sAlarmZ5.setEnabled(true);
			powerZ5.setEnabled(false);
			sAlarmZ6.setEnabled(true);
			powerZ6.setEnabled(false);
			sAlarmZ7.setEnabled(true);
			powerZ7.setEnabled(false);
			frmECS.getContentPane().revalidate();
			frmECS.getContentPane().repaint();
		}else {
			sAlarmZ1.setEnabled(false);
			powerZ1.setEnabled(true);
			sAlarmZ2.setEnabled(false);
			powerZ2.setEnabled(true);
			sAlarmZ3.setEnabled(false);
			powerZ3.setEnabled(true);
			sAlarmZ4.setEnabled(false);
			powerZ4.setEnabled(true);
			sAlarmZ5.setEnabled(false);
			powerZ5.setEnabled(true);
			sAlarmZ6.setEnabled(false);
			powerZ6.setEnabled(true);
			sAlarmZ7.setEnabled(false);
			powerZ7.setEnabled(true);

			frmECS.getContentPane().revalidate();
			frmECS.getContentPane().repaint();
		}
		// STATE CHECKING FOR GUI
		Simulatebtn.addActionListener(e -> {

			// CHECK FOR FIRES -- IF THERE IS FIRE TURN ON SMOKE ALARM
			
			if(!ECS_States.FIRE_ZONE_1 ) {
				sAlarmZ1.setEnabled(true);
				powerZ1.setEnabled(false);
				sAlarmZ2.setEnabled(true);
				powerZ2.setEnabled(false);
				sAlarmZ3.setEnabled(true);
				powerZ3.setEnabled(false);
				sAlarmZ4.setEnabled(true);
				powerZ4.setEnabled(false);
				sAlarmZ5.setEnabled(true);
				powerZ5.setEnabled(false);
				sAlarmZ6.setEnabled(true);
				powerZ6.setEnabled(false);
				sAlarmZ7.setEnabled(true);
				powerZ7.setEnabled(false);
				frmECS.getContentPane().revalidate();
				frmECS.getContentPane().repaint();
			}else {
				sAlarmZ1.setEnabled(false);
				powerZ1.setEnabled(true);
				sAlarmZ2.setEnabled(false);
				powerZ2.setEnabled(true);
				sAlarmZ3.setEnabled(false);
				powerZ3.setEnabled(true);
				sAlarmZ4.setEnabled(false);
				powerZ4.setEnabled(true);
				sAlarmZ5.setEnabled(false);
				powerZ5.setEnabled(true);
				sAlarmZ6.setEnabled(false);
				powerZ6.setEnabled(true);
				sAlarmZ7.setEnabled(false);
				powerZ7.setEnabled(true);

				frmECS.getContentPane().revalidate();
				frmECS.getContentPane().repaint();
			}
			
//			if(!ECS_States.FIRE_EXT){
//				sAlarmZ1.setEnabled(false);
//				powerZ1.setEnabled(true);
//				sAlarmZ2.setEnabled(false);
//				powerZ2.setEnabled(true);
//				sAlarmZ3.setEnabled(false);
//				powerZ3.setEnabled(true);
//				sAlarmZ4.setEnabled(false);
//				powerZ4.setEnabled(true);
//				sAlarmZ5.setEnabled(false);
//				powerZ5.setEnabled(true);
//				sAlarmZ6.setEnabled(false);
//				powerZ6.setEnabled(true);
//				sAlarmZ7.setEnabled(false);
//				powerZ7.setEnabled(true);
//				frmECS.getContentPane().revalidate();
//				frmECS.getContentPane().repaint();
//			} else {
//				sAlarmZ1.setEnabled(true);
//				powerZ1.setEnabled(false);
//				sAlarmZ2.setEnabled(true);
//				powerZ2.setEnabled(false);
//				sAlarmZ3.setEnabled(true);
//				powerZ3.setEnabled(false);
//				sAlarmZ4.setEnabled(true);
//				powerZ4.setEnabled(false);
//				sAlarmZ5.setEnabled(true);
//				powerZ5.setEnabled(false);
//				sAlarmZ6.setEnabled(true);
//				powerZ6.setEnabled(false);
//				sAlarmZ7.setEnabled(true);
//				powerZ7.setEnabled(false);
//				frmECS.getContentPane().revalidate();
//				frmECS.getContentPane().repaint();
//			}

			// CHECK IF TEMPERATURE AND HUMIDITY MUST BE ADJUSTED IF THERES NO FIRE
			if(!firebtnPressed) {
				
				try (SimpleClient sendFire = new SimpleClient("127.0.0.1", 30003, "ECSPlantCD", "fire")) {
					sendFire.emit(0, 10);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(ECS_States.FAN_ZONE_1_7) {
					fanOnZ1.setEnabled(false);
					fanOnZ7.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					fanOnZ1.setEnabled(true);
					fanOnZ7.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(ECS_States.HEAT_ZONE_1_7) {
					heatOnZ1.setEnabled(false);
					heatOnZ7.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					heatOnZ1.setEnabled(true);
					heatOnZ7.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.AC_COOL_ZONE_2_3) {
					coolAirZ2.setEnabled(true);
					coolAirZ3.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					coolAirZ2.setEnabled(false);
					coolAirZ3.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.AC_COOL_ZONE_4_5_6) {
					coolAirZ4.setEnabled(true);
					coolAirZ5.setEnabled(true);
					coolAirZ6.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					coolAirZ4.setEnabled(false);
					coolAirZ5.setEnabled(false);
					coolAirZ6.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.AC_HEAT_ZONE_2_3) {
					heatAirConZ2.setEnabled(true);
					heatAirConZ3.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					heatAirConZ2.setEnabled(false);
					heatAirConZ3.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.AC_HEAT_ZONE_4_5_6) {
					heatAirConZ4.setEnabled(true);
					heatAirConZ5.setEnabled(true);
					heatAirConZ6.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					heatAirConZ4.setEnabled(false);
					heatAirConZ5.setEnabled(false);
					heatAirConZ6.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.HUM_ZONE_1_7) {
					humZ1.setEnabled(true);
					humZ7.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					humZ1.setEnabled(false);
					humZ7.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.HUM_ZONE_2_3) {
					humZ2.setEnabled(true);
					humZ3.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					humZ2.setEnabled(false);
					humZ3.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.HUM_ZONE_4_5_6) {
					humZ4.setEnabled(true);
					humZ5.setEnabled(true);
					humZ6.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					humZ4.setEnabled(false);
					humZ5.setEnabled(false);
					humZ6.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.DEHUM_ZONE_1_7) {
					deHumZ1.setEnabled(true);
					deHumZ7.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					deHumZ1.setEnabled(false);
					deHumZ7.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.DEHUM_ZONE_2_3) {
					deHumZ2.setEnabled(true);
					deHumZ3.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					deHumZ2.setEnabled(false);
					deHumZ3.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				
				if(!ECS_States.DEHUM_ZONE_4_5_6) {
					deHumZ4.setEnabled(true);
					deHumZ5.setEnabled(true);
					deHumZ6.setEnabled(true);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
				else {
					deHumZ4.setEnabled(false);
					deHumZ5.setEnabled(false);
					deHumZ6.setEnabled(false);
					frmECS.getContentPane().revalidate();
					frmECS.getContentPane().repaint();
				}
			}

		});

	}
}
