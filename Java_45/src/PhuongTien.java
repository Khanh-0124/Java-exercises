
public abstract class PhuongTien {
	protected String tenPhuongTien;

	public PhuongTien(String tenPhuongTien) {
		super();
		this.tenPhuongTien = tenPhuongTien;
	}

	public String getTenPhuongTien() {
		return tenPhuongTien;
	}

	public void setTenPhuongTien(String tenPhuongTien) {
		this.tenPhuongTien = tenPhuongTien;
	}
	public 	abstract double layVanToc();
}
