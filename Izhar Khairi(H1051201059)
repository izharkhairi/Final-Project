import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollBar;
import javax.swing.JToggleButton;

public class TestTiket {
	
	private int harga;

	private JFrame frame;
	private JTextField txtHarga;
	private JTable table;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestTiket window = new TestTiket();
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
	public TestTiket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 782, 711);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 25, 748, 75);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tiket Kereta Api");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(234, 11, 367, 53);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 168, 153, 29);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tipe Tiket");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_1);
		
		JRadioButton Economy = new JRadioButton("Economy");
		buttonGroup.add(Economy);
		Economy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if(Economy.isSelected()) {
//
//				}
			}
		});
		Economy.setFont(new Font("Tahoma", Font.BOLD, 13));
		Economy.setBounds(30, 204, 111, 23);
		frame.getContentPane().add(Economy);
		
		JRadioButton Bussines = new JRadioButton("Bussines");
		buttonGroup.add(Bussines);
		Bussines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Bussines.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bussines.setBounds(30, 230, 111, 23);
		frame.getContentPane().add(Bussines);
		
		JRadioButton Ekslusif = new JRadioButton("Ekslusif");
		buttonGroup.add(Ekslusif);
		Ekslusif.setFont(new Font("Tahoma", Font.BOLD, 13));
		Ekslusif.setBounds(30, 257, 111, 23);
		frame.getContentPane().add(Ekslusif);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1.setBounds(217, 168, 153, 29);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Jadwal");
		panel_1_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JRadioButton Pagi = new JRadioButton("Pagi");
		buttonGroup_1.add(Pagi);
		Pagi.setFont(new Font("Tahoma", Font.BOLD, 13));
		Pagi.setBounds(248, 204, 111, 23);
		frame.getContentPane().add(Pagi);
		
		JRadioButton Siang = new JRadioButton("Siang");
		buttonGroup_1.add(Siang);
		Siang.setFont(new Font("Tahoma", Font.BOLD, 13));
		Siang.setBounds(248, 231, 111, 23);
		frame.getContentPane().add(Siang);
		
		JRadioButton Malam = new JRadioButton("Malam");
		buttonGroup_1.add(Malam);
		Malam.setFont(new Font("Tahoma", Font.BOLD, 13));
		Malam.setBounds(248, 257, 111, 23);
		frame.getContentPane().add(Malam);
		
		JComboBox Tujuan = new JComboBox();
		Tujuan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Economy.isSelected()) {
					if(Pagi.isSelected()){
						if(Tujuan.getSelectedItem() ==  "Jakarta") {
							harga = 90000;
						}
						
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Economy.isSelected()) {
					if(Siang.isSelected()) {
						if(Tujuan.getSelectedItem() == "Jakarta") {
							harga = 90000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Economy.isSelected()) {
					if(Malam.isSelected()) {
						if(Tujuan.getSelectedItem() == "Jakarta") {
							harga = 90000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Economy.isSelected()) {
					if(Pagi.isSelected()) {
						if(Tujuan.getSelectedItem() =="Bandung") {
							harga = 95000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Economy.isSelected()) {
					if(Siang.isSelected()) {
						if(Tujuan.getSelectedItem() =="Bandung") {
							harga = 95000;
						}
					}
				}
				
				if(Economy.isSelected()) {
					if(Malam.isSelected()) {
						if(Tujuan.getSelectedItem() =="Bandung") {
							harga = 95000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Bussines.isSelected()) {
					  if(Pagi.isSelected()) {
						  if(Tujuan.getSelectedItem() =="Jakarta") {
							  harga = 120000;
						  }
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Bussines.isSelected()) {
					if(Siang.isSelected()) {
						if(Tujuan.getSelectedItem() =="Jakarta") {
							harga = 120000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Bussines.isSelected()) {
					if(Malam.isSelected()) {
						if(Tujuan.getSelectedItem() =="Jakarta") {
							harga = 120000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Bussines.isSelected()) {
					if(Pagi.isSelected()) {
						if(Tujuan.getSelectedItem() =="Bandung") {
							harga = 125000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Bussines.isSelected()) {
					if(Siang.isSelected()) {
						if(Tujuan.getSelectedItem() =="Bandung") {
							harga = 125000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Bussines.isSelected()) {
					if(Malam.isSelected()) {
						if(Tujuan.getSelectedItem() =="Bandung") {
							harga = 125000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Ekslusif.isSelected()) {
					if(Pagi.isSelected()) {
						if(Tujuan.getSelectedItem() =="Jakarta") {
							harga = 250000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Ekslusif.isSelected()) {
					if(Siang.isSelected()) {
						if(Tujuan.getSelectedItem() =="Jakarta") {
							harga = 250000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Ekslusif.isSelected()) {
					if(Malam.isSelected()) {
						if(Tujuan.getSelectedItem() =="Jakarta") {
							harga = 250000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Ekslusif.isSelected()) {
					if(Pagi.isSelected()) {
						if(Tujuan.getSelectedItem() =="Bandung") {
							harga = 270000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Ekslusif.isSelected()) {
					if(Siang.isSelected()) {
						if(Tujuan.getSelectedItem() =="Bandung") {
							harga = 270000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
				if(Ekslusif.isSelected()) {
					if(Malam.isSelected()) {
						if(Tujuan.getSelectedItem() =="Bandung") {
							harga = 270000;
						}
					}
				}
				txtHarga.setText(String.valueOf(harga));
			}
		});
		Tujuan.setModel(new DefaultComboBoxModel(new String[] {"Tujuan", "Jakarta", "Bandung"}));
		Tujuan.setFont(new Font("Tahoma", Font.BOLD, 15));
		Tujuan.setBounds(468, 200, 209, 29);
		frame.getContentPane().add(Tujuan);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1_1.setBounds(493, 160, 153, 29);
		frame.getContentPane().add(panel_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Keberangkatan");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1_1_1.add(lblNewLabel_1_1_1);
		
		JLabel Harga = new JLabel("Harga");
		Harga.setFont(new Font("Tahoma", Font.BOLD, 13));
		Harga.setBounds(51, 321, 74, 29);
		frame.getContentPane().add(Harga);
		
		txtHarga = new JTextField();
		txtHarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtHarga.setEditable(false);
		txtHarga.setBounds(104, 326, 154, 20);
		frame.getContentPane().add(txtHarga);
		txtHarga.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 386, 663, 2);
		frame.getContentPane().add(separator);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				String cl = "";
				if(Economy.isSelected()) {
					cl = Economy.getText();
				}
				if(Bussines.isSelected()) {
					cl = Bussines.getText();
				}
				if(Ekslusif.isSelected()) {
					cl = Ekslusif.getText();
				}
				String wt = "";
				if(Pagi.isSelected()) {
					wt = Pagi.getText();
				}
				if(Siang.isSelected()) {
					wt = Siang.getText();
				}
				if(Malam.isSelected()) {
					wt = Malam.getText();
				}
				model.addRow(new Object[] {cl,wt,Tujuan.getSelectedItem(),txtHarga.getText()});
				if(table.getSelectedRow() == +1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Tiket sudah dipesan");
				
					}
				}

			}
		});
		Submit.setFont(new Font("Tahoma", Font.BOLD, 11));
		Submit.setBounds(217, 399, 121, 29);
		frame.getContentPane().add(Submit);
		
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Exit.setFont(new Font("Tahoma", Font.BOLD, 11));
		Exit.setBounds(391, 399, 121, 29);
		frame.getContentPane().add(Exit);
		
		JLabel lblNewLabel_3 = new JLabel("Tiket yang dipesan");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(312, 456, 187, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(81, 495, 596, 134);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Tipe Tiket", "Jadwal", "Keberangkatan", "Harga"
				
			}
		));
		scrollPane.setViewportView(table);
	}
}
