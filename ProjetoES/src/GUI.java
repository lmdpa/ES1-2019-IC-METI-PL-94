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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.UIManager;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

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
	private JTextField textField;
	private JTextField textField_1;
	private ArrayList<Regra> regras = new ArrayList<Regra>();

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
		frame.setBounds(100, 100, 777, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton show_excel = new JButton("Show Excel");
		show_excel.setBounds(294, 0, 138, 47);
		show_excel.setMaximumSize(new Dimension(40, 25));
		show_excel.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
		cbox1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbox1.setToolTipText("Metricas");
		cbox1.setBounds(50, 156, 130, 39);
		cbox1.setEditable(true);
		cbox1.setSelectedItem("metrica 1");
		frame.getContentPane().add(cbox1);
		
		
		JComboBox cbox2 = new JComboBox();
		cbox2.setBounds(345, 165, 41, 22);
		cbox2.setEditable(true);
		cbox2.addItem(">");
		cbox2.addItem("<");
		cbox2.setSelectedItem(null);
		frame.getContentPane().add(cbox2);
		
		
		JComboBox cbox3 = new JComboBox();
		cbox3.setToolTipText("");
		cbox3.setBounds(316, 226, 105, 33);
		cbox3.setEditable(true);
		cbox3.addItem("OR");
		cbox3.addItem("AND");
		cbox3.setSelectedItem(null);
		frame.getContentPane().add(cbox3);
		
		JComboBox cbox4 = new JComboBox();
		cbox4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cbox4.setToolTipText("");
		cbox4.setBounds(50, 292, 130, 39);
		cbox4.setEditable(true);
		cbox4.setSelectedItem("metrica 2");
		frame.getContentPane().add(cbox4);
		
		

		
		JComboBox cbox5 = new JComboBox();
		cbox5.setBounds(345, 301, 41, 22);
		cbox5.setEditable(true);
		cbox5.addItem(">");
		cbox5.addItem("<");
		cbox5.setSelectedItem(null);
		frame.getContentPane().add(cbox5);
		
		
		textField = new JTextField();
		textField.setBounds(557, 157, 130, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(557, 293, 130, 39);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		JRadioButton ife = new JRadioButton("is_feature_envy");
		ife.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JRadioButton ilm = new JRadioButton("is_long_method");
		ilm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ilm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ilm.isSelected())
					ife.setSelected(false);
					cbox1.removeItem("ATFD");
					cbox4.removeItem("LAA");
					cbox1.addItem("LOC");
					cbox4.addItem("CYCLO");
			}
		});
		ilm.setBounds(50, 32, 168, 56);
		frame.getContentPane().add(ilm);
		
		ife.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ife.isSelected())
					ilm.setSelected(false);
					cbox1.removeItem("LOC");
					cbox4.removeItem("CYCLO");
					cbox1.addItem("ATFD");
					cbox4.addItem("LAA");
			}
		});
		ife.setBounds(50, 77, 154, 58);
		frame.getContentPane().add(ife);
		
		
		JComboBox exists = new JComboBox();
		exists.setBounds(60, 390, 105, 33);
		frame.getContentPane().add(exists);
		exists.addItem("TRUE");
		exists.addItem("FALSE");
		exists.setSelectedItem(null);
		
		
		
		JButton criar_regra = new JButton("criar regra");
		criar_regra.setBounds(294, 473, 138, 47);
		criar_regra.setBorder(UIManager.getBorder("Button.border"));
		criar_regra.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		criar_regra.setPreferredSize(new Dimension(40, 25));
		criar_regra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		criar_regra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String metrica1 = (String)cbox1.getSelectedItem();
				String comparador1 = (String)cbox2.getSelectedItem();
				String operador = (String)cbox3.getSelectedItem();
				String metrica2 = (String)cbox4.getSelectedItem();
				String comparador2 = (String)cbox5.getSelectedItem();
				int v1 = Integer.parseInt(textField.getText());	
				int v2 = Integer.parseInt(textField_1.getText());
				boolean ex;
				if(exists.getSelectedItem().equals("TRUE")) 
					ex = true;
				else ex = false;
				
				
				if(ilm.isSelected()) {
				Regra regra1 = new Regra(ilm.getName(),metrica1,metrica2,v1,v2,comparador1,comparador2,operador, ex);
				regras.add(regra1);
				System.out.println("Regra para testar is_long_method criada: " + regra1.toString());
				System.out.println( "SE ( " + metrica1 + " " + comparador1 +" " + " " + v1 + " " + operador + " " + metrica2 + " " + comparador2 + " " +  v2 + " ) Então is_long_method = " + ex);
				}		
				
				else if(ife.isSelected()) {
					//Double vd2= Double.parseDouble(textField_1.getText());
					//v2 = vd2.intValue();
					Regra regra2 = new Regra(ilm.getName(),metrica1,metrica2,v1,v2,comparador1,comparador2,operador, ex);
					regras.add(regra2);
					System.out.println("Regra para testar is_feature_envy criada: " + regra2.toString());
					System.out.println( "SE ( " + metrica1 + " " + comparador1 +" " + " " + v1 + " " + operador + " " + metrica2 + " " + comparador2 + " " +  v2 + " ) Então is_feature_envy = " + ex);

				}
				
		}
		});
		frame.getContentPane().add(criar_regra);
		
		
	}
}
