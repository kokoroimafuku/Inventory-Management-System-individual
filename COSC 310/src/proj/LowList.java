package proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.awt.event.ActionEvent;


public class LowList extends JFrame {
	private JTable table;
	public String all;
	String[] fields = {"Product Name","Expiry Date","Quantity","Value"};
	String to = "";

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
		
		db app = new db();
		app.connect();
		this.setSize(720,400);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 41, 708, 292);
		getContentPane().add(scrollPane);
		
		table = new JTable(app.listLowInventryProducts(),fields);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Options.main(null);
			}
		});
		btnNewButton.setBounds(200, 337, 117, 29);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("List of Low Quantity products");
		lblNewLabel.setBounds(302, 6, 192, 23);
		getContentPane().add(lblNewLabel);
		this.setVisible(true);

		JButton btnNewButton2 = new JButton("Translate");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trans();
			}
		});
		btnNewButton2.setBounds(400, 337, 117, 29);
		getContentPane().add(btnNewButton2);
		
	}

	public void trans(){
		JPanel contentPane1;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane1 = new JPanel();
		contentPane1.setBackground(UIManager.getColor("Button.darkShadow"));
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane1);
		contentPane1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Select Language");
		lblNewLabel.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel.setBounds(175, 40, 200, 70);
		contentPane1.add(lblNewLabel);

		JLabel lblNewLabel2 = new JLabel("(please enter in google translate language code)");
		lblNewLabel2.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel2.setBounds(85, 89, 350, 20);
		contentPane1.add(lblNewLabel2);

		

		JTextField textField;
		textField = new JTextField(15);
		textField.setBounds(150, 120, 155, 26);
		contentPane1.add(textField);
		textField.setColumns(10);

		textField.getDocument().addDocumentListener(new DocumentListener(){
			@Override
			public void insertUpdate(DocumentEvent e) { printText(); }
			@Override
			public void removeUpdate(DocumentEvent e) { printText(); }
			@Override
			public void changedUpdate(DocumentEvent e) { printText(); }
		
			private void printText() {
				System.out.println(textField.getText());
				to = textField.getText();
			}
		});

		JButton btnNewButton3 = new JButton("Return");
		btnNewButton3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				try {
					set();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}		
		});
		btnNewButton3.setBounds(170, 180, 117, 29);
		getContentPane().add(btnNewButton3);

	}

	public void set() throws SQLException {
		String a = "";
		String b = "";
		String c = "";
		String d = "";
		String e = "";
		String f = "";
		String g = "";
		
		try {
			a = translate( "en", to, "LOW ON INVENTORY");
			b = translate( "en", to, "List of Low Quantity products");
			c = translate( "en", to, "Product Name");
			d = translate( "en", to, "Expiry Date");
			e = translate( "en", to, "Quantity");
			f = translate( "en", to, "Value");
			g = translate( "en", to, "Home");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String[] fields2 = {c,d,e,f};

		JPanel contentPane2 = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(a);

		db app1 = new db();
		app1.connect();
		this.setSize(720,400);
		getContentPane().setLayout(null);

		setContentPane(contentPane2);
		contentPane2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 41, 708, 292);
		getContentPane().add(scrollPane);
		
		table = new JTable(app1.listLowInventryProducts(),fields2);
		scrollPane.setViewportView(table);

		JButton btnNewButton3 = new JButton(g);
		btnNewButton3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				Options.main(null);
			}		
		});
		btnNewButton3.setBounds(300, 337, 117, 29);
		getContentPane().add(btnNewButton3);

		JLabel lblNewLabel = new JLabel(b);
		lblNewLabel.setBounds(220, 6, 350, 23);
		getContentPane().add(lblNewLabel);
		this.setVisible(true);
	}


	private static String translate(String langFrom, String langTo, String text) throws IOException {
        String urlStr = "https://script.google.com/macros/s/AKfycbxCyGdcqNuYaBAiJGZtTS0yg2HMzLpWCzukxKwHKZh4k4RBy3QJz8xBv4EZInXB_wDo0g/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }

}
