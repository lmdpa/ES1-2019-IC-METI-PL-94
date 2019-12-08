 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.UIManager;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.awt.TextArea;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 593, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton show_excel = new JButton("Show Excel");
		show_excel.setBounds(222, 13, 101, 26);
		show_excel.setMaximumSize(new Dimension(40, 25));
		show_excel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		show_excel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File excel = new File("Long-Method.xlsx");
				try {
					Desktop.getDesktop().open(excel);
					LerExcel le = new LerExcel();
					le.main(null);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(show_excel);
		
		
		JComboBox cbox1 = new JComboBox();
		cbox1.setToolTipText("Metricas");
		cbox1.setBounds(12, 102, 127, 22);
		cbox1.setEditable(true);
		cbox1.addItem("LOC");
		cbox1.addItem("CYCLO");
		cbox1.addItem("ATFD");
		cbox1.addItem("LAA");
		cbox1.setSelectedItem(null);
		frame.getContentPane().add(cbox1);
		
		
		
		JComboBox cbox2 = new JComboBox();
		cbox2.setBounds(206, 102, 127, 22);
		cbox2.setBorder(UIManager.getBorder("ComboBox.border"));
		cbox2.setEditable(true);
		cbox2.addItem("<");
		cbox2.addItem(">");
		cbox2.setSelectedItem(null);
		frame.getContentPane().add(cbox2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("is_feature_envy");
		rdbtnNewRadioButton.setBounds(44, 41, 127, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnLong = new JRadioButton("is_long_method");
		rdbtnLong.setBounds(369, 50, 127, 25);
		frame.getContentPane().add(rdbtnLong);
		
		JComboBox cbox3 = new JComboBox();
		cbox3.setToolTipText("");
		cbox3.setBounds(12, 260, 127, 22);
		cbox3.setEditable(true);
		cbox3.addItem("LOC");
		cbox3.addItem("CYCLO");
		cbox3.addItem("ATFD");
		cbox3.addItem("LAA");
		cbox3.setSelectedItem(null);
		frame.getContentPane().add(cbox3);
		
		
		JComboBox cbox4 = new JComboBox();
		cbox4.setToolTipText("");
		cbox4.setBounds(206, 260, 127, 22);
		cbox4.setEditable(true);
		cbox4.addItem("<");
		cbox4.addItem(">");
		cbox4.setSelectedItem(null);
		frame.getContentPane().add(cbox4);
		
		JComboBox cbox5 = new JComboBox();
		cbox5.setToolTipText("");
		cbox5.setBounds(253, 184, 46, 22);
		cbox5.setEditable(true);
		cbox5.addItem("OR");
		cbox5.addItem("AND");
		cbox5.setSelectedItem(null);
		frame.getContentPane().add(cbox5);
		
		JTextArea valor1 = new JTextArea();
		valor1.setBounds(413, 260, 83, 22);
		String value1 = valor1.getName();
		frame.getContentPane().add(valor1);
		
		JTextArea valor2 = new JTextArea();
		valor2.setBounds(413, 102, 101, 25);
		String value2 = valor2.getName();
		frame.getContentPane().add(valor2);
		
		
		
		JButton detectar_defeitos = new JButton("detectar defeitos");
		detectar_defeitos.setBounds(219, 371, 144, 25);
		detectar_defeitos.setBorder(UIManager.getBorder("Button.border"));
		detectar_defeitos.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		detectar_defeitos.setPreferredSize(new Dimension(40, 25));
		detectar_defeitos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		detectar_defeitos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LerExcel le = new LerExcel();	
				//le.is_long_(10,Integer.parseInt(value1));
					
			}
		});
		frame.getContentPane().add(detectar_defeitos);
		
		
		
		
		
	}
}
