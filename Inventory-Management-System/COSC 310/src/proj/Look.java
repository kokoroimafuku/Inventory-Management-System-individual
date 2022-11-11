package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.List;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Look extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Look();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException
	 */
	public Look() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("INVENTORY");
		String[] fields = {"Product Name","Expiry Date","Quantity","Value"};
		db app = new db();
		app.connect();
		JTable table = new JTable(app.listProducts(),fields);
		table.setBounds(100,100,450,300);
		JScrollPane scrollpane = new JScrollPane(table);
		this.add(scrollpane);
		this.setSize(300,400);
		this.setVisible(true);

		
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("Button.darkShadow"));
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inventory");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(UIManager.getColor("Button.darkShadow"));
		lblNewLabel.setBounds(145, 6, 126, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Show Inventory");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(145, 88, 140, 29);
		contentPane.add(btnNewButton);*/
		
	}
}
