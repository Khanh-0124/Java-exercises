package test;

import java.util.Scanner;

import main.DanhSachSv;
import main.SinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSv ds = new DanhSachSv();
		int luaChon;
		System.out.println("1. Thêm sinh viên vào danh sách.\n" + "2. In danh sách sinh viên ra màn hình\n"
				+ "3. Kiểm tra danh sách có rỗng hay không.\n" + "4. Lấy ra số lượng sinh viên trong danh sách.\n"
				+ "5. Làm rỗng danh sách sinh viên. \n"
				+ "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh\n"
				+ "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
				+ "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím. \n"
				+ "9. Xuất ra danh sách sinh viên có điểm từ cao đến thấp. \n" + "0. Thoát khỏi chương trình");
		do {

			System.out.println("\n===================\n");
			System.out.println("Vui long nhap lua chon!\n");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1:
				System.out.println("Nhap ho ten: ");
				String hoTen = sc.nextLine();
				System.out.println("Nhap ma sv: ");
				String maSV = sc.nextLine();
				System.out.println("Nhap nam sinh: ");
				int namSinh = sc.nextInt();
				System.out.println("Nhap diem: ");
				float diem = sc.nextFloat();
				SinhVien sv = new SinhVien(hoTen, maSV, namSinh, diem);
				ds.addSV(sv);
				break;
			case 2:
				ds.xuatDS();
				break;
			case 3:
				if (ds.empty()) {
					System.out.println("Danh sach trong");
				} else
					System.out.println("Danh sach k trong");
				break;
			case 4:
				System.out.println("Ds dang co: " + ds.laySL() + " phan tu");
				break;
			case 5:
				ds.lamRong();
				break;
			case 6:
				System.out.println("Nhap ma sv can ktra: ");
				String masv = sc.nextLine();
				SinhVien sv1 =  new SinhVien(masv);
				ds.ktraTonTai(sv1);
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;

			case 0:
				System.out.println("Đóng thành công chương trình!");
				return;

			}
		} while (luaChon > 0);
	}
}
