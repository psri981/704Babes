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

public class Canvas {


	private JFrame frmAbs;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		Canvas window = new Canvas();
//		window.frmAbs.setVisible(true);
//		SignalServer<RotaryVizWorker> server = new SignalServer<RotaryVizWorker>(Ports.PORT_LOADER_VIZ, RotaryVizWorker.class);
//		new Thread(server).start();
//
//		while(true) {
//			try {
//				Thread.sleep(5);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
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

		JLabel LFMReady = new JLabel("");
		LFMReady.setBackground(Color.WHITE);
		LFMReady.setForeground(Color.WHITE);
		LFMReady.setIcon(new ImageIcon("res\\fillerReady_300.png"));
		LFMReady.setBounds(-46, 187, 352, 141);
		frmAbs.getContentPane().add(LFMReady);

		JLabel LFMInUse = new JLabel("");
		LFMInUse.setIcon(new ImageIcon("res\\fillerInUse_300.png"));
		LFMInUse.setForeground(Color.WHITE);
		LFMInUse.setBackground(Color.WHITE);
		LFMInUse.setBounds(-46, 187, 352, 141);
		frmAbs.getContentPane().add(LFMInUse);

		JLabel LLReady = new JLabel("");
		LLReady.setHorizontalAlignment(SwingConstants.CENTER);
		LLReady.setIcon(new ImageIcon("res\\lidLoadReady_400.png"));
		LLReady.setBounds(283, -56, 162, 232);
		frmAbs.getContentPane().add(LLReady);

		JLabel LLReadyInUse = new JLabel("");
		LLReadyInUse.setIcon(new ImageIcon("res\\lidLoadInUse_400.png"));
		LLReadyInUse.setHorizontalAlignment(SwingConstants.CENTER);
		LLReadyInUse.setBounds(283, -56, 162, 232);
		frmAbs.getContentPane().add(LLReadyInUse);

		JLabel CSMReady = new JLabel("");
		CSMReady.setIcon(new ImageIcon("res\\capperReady_300.png"));
		CSMReady.setBounds(477, 201, 398, 125);
		frmAbs.getContentPane().add(CSMReady);

		JLabel CSMReadyInUse = new JLabel("");
		CSMReadyInUse.setIcon(new ImageIcon("res\\capperInUse_300.png"));
		CSMReadyInUse.setBounds(477, 201, 398, 125);
		frmAbs.getContentPane().add(CSMReadyInUse);

		//lidLoadedPos3
		JLabel lidLoadedPos3 = new JLabel("");
		if(!States.LID_LOADED_POS_3) {
			lidLoadedPos3.setVisible(false);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}
		else {
			lidLoadedPos3.setVisible(true);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}

		lidLoadedPos3.setIcon(new ImageIcon("res\\Bottle_100.png"));
		lidLoadedPos3.setBounds(308, 118, 97, 94);
		frmAbs.getContentPane().add(lidLoadedPos3);

		//filledBotPos2
		JLabel filledBotPos2 = new JLabel("");
		if(!States.FILLED_BOT_POS_2) {
			filledBotPos2.setVisible(false);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;
		}
		else {
			filledBotPos2.setVisible(true);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}
		filledBotPos2.setIcon(new ImageIcon("res\\Filled_100.png"));
		filledBotPos2.setBounds(217, 211, 147, 97);
		frmAbs.getContentPane().add(filledBotPos2);

		//doneBotPos6
		JLabel doneBotPos6 = new JLabel("");
		if(!States.DONE_BOT_POS_6) {
			doneBotPos6.setVisible(false);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}
		else {
			doneBotPos6.setVisible(true);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}
		doneBotPos6.setIcon(new ImageIcon("res\\Bottle_100.png"));
		doneBotPos6.setBounds(517, 337, 82, 84);
		frmAbs.getContentPane().add(doneBotPos6);

		//doneBotPos5
		JLabel doneBotPos5 = new JLabel("");
		if(!States.DONE_BOT_POS_5) {
			doneBotPos5.setVisible(false);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}
		else {
			doneBotPos5.setVisible(true);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}

		doneBotPos5.setIcon(new ImageIcon("res\\Bottle_100.png"));
		doneBotPos5.setBounds(361, 319, 82, 84);
		frmAbs.getContentPane().add(doneBotPos5);

		//emptyBotPos0
		JLabel emptyBotPos0 = new JLabel("");
		emptyBotPos0.setIcon(new ImageIcon("res\\Empty_100.png"));
		emptyBotPos0.setBounds(69, 339, 102, 77);
		frmAbs.getContentPane().add(emptyBotPos0);
		if(!States.EMPTY_BOT_POS_0) {
			//System.out.println("swag");
			emptyBotPos0.setVisible(false);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}
		else {
			//System.out.println("ligma");
			emptyBotPos0.setVisible(true);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}
		

		
		
		//emptyBotPos1
		JLabel emptyBotPos1 = new JLabel("");
		
		emptyBotPos1.setIcon(new ImageIcon("res\\Empty_100.png"));
		emptyBotPos1.setBounds(249, 319, 102, 77);
		frmAbs.getContentPane().add(emptyBotPos1);
		
		if(!States.EMPTY_BOT_POS_1) {
			//System.out.println("money");
			emptyBotPos1.setVisible(false);
			System.out.println(States.EMPTY_BOT_POS_1);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;

		}
		else {
			emptyBotPos1.setVisible(true);
			System.out.println(States.EMPTY_BOT_POS_1);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;


		}

