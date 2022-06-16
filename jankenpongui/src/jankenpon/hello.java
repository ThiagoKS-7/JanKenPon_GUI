package jankenpon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class hello {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hello window = new hello();
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
	public hello() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Escolha uma das opcoes:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(204, 61, 242, 58);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(445, 152, 110, 87);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\W10\\eclipse-workspace2\\jankenpongui\\src\\assets\\scisors.PNG"));
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  	byte jogadaUsuario = 1;
					Jogo j = new Jogo(jogadaUsuario);
					lblNewLabel_1.setBounds(10, 61, 596, 58);
					lblNewLabel_1.setText(String.valueOf(j) + ": " + j.verificaVencedor());
				  } 
				} );
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(268, 152, 110, 87);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\W10\\eclipse-workspace2\\jankenpongui\\src\\assets\\paper.PNG"));
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  	byte jogadaUsuario = 2;
					Jogo j = new Jogo(jogadaUsuario);
					lblNewLabel_1.setBounds(10, 61, 596, 58);
					lblNewLabel_1.setText(String.valueOf(j) + ": " + j.verificaVencedor());
				  } 
				} );
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBounds(89, 152, 110, 87);
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\W10\\eclipse-workspace2\\jankenpongui\\src\\assets\\rock.PNG"));
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("JanKenPon");
		lblNewLabel.setBounds(200, 11, 244, 39);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 27));
		btnNewButton_1_1.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  	byte jogadaUsuario = 3;
					Jogo j = new Jogo(jogadaUsuario);
					lblNewLabel_1.setBounds(10, 61, 596, 58);
					lblNewLabel_1.setText(String.valueOf(j) + ": " + j.verificaVencedor());
				  } 
				} );
	}
}
