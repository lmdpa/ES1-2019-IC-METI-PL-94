import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * GUI onde o utilizador seleciona a ferramenta ou regra sobre a qual pretende analisar a qualidade
 * @author carlo
 *
 */

public class Qualidade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Qualidade frame = new Qualidade();
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
	public Qualidade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{417, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblSelecione = new JLabel("Selecione uma Ferramenta ou Regra");
		lblSelecione.setFont(new Font("Tahoma", Font.BOLD, 21));
		GridBagConstraints gbc_lblSelecione = new GridBagConstraints();
		gbc_lblSelecione.insets = new Insets(0, 0, 5, 0);
		gbc_lblSelecione.gridx = 0;
		gbc_lblSelecione.gridy = 0;
		contentPane.add(lblSelecione, gbc_lblSelecione);
		
		JButton btnNewButton = new JButton("PMD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("iPlasma");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 2;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		/**
		 * Deveria ter sido criada uma lista do tipo Regra que contém todas as regras criadas pelo utilizador, mas só conseguimos gerar a GUI sem as funcionalidades implementadas
		 */
		
		JButton btnRegra = new JButton("Regra 1");
		GridBagConstraints gbc_btnRegra = new GridBagConstraints();
		gbc_btnRegra.insets = new Insets(0, 0, 5, 0);
		gbc_btnRegra.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRegra.gridx = 0;
		gbc_btnRegra.gridy = 3;
		contentPane.add(btnRegra, gbc_btnRegra);
		
		JButton btnRegra_1 = new JButton("Regra 2");
		GridBagConstraints gbc_btnRegra_1 = new GridBagConstraints();
		gbc_btnRegra_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnRegra_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRegra_1.gridx = 0;
		gbc_btnRegra_1.gridy = 4;
		contentPane.add(btnRegra_1, gbc_btnRegra_1);
		
		/**
		 * Rodapé
		 */
		
		JLabel lblEngenhariaDeSoftware = new JLabel("Engenharia de Software 2019/2020");
		lblEngenhariaDeSoftware.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEngenhariaDeSoftware = new GridBagConstraints();
		gbc_lblEngenhariaDeSoftware.gridx = 0;
		gbc_lblEngenhariaDeSoftware.gridy = 5;
		contentPane.add(lblEngenhariaDeSoftware, gbc_lblEngenhariaDeSoftware);
		
		
	}

}