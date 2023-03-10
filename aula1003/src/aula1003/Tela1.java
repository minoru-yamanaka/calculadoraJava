package aula1003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor1;
	private JTextField txtValor2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(163, 11, 139, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira o valor 1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 41, 154, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Insira o valor 2:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 73, 154, 21);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("RESULTADO:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(10, 105, 154, 21);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtValor1 = new JTextField();
		txtValor1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtValor1.setBounds(163, 43, 383, 20);
		contentPane.add(txtValor1);
		txtValor1.setColumns(10);
		
		txtValor2 = new JTextField();
		txtValor2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtValor2.setColumns(10);
		txtValor2.setBounds(163, 73, 383, 20);
		contentPane.add(txtValor2);
		
		txtResultado = new JTextField();
		txtResultado.setBackground(Color.LIGHT_GRAY);
		txtResultado.setEnabled(false);
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtResultado.setColumns(10);
		txtResultado.setBounds(163, 105, 383, 20);
		contentPane.add(txtResultado);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//recebo os valores 
				int v1 = Integer.parseInt(txtValor1.getText ());
				int v2 = Integer.parseInt(txtValor2.getText ());
				//soma
				int soma = (v1 + v2);
				//resultado 
				txtResultado.setText(String.valueOf(soma));
				
			
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCalcular.setBounds(163, 133, 154, 23);
		contentPane.add(btnCalcular);
	}
}
