package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class LowList extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Options frame1= new Options();
					frame1.setVisible(true);
					LowList frame = new LowList();
					frame.setVisible(true);

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
	public LowList() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("LOW ON INVENTORY");
		String[] fields = {"Product Name","Expiry Date","Quantity","Value"};
		db app = new db();
		app.connect();
		JTable table = new JTable(app.listLowInventryProducts(),fields);
		table.setBounds(100,100,450,300);
		JScrollPane scrollpane = new JScrollPane(table);
		getContentPane().add(scrollpane);
		this.setSize(720,400);
		this.setVisible(true);
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Low Stock Level Items");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel.setBounds(72, 6, 302, 51);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Show Items");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db db = new db();
				db.listLowInventryProducts();
			}
		});
		btnNewButton.setBounds(161, 139, 117, 29);
		contentPane.add(btnNewButton);*/
	}

}
