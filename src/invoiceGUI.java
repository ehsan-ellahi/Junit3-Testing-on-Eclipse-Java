import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class invoiceGUI extends JFrame {

	private JPanel contentPane;
	private JTextField tf_invoice;
	private JTextField tf_due;
	private JTextField tf_cust;
	private JTextField tf_issue;
	private JTable table;
	private JButton btn_create;
	private JButton btn_read;
	private JButton btn_update;
	private JButton btn_delete;
	private JTextField tf_total;
	private JLabel lblTotal;
	private JButton btn_print;
	private JTextField tf_stock;
	private JTextField tf_price;
	private JLabel lblCustomerId_1;
	private JLabel lblCustomerId_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					invoiceGUI frame = new invoiceGUI();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);  
					frame.initial();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//=============================
	
	void initial()
	{
		
		btn_create.setText("Create");
		btn_read.setText("Read");
		
		btn_create.setEnabled(true);
		btn_read.setEnabled(true);
		
		
		btn_update.setEnabled(false);
		btn_delete.setEnabled(false);
		btn_print.setEnabled(false);
		
		tf_invoice.setEnabled(false);
		tf_cust.setEnabled(false);
		tf_due.setEnabled(false);
		tf_issue.setEnabled(false);
		tf_stock.setEnabled(false);
		tf_price.setEnabled(false);
		tf_total.setEnabled(false);
		
		tf_invoice.setText(null);
		tf_cust.setText(null);
		tf_due.setText(null);
		tf_stock.setText(null);
		tf_price.setText(null);
		tf_total.setText(null);
		tf_due.setText(null);
		
	}
	
	
	void prssedCreateButton()
	{
		
		
		if (btn_create.getText()=="Create")
		{
			btn_update.setEnabled(false);
			btn_delete.setEnabled(false);
			btn_print.setEnabled(false);
			btn_read.setEnabled(false);
			
			tf_invoice.setEnabled(true);
			tf_cust.setEnabled(true);
			tf_due.setEnabled(true);
			tf_issue.setEnabled(true);
			tf_stock.setEnabled(true);
			tf_price.setEnabled(true);
			
			btn_create.setText("Save");
			
			tf_invoice.requestFocus();
		}
		else if (btn_create.getText()=="Save")
		{
			initial();
			btn_create.setText("Create");
			btn_read.setEnabled(true);
			
			
		}
		
		
		
	}
	
	//=============================

	/**
	 * Create the frame.
	 */
	public invoiceGUI() {
		
		 JFrame ff = new  JFrame();
		setResizable(false);
		setTitle("INVOICE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf_invoice = new JTextField();
		tf_invoice.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				int a = arg0.getKeyCode();
		        if (a == 10) {                     // for enter key
		        	btn_create.setEnabled(false);
					
					btn_update.setEnabled(true);
					btn_delete.setEnabled(true);
					
					tf_invoice.setEnabled(true);
					tf_cust.setEnabled(true);
					tf_due.setEnabled(true);
					tf_issue.setEnabled(true);
					tf_stock.setEnabled(true);
					tf_price.setEnabled(true);
		        } 
				
			}
		});
		tf_invoice.setBounds(151, 71, 160, 37);
		contentPane.add(tf_invoice);
		tf_invoice.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("I N V O I C E");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
		lblNewLabel.setBounds(299, 11, 144, 49);
		contentPane.add(lblNewLabel);
		
		tf_due = new JTextField();
		tf_due.setColumns(10);
		tf_due.setBounds(556, 119, 160, 37);
		contentPane.add(tf_due);
		
		tf_cust = new JTextField();
		tf_cust.setColumns(10);
		tf_cust.setBounds(151, 119, 160, 37);
		contentPane.add(tf_cust);
		
		tf_issue = new JTextField();
		tf_issue.setColumns(10);
		tf_issue.setBounds(556, 71, 160, 37);
		contentPane.add(tf_issue);
		
		JLabel lblInvoice = new JLabel("Invoice # :");
		lblInvoice.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblInvoice.setBounds(10, 71, 110, 37);
		contentPane.add(lblInvoice);
		
		JLabel lblCustomerId = new JLabel("Customer ID :");
		lblCustomerId.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblCustomerId.setBounds(10, 119, 144, 37);
		contentPane.add(lblCustomerId);
		
		JLabel lblDateOfIssue = new JLabel("Date of Issue :");
		lblDateOfIssue.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblDateOfIssue.setBounds(402, 72, 144, 36);
		contentPane.add(lblDateOfIssue);
		
		JLabel lblCustomerId_1_1 = new JLabel("Due Date :");
		lblCustomerId_1_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblCustomerId_1_1.setBounds(402, 119, 144, 37);
		contentPane.add(lblCustomerId_1_1);
		
		table = new JTable();
		table.setBounds(10, 233, 706, 184);
		contentPane.add(table);
		
		btn_create = new JButton("Create");
		btn_create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prssedCreateButton();
				
			}
		});
		btn_create.setBounds(10, 524, 98, 36);
		contentPane.add(btn_create);
		
		btn_read = new JButton("Read");
		btn_read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (btn_read.getText()=="Read")
				{
					JOptionPane.showMessageDialog(null,"Type Invoice # and hit ENTER button."); 
					tf_invoice.requestFocus();
					tf_invoice.setEnabled(true);
					
					btn_read.setText("Back");
					
				}
				else if (btn_read.getText()=="Back")
				{
					
				
					invoiceGUI frame = new invoiceGUI();
					frame.initial();
					
					
				}
				
			}
		});
		btn_read.setBounds(135, 524, 120, 36);
		contentPane.add(btn_read);
		
		
		btn_update = new JButton("Update");
		btn_update.setBounds(286, 524, 104, 36);
		contentPane.add(btn_update);
		
		btn_delete = new JButton("Delete");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_delete.setBounds(426, 524, 133, 36);
		contentPane.add(btn_delete);
		
		tf_total = new JTextField();
		tf_total.setColumns(10);
		tf_total.setBounds(556, 428, 160, 37);
		contentPane.add(tf_total);
		
		lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
		lblTotal.setBounds(480, 428, 66, 37);
		contentPane.add(lblTotal);
		
		btn_print = new JButton("Print");
		btn_print.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn_print.setBounds(610, 520, 98, 47);
		contentPane.add(btn_print);
		
		tf_stock = new JTextField();
		tf_stock.setColumns(10);
		tf_stock.setBounds(92, 198, 86, 24);
		contentPane.add(tf_stock);
		
		tf_price = new JTextField();
		tf_price.setColumns(10);
		tf_price.setBounds(234, 198, 86, 24);
		contentPane.add(tf_price);
		
		lblCustomerId_1 = new JLabel("Stock ID :");
		lblCustomerId_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lblCustomerId_1.setBounds(10, 198, 98, 24);
		contentPane.add(lblCustomerId_1);
		
		lblCustomerId_2 = new JLabel("Price :");
		lblCustomerId_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lblCustomerId_2.setBounds(181, 198, 60, 24);
		contentPane.add(lblCustomerId_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 511, 735, 67);
		contentPane.add(panel);
		
	}
}
