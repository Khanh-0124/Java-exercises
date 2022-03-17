package MyPack;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu extends JFrame{
	
	public ViDu() {
		this.setTitle("Khanh Zua");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		
//		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
//		FlowLayout f2 = new FlowLayout(FlowLayout.CENTER, 50, 50);
//		FlowLayout f3 = new FlowLayout()
		GridLayout gl1 = new GridLayout();
		GridLayout gl2 = new GridLayout(4,4,25,25);
		GridLayout gl3 = new GridLayout();
		this.setLayout(gl2);
		
		JButton bt1 = new JButton("1");
		JButton bt2 = new JButton("2");
		JButton bt3 = new JButton("3");
		
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
//		JFrame jf = new JFrame();
//		
//		jf.setVisible(true); // Cho phép hiển thị
//
//		jf.setSize(600, 400); // set Chiều Rộng, Dài
//
//		jf.setTitle("Java swing"); // set tiêu đề
//
////		while(true) {
////			System.out.println("hello");
////		}
//
//		jf.setLocation(300, 300); // set vị trí JFrame trên màn hình
//
//		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // đóng chương trình khi đống JFrame
		new ViDu();
	}

}
