package bean;

public class VaiTro {

	private int id;
	private String vaitro;
	private String ten;

	public VaiTro() {
		super();
	}

	public VaiTro(int id, String vaitro, String ten) {
		super();
		this.id = id;
		this.vaitro = vaitro;
		this.ten = ten;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVaitro() {
		return vaitro;
	}

	public void setVaitro(String vaitro) {
		this.vaitro = vaitro;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

}
