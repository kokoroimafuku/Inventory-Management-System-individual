package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add extends JFrame {

	public static String q = null;
	public static String w = null;
	public static int r = 0;
	public static double t = 0.0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add frame = new Add();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Product p1 = new Product(q,w,r,t);
	}

	/**
	 * Create the frame.
	 */
	public Add() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel.setBounds(193, 6, 99, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_1.setBounds(6, 57, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Expiration Date");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_2.setBounds(6, 85, 108, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity");
		lblNewLabel_3.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_3.setBounds(6, 113, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Value");
		lblNewLabel_4.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_4.setBounds(6, 141, 61, 16);
		contentPane.add(lblNewLabel_4);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 q = formattedTextField.getText();
			}
		});
		formattedTextField.setBounds(126, 52, 155, 26);
		contentPane.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String w = formattedTextField_1.getText();

			}
		});
		formattedTextField_1.setBounds(126, 80, 155, 26);
		contentPane.add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String g = formattedTextField_2.getText();
				r = Integer.parseInt(g);
			}
		});
		formattedTextField_2.setBounds(129, 108, 152, 26);
		contentPane.add(formattedTextField_2);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String h = formattedTextField_3.getText();
				 t = Double.parseDouble(h);
			}
		});
		formattedTextField_3.setToolTipText("");
		formattedTextField_3.setBounds(126, 136, 155, 26);
		contentPane.add(formattedTextField_3);
		
	}
}
