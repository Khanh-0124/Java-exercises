package main;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien> {
	private String hoTen;
	private String maSV;
	private int namSinh;
	private float diem;

	public SinhVien(String hoTen, String maSV, int namSinh, float diem) {
		this.hoTen = hoTen;
		this.maSV = maSV;
		this.namSinh = namSinh;
		this.diem = diem;
	}

	public SinhVien(String maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public float getDiem() {
		return diem;
	}

	public void setDiem(float diem) {
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", maSV=" + maSV + ", namSinh=" + namSinh + ", diem=" + diem + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.maSV.compareTo(o.maSV);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maSV);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSV, other.maSV);
	}

}
