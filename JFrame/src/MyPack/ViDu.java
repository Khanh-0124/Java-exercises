package MyPack;

import javax.swing.JFrame;

public class ViDu {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		jf.setVisible(true); // Cho phép hiển thị

		jf.setSize(600, 400); // set Chiều Rộng, Dài

		jf.setTitle("Java swing"); // set tiêu đề

//		while(true) {
//			System.out.println("hello");
//		}

		jf.setLocation(300, 300); // set vị trí JFrame trên màn hình

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // đóng chương trình khi đống JFrame
	}

}
