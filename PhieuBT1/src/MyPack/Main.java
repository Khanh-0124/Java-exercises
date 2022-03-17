package MyPack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(
							  "1: Cài đặt và vẽ lưu đồ thuật toán cho chương trình kiểm tra một số n có phải nguyên tố hay không?\r\n"
							+ "2: Cài đặt và vẽ lưu đồ thuật toán cho chương trình giải phương trình bậc 2, có tính tới nghiệm phức\r\n"
							+ "3: Viết chương trình tính n!\r\n" + "4: Viết chương trình tính C(m,n)\r\n"
							+ "5: Viết chương trình tìm UCLN của 2 số\r\n"
							+ "6: Viết chương trình kiểm tra một số có phải là nguyên tố \n"
							+ "7: Viết chương trình tìm kiếm một giá trị (theo thuật toán tìm kiếm nhị phân) trong mảng một chiều.\r\n"
							+ "8: Cho một mảng đã được sắp xếp, viết chương trình bổ sung một giá trị mới vào mảng theo đúng thứ tự.\r\n"
							+ "9: Tìm tất cả các mảng nguyên (int) có tổng giá trị các phần tử bằng giá trị đã cho bất kỳ.\r\n"
							+ "10: Tìm tất cả các số nguyên tố trong một mảng nguyên đặt lên đầu và có sắp xếp\n"
							+ "11: Viết chương trình tìm số nguyên tố lớn nhất trong mảng hai chiều.\r\n"
							+ "12: Viết chương trình nhân hai mảng hai chiều\r\n"
							+ "13: Viết chương trình tạo một bản sao của một mảng n chiều, n là bất kỳ chuỗi.\r\n"
							+ "15: Tìm ra những ký tự có tần suất xuất hiện lớn nhất trong một chuỗi everybody”  e,y\r\n"
							+ "16: Đếm xem trong một chuỗi xuất hiện bao nhiêu từ. “Hello world” -> 2\r\n"
							+ "17: Viết hoa chỉ các ký tự đầu từ trong một chuỗi. “Nguyễn Văn Abc”\r\n"
							+ "18: Viết chương trình so sánh sự giống nhau của hai chuỗi ký tự bất kỳ.\r\n"
							+ "19: Viết chương trình cắt ra một số lượng từ nhất định trong một chuỗi đã cho");
			int chon = 0;

			do {
				System.out.println("\n===========================\nNhập lựa chọn");
				chon = sc.nextInt();
				switch (chon) {
				case 1: break;
				case 2: ChuongTrinhTinh.PTB2(); break;
				case 3: ChuongTrinhTinh.GiaiThua(); break;
				case 4: ChuongTrinhTinh.ToHop(); break;
				case 5: ChuongTrinhTinh.GCD(); break;
				case 6: ChuongTrinhTinh.KtraNto(); break;
				case 7: Mang1Chieu.TKNP(); break;
				case 8: Mang1Chieu.ThemPtu(); break;
				case 9: Mang1Chieu.TimMangCon(); break;
				case 10: Mang1Chieu.TimNgto(); break;
				case 11: Mang2Chieu.TimNtoMax(); break;
				case 12: Mang2Chieu.NhanMT(); break;
				case 13: break;
				case 14: break;
				case 15: break;
				case 16: break;
				case 17: break;
				case 18: break;
				case 19: break;
				case 0:
					System.out.println("Thoát thành công chương trình!");
					break;
				}
			} while (chon > 0);
		}
	}
}
