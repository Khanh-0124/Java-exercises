
public class Oto extends PhuongTien {
	private String loaiNhienLieu;

	public Oto( String loaiNhienLieu) {
		super("O To");
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 43;
	}
	
}
