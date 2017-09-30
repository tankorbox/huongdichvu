package bean;

public class LoaiPhuKien {

	private int id;
	private String tenloaiphukien;

	public LoaiPhuKien() {
		super();
	}

	public LoaiPhuKien(int id, String tenloaiphukien) {
		super();
		this.id = id;
		this.tenloaiphukien = tenloaiphukien;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenloaiphukien() {
		return tenloaiphukien;
	}

	public void setTenloaiphukien(String tenloaiphukien) {
		this.tenloaiphukien = tenloaiphukien;
	}

}
