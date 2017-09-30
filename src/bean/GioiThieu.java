package bean;

public class GioiThieu {

	private int id;
	private String tieude;
	private String noidung;

	public GioiThieu() {
		super();
	}

	public GioiThieu(int id, String tieude, String noidung) {
		super();
		this.id = id;
		this.tieude = tieude;
		this.noidung = noidung;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTieude() {
		return tieude;
	}

	public void setTieude(String tieude) {
		this.tieude = tieude;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

}
