package rrjava;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class calculator extends JFrame implements ActionListener, KeyListener {
	static JFrame frame;
	static String s0 = "",s1="",s2="";
	static JTextField txt;
	public void Calculator() {
		s0 = s1 = s2 = "";
	}
	private static void createUI(final JFrame frame) {
		txt = new JTextField(20);
		txt.setEditable(false);
		txt.setAlignmentX(RIGHT_ALIGNMENT);
		txt.setHorizontalAlignment(JTextField.RIGHT);
		txt.setForeground(Color.WHITE);
		txt.setBackground(Color.GRAY);
		
		Font font1 = new Font("Times New Roman", Font.BOLD,40);
		txt.setFont(font1);
		
		Font fontBtn = new Font("Arial",Font.BOLD,30);
		
		calculator c = new calculator();
		JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bSub,bDiv,bMul,bClear,bPoint,bEq;
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bAdd = new JButton("+");
		bSub = new JButton("-");
		bDiv = new JButton("/");
		bMul = new JButton("*");
		bClear = new JButton("C");
		bPoint = new JButton(".");
		bEq = new JButton("=");
		
		b0.setFont(fontBtn);
		b1.setFont(fontBtn);
		b2.setFont(fontBtn);
		b3.setFont(fontBtn);
		b4.setFont(fontBtn);
		b5.setFont(fontBtn);
		b6.setFont(fontBtn);
		b7.setFont(fontBtn);
		b8.setFont(fontBtn);
		b9.setFont(fontBtn);
		bAdd.setFont(fontBtn);
		bSub.setFont(fontBtn);
		bDiv.setFont(fontBtn);
		bMul.setFont(fontBtn);
		bClear.setFont(fontBtn);
		bPoint.setFont(fontBtn);
		bEq.setFont(fontBtn);
		
		txt.addKeyListener(c);
		
		b0.addActionListener(c);
		b1.addActionListener(c);
		b2.addActionListener(c);
		b3.addActionListener(c);
		b4.addActionListener(c);
		b5.addActionListener(c);
		b6.addActionListener(c);
		b7.addActionListener(c);
		b8.addActionListener(c);
		b9.addActionListener(c);
		bAdd.addActionListener(c);
		bSub.addActionListener(c);
		bDiv.addActionListener(c);
		bMul.addActionListener(c);
		bPoint.addActionListener(c);
		bClear.addActionListener(c);
		bEq.addActionListener(c);
		
		b0.setFocusable(false);
		b1.setFocusable(false);
		b2.setFocusable(false);
		b3.setFocusable(false);
		b4.setFocusable(false);
		b5.setFocusable(false);
		b6.setFocusable(false);
		b7.setFocusable(false);
		b8.setFocusable(false);
		b9.setFocusable(false);
		bAdd.setFocusable(false);
		bSub.setFocusable(false);
		bDiv.setFocusable(false);
		bMul.setFocusable(false);
		bPoint.setFocusable(false);
		bClear.setFocusable(false);
		bEq.setFocusable(false);
		
		
		JPanel textPanel = new JPanel();
		textPanel.setLayout(new GridLayout(1,1));
		textPanel.add(txt);
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5,4));
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		buttonPanel.add(b3);
		buttonPanel.add(bAdd);
		buttonPanel.add(b4);
		buttonPanel.add(b5);
		buttonPanel.add(b6);
		buttonPanel.add(bSub);
		buttonPanel.add(b7);
		buttonPanel.add(b8);
		buttonPanel.add(b9);
		buttonPanel.add(bMul);
		buttonPanel.add(bPoint);
		buttonPanel.add(b0);
		buttonPanel.add(bClear);
		buttonPanel.add(bDiv);
		buttonPanel.add(bEq);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(textPanel, BorderLayout.NORTH);
		mainPanel.add(buttonPanel,BorderLayout.CENTER);
		
		frame.add(mainPanel);
		frame.setVisible(true);
	
		
		}
	private static void createFrame() {
		frame = new JFrame("BG Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,500);
		createUI(frame);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		txt.setText(s);
		if((s.charAt(0) >='0' && s.charAt(0) <='9') || s.charAt(0) == '.') {
			if(s1.equals("") && s2.equals("")) {
				s0 = s0 + s;
			}
			else if(!s1.equals("")) {
				s2 = s2 +s;
			}
			txt.setText(s0 + s1 + s2);
		}
		else if(s.charAt(0) == 'C') {
			s0 = s1 = s2 = "";
			txt.setText(s0 + s1 + s2);
		}
		else if(s.charAt(0) == '=') {
			double result = 0;
			if(s1.equals("+")) {
				result = Double.parseDouble(s0) + Double.parseDouble(s2);
			}
			else if(s1.equals("-")) {
				result = Double.parseDouble(s0) - Double.parseDouble(s2);
			}
			else if(s1.equals("/")) {
				result = Double.parseDouble(s0) / Double.parseDouble(s2);
			}
			else if(s1.equals("*")) {
				result = Double.parseDouble(s0) * Double.parseDouble(s2);
			}
			txt.setText(s0+s1+s2+"="+Double.valueOf(result));
		}
		else {
			double result = 0;
			if(!s1.equals("") && !s2.equals("")) {
				if(s1.equals("+")) {
					result = Double.parseDouble(s0) + Double.parseDouble(s2);
				}
				else if(s1.equals("-")) {
					result = Double.parseDouble(s0) - Double.parseDouble(s2);
				}
				else if(s1.equals("/")) {
					result = Double.parseDouble(s0) / Double.parseDouble(s2);
				}
				else if(s1.equals("*")) {
					result = Double.parseDouble(s0) * Double.parseDouble(s2);
				}
				s0 = Double.toString(result);
				s2 = "";
				s1 = s;
				txt.setText(s0+s1+s2);
			}
			else if(!s0.equals("")){
				s1 = s;
			}
			txt.setText(s0+s1+s2);
	
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = e.getKeyChar();
		int keyInt = e.getKeyCode();
		
		if((c>='0' && c<='9') || c == '.') {
			if(s1.equals("") && s2.equals("")) {
				s0 = s0 + Character.toString(c);
			}
			else if(!s1.equals("")) {
				s2 = s2 +Character.toString(c);
			}
			txt.setText(s0 + s1 + s2);
		}
		else if (keyInt==KeyEvent.VK_DELETE) {
			s0=s1=s2="";
			txt.setText(s0+s1+s2);
		}
		else if(keyInt == KeyEvent.VK_ENTER || c =='=') {
			double result = 0;
			if(s1.equals("+")) {
				result = Double.parseDouble(s0) + Double.parseDouble(s2);
			}
			else if(s1.equals("-")) {
				result = Double.parseDouble(s0) - Double.parseDouble(s2);
			}
			else if(s1.equals("/")) {
				result = Double.parseDouble(s0) / Double.parseDouble(s2);
			}
			else if(s1.equals("*")) {
				result = Double.parseDouble(s0) * Double.parseDouble(s2);
			}
			txt.setText(s0+s1+s2+"="+Double.valueOf(result));
		}
		else if(!s0.equals("")){
			if(c == '+' || c == '-' | c == '*' | c == '/') {
				s1 = Character.toString(c);
			}
			
		}
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
