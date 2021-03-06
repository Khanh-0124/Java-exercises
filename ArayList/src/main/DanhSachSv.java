package main;

import java.util.ArrayList;

public class DanhSachSv {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSv() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSv(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	public void addSV(SinhVien sv) {
		this.danhSach.add(sv);
	}

	public void xuatDS() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
	}

	public boolean empty() {
		return this.danhSach.isEmpty();
	}

	public int laySL() {
		return this.danhSach.size();
	}

	public void lamRong() {
		this.danhSach.removeAll(danhSach);
	}
	
	public boolean ktraTonTai (SinhVien sv) {
		return this.danhSach.contains(sv);
	}
}
