package bean;

public class ChiTietDonHang {

	private int id;
	private String tensanpham;
	private String hinhanh;
	private int gia;
	private int soluong;
	private int id_don_hang;

	public ChiTietDonHang() {
		super();
	}

	public ChiTietDonHang(int id, String tensanpham, String hinhanh, int gia,
			int soluong, int id_don_hang) {
		super();
		this.id = id;
		this.tensanpham = tensanpham;
		this.hinhanh = hinhanh;
		this.gia = gia;
		this.soluong = soluong;
		this.id_don_hang = id_don_hang;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTensanpham() {
		return tensanpham;
	}

	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public int getId_don_hang() {
		return id_don_hang;
	}

	public void setId_don_hang(int id_don_hang) {
		this.id_don_hang = id_don_hang;
	}

}
