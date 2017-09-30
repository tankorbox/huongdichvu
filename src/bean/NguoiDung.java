package bean;

public class NguoiDung {
	private int id;
	private String tendangnhap;
	private String matkhau;
	private String tendaydu;
	private String diachi;
	private String sodienthoai;
	private int id_role;
	private int active;

	public NguoiDung() {
		super();
	}

	public NguoiDung(int id, String tendangnhap, String matkhau,
			String tendaydu, String diachi, String sodienthoai, int id_role,
			int active) {
		super();
		this.id = id;
		this.tendangnhap = tendangnhap;
		this.matkhau = matkhau;
		this.tendaydu = tendaydu;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.id_role = id_role;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTendangnhap() {
		return tendangnhap;
	}

	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getTendaydu() {
		return tendaydu;
	}

	public void setTendaydu(String tendaydu) {
		this.tendaydu = tendaydu;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public int getId_role() {
		return id_role;
	}

	public void setId_role(int id_role) {
		this.id_role = id_role;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
}
