package bean;

public class HangSanXuat {

	private int id;
	private String tenhangsanxuat;
	private String icon;

	public HangSanXuat() {
		super();
	}

	public HangSanXuat(int id, String tenhangsanxuat, String icon) {
		super();
		this.id = id;
		this.tenhangsanxuat = tenhangsanxuat;
		this.icon = icon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenhangsanxuat() {
		return tenhangsanxuat;
	}

	public void setTenhangsanxuat(String tenhangsanxuat) {
		this.tenhangsanxuat = tenhangsanxuat;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
