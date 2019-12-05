 import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Show Excel");
		btnNewButton.setFont(new Font("Krungthep", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File excel = new File("Long-Method.xlsx");
				try {
					Desktop.getDesktop().open(excel);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnMakeComparison = new JButton("Make Comparison");
		frame.getContentPane().add(btnMakeComparison, BorderLayout.SOUTH);
		
		String[] metrics = {"Choose metric","LOC", "CYCLO", "ATFD", "LAA"};
		JComboBox mlist = new JComboBox(metrics);
		frame.getContentPane().add(mlist, BorderLayout.WEST);
		
	}

}
