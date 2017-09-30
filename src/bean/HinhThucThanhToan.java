package bean;

public class HinhThucThanhToan {

	private int id;
	private String hinhthucthanhtoan;
	private String code;

	public HinhThucThanhToan() {
		super();
	}

	public HinhThucThanhToan(int id, String hinhthucthanhtoan, String code) {
		super();
		this.id = id;
		this.hinhthucthanhtoan = hinhthucthanhtoan;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHinhthucthanhtoan() {
		return hinhthucthanhtoan;
	}

	public void setHinhthucthanhtoan(String hinhthucthanhtoan) {
		this.hinhthucthanhtoan = hinhthucthanhtoan;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
