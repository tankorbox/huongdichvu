package bean;

public class LienHe {

	private int id;
	private String ten;
	private String email;
	private String sodienthoai;
	private String noidung;

	public LienHe() {
		super();
	}

	public LienHe(int id, String ten, String email, String sodienthoai,
			String noidung) {
		super();
		this.id = id;
		this.ten = ten;
		this.email = email;
		this.sodienthoai = sodienthoai;
		this.noidung = noidung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

}
