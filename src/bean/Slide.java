package bean;

public class Slide {

	private int id;
	private String ten;
	private String hinhanh;
	private int active;

	public Slide() {
		super();
	}

	public Slide(int id, String ten, String hinhanh, int active) {
		super();
		this.id = id;
		this.ten = ten;
		this.hinhanh = hinhanh;
		this.active = active;
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

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

}
