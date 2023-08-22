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


import javax.swing.ImageIcon;
import javax.swing.UIManager; 

public class Canvas {


	private JFrame frmAbs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		initialize();
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
		}
		else {
			lidLoadedPos3.setVisible(true);
		}

		lidLoadedPos3.setIcon(new ImageIcon("res\\Bottle_100.png"));
		lidLoadedPos3.setBounds(308, 118, 97, 94);
		frmAbs.getContentPane().add(lidLoadedPos3);
		
		//filledBotPos2
		JLabel filledBotPos2 = new JLabel("");
		if(!States.FILLED_BOT_POS_2) {
			filledBotPos2.setVisible(false);
		}
		else {
			filledBotPos2.setVisible(true);
		}
		filledBotPos2.setIcon(new ImageIcon("res\\Filled_100.png"));
		filledBotPos2.setBounds(217, 211, 147, 97);
		frmAbs.getContentPane().add(filledBotPos2);
		
		//doneBotPos6
		JLabel doneBotPos6 = new JLabel("");
		if(!States.DONE_BOT_POS_6) {
			doneBotPos6.setVisible(false);
		}
		else {
			doneBotPos6.setVisible(true);
		}
		doneBotPos6.setIcon(new ImageIcon("res\\Bottle_100.png"));
		doneBotPos6.setBounds(517, 337, 82, 84);
		frmAbs.getContentPane().add(doneBotPos6);
		
		//doneBotPos5
		JLabel doneBotPos5 = new JLabel("");
		if(!States.DONE_BOT_POS_5) {
			doneBotPos5.setVisible(false);
		}
		else {
			doneBotPos5.setVisible(true);
		}

		doneBotPos5.setIcon(new ImageIcon("res\\Bottle_100.png"));
		doneBotPos5.setBounds(361, 319, 82, 84);
		frmAbs.getContentPane().add(doneBotPos5);
		
		//emptyBotPos0
		JLabel emptyBotPos0 = new JLabel("");
		if(!States.EMPTY_BOT_POS_0) {
			emptyBotPos0.setVisible(false);
		}
		else {
			emptyBotPos0.setVisible(true);
		}
		emptyBotPos0.setIcon(new ImageIcon("res\\Empty_100.png"));
		emptyBotPos0.setBounds(69, 339, 102, 77);
		frmAbs.getContentPane().add(emptyBotPos0);
		
		//emptyBotPos1
		JLabel emptyBotPos1 = new JLabel("");
		if(!States.EMPTY_BOT_POS_1) {
			emptyBotPos1.setVisible(false);
		}
		else {
			emptyBotPos1.setVisible(true);
		}

		emptyBotPos1.setIcon(new ImageIcon("res\\Empty_100.png"));
		emptyBotPos1.setBounds(249, 319, 102, 77);
		frmAbs.getContentPane().add(emptyBotPos1);
		
		//emptyBotPos2
		JLabel emptyBotPos2 = new JLabel("");
		if(!States.EMPTY_BOT_POS_2) {
			emptyBotPos2.setVisible(false);
		}
		else {
			emptyBotPos2.setVisible(true);
		}

		emptyBotPos2.setIcon(new ImageIcon("res\\Empty_100.png"));
		emptyBotPos2.setBounds(217, 223, 102, 77);
		frmAbs.getContentPane().add(emptyBotPos2);
		
		//filledBotPos3
		JLabel filledBotPos3 = new JLabel("");
		if(!States.FILLED_BOT_POS_3) {
			filledBotPos3.setVisible(false);
		}
		else {
			filledBotPos3.setVisible(true);
		}
		filledBotPos3.setIcon(new ImageIcon("res\\Filled_100.png"));
		filledBotPos3.setBounds(308, 118, 147, 97);
		frmAbs.getContentPane().add(filledBotPos3);
		
		//capScrewedPos4
		JLabel capScrewedPos4 = new JLabel("");
		if(!States.CAP_SCREWED_POS_4) {
			capScrewedPos4.setVisible(false);
		}
		else {
			capScrewedPos4.setVisible(true);
		}
		capScrewedPos4.setIcon(new ImageIcon("res\\Bottle_100.png"));
		capScrewedPos4.setBounds(398, 216, 82, 84);
		frmAbs.getContentPane().add(capScrewedPos4);
		
		JLabel rotaryTable = new JLabel("");
		rotaryTable.setIcon(new ImageIcon("res\\300pxRotTable.png"));
		rotaryTable.setBounds(207, 115, 300, 306);
		frmAbs.getContentPane().add(rotaryTable);
		
		JButton btnNewButton = new JButton("Rotate");
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(296, 486, 122, 32);
		frmAbs.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Rotary");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(308, 444, 98, 14);
		frmAbs.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Liquid Filler");
		lblNewLabel_2_1.setBounds(10, 171, 99, 14);
		frmAbs.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cap Screwer");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1_1.setBounds(552, 171, 122, 14);
		frmAbs.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Lid Loader");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setBounds(430, 11, 88, 14);
		frmAbs.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("res\\resizedConBeltLeft.png"));
		lblNewLabel_3.setBounds(-19, 331, 352, 92);
		frmAbs.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("res\\conBeltRightSide.png"));
		lblNewLabel_4.setBounds(430, 331, 368, 92);
		frmAbs.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("Conveyor Belt - Bottle In");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setBounds(11, 444, 162, 14);
		frmAbs.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Conveyor Belt - Labelling");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2_1.setBounds(512, 444, 162, 14);
		frmAbs.getContentPane().add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("");
		lblNewLabel_9_1.setBounds(207, 216, 102, 77);
		frmAbs.getContentPane().add(lblNewLabel_9_1);
		
		
	}
}
