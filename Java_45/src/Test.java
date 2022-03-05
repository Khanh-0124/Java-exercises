
public class Test {
	public static void main(String[] args) {
		PhuongTien p1 = new MayBay("Xang");
		Oto p2 = new Oto("Dau");
		PhuongTien p3 = new XeDap();
		System.out.println(p1.tenPhuongTien);
		System.out.println(p2.getLoaiNhienLieu());
		System.out.println(p2.layVanToc());
	}
	
}