		//emptyBotPos2
		JLabel emptyBotPos2 = new JLabel("");
		
		emptyBotPos2.setIcon(new ImageIcon("res\\Empty_100.png"));
		emptyBotPos2.setBounds(217, 223, 102, 77);
		frmAbs.getContentPane().add(emptyBotPos2);
		
		if(!States.EMPTY_BOT_POS_2) {
		//	System.out.println("sbitch");
			emptyBotPos2.setVisible(false);
		//	System.out.println(States.EMPTY_BOT_POS_1);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;


		}
		else {
			emptyBotPos2.setVisible(true);
			//System.out.println(States.EMPTY_BOT_POS_1);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;


		}

		//filledBotPos3
		JLabel filledBotPos3 = new JLabel("");
		if(!States.FILLED_BOT_POS_3) {
		//	System.out.println("3");
			filledBotPos3.setVisible(false);
			System.out.println(States.EMPTY_BOT_POS_1);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;


		}
		else {
			//System.out.println("3_5");
			filledBotPos3.setVisible(true);
			System.out.println(States.EMPTY_BOT_POS_1);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;


		}
		filledBotPos3.setIcon(new ImageIcon("res\\Filled_100.png"));
		filledBotPos3.setBounds(308, 118, 147, 97);
		frmAbs.getContentPane().add(filledBotPos3);

		//capScrewedPos4
		JLabel capScrewedPos4 = new JLabel("");
		if(!States.CAP_SCREWED_POS_4) {
			//System.out.println("4");
			capScrewedPos4.setVisible(false);
			System.out.println(States.EMPTY_BOT_POS_1);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;


		}
		else {
			//System.out.println("4_5");
			capScrewedPos4.setVisible(true);
			System.out.println(States.EMPTY_BOT_POS_1);
			frmAbs.getContentPane().revalidate();
			frmAbs.getContentPane().repaint();;


		}
		
		
		//System.out.println("Whopps");
		capScrewedPos4.setIcon(new ImageIcon("res\\Bottle_100.png"));
		capScrewedPos4.setBounds(398, 216, 82, 84);
		frmAbs.getContentPane().add(capScrewedPos4);

		JLabel rotaryTable = new JLabel("");
		rotaryTable.setIcon(new ImageIcon("res\\300pxRotTable.png"));
		rotaryTable.setBounds(207, 115, 300, 306);
		frmAbs.getContentPane().add(rotaryTable);

		JButton btnNewButton = new JButton("Rotate");
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.addActionListener(new SignalClient(Ports.PORT_LOADER_PLANT, Ports.ROTATE_SIGNAL));
		btnNewButton.setBounds(296, 486, 122, 32);
		frmAbs.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(e -> {
			
			if(!States.EMPTY_BOT_POS_0) {
				System.out.println("a");
				emptyBotPos0.setVisible(false);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;

			}
			else {
				System.out.println("1");
				emptyBotPos0.setVisible(true);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;

			}
			
			
			if(!States.FILLED_BOT_POS_2) {
				System.out.println("b");
				filledBotPos2.setVisible(false);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;
			}
			else {
				System.out.println("2");
				filledBotPos2.setVisible(true);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;
			}
			
			if(!States.LID_LOADED_POS_3) {
				lidLoadedPos3.setVisible(false);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;

			}
			else {
				lidLoadedPos3.setVisible(true);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;

			}
			
			
			if(!States.CAP_SCREWED_POS_4) {
				System.out.println("d");
				capScrewedPos4.setVisible(false);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;


			}
			else {
				System.out.println("4");
				capScrewedPos4.setVisible(true);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;
			}
			if(!States.DONE_BOT_POS_6) {
				System.out.println("e");
				doneBotPos6.setVisible(false);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;

			}
			else {
				System.out.println("5");
				doneBotPos6.setVisible(true);
				frmAbs.getContentPane().revalidate();
				frmAbs.getContentPane().repaint();;

			}
			

			
	    });
		


		JLabel lblNewLabel_2 = new JLabel("Rotary");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(308, 444, 98, 14);
		frmAbs.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("res\\resizedConBeltLeft.png"));
		lblNewLabel_3.setBounds(-19, 331, 352, 92);
		frmAbs.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("res\\conBeltRightSide.png"));
		lblNewLabel_4.setBounds(430, 331, 368, 92);
		frmAbs.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setBounds(207, 216, 102, 77);
		frmAbs.getContentPane().add(lblNewLabel_9_1);

		JButton btnNewButton_1 = new JButton("Lid Loader");
		btnNewButton_1.setBounds(466, 11, 122, 23);
		frmAbs.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Liquid Filler");
		btnNewButton_2.setBounds(11, 167, 122, 23);
		frmAbs.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Conveyor - Bottle In");
		btnNewButton_3.setBounds(11, 440, 160, 23);
		frmAbs.getContentPane().add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Conveyor - Bottle Out");
		btnNewButton_4.setBounds(512, 440, 162, 23);
		frmAbs.getContentPane().add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("Cap Screwer");
		btnNewButton_5.setBounds(552, 167, 122, 23);
		frmAbs.getContentPane().add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("Cap Pos 1");
		btnNewButton_6.setBounds(11, 139, 122, 23);
		frmAbs.getContentPane().add(btnNewButton_6);

	}
}
