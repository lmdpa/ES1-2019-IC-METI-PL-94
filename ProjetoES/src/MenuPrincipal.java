
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * 
 * @author carlo
 * Menu principal onde o utilizador pode escolher a funcionalidade da aplicação pretendida
 */

public class MenuPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{423, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		
		
		JButton btnNewButton_2 = new JButton("Detetar Defeitos");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 21));
		GridBagConstraints gbc_lblMenu = new GridBagConstraints();
		gbc_lblMenu.insets = new Insets(0, 0, 5, 0);
		gbc_lblMenu.gridx = 0;
		gbc_lblMenu.gridy = 2;
		getContentPane().add(lblMenu, gbc_lblMenu);
		
		JButton btnVisualizarExcel = new JButton("Visualizar Excel");
		GridBagConstraints gbc_btnVisualizarExcel = new GridBagConstraints();
		gbc_btnVisualizarExcel.fill = GridBagConstraints.BOTH;
		gbc_btnVisualizarExcel.insets = new Insets(0, 0, 5, 0);
		gbc_btnVisualizarExcel.gridx = 0;
		gbc_btnVisualizarExcel.gridy = 3;
		getContentPane().add(btnVisualizarExcel, gbc_btnVisualizarExcel);
		
		JButton btnNewButton_1 = new JButton("Criar e Editar Regras");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 4;
		getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 5;
		getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);
		
		
		
		JButton btnNewButton_3 = new JButton("Analisar Qualidade");
		btnNewButton_3.setForeground(Color.BLACK);
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 6;
		getContentPane().add(btnNewButton_3, gbc_btnNewButton_3);
		
		JLabel lblEngenhariaDeSoftware = new JLabel("Engenharia de Software 2019/2020");
		lblEngenhariaDeSoftware.setFont(new Font("Tahoma", Font.PLAIN, 9));
		GridBagConstraints gbc_lblEngenhariaDeSoftware = new GridBagConstraints();
		gbc_lblEngenhariaDeSoftware.insets = new Insets(0, 0, 5, 0);
		gbc_lblEngenhariaDeSoftware.gridx = 0;
		gbc_lblEngenhariaDeSoftware.gridy = 7;
		getContentPane().add(lblEngenhariaDeSoftware, gbc_lblEngenhariaDeSoftware);
	}

}
