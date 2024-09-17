import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField txtCa;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String answer;
	String operation;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.setBounds(100, 100, 373, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCa = new JTextField();
		txtCa.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtCa.setText("    SCIENTIFIC  CALCULATOR");
		txtCa.setBounds(0, 0, 350, 43);
		frame.getContentPane().add(txtCa);
		txtCa.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(10, 43, 330, 66);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u221A");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(10, 136, 68, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1/x");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(10, 178, 68, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNpow = new JButton("x^y");
		btnNpow.setEnabled(false);
		btnNpow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		btnNpow.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNpow.setBounds(10, 228, 68, 43);
		frame.getContentPane().add(btnNpow);
		
		JButton btnQub = new JButton("x^3");
		btnQub.setEnabled(false);
		btnQub.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnQub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnQub.setBounds(10, 270, 68, 43);
		frame.getContentPane().add(btnQub);
		
		JButton btnSqr = new JButton("x^2");
		btnSqr.setEnabled(false);
		btnSqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSqr.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSqr.setBounds(10, 312, 68, 43);
		frame.getContentPane().add(btnSqr);
		
		JButton btnNfact = new JButton("n!");
		btnNfact.setEnabled(false);
		btnNfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
				
			}
		});
		btnNfact.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNfact.setBounds(10, 356, 68, 43);
		frame.getContentPane().add(btnNfact);
		
		JButton btnPlusMin = new JButton("+/-");
		btnPlusMin.setEnabled(false);
		btnPlusMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPlusMin.setBounds(10, 399, 68, 51);
		frame.getContentPane().add(btnPlusMin);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(106, 53, 51, 51);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Log");
		btnNewButton_1_2.setEnabled(false);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_1_2.setBounds(77, 178, 68, 51);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_7 = new JButton("e^x");
		btnNewButton_7.setEnabled(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_7.setBounds(77, 136, 68, 43);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnMod = new JButton("%");
		btnMod.setEnabled(false);
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnMod.setFont(new Font("Dialog", Font.BOLD, 17));
		btnMod.setBounds(77, 228, 68, 43);
		frame.getContentPane().add(btnMod);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 24));
		btn7.setBounds(77, 270, 68, 43);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 24));
		btn4.setBounds(77, 312, 68, 43);
		frame.getContentPane().add(btn4);
		
		JButton btnNewButton_6_1 = new JButton("0");
		btnNewButton_6_1.setEnabled(false);
		btnNewButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btnNewButton_6_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6_1.setFont(new Font("Dialog", Font.BOLD, 24));
		btnNewButton_6_1.setBounds(77, 399, 130, 51);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 24));
		btn1.setBounds(77, 351, 68, 48);
		frame.getContentPane().add(btn1);
		
		JButton btnNewButton_11_1 = new JButton("Tan");
		btnNewButton_11_1.setEnabled(false);
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btnNewButton_11_1.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_11_1.setBounds(277, 136, 68, 43);
		frame.getContentPane().add(btnNewButton_11_1);
		
		JButton btnNewButton_1_5_1 = new JButton("Tanh");
		btnNewButton_1_5_1.setEnabled(false);
		btnNewButton_1_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1_5_1.setBounds(277, 179, 68, 51);
		frame.getContentPane().add(btnNewButton_1_5_1);
		
		JButton btnAdd_1 = new JButton("+");
		btnAdd_1.setEnabled(false);
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		btnAdd_1.setBounds(277, 228, 68, 43);
		frame.getContentPane().add(btnAdd_1);
		
		JButton btnMin_1 = new JButton("-");
		btnMin_1.setEnabled(false);
		btnMin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnMin_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		btnMin_1.setBounds(277, 270, 68, 43);
		frame.getContentPane().add(btnMin_1);
		
		JButton btnmul_1 = new JButton("*");
		btnmul_1.setEnabled(false);
		btnmul_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		btnmul_1.setBounds(277, 312, 68, 43);
		frame.getContentPane().add(btnmul_1);
		
		JButton btndiv_1 = new JButton("/");
		btndiv_1.setEnabled(false);
		btndiv_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndiv_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		btndiv_1.setBounds(277, 356, 68, 43);
		frame.getContentPane().add(btndiv_1);
		
		JButton btnEql_1 = new JButton("=");
		btnEql_1.setEnabled(false);
		btnEql_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					
					textField.setText(answer);
				}
				else if(operation=="x^y") {
					
					
					double resultt=1;
					for(int i=0;i<second;i++) {
						resultt=first*resultt;
					}
					answer=String.format("%.2f", resultt);
					
					textField.setText(answer);
					
				}
			}
		});
		btnEql_1.setFont(new Font("Dialog", Font.PLAIN, 24));
		btnEql_1.setBounds(277, 399, 68, 51);
		frame.getContentPane().add(btnEql_1);
		
		JButton btnNewButton_10 = new JButton("Cos");
		btnNewButton_10.setEnabled(false);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_10.setBounds(210, 136, 68, 43);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_1_4 = new JButton("Cosh");
		btnNewButton_1_4.setEnabled(false);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1_4.setBounds(210, 179, 68, 51);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.setEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 24));
		btnBack.setBounds(210, 228, 68, 43);
		frame.getContentPane().add(btnBack);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 24));
		btn9.setBounds(210, 270, 68, 43);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 24));
		btn6.setBounds(210, 312, 68, 43);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 24));
		btn3.setBounds(210, 356, 68, 43);
		frame.getContentPane().add(btn3);
		
		JButton btndot = new JButton(".");
		btndot.setEnabled(false);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Dialog", Font.BOLD, 24));
		btndot.setBounds(210, 399, 68, 51);
		frame.getContentPane().add(btndot);
		
		JButton btnNewButton_8 = new JButton("Sin");
		btnNewButton_8.setEnabled(false);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton_8.setBounds(146, 136, 64, 43);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_1_3 = new JButton("Sinh");
		btnNewButton_1_3.setEnabled(false);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1_3.setBounds(146, 179, 64, 51);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnCancle = new JButton("C");
		btnCancle.setEnabled(false);
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCancle.setFont(new Font("Dialog", Font.BOLD, 24));
		btnCancle.setBounds(146, 228, 64, 43);
		frame.getContentPane().add(btnCancle);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 24));
		btn8.setBounds(146, 270, 64, 43);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 24));
		btn5.setBounds(146, 312, 64, 43);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 24));
		btn2.setBounds(146, 356, 64, 43);
		frame.getContentPane().add(btn2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("on");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btnNewButton_6_1.setEnabled(true);
				btndot.setEnabled(true);
				 btnEql_1.setEnabled(true);
				 btndiv_1.setEnabled(true);
				btnAdd_1.setEnabled(true);
				btnMin_1.setEnabled(true);
				btnmul_1.setEnabled(true);
				btnBack.setEnabled(true);
				btnCancle.setEnabled(true);
				btnMod.setEnabled(true);
				btnNewButton_1_5_1.setEnabled(true);
				 btnNewButton_1_4.setEnabled(true);
				 btnNewButton_1_3.setEnabled(true);
				 btnNewButton_1_2.setEnabled(true);
				 btnNewButton_1.setEnabled(true);
				 btnNewButton.setEnabled(true);
				 btnNewButton_7.setEnabled(true);
				 btnNewButton_8.setEnabled(true);
				 btnNewButton_10.setEnabled(true);
				 btnNewButton_11_1.setEnabled(true);
				 btnNpow.setEnabled(true);
				 btnQub.setEnabled(true);
				 btnSqr.setEnabled(true);
				 btnNfact.setEnabled(true);
				 btnPlusMin.setEnabled(true);
				 textField.setEnabled(true);
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(20, 110, 43, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("off");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btnNewButton_6_1.setEnabled(false);
				btndot.setEnabled(false);
				 btnEql_1.setEnabled(false);
				 btndiv_1.setEnabled(false);
				btnAdd_1.setEnabled(false);
				btnMin_1.setEnabled(false);
				btnmul_1.setEnabled(false);
				btnBack.setEnabled(false);
				btnCancle.setEnabled(false);
				btnMod.setEnabled(false);
				btnNewButton_1_5_1.setEnabled(false);
				 btnNewButton_1_4.setEnabled(false);
				 btnNewButton_1_3.setEnabled(false);
				 btnNewButton_1_2.setEnabled(false);
				 btnNewButton_1.setEnabled(false);
				 btnNewButton.setEnabled(false);
				 btnNewButton_7.setEnabled(false);
				 btnNewButton_8.setEnabled(false);
				 btnNewButton_10.setEnabled(false);
				 btnNewButton_11_1.setEnabled(false);
				 btnNpow.setEnabled(false);
				 btnQub.setEnabled(false);
				 btnSqr.setEnabled(false);
				 btnNfact.setEnabled(false);
				 btnPlusMin.setEnabled(false);
				 textField.setEnabled(false);
				 
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(62, 110, 43, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
