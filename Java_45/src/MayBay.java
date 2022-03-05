
public class MayBay extends PhuongTien {
	public MayBay(String loaiNhienLieu) {
		super("May Bay");
		// TODO Auto-generated constructor stub
		this.loaiNhienLieu = loaiNhienLieu;
	}

	private String loaiNhienLieu;

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 124;
	}
	 
}
