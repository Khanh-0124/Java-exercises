package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalculaor extends JFrame{
	public MyCalculaor() {
		this.setTitle("My Calculator");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		
		JTextField jtf = new JTextField(50);
		JPanel JP_Header = new JPanel();
		JP_Header.setLayout(new BorderLayout());
		JP_Header.add(jtf, BorderLayout.CENTER);
		
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn0 = new JButton("0");
		JButton btn_plus = new JButton("+");
		JButton btn_sub = new JButton("-");
		JButton btn_mul = new JButton("x");
		JButton btn_div = new JButton("/");
		JButton btn_es = new JButton("=");
		
		JPanel JP_btn = new JPanel();
		JP_btn.setLayout(new GridLayout(5,3));
		JP_btn.add(btn1);
		JP_btn.add(btn2);
		JP_btn.add(btn3);
		JP_btn.add(btn4);
		JP_btn.add(btn5);
		JP_btn.add(btn6);
		JP_btn.add(btn7);
		JP_btn.add(btn8);
		JP_btn.add(btn9);
		JP_btn.add(btn0);
		JP_btn.add(btn_plus);
		JP_btn.add(btn_sub);
		JP_btn.add(btn_mul);
		JP_btn.add(btn_div);
		JP_btn.add(btn_es);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		this.add(JP_Header, BorderLayout.NORTH);
		this.add(JP_btn, BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		new MyCalculaor();
	}
}
