package bean;

public class PhuKien {

	private int id;
	private String tenphukien;
	private int gia;
	private String hinhanh;
	private int id_loai_pk;
	private String danhgia;

	public PhuKien() {
		super();
	}

	public PhuKien(int id, String tenphukien, int gia, String hinhanh,
			int id_loai_pk, String danhgia) {
		super();
		this.id = id;
		this.tenphukien = tenphukien;
		this.gia = gia;
		this.hinhanh = hinhanh;
		this.id_loai_pk = id_loai_pk;
		this.danhgia = danhgia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenphukien() {
		return tenphukien;
	}

	public void setTenphukien(String tenphukien) {
		this.tenphukien = tenphukien;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public int getId_loai_pk() {
		return id_loai_pk;
	}

	public void setId_loai_pk(int id_loai_pk) {
		this.id_loai_pk = id_loai_pk;
	}

	public String getDanhgia() {
		return danhgia;
	}

	public void setDanhgia(String danhgia) {
		this.danhgia = danhgia;
	}

}