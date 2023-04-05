package rrjava;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
public class rrtest1 {
	static boolean visibility = true;
	static boolean disable = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	JFrame frame = new JFrame();
	
	JLabel lbl = new JLabel("Hello Swing UI");
	lbl.setBounds(150,20,100,40);
	
	JButton btn = new JButton("Click");
	btn.setBounds(100,100,90,40);
	
	JButton btn1 = new JButton("Press Me");
	btn1.setBounds(210,100,90,40);
	
	JTextField txt = new JTextField();
	txt.setBounds(100,55,200,30);
	
	JButton btn2 = new JButton("Delete");
	btn2.setBounds(100,150,90,40);
	
	JButton btn3 = new JButton("Hide/Show");
	btn3.setBounds(210,150,90,40);
	btn3.setBackground(Color.yellow);
	
	JButton btnDisable = new JButton("Disable");
	btnDisable.setBounds(210,200,90,40);
	
	JButton btnEdit = new JButton("Editable");
	btnEdit.setBounds(100,200,90,40);
	
	frame.add(lbl);
	frame.add(btn);
	frame.add(btn1);
	frame.add(txt);
	frame.add(btn2);
	frame.add(btn3);
	frame.add(btnDisable);
	frame.add(btnEdit);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	frame.setSize(400,500);
	frame.setVisible(true);
	frame.getContentPane().setBackground(Color.white);
	
	btn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			lbl.setText(btn.getText());
		}});
	btn1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			lbl.setText(btn1.getText());
		}});
	btn3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (visibility) {
				visibility=false;
			}
			else {
				visibility=true;
			}
			lbl.setVisible(visibility);
		}});
	btn2.addActionListener(new ActionListener( ){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			txt.setText(null);
		}});
	txt.addKeyListener(new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			lbl.setText(txt.getText());
		}});
	btnDisable.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(txt.isEnabled()) {
				txt.setEnabled(false);
			}
			else {
				txt.setEnabled(true);
			}
		}});
	btnEdit.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(txt.isEditable()) {
				txt.setEditable(false);
			}
			else {
				txt.setEditable(true);
			}
		}});
	btn1.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			btn1.setBackground(Color.white);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			btn1.setBackground(Color.decode("#008080"));
		}});
	}

}
